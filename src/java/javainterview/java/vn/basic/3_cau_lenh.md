# Câu lệnh trong JAVA

## Mệnh đề if-else

Mệnh đề if trong java được sử dụng để kiểm tra giá trị dạng boolean của điều kiện. Mệnh đề này trả về giá trị True hoặc False . Có các kiểu của mệnh đề if-else trong java như sau:

- Mệnh đề if
- Mệnh đề if-else
- Mệnh đề if-else-if

Ví dụ:

```java
if (condition1) {
// Các câu lệnh thực hiện khi biểu thức điều kiện 1 là true;
} else if (condition2) {
// Các câu lệnh thực hiện khi biểu thức điều kiện 2 là true;
} else if (condition3) {
// Các câu lệnh thực hiện khi biểu thức điều kiện 3 là true;
}
...
else {
// Các câu lệnh thực hiện khi tất cả biểu thức điều kiện là false;
}
```

### Câu lệnh if-else rút gọn ? :

```java
condition ? <câu lệnh khi condition là true> : <câu lệnh khi codition là false>
```

### Các toán tử tham gia vào biểu thức điều kiện

Dưới đây là danh sách các toán tử thường đươc sử dụng trong một biểu thức điều kiện (condition).

- ">" Lớn hơn
- "<" Nhỏ hơn
- ">=" Lớn hơn hoặc bằng
- "<=" Nhỏ hơn hặc bằng
- "&&" Và
- "||" hoặc
- "==" So sánh bằng
- "!=" So sánh khác nhau
- "!" Phủ định

## Mệnh đề Switch-case

switch sẽ kiểm tra giá trị của một biến (variable), và so sánh biến với từng giá trị khác nhau từ trên xuống dưới, mỗi giá trị cần so sánh được gọi là một trường hợp (case). Khi một trường hợp đúng, khối lệnh của trường hợp đó sẽ được thực thi (execute).

Nếu tất cả các trường hợp đều sai, khối lệnh default sẽ được thực thi. Chú ý, trong cấu trúc của câu lệnh switch, có thể có hoặc không có khối lệnh default.

Khi tìm thấy một trường hợp đúng, khối lệnh của trường hợp đó sẽ được thực thi. Nếu không bắt gặp lệnh break trong khối lệnh này, chương trình sẽ thực hiện tiếp các khối lệnh bên dưới cho tới khi nó bắt gặp lệnh break, hoặc không còn khối lệnh nào để thực thi.

Lệnh break làm chương trình thoát ra khỏi switch.

Chú ý rằng với câu lệnh case phải là một giá trị cụ thể, không thể thực hiện phép tính so sánh hay tính toán trong case. Ví dụ: case (age < 18)

### Trường hợp sử dụng

Trong một vài trường hợp, bạn dùng quá nhiều cấu trúc rẽ nhánh dạng if-else, và điều kiện của các mã xử lý này có điểm tương đồng. Bạn có thể nghĩ đến việc sử dụng cấu trúc switch-case.

Ví dụ: bạn cần xét các tháng trong 1 năm. Chúng ta sẽ cần khá nhiều cấu trúc rẽ nhánh dạng if, if-else hoặc các dạng mở rộng hơn để xét tất cả 12 tháng. Tôi sẽ trình bày cụ thể ví dụ này ở trong phần Ví dụ mệnh đề Switch-case nhiều hơn 1 case.

```java
public class Switchtatement {
  public static void main(String[] args) {
    int month = 10;
    switch (month) {
    case 1:
      System.out.println("January");
      break;
    case 2:
      System.out.println("February");
      break;
    case 3:
      System.out.println("March");
      break;
    case 4:
      System.out.println("April");
      break;
    case 5:
      System.out.println("May");
      break;
    case 6:
      System.out.println("June");
      break;
    case 7:
      System.out.println("July");
      break;
    case 8:
      System.out.println("August");
      break;
    case 9:
      System.out.println("September");
      break;
    case 10:
      System.out.println("October");
      break;
    case 11:
      System.out.println("November");
      break;
    case 12:
      System.out.println("December");
      break;
    default:
      System.out.println("Error");
      break;
    }
  }
}
```

### Vài điểm cần lưu ý khi sử dụng switch

- Cách mô tả các trường hợp có thể xảy ra, các bạn có thể mô tả từng trường hợp cụ thể, hoặc gom thành nhóm các trường hợp giống nhau. (case 1: case2: { })
- Luôn phải thông báo kết thúc phần lệnh cần thực thi của mỗi trường hợp hoặc nhóm trường hợp thông qua câu lệnh break.
- Luôn tận dụng câu lệnh default để thực thi những mệnh lệnh đối với trường hợp ngoại lệ (trường hợp khác).

### So sánh giữa if và switch trong lập trình Java

if |	switch
------------ | -------------
Mỗi if có biểu thức logic bên trong nó để định giá trị là đúng hay sai |	Mỗi case trong switch phải là một giá trị cụ thể, không có biểu thức logic bên trong.
Các biến trong biểu thức có thể định giá trị của bất kỳ kiểu giá trị nào |	Biểu thức phải định giá trị là byte, short, chart, int hoặc enum
Chỉ một khối lệnh được thực thi |	Nếu câu lệnh break bị bỏ qua, thì các câu lệnh từ case đúng trở về sau sẽ được thực hiện

## Vòng lặp for

Vòng lặp for trong java được sử dụng để lặp một phần của chương trình nhiều lần. Nếu số lần lặp là cố định thì vong lặp for được khuyến khích sử dụng, còn nếu số lần lặp không cố định thì nên sử dụng vòng lặp while hoặc do while.

Các kiểu của vòng lặp for trong java:

- Vòng lặp for đơn giản
- Vòng lặp for cải tiến

### Vòng lặp for đơn giản

VD:

```java
for (int i = 1; i <= 5; i++) { 
  System.out.print(i + " "); 
} 
```

### Vòng lặp for cải tiến

Vòng lặp for cải tiến được sử dụng để lặp mảng (array) hoặc tập hợp (collection) trong java. Bạn có thể sử dụng nó dễ dàng, dễ hơn cả vòng lặp for đơn giản. Bởi vì bạn không cần phải tăng hay giảm giá trị của biến rồi check điều kiện, bạn chỉ cần sử dụng ký hiệu hai chấm “:”

VD:

```java
int []arr = {1, 2, 3, 4, 5  };
for (int i : arr) { 
    System.out.print(i + " "); 
}
```

### Vòng lặp for vô tận

Nếu bạn để điều kiện lặp là true hoặc không xác định thì vòng lặp for sẽ chạy đến vô tận… đến khi bạn stop chương trình đối với mỗi IDE (Eclipse, Netbean…) hoặc bấm Ctrl + C khi chạy bằng command hoặc đến khi hết bộ nhớ (StackOverflow).

Một điều khá đặc biệt là có thể sử dụng vòng lặp for vô tận, kết hợp với kiểm tra điều kiện kết thúc với lệnh break để thay thế cho vòng lặp while.

## Vòng lặp while

Vòng lặp while trong java được sử dụng để lặp một phần của chương trình một vài lần. Nếu số lần lặp không được xác định trước thì vòng lặp lặp while được khuyến khích sử dụng trong trường hợp này.

Cú pháp

```java
while (condition) {
// Khối lệnh được lặp lại cho đến khi condition là sai (condition = false)
}
```

## Vòng lặp do-while 

Vòng lặp do-while trong java được sử dụng để lặp một phần của chương trình một vài lần. Tương tự như vòng lặp while, ngoại trừ do-while thực hiện lệnh ít nhất một lần ngay cả khi điều kiện là false.

Cú pháp:

```java
do { 
 // Khối lệnh được thực thi
} while(condition);
```

## Câu lệnh điều khiển vòng lặp trong Java (break, continue)

### break

Từ khóa break trong java được sử dụng để dừng thực thi lệnh trong vòng lặp hoặc trong mệnh đề switch tại điều kiện đã được chỉ định. Đối với vòng lặp bên trong vòng lặp khác, thì nó chỉ dừng vòng lặp bên trong đó.

Ví dụ:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 4) {
        break;
    }
    System.out.print(i + " ");
}
// kết quả: 1 2 3
```

### continue

Từ khóa continue trong java được sử dụng để tiếp tục vòng lặp tại điều kiện đã được xác định, với điều kiện đó khối lệnh phía sau từ khóa continue sẽ không được thực thi. Đối với vòng lặp bên trong một vòng lặp khác, continue chỉ có tác dụng với vọng lặp bên trong đó.

Ví dụ:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 4) {
        continue;
    }
    System.out.print(i + " ");
}
// kết quả: 1 2 3 5
```


	
	
	
	

