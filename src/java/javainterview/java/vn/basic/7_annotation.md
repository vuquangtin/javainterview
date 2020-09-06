# Java Annotation

## Giới thiệu:

Annotation (chú thích) là một loại siêu dữ liệu (metadata information) trong java có thể được áp dụng ở các phần tử mã nguồn java để sau đó một số công cụ (tool), trình gỡ lỗi (debugger) hoặc chương trình ứng dụng có thể tận dụng các chú thích này.

Các Annotation được thêm vào Java kể từ JDK 5. Chúng ta có thể chú thích các lớp (class), phương pháp (method), các biến (variable), các tham số (parameter) và các gói (package) trong java. Điều quan trọng là phải biết rằng: các chú thích được áp dụng trên mã nguồn java được biên dịch thành bytecode và sử dụng kỹ thuật lập trình phản chiếu (Reflection) để có thể truy vấn thông tin siêu dữ liệu (metadata information) và quyết định hành động thích hợp để thực hiện trong ngữ cảnh cụ thể.

Các Annotation không trực tiếp ảnh hưởng đến việc thực hiện các mã của bạn, mặc dù một số loại chú thích thực sự có thể được sử dụng cho mục đích đó.

Annotation là một tính năng rất hay và được sử dụng rất nhiều trong Java. Có thể bạn đã gặp các Annotation trong các ứng dụng Java như:

- Java Core: @Deprecated, @Override, @SuppressWarnings, …
- Spring Framework: @Controller, @Service, @Repository, @Component, …
- Hibernate: @Table, @Id, @Column, @OneToMany, @ManyToOne, …

Trong bài này, chúng ta sẽ lần lượt tìm hiểu qua các chủ đề sau: mục đích sử dụng annotations, những kiểu annotation được định nghĩa sẵn trong Java và cách để tạo ra các annotation tùy biến.

## Các annotation được sử dụng để làm gì?

Annotation được sử dụng cho các mục đích:

- Chỉ dẫn cho trình biên dịch (Compiler)
- Chỉ dẫn trong thời điểm biên dịch (Build-time)
- Chỉ dẫn trong thời gian chạy (Runtime)

### Hướng dẫn cho trình biên dịch (Compiler)

Java được tích hợp sẵn 3 annotation để cung cấp những chỉ dẫn nhất định cho trình biên là: @Deprecated, @Override, @SuppressWarnings. Các Annotation này được giải thích chi tiết hơn trong phần dưới của bài viết này.

### Chỉ dẫn trong lúc biên dịch (Compile-time)

Các chú thích có thể cung cấp hướng dẫn trong lúc biên dịch cho trình biên dịch mà có thể tiếp tục được sử dụng bởi các phần mềm như sinh code, XML file,…

### Chỉ dẫn trong thời gian chạy (Runtime)

Thông thường, các Annotation không có mặt trong mã Java csau khi biên dịch. Tuy nhiên, có thể xác định trong thời gian chạy bằng cách sử dụng kỹ thuật Java Reflection và có thể sử dụng để đưa ra những hướng dẫn cho chương trình tại Runtime.

## Cơ bản về Annotations

Một chú thích luôn bắt đầu với ký hiệu @ và sau đó là tên của chú thích. Ký hiệu @ chỉ ra cho trình biên dịch rằng đây là một chú thích.

Ví dụ: @Override

- Ký hiệu@ mô tả đây là một chú thích
- Override là tên của chú thích.

## Các Annotation sẵn có của Java

### @Deprecated

Chú thích @Deprecated chỉ ra rằng những phần tử bị đánh dấu (class, method hoặc field) đã bị lỗi thời, tốt nhất không nên sử dụng nữa. Trình biên dịch sinh ra một cảnh báo bất cứ khi nào chương trình sử dụng một phương thức, lớp hoặc trường đã bị đánh dấu với chú thích @Deprecated. Khi một phần tử bị đánh dấu với chú thích này thì trong Javadoc cũng sẽ bị thêm vào thẻ @deprecated để cảnh báo cho người dùng.

### @Override

Chú thích @Override được sử dụng cho các method ghi đè của method trong một class cha (superclass). Nếu method này không hợp lệ với một method trong class cha, trình biên dịch sẽ thông báo cho bạn một lỗi.

Annotation @Override là không bắt buộc phải chú thích trên method đã ghi đè method của class cha. Tuy nhiên, khi ghi đè một phương thức trong lớp con (sub-class) chúng ta nên sử dụng chú thích này để đánh dấu phương thức. Điều này giúp cho code dễ đọc và tránh được các vấn đề khi bảo trì. Ví dụ trong trường hợp một người nào đó thay đổi tên của method của class cha, method tại class con của bạn sẽ không còn là method ghi đè nữa. Nếu không có chú thích @Override bạn sẽ không tìm ra. Với các chú thích @Override, trình biên dịch sẽ ném ra lỗi biên dịch và bạn phải thay đổi luôn cả tên phương thức được ghi đè ở lớp con (nơi mà chú thích này đang được áp dụng).

### @SuppressWarnings

Chú thích này hướng dẫn cho trình biên dịch bỏ qua những cảnh báo cụ thể. Ví dụ, nếu trong một method có gọi tới một method khác đã lỗi thời, hoặc bên trong method có một ép kiểu không an toàn, trình biên dịch có thể tạo ra một cảnh báo. Bạn có thể tắt các cảnh báo này bằng cách chú thích method này bằng @SuppressWarnings.

- @SuppressWarnings(“deprecation”) để thông báo trình biên dịch không cảnh báo việc sử dụng phương thức có sử dụng @Deprecation.
- @SuppressWarnings(“unchecked”) để thông báo trình biên dịch không cảnh báo việc sử một ép kiểu không an toàn.
- @SuppressWarnings(“rawtypes”) để thông báo trình biên dịch không cảnh báo việc khai báo kiểu dữ liệu không tường minh.

## Cách tạo Custom Annotations

Sử dụng @interface là từ khóa khai báo một Annotation, annotation khá giống một interface. Annotation có hoặc không có các phần tử (element) trong nó.

Đặc điểm của các phần tử (element) của annotation:

- Không có thân hàm
- Không có tham số hàm
- Khai báo trả về phải là một kiểu cụ thể:
    - Các kiểu nguyên thủy (boolean, int, float, …)
    - Enum
    - Annotation
    - Class (Ví dụ String.class)
- Có thể có giá trị mặc định.

### **@Retention và @Target**

#### @Retention

Dùng để chú thích mức độ tồn tại của một annotation nào đó.

Cụ thể có 3 mức nhận thức tồn tại của vật được chú thích, và được định nghĩa trong enum java.lang.annotation.RetentionPolicy::

- SOURCE: Tồn tại trên code nguồn, và không được bộ dịch (compiler) nhận ra.
- CLASS: Mức tồn tại được bộ dịch nhận ra, nhưng không được nhận biết bởi máy ảo tại thời điểm chạy (Runtime).
- RUNTIME: Mức tồn tại lớn nhất, được bộ dịch (compiler) nhận biết, và máy ảo thời điểm chạy cũng nhận ra sự tồn tại của nó.

#### @Target

Dùng để chú thích cho một annotation khác, và annotation đó sẽ được sử dụng trong phạm vi nào. Các chú thích này đã được định nghĩa trong enum java.lang.annotation.ElementType:

**TYPE** : Gắn trên khai báo Class, interface, enum, annotation.
**FIELD** : Gắn trên khai báo trường (field), bao gồm cả các hằng số enum.
**METHOD** : Gắn trên khai báo method.
**PARAMETER** : Gắn trên khai báo parameter
**CONSTRUCTOR** : Gắn trên khai báo cấu tử
**LOCAL_VARIABLE** : Gắn trên biến địa phương.
**ANNOTATION_TYPE** : Gắn trên khai báo Annotation
**PACKAGE** : Gắn trên khai báo package.

### @Documented:

Chú thích này chỉ ra rằng chú thích mới nên được bao gồm trong tài liệu java được tạo ra bởi các công cụ tạo tài liệu java.

### @Inherited: 

Chú thích chỉ ra rằng loại chú thích có thể được kế thừa từ super class (mặc định là false). Khi người dùng truy vấn kiểu annotation của lớp con và lớp con không có chú thích cho kiểu này thì lớp superclass của lớp được truy vấn cho loại chú thích sẽ được gọi. Chú thích này chỉ áp dụng cho các khai báo lớp.

### Ví dụ:

```java
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {
 
    int index();
 
    String title();
 
    String description() default "Default value";
 
}
```
Lưu ý: Những phần tử được gán giá trị mặc định khi tạo có thể được bỏ qua khi sử dụng chú thích. Ví dụ, áp dụng annotation cho một class như sau:


```java
import java.util.Date;
 
public class Student {
 
    @ExcelColumn(index = 1, title = "#", description = "Student's id")
    private long id;
 
    @ExcelColumn(index = 2, title = "Tên")
    private String name;
 
    @ExcelColumn(index = 3, title = "Tuổi ")
    private int age;
 
    @ExcelColumn(index = 4, title = "Ngày sinh")
    private Date birthday;
 
}
```

### Sử dụng Annotation lồng nhau

Trong một vài trường hợp, chúng ta cần sử dụng một Annotation nhiều lần annotation tại cùng 1 vị trí trong một method, constructor. Khi đó chúng ta cần tạo một Wrapper annotation để chứa danh sách các Annotation có thể lặp lại.

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
public class RepeatingAnnotations {
 
    // 1. Declare a Repeatable Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filter {
        String value();
    };
 
    // 2. Declare the Nested Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }
 
    // 3. Use repeating annotations
    @Filters({ @Filter("filter1"), @Filter("filter2") })
    public interface Filterable {
 
    }
 
    public static void main(String[] args) {
        // 4. Retrieving Annotations via the Filters class
        Filters filters = Filterable.class.getAnnotation(Filters.class);
        for (Filter filter : filters.value()) {
            System.out.println(filter.value());
        }
    }
}
```