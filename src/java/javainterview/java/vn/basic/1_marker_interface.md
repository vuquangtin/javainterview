# Marker Interface trong Java

## Marker (hay Tagging) Interface trong Java là gì?

Marker Interface là một interface không có bất kỳ phương thức và thuộc tích nào bên trong nó. Nó cung cấp thông tin run-time type về object, vì vậy compiler và JVM có thêm thông tin về đối tượng thể thực hiện một số hoạt động hữu ích.

Một marker interface còn được gọi là một tagging interface.

ví dụ:

```java
public interface Serializable {
}
```

## Built-in marker interface trong Java

Một số marker interface hiện có trong (built-in) Java: java.io.Serializable, java.lang.Cloneable, java.rmi.Remote, java.util.RandomAccess, java.util.EventListener, …

java.io.Serializable được sử dụng để đánh dấu đối tượng Serialize. Khi chúng ta gọi phương thức ObjectOutputStream.writeObject(), JVM sẽ kiểm tra đối tượng có implement một marker interface Serializable hay không. Nếu không, sẽ throw một exception NotSerializableException. Vì vậy đối tượng sẽ không được Serialize sang output stream object. Chi tiết các bạn xem bài viết “Serialization và Deserialization trong java“.

Tương tự, java.lang.Cloneable là một marker interface để nói với JVM rằng, đối tượng có thể call Object.clone() method. Nếu chúng ta thực hiện clone một object mà không được implement một marker interface Clonable, thì sẽ gặp một exception CloneNotSupportedException. Chi tiết về Clone và Clonable, các bạn xem lại bài viết “Object Cloning trong Java“.

## Chúng ta có thể sử dụng Marker Interface ở đâu?

- Tạo một cha chung: Như với EventListener interface, mà được kế thừa bởi hàng tá các interface khác trong Java API, bạn có thể sử dụng một tagging interface để tạo một cha chung cho một nhóm interface. Ví dụ, khi một interface kế thừa EventListener, thì JVM biết rằng interface cụ thể này đang được sử dụng trong một event.

- Thêm một kiểu dữ liệu tới một class: Đó là khái niệm tagging. Một class mà triển khai một tagging interface không cần định nghĩa bất kỳ phương thức nào, nhưng class trở thành một kiểu interface thông qua tính đa hình (polymorphism).

- Thực hiện một số pre-processing trên các class, đặc biệt hữu dụng để phát triển các API và Framework giống như Sping, Struts.

- Giúp cho code coverage và build tools để find bug dựa trên một behavior cụ thể của marker interface.

## Custom Marker Interface

Trong ví dụ bên dưới, chúng ta tạo một Marker Interface gọi là SafeDeletable. Interface này chỉ ra rằng một đối tượng không được xoá khỏi database, chỉ được set flag là delete.

Marker interface:

```java
interface SafeDeletable { }
```

Chúng ta có 2 đối tượng:

- Order: đối tượng này có thể xoá khỏi database.
- Customer: đối tượng này không thể xoá khỏi database, cần set flad delete khi được yêu cầu xoá.

```java
class Order {}
 
class Customer implements SafeDeletable {}
```

Chương trình chúng ta như sau:

```java
public class InterfaceMarkerExample {
 
    public static void delete(Object obj) {
        if (obj instanceof SafeDeletable) {
            System.out.println("Set flag to delete: " + obj.getClass());
        } else {
            System.out.println("Call delete object from database: " + obj.getClass());
        }
    }
 
    public static void main(String[] args) {
 
         delete(new Order());
         delete(new Customer());
    }
}
```

## Marker Interface vs. Annotation

Tương tự như Marker Interface, chúng ta có thể sử dụng Annotation cho cùng mục đích. Chúng ta có thể chỉ giới hạn sử dụng Annotation ở mức class giống như interface bằng cách khai báo java.lang.annotation.ElementType là TYPE.

Hãy xem cách sử dụng Annotation để thay thế cho Marker Interface ở trên:

```java
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SafeDeletable {
 
}
 
class Order { }
 
@SafeDeletable
class Customer{ }
 
public class AnnotationMarkerExample {
 
    public static void delete(Object obj) {
        if (obj.getClass().isAnnotationPresent(SafeDeletable.class)) {
            System.out.println("Set flag to delete: " + obj.getClass());
        } else {
            System.out.println("Call delete object from database: " + obj.getClass());
        }
    }
 
    public static void main(String[] args) {
 
         delete(new Order());
         delete(new Customer());
    }
}
```

Một câu hỏi đặt ra là có phải Annotation có thể thay thế 100% Marker interface?

Chúng ta có thể sử dụng Annotation để thay thế cho Marker interface, tuy nhiên trong một số trường hợp sẽ khó khăn nếu sử dụng Annotation. Chẳng hạn trong ví dụ trên, nếu chúng ta có một class con của Customer :

```java
class VipCustomer extends Customer {}
```

Nếu sử dụng Marker inetrface, mặc định class VipCustomer cũng được đánh dấu là SafeDeletable vì tính kế thừa của Java. Tuy nhiên, với Annotation, chúng ta cần đánh dấu lại Annotation SafeDeletable cho class VipCustomer. Kế thừa cũng là một bất lợi của Marker Interface so với Annotation là chúng ta không thể bỏ Marker Interface ở subclass, với Annotation thì không cần làm gì thêm.

Vì interface cho chúng ta tính đa hình (polymorphism), nên chúng ta có thể sử dụng để type check tại thời điểm compile time. Chẳng hạn, chúng ta có class DocumentTransferExecutor, class này chỉ chấp nhận transfer cho những document có implement marker interface DocumentTransferable. Thay vì nhận vào một Object type, chúng ta có thể chỉ định là một Marker interface để tránh developer truyền sai parameter type (đối tượng không phải là document) hay cast object trong quá trình xử lý.

```java
interface DocumentTransferable { }
 
class DocumentTransferExecutor {
 
    public void transfer(DocumentTransferable obj) { }
}
```

Tóm lại, marker interface trong Java được sử dụng để chỉ ra một cái gì đó cho complier, JVM hoặc bất kỳ công cụ nào khác. Hiện nay, hầu hết các developer ủng hộ các Annotation để giải quyết một số vấn đề tương tự thay vì dùng marker interface. Mặc dù các marker interface vẫn đang được sử dụng, nhưng chúng nên được sử dụng cẩn thận vì tính kế thừa của nó.