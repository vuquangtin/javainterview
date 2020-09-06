# ProcessBuilder trong Java, chạy lệnh cmd trong Java
## Tổng quan về ProcessBuilder trong Java
>ProcessBuilder là 1 class được sử dụng để tạo các tiến trình hệ điều hành.

Trong Java, ta sẽ dùng ProcessBuilder để thực hiện gọi tới các chương trình bên ngoài, các lệnh của hệ điều hành.

Ví dụ:

Đoạn code dưới đây thực hiện gọi lệnh ping trong cmd và trả về kết quả trên màn hình:

```java
try {
  // kiểm tra ping google.com (gửi 5 gói tin)
  ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "ping stackjava.com -n 5");
  // thực thi command line
  Process p = builder.start();
  // lấy kết quả trả về trên command line
  BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
  String line;
  while (true) {
    line = r.readLine();
    if (line == null) {
      break;
    }
    System.out.println(line);
  }
} catch (IOException ex) {
  System.out.println("loi Ping: " + ex.toString());
}
```
Kết quả:

```java
Pinging stackjava.com [150.95.18.239] with 32 bytes of data:
Reply from 150.95.18.239: bytes=32 time=10ms TTL=49
Reply from 150.95.18.239: bytes=32 time=5ms TTL=49
Reply from 150.95.18.239: bytes=32 time=3ms TTL=49
Reply from 150.95.18.239: bytes=32 time=7ms TTL=49
Reply from 150.95.18.239: bytes=32 time=14ms TTL=49

Ping statistics for 150.95.18.239:
    Packets: Sent = 5, Received = 5, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 3ms, Maximum = 14ms, Average = 7ms
```
## Chạy lệnh cmd trong Java
Ở đây mình sẽ hướng dẫn mọi người thực thi lệnh cmd của window trong Java (Bạn cũng có thể làm điều này với 

```java
Runtime.getRuntime().exec("command line");
```

Đầu tiên các bạn có thể tham khảo các lệnh cmd trên window tại: https://ss64.com/nt/

**Ví dụ 1:**
Thực hiện lệnh ping tới trang web stackjava.com:

```java
try {
  // kiểm tra ping google.com (gửi 5 gói tin)
  ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "ping stackjava.com -n 5");
  // thực thi command line
  Process p = builder.start();
  // lấy kết quả trả về trên command line
  BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
  String line;
  while (true) {
    line = r.readLine();
    if (line == null) {
      break;
    }
    System.out.println(line);
  }
} catch (IOException ex) {
  System.out.println("loi Ping: " + ex.toString());
}
```
Kết quả:

```java
Pinging stackjava.com [150.95.18.239] with 32 bytes of data:
Reply from 150.95.18.239: bytes=32 time=10ms TTL=49
Reply from 150.95.18.239: bytes=32 time=5ms TTL=49
Reply from 150.95.18.239: bytes=32 time=3ms TTL=49
Reply from 150.95.18.239: bytes=32 time=7ms TTL=49
Reply from 150.95.18.239: bytes=32 time=14ms TTL=49

Ping statistics for 150.95.18.239:
    Packets: Sent = 5, Received = 5, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 3ms, Maximum = 14ms, Average = 7ms
```

Hàm khởi tạo của ProcessBuilder là: 

```java
ProcessBuilder(String... command){...}
```

hoặc 

```java
public ProcessBuilder(List<String> command){...}
```

Tức là ta sẽ truyền vào các lệnh để nó thực thi.

Ở ví dụ trên mình gọi: 

```java
new ProcessBuilder("cmd.exe", "/c", "ping stackjava.com -n 5");
```

- cmd.exe: thực hiện chạy cmd
- /c: Carries out the command specified by string and then terminates, các bạn có thể xem thêm bằng cách chạy lệnh cmd /?

- ping stackjava.com -n 5: thực hiện gửi 5 gói tin tới trang web stackjava.com, bạn có thể gửi nhiều gói tin hơn bằng cách thay số 5 thành số gói tin gửi hoặc thay ‘-n 5’ bằng ‘-t’ để gửi số gói tin không giới hạn.

Ví dụ 2:
Thực hiện liệt kê tất cả các file và folder trong ổ ‘C:’

```java
try {
  // liet ke cac file trong thu muc hien hanh
  ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dir");
  // run command line at: C:\\ (nó tương ứng với lệnh cd C:/
  builder.directory(new File("C:\\"));
  // thực thi command line
  Process p = builder.start();
  // lấy kết quả trả về trên command line
  BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
  String line;
  while (true) {
    line = r.readLine();
    if (line == null) {
      break;
    }
    System.out.println(line);
  }
} catch (Exception ex) {
  System.out.println("loi CdSource.main: " + ex.toString());
}
```

Ví dụ 3:
Thực hiện xóa file D://a.txt

```java
String filePath = "a.txt";
try {
  // tạo processbuilder
  ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "del \"" + filePath + "\" ");
  // run command line at: D:\\ (nó tương ứng với lệnh cd D:/
  builder.directory(new File("D:\\"));
  
  // thực thi command line
  Process p = builder.start();
  // lấy kết quả trả về trên command line
  BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
  String line;
  while (true) {
    line = r.readLine();
    if (line == null) {
      break;
    }
    System.out.println(line);
  }
} catch (Exception ex) {
  System.out.println("loi delete: " + ex.toString());
  }
}
```