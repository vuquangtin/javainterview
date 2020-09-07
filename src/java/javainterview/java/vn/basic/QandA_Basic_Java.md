### 1.	Synchronization (Đồng bộ hóa) là gì?

Synchronization là khả năng điều khiển truy cập của nhiều Thread tới nguồn đã chia sẻ. 
Từ khóa synchronized trong Java cung cấp locking để đảm bảo sự truy cập tương hỗ mang tính loại trừ của nguồn đã chia sẻ và ngăn cản Data Race (Tranh đoạt dữ liệu).

### 2. ClassLoader là gì?

ClassLoader là một đối tượng mà đảm nhiệm việc tải các lớp. 

Lớp ClassLoader là một lớp abstract.

### 3. Tại sao chúng ta cần các lớp wrapper?

Chúng ta có thể truyền chúng ở dạng các tham số phương thức khi một phương thức chờ đợi một đối tượng. 
Nó cũng cung cấp các phương thức tiện ích.

### 4.Điểm khác nhau giữa Error và Exception?

Một Error là một điều kiện không thể cứu chữa xuất hiện tại runtime, ví dụ ```OutOfMemory``` error. 

Các Exception là các điều kiện mà xuất hiện là do input không phù hợp, hoặc sai,… ví dụ ```FileNotFoundException``` sẽ bị ném nếu file đã cho không tồn tại.
	
### 5. Khi nào sử dụng ArrayList và LinkedList?

Nếu bạn cần thường xuyên thêm và xóa các phần tử từ giữa danh sách và chỉ truy cập các phần tử theo dãy, thì LinkedList nên được sử dụng.
Nếu bạn cần hỗ trợ truy cập ngẫu nhiên, mà không chèn hoặc xóa các phần tử từ bất kỳ vị trí nào khác ngoài vị trí cuối, thì nên sử dụng ArrayList.

### 6. Trình bày Externalizable Interface?

Externalizable là một Interface chứa hai phương thức readExternal và writeExternal. 
Hai phương thức này cung cấp cho bạn một điều khiển thông qua kỹ thuật Serialization.

### 7. Trình bày Enumeration?

Một Enumeration là một Interface chứa các phương thức để truy cập cấu trúc dữ liệu lớp dưới mà từ đó Enumeration được thu nhận. 
Nó cho phép sự truy cập liên tiếp tới tất cả phần tử được lưu trữ trong Collection đó.

### 8.ĐIỂM KHÁC NHAU GIỮA INNER CLASS VÀ NESTED CLASS?

Khi một lớp được định nghĩa bên trong một phạm vi của lớp khác, thì nó trở thành Inner Class. 
Nếu Access Modifier của Inner Class là static, thì nó trở thành Nested Class.

### 9. Khi nào từ khóa throws được sử dụng?
Nếu một phương thức không xử lý một Checked Exception, phương thức phải được khai báo với từ khóa throws. 
Từ khóa throws xuất hiện ở phần cuối một phương thức.

### 10. Khi nào từ khóa throw được sử dụng?
Một Exception có thể được ném, hoặc bởi được thuyết minh hoặc một Exception mà bạn vừa bắt, bởi sử dụng từ khóa throw.

### 11. Đa luồng (Multi-Thread)?
Một chương trình đa luồng bao gồm hai hoặc nhiều phần mà có thể chạy đồng thời. 
Mỗi phần của chương trình đó được gọi là một Thread, và một Thread xác định một trình thực thi khác nhau.

### 12. Serializable và Deserializable trong Java

### 13. Điểm khác nhau giữa yield và sleep?
Khi một tác vụ triệu hồi phương thức yield() của nó, nó chuyển thành trạng thái sẵn sàng. 
Khi một tác vụ triệu hồi phương thức sleep() của nó, nó chuyển sang trạnh thái đợi.

### 14.Tại sao lớp Vector được sử dụng?
Lớp Vector cung cấp khả năng để triển khai mọt mảng có thể mở rộng của các đối tượng. 
Vector tỏ ra rất hữu ích nếu bạn không biết trước kích cỡ của mảng, hoặc nếu bạn chỉ cần một mảng mà có thể thay đổi kích cỡ trong thời gian sống của một chương trình.

### 15. Sự khác nhau giữa throw và throws trong java


1. )	Từ khóa throw trong java được sử dụng để ném ra một ngoại lệ rõ ràng.
	Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ.
	
2. )	Ngoại lệ checked không được truyền ra nếu chỉ sử dụng từ khóa throw.
	Ngoại lệ checked được truyền ra ngay cả khi chỉ sử dụng từ khóa throws
	
3. )	Sau throw là một instance.	
	Sau throws là một hoặc nhiều class.
	
4. )	Throw được sử dụng trong phương thức.	
	Throws được khai báo ngay sau dấu đóng ngoặc đơn của phương thức.
	
5. )	Bạn không thể throw nhiều exceptions.	
	Bạn có thể khai báo nhiều exceptions, Ví dụ:
	public void method()throws IOException,SQLException.
	
### 16. Lớp TreeSet trong java implements giao diện Set sử dụng cấu trúc cây để lưu trữ các phần tử.
Nó kế thừa lớp AbstractSet và implements giao diện NavigableSet. 
Các đối tượng của lớp TreeSet được lưu trữ theo thứ tự tăng dần.

Các điểm quan trọng về lớp TreeSet trong java là:

- Chỉ chứa các phần tử duy nhất giống như HashSet.
- Thời gian truy xuất nhanh.
- Duy trì thứ tự tăng dần.
	
### 17. Set (tập hợp) và đặc điểm của Set
Set hay còn gọi là bộ hoặc tập hợp, mặc dù cùng mang nghĩa là tập hợp nhưng khác với Collection thì trong Set các phần tử là duy nhất cũng có nghĩa là Set không chứa các phần tử trùng lặp. 

Chính vì vậy Set có một số đặc điểm sau:

- Các phần tử trong set là không trùng lặp
- Cho phép chứa phần tử null, nhưng chỉ có tối đa một phần tử null trong Set
- Nếu thêm 1 phần tử đã tồn tại trong Set vào Set thì trong Set vẫn chỉ chứa 1 phần tử mà thôi.
	
### 18. HashSet & LinkedHashSet & EnumSet
>HashSet là class thực thi giao diện Set Interface dựa trên cấu trúc dữ liệu bảng băm (Hash Table) cho phép việc truy câp tìm kiếm (contains), thêm (add), xóa (remove) các phần tử trong Set được thực thi với tốc độ O(1). 
	
Đây cũng là loại Set có tốc độ cao nhất.

–Một điểm đáng chú ý là trong khi sử, Iterator của HashSet có thể sẽ throw ConcurrentModificationException nếu bạn thay đổi nội dung HashSet (thêm hoặc xóa bớt phần tử) sau khi Iterator đã được tạo ra.

> LinkedHashSet là sự kết hợp giữ bảng băm (Hash table) và danh sách liên kết (linked list) để thực thi giao diện Set Interface. 

Tuy được kế thừa từ HashSet nhưng khác so với HashSet đó là các phần tử trong LinkedHashSet được lưu giữ dưới dạng danh sách liên kết 2 chiều.

– Một điều cần chú ý là Iterator của LinkedHashSet cho chúng ta các phần tử theo thứ tự thời gian chèn vào Set (insertion-order), phần tử nào được thêm vào trước sẽ nằm trước, và trường hợp thêm lại một phần tử đã có trong Set sẽ không ảnh hưởng tới thứ tự trong Iterator.

>EnumSet cũng là 1 class thực thi giao diện Set Interface,tuy nhiên thay vì việc các phần tử trong Set là các đối tượng của một lớp nào đó thì các phần tử trong EnumSet lại các giá trị Enum.
	
### 19. Set Interface và các phương thức bên trong
Set Inteface là một interface con được kế thừa từ Collection Interface vì vậy nó có đầy đủ các phương thức của Collection Interface, hơn nữa Set Interface cũng không có thêm 1 phương thức nào vì vậy các bạn có thể xem lại phần 2: Collection Interface để hiểu rõ hơn về các phương thức của Set Interface.

Chú ý: cách làm việc của 2 phương thức add() và addAll() trong Set Interface sẽ hơi khác với trong Collection Interface. Đó là với Set Interface, 2 phương thức này sẽ chỉ thêm phần tử vào trong Set nếu như phần tử đó chưa có trong Set.
	
### 20. Nested class (lớp lồng nhau) là gì?
### 21.Mục đích của phương thức toString() trong java là gì?
### 22. Tại sao các đối tượng String trong java là immutable?	
### 23. Immutable String trong java
Trong java đối tượng string là bất biến(immutable). Bất biến có nghĩa là không thể thay đổi

### 24. Sự khác nhau giữa HashSet và TreeSet là gì?
### 25. Sự khác nhau giữa ArrayList và LinkedList là gì?
**  Cả hai lớp này đều là lớp không đồng bộ (non-synchronized).

1. ) 	ArrayList nội bộ sử dụng mảng động để lưu trữ các phần tử.	
		LinkedList nội bộ sử dụng danh sách liên kết doubly để lưu trữ các phần tử.
		
2. ) 	Thao tác với ArrayList là chậm bởi vì nó sử dụng nội bộ mảng. 
		Nếu bất kỳ phần tử nào được xoá khỏi mảng, tất cả các bit được chuyển trong bộ nhớ.	
		Thao tác với LinkedList là nhanh hơn so với ArrayList bởi vì nó sử dụng danh sách liên kết doubly do đó không cần chuyển đổi bit nào trong bộ nhớ.
		
3. ) 	Lớp ArrayList trong java chỉ có thể hoạt động như một list vì nó chỉ implements giao tiếp List.	
		Lớp LinkedList trong java có thể hoạt động như một list và queue(hàng đợi) vì nó implements các giao tiếp List và Deque.
		
4. )	ArrayList là tốt hơn trong việc lưu trữ và truy cập dữ liệu.	
		LinkedList là tốt hơn trong việc thao tác dữ liệu.
		
### 26. legacy class
### 27. Marker interface in Java
### 28.	String
>String object được lưu trong một vùng bộ nhớ đặc biệt được biết đến là string constant pool tại sao Java lại phải sử dụng đến khái niệm string literal

### 30. Hạn chế khi dùng mảng là gì?

# OOP
## 1. OOP là gì?

OOP là từ viết tắt của  Object Oriented Programing , một phương pháp lập trình mà ở đó các chương trình được coi là tập hợp các đối tượng. Mỗi đối tượng là thể hiện của một lớp (class).

## 2. Các đặc tính cơ bản của OOP?

Các đặc tính cơ bản của OOP là:

*   Tính trừu tượng.
*   Tính kế thừa.
*   TÍnh đóng gói.
*   Tính đa hình.

## 3. Lớp là gì?

Lớp có thể hiểu đơn giản là đại diện của một loại đối tượng. Nó là một bản kế hoạch, một bản mẫu hay bản thiết kế diễn tả đối tượng.

## 4. Đối tượng là gì?

Đối tượng là một thể hiện của lớp và nó có thuộc tính, hành vi và bản sắc riêng.

## 5. Tính đóng gói là gì?

Tính đóng gói là một đặc tính của OOP, nó đảm bảo cho thông tin của đối tượng luôn được che giấu. Các thông tin được ẩn giấu ấy bị giới hạn sử dụng trong phạm vi các thành viên của lớp ấy.

Có các mức độ che giấu là: public, protected, private, internal và protected internal.

## 6. Tính đa hình là gì? 

Tính đa hình là việc các hành vi , thuộc tính của lớp con có thể thay đổi, không còn rập khuôn trong một khuôn mẫu của lớp cha khi các hành vi và phương thức ấy không còn phù hợp.

Hiểu đơn giản, tính đa hình làm cho các đối tượng không bị rập khuôn trong một khuôn mẫu giống nhau.

## 7. Tính kế thừa là gì?

Tính kế thừa là một khái niệm chỉ việc một lớp có thể chia sẻ kiến trúc, phương  thức và thuộc tính cho một class khác. Nếu việc kế thừa chỉ được thực hiện trên một class thì nó được gọi là kế thừa đơn , còn nếu nó có thể được thực hiện trên nhiều class khác nhau thì nó được gọi là đa kế thừa.

## 8. Manipulator là gì?

Manipulator là các hàm có thể được sử dụng kết hợp với các toán tử “<<” và “>>” trên một đối tượng. Ví dụ như endl và setw.

## 9. Định nghĩa một phương thức khởi tạo trong OOP?

Phương thức khởi tạo (constructor) là một phương thức được sử dụng để khởi tạo các thuộc tính của một đối tượng và được gọi ngay khi đối tượng được tạo ra. 

Các quy định cho phương thức khởi tạo là:

*   Tên của phương thức khởi bạo phải là tên của một lớp.
*   Phương thức khởi tạo không thể là một phương thức có trả về.

## 10. Định nghĩa một phương thức hủy?

Phương thức hủy là một phương thức được tự động gọi khi một đối tượng đã được sử dụng xong hoặc bị hủy bỏ. Tên của phương thức hủy cũng phải trùng với tên class nhưng với dấu ngã “~” ở phía trước tên.

## 11. Nội hàm (Inline function) là gì?

Nội hàm là một kĩ thuật được sử dụng bởi trình biên dịch và “” để chèn nội dung của hàm vào hàm được sử dụng trong mã nguồn chương trình.

## 12. Nạp chồng là gì?

Nạp chồng là việc một phương thức, thuộc tính có tên giống nhau nhưng khác nhau về số lượng và  loại tham số. Toán tử “-” , “*” có thể được sử dụng để nhảy qua các phương thức và nó có một làn ưu tiên thực hiện riêng.

## 13. Lớp trừu tượng là gì?

Một lớp trừu tượng là một lớp không thể được khởi taọ. Việc khởi tạo đối tượng từ một lớp trừu tượng là bất khả thi, nhưng nó lại có thể được kế thừa.  Một lớp trừu tượng có thể chỉ chứa duy nhất một phương thức trừu tượng. Java chỉ cho phép các phương thức trừu tượng được ở bên trong lớp trừu tượng trong khi các ngôn ngữ khác vẫn có thể cho phép các phương thức không phải là trừu tượng ở bên trong nó.

## 14. Thế nào là interface?

Một interface có thể hiểu là một tập hợp các phương thức trừu tượng. Nếu lớp thực thi một interface thì nó sẽ kế thừa tất cả các phương thức trừu tượng trong interface đấy.

## 15. Xử lí ngoại lệ là gì?

Xử lí ngoại lệ là một sự kiện xảy ra trong suốt quá trình thực thi chương trình. Các xử lí ngoại lệ có hai loại: Ngoại lệ thời gian chạy và ngoại lệ lỗi. Những ngoại lệ này được xử lí thông qua các cơ chế xử lí ngoại lệ như try, catch và throw.

## 16. Thế nào là thực thi đa hình?

Thực thi đa hình (Run time polymorphism) cũng được biết đến như việc ghi đè phương thức trong lúc được gọi đến một phương thức bị ghi đè được giải quyết trong suốt thời gian thực thi, không phải trong thời gian biên dịch. Điều này có nghĩa là có hai hoặc nhiều phương thức cùng tên, cùng chữ kí nhưng khác thực thi.

## 17.Liên kết tĩnh và động là gì?

Liên kết tĩnh là một ràng buộc trong đó tên có thể được liên kết với lớp trong thời gian biên dịch và nó còn được gọi là liên kết sớm.

Liên kết động là một ràng buộc trong đó tên có thể được liên kết với lớp trong thời gian thực hiện và nó còn được gọi là Liên kết muộn.

## 18. Phương thức khởi tạo sao chép là gì?

Đây là một phương thức khởi tạo đặc biệt cho việc tạo một bản copy của đối tượng từ một đối tượng đã tồn tại. Sẽ luôn chỉ có một phương thức khởi tạo sao chép được xác định bởi hệ thống hoặc người dùng.

## 19. Sự khác nhau giữa lớp và đối tượng?

Một đối tượng là thể hiện của một lớp. Các đối tượng nắm giữ tất cả các thông tin trong khi class thì không.  Các thuộc tính và phương thức được định nghĩa trong class được thực thi và sử dụng trong các đối tượng.
Các lớp có thể có các lớp con kế thừa trong khi đối tượng thì không.

## 20. Khác biệt giữa cấu trúc (structure) và lớp?

Quyền truy cập của cấu trúc được mặc định là public nhưng loại truy cập của  lớp là private. Một cấu trúc được sử dụng cho một nhóm các dữ liệu nơi các lớp có thể sử dụng cho nhóm dữ liệu và các phương thức. Các cấu trúc duy nhất được sử dụng cho dữ liệu và nó không đòi hỏi sự nghiêm ngặt trong việc xác nhận truy cập  nhưng các lớp lại được sử dụng để đóng gói và kế thừa dữ liệu, thứ đòi hỏi sự nghiêm ngặt trong việc này.

