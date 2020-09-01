# Sự khác nhau giữa bộ nhớ heap và stack trong java?
@see https://viettuts.vn/interview/list-cau-hoi-phong-van-java-core-2

>Stack là một vùng nhớ được sử dụng để lưu trữ các tham số và các biến local của phương thức mỗi khi một phương thức được gọi ra.

>Heap là một vùng nhớ trong bộ nhớ được sử dụng để lưu trữ các đối tượng khi từ khóa new được gọi ra, các biến static và các biến toàn cục (biến instance). 

# Tính chất "viết một lần chạy nhiều nơi" của java là gì?

Java code được biên dịch thành một byte code, là ngôn ngữ trung gian giữa mã nguồn và mã máy. Byte code này không phải là nền tảng cụ thể và do đó có thể được thông dịch cho bất kỳ nền tảng nào. 

# File có tên trống ".java" có hợp lệ không?

Có, bạn có thể lưu file java với tên ".java", sau đó biên dịch bằng lệnh javac .java và chạy bằng lệnh java ten_lop. Ví dụ:

```java
class A{  
    public static void main(String args[]){  
        System.out.println("Hello java");  
    }
}  
```

Biên dịch: ```javac .java```

Run: java A 

# Nếu không cung cấp bất kỳ đối số nào trên command line, thì mảng String của hàm main là empty hay null?

Mảng String là empty, không phải null. 

# Chuyện gì xảy ra nếu khai báo static public void thay vì public static void?

Chương trình được biên dịch và run đúng. 

# Giá trị mặc định của các biến local là gì?

Các biến local không được khởi tạo với bất kỳ giá trị mặc định nào, bất kể là nguyên thủy hay tham chiếu đối tượng. 