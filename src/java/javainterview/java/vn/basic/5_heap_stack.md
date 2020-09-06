# Quản lý bộ nhớ trong Java với Heap Space vs Stack

## Định nghĩa

**Java Heap và Stack Memory là một phần của bộ nhớ được JVM sử dụng để chạy chương trình Java của bạn**. Khi bạn chạy chương trình Java, JVM sẽ yêu cầu hệ điều hành cấp cho một không gian bộ nhớ trong RAM để dùng cho việc chạy chương trình. JVM sẽ chia bộ nhớ được cấp phát này thành 2 phần: Heap và Stack cho việc quản lý.

## Java Heap Memory

Java Heap Memory là bộ nhớ được sử dụng ở runtime để lưu các Objects. Bất cứ khi nào ở đâu trong chương trình của bạn khi bạn tạo Object thì nó sẽ được lưu trong Heap (thực thi toán tử new).

Các objects trong Heap đều được truy cập bởi tất cả các các nơi trong ứng dụng, bởi các threads khác nhau.

Thời gian sống của object phụ thuộc vào Garbage Collection của java.

Garbage Collection sẽ chạy trên bộ nhớ Heap để xoá các Object không được sử dụng nữa, nghĩa là object không được referece trong chương trình.

Dung lượng sử dụng của Heap sẽ tăng giảm phụ thuộc vào Objects sử dụng.

Dung lượng Heap thường lớn hơn Stack.

## Java Stack Memory

Bộ nhớ để lưu các biến local trong hàm và lời gọi hàm ở runtime trong một Thread java.

Các biến local bao gồm loại nguyên thuỷ (primitive) và loại tham chiếu tới đối tượng trong heap (reference) khai báo trong hàm, hoặc đối số được truyền vào hàm, thường có thời gian sống ngắn.

Bố nhớ stack thường nhỏ.

Cơ chế hoạt động là LIFO (Last-In-First-Out), chạy sau chết trước.

Bất cứ khi nào gọi 1 hàm, một khối bộ nhớ mới sẽ được tạo trong Stack cho hàm đó để lưu các biến local. Khi hàm thực hiện xong, khối bộ nhớ cho hàm sẽ bị xoá, và giải phóng bộ nhớ trong stack.

## Ví dụ minh họa

```java

public class Memory {
 
    public static void main(String[] args) { // Line 1
        int i=1; // Line 2
        Object obj = new Object(); // Line 3
        Memory mem = new Memory(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9
 
    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8
 
}  

```

![GitHub Logo](../../../../../resources/img/5_java-heap-stack-1.png)

Giải thích:

+ Khi chạy chương trình, một thread sẽ khởi tạo và sẽ gọi hàm main ở dòng 1. Một khối bộ nhớ được tạo trong stack cho hàm main().

+ Một biến local được tạo ở dòng 2, loại primitive được lưu trong cùng khối bộ nhớ của hàm main()

+ Dòng 3, một đối tượng được tạo loại Object sẽ được lưu trong bộ nhớ heap và biến tham chiếu obj được lưu trong stack của hàm main()

+ Tương tự dòng 4, một đối tượng được tạo loại Memory lưu trong bộ nhớ heap và biến tham chiếu mem lưu trong stack.

+ Dòng 5 , hàm foo() thì được gọi, vì vậy nó sẽ tạo một khối mới bộ nhớ trong stack cho hàm foo()

+ Hàm foo có một đối số ở dòng 6, loại biến tham chiếu param tời đối tượng Object trong heap, nên đối số này sẽ được lưu trong bộ nhớ stack của foo()

+ Dòng 7, một biến local loại tham chiếu là str được tạo trong stack của foo(). Biến này tham chiếu tới đối tượng StringPool trong heap.

+ Dòng 8, hàm foo() sẽ kết thúc vì vậy bộ nhớ trong stack cho hàm foo() sẽ được giải phóng.

+ Theo quy luật LIFO, foo() vào sau chết trước, và sau đó hàm main() cũng kết thúc, bộ nhớ trong stack cho hàm main() cũng được giải phóng.

+ Chương trình kết thúc.

## Sự khác nhau stack và heap

| Heap Memory        | Stack Memory           | 
| ------------- |-------------|
| Java Heap Memory là bộ nhớ được sử dụng ở runtime để lưu các Objects. Bất cứ khi nào ở đâu trong chương trình của bạn khi bạn tạo Object thì nó sẽ được lưu trong Heap (thực thi toán tử new).     | Stack Memory là bộ nhớ để lưu các biến local trong hàm và lời gọi hàm ở runtime trong một Thread java. Các biến local bao gồm: loại nguyên thuỷ (primitive), loại tham chiếu tới đối tượng trong heap (reference), khai báo trong hàm, hoặc đối số được truyền vào hàm. |
|Thời gian sống của bộ nhớ Heap dài hơn so với Stack. Thời gian sống của object phụ thuộc vào Garbage Collection của java. Garbage Collection sẽ chạy trên bộ nhớ Heap để xoá các Object không được sử dụng nữa, nghĩa là object không được referece trong chương trình.     | Thường có thời gian sống ngắn.  |
| Các objects trong Heap đều được truy cập bởi tất cả các các nơi trong ứng dụng, bởi các threads khác nhau. | Stack chỉ được sử dụng cho một Thread duy nhất. Thread ngoài không thể truy cập vào được. |
| Cơ chế quản lý của Heap thì phức tạp hơn. Heap được phân làm 2 loại Young-Generation, Old-Generation. Đọc thêm về Garbage Collection để hiểu rõ hơn. | Cơ chế hoạt động là LIFO (Last-In-First-Out), chạy sau chết trước. |
| Dung lượng Heap thường lớn hơn Stack. |	Bộ nhớ stack thường nhỏ.| 
| Sử dụng -Xms và -Xmx để định nghĩa dung lượng bắt đầu và dung lượng tối đa của bộ nhớ heap. | Dùng -Xss để định nghĩa dung lượng bộ nhớ stack. |
| Khi Heap bị đầy chương trình hiện lỗi java.lang.OutOfMemoryError: Java Heap Space | Khi stack bị đầy bộ nhớ, chương trình phát sinh lỗi: java.lang.StackOverFlowError |
| Truy cập vùng nhớ Heap chậm hơn Stack. | Truy cập stack nhanh hơn Heap |
| Dung lượng sử dụng của Heap sẽ tăng giảm phụ thuộc vào Objects sử dụng. | Bất cứ khi nào gọi 1 hàm, một khối bộ nhớ mới sẽ được tạo trong Stack cho hàm đó để lưu các biến local. Khi hàm thực hiện xong, khối bộ nhớ cho hàm sẽ bị xoá, và giải phóng bộ nhớ trong stack. |



