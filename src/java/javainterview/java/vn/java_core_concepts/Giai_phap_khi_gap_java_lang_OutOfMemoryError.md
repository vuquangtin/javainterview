# Giải pháp khi gặp java.lang.OutOfMemoryError	
Mọi lập trình viên java đều phải đối mặt với ```java.lang.OutOfMemoryError``` và nó là một vấn đề về giới hạn của hệ thống ( bộ nhớ ) hơn là lỗi lập trình trong một số trường hợp. Tuy nhiên trong một số trường hợp với memory leak cũng gây ra java.lang.OutOfMemoryError .Tôi nhận ra rằng mặc dù java.lang.OutOfMemoryError là kiến thức khá cơ bản về nguyên nhân và giải pháp, nhưng phần lớn các lập trình viên không biết rõ nó. Cuốn sách cơ bản cho người mới như Head First Java không hướng dẫn cho bạn cách xử lí với những lỗi như này. Bạn cần một kinh nghiệm thực tế xử lí với các hệ thống sản xuất, giải quyết một số lượng lớn phiên người dùng để khắc phục sự cố về hiệu năng như không đủ bộ nhớ

Nếu bạn muốn tốt hơn trong xử lí sự cố và phân tích hiệu năng, bạn cần phải đọc vài cuốn sách về Java hiệu năng và profiling như Java Performance The definitive Guide của Scott Oaks hoặc Java Performance của Binu John. Họ không những là cảm hứng tuyệt vời cho lập trình viên Java senior mà còn chỉ bạn công cụ và phương pháp khi gặp những lỗi như java.lang.OutOfMemoryError.

Trong bài viết này, chúng tôi sẽ tìm hiểu java.lang.OutOfMemoryError là gì ? Tại sao OutOfMemoryError lại xảy ra với ứng dụng Java? sự khác nhau giữa OutOfMemoryError và Làm thế nào để khắc phục OutOfMemoryError  trong Java. Bài viết còn cung cấp kiến thức cơ bản về  java.lang.OutOfMemoryError và chúng tôi sẽ không bàn luận chi tiết về profiling. Về profiling hãy đọc những cuốn sách đã được tối nhắc ở trên.

java.lang.OutOfMemoryError trong Java là gì?

OutOfMemoryError trong Java là một subclass của java.lang.VirtualMachineError và JVM ném java.lang.OutOfMemoryError khi nó hết bộ nhớ trong heap. OutOfMemoryError trong Java có thể xảy ra bất cứ lúc nào trong heap, chủ yếu khi bạn cố gắng tạo một object và không có đủ không gian trên heap để phân bổ đối tượng đó. Tuy nhiên Javadoc của OutOfMemoryError không cung cấp nhiều thông tin về nó.

2 loại chủ yếu của OutOfMemoryError:

1) java.lang.OutOfMemoryError: không gian Java heap

2) java.lang.OutOfMemoryError: không gian PermGen

Mặc dù cả hai đều xảy ra khi JVM hết bộ nhớ nhưng chúng rất khác nhau và các giải pháp của chúng cũng độc lập với nhau.

Sự khác biệt giữa “java.lang.OutOfMemoryError: không gian heap của Java” và “java.lang.OutOfMemoryError: PermGen không gian”

Nếu bạn đã quen thuộc với các generations khác nhau trên heap và cách thức hoạt động của garbage collection trong java và hiểu biết old generation, new generation và permanent generation thì bạn sẽ dễ dàng luận ra nguyên căn của OutOfMemoryError. Permanent generation của heap được sử dụng để lưu trữ String pool và siêu dữ liệu (metadata) khác nhau theo yêu cầu của JVM liên quan đến Class, phương thức và các java primitives khác.

Bởi vì hầu hết kích thước mặc định của JVM trong không gian Perm là khoảng “64MB” bạn có thể dễ dàng tràn bộ nhớ nếu có quá nhiều lớp hoặc một số lượng lớn các chuỗi trong dự án của bạn.

Điểm quan trọng cần ghi nhớ là nó không phụ thuộc vào giá trị -Xmx vì vậy dù kích thước heap của bạn lớn như thế nào thì bạn có thể gây ra OutOfMemory trong không gian perm. Tốt hơn hết là nên chỉ định kích thước của permanent generation sử dụng các tùy chọn JVM “-XX: PermSize” và “-XX: MaxPermSize” dựa trên nhu cầu dự án.

Một điều nhỏ cần nhớ là “=” được sử dụng để tách riêng tham số và giá trị trong khi chỉ định kích thước không gian perm trong heap và “=” không cần thiết trong thiết lập kích thước heap tối đa, như ví dụ dưới đây.

export JVM_ARGS=”-Xmx1024m -XX:MaxPermSize=256m”

Một lý do khác của “java.lang.OutOfMemoryError: PermGen” là bộ nhớ bị rò rỉ thông qua Classloaders và nó thường xuất hiện trong WebServer và ứng dụng máy chủ như tomcat, WebSphere, glassfish hoặc WebLogic.

Trong các ứng dụng máy chủ, các classloaders khác nhau được sử dụng để tải các ứng dụng web khác nhau giúp triển khai và không triển khai một ứng dụng mà không ảnh hưởng đến ứng dụng khác trên cùng một máy chủ . Nhưng trong khi không triển khai nếu container bằng cách nào đó giữ tham chiếu của bất kỳ lớp loaded bởi trình ứng dụng lớp loader thì lớp đó và tất cả các lớp liên quan khác sẽ không được thu gom bởi GC và nhanh chóng làm đầy các không gian PermGen nếu bạn triển khai và không triển khai ứng dụng của bạn nhiều lần.

“Java.lang.OutOfMemoryError: PermGen” đã được quan sát nhiều lần trong tomcat bằng những dự án cuối cùng của chúng tôi, nhưng giải pháp của vấn đề này thực sự phức tạp bởi vì trước tiên bạn cần phải biết lớp nào đang gây rò rỉ bộ nhớ và sau đó bạn cần phải sửa nó. Một lý do khác của OutOfMemoryError trong không gian PermGen là nếu bất kỳ luồng đã bắt đầu trong lúc khởi chạy ứng dụng không được thoát ra khi bạn gỡ bỏ ứng dụng.

Đây chỉ là một số ví dụ về rò rỉ classloader thông dụng, bất kỳ ai viết code cho việc xếp và dỡ bỏ các lớp đều phải rất thận trọng để tránh trường hợp này. Bạn cũng có thể sử dụng visualgc để theo dõi không gian PermGen, công cụ này sẽ hiển thị biểu đồ của không gian PermGen và bạn có thể thấy được thời gian và cách mà permanent generation tăng lên. Tôi khuyến khích nên sử dụng công cụ này trước khi đưa ra bất kỳ kết luận.

Một nguyên nhân khác khá không rõ ràng nhưng thú vị của “java.lang.OutOfMemoryError: PermGen” chúng tôi tìm thấy là giới thiệu các tùy chọn JVM “-Xlasslassgc”.

Tùy chọn này đôi khi được sử dụng để tránh tải và giải phóng các lớp khi không có thêm tham chiếu đang hoạt động, nhưng sử dụng tùy chọn này trong môi trường J2EE có thể rất nguy hiểm vì nhiều framework như Struts, spring vv sử dụng sự đối xứng để tạo ra các lớp và với việc triển khai và không triển khai thường xuyên sẽ làm tràn bộ nhớ trong PermGen nếu tham chiếu trước đó không được xóa bỏ. Trường hợp này cũng chỉ ra rằng đôi khi đối số JVM hoặc cấu hình xấu có thể gây ra OutOfMemoryError trong Java.

Vì vậy, kết luận là tránh sử dụng “-Xnwlassgc” trong môi trường J2EE đặc biệt là với AppServer.

Tomcat để xử lí OutOfMemoryError trong không gian PermGen

Từ Tomcat 6.0 trở lên cung cấp tính năng phát hiện rò rỉ bộ nhớ, có thể phát hiện nhiều rò rỉ bộ nhớ thường gặp trên góc nhìn ứng dụng web, ví dụ như rò rỉ bộ nhớ ThreadLocal, đăng ký trình điều khiển JDBC, RMI Targes, LogFactory và Thread phát sinh bởi các ứng dụng web. Kiểm tra chi tiết đầy đủ ở đây  bạn cũng có thể phát hiện rò rỉ bộ nhớ bằng cách truy cập vào ứng dụng quản lý đi kèm với tomcat, trong trường hợp bạn đang gặp rắc rối bộ nhớ trên bất kỳ java-web app nào thì tốt nhất nên chạy nó trên Tomcat.

Cách xử lí java.lang.OutOfMemoryError: không gian Java heap ?

1) Một cách dễ dàng để giải quyết OutOfMemoryError trong java là tăng kích thước heap tối đa bằng cách sử dụng tùy chọn JVM “-Xmx512M”, nó ngay lập tức giải quyết OutOfMemoryError. Đây là giải pháp ưa thích của tôi khi gặp OutOfMemoryError trong Eclipse, Maven hoặc ANT vì dựa trên kích thước của dự án bạn có thể dễ dàng bị tràn bộ nhớ. Đây là một ví dụ về tăng kích thước heap tối đa của JVM, sẽ tôt hơn nếu giữ -Xmx thành -Xms theo tỉ lệ hoặc 1: 1 hoặc 1: 1.5 nếu bạn đang thiết lập kích thước heap trong ứng dụng java .

export JVM_ARGS = “- Xms1024m-Xmx1024m”

2) Cách thứ hai để giải quyết OutOfMemoryError trong Java thì khó hơn và được dùng tới khi bạn không có nhiều bộ nhớ và thậm chí sau khi tăng kích thước heap tối đa bạn vẫn gặp java.lang.OutOfMemoryError. Trong trường hợp này, bạn có thể muốn cấu hình ứng dụng của bạn và tìm bất kỳ nguồn phát sinh rò rỉ bộ nhớ. Bạn có thể sử dụng Eclipse Memory Analyzer để kiểm tra heap dump hoặc có thể sử dụng bất kỳ profiler như Netbeans hoặc JProbe. Đây là giải pháp khó khăn và cần một khoảng thời gian để phân tích và tìm ra rò rỉ bộ nhớ.

Cách xử lí java.lang.OutOfMemoryError: không gian PermGen

Như đã giải thích ở trên, lỗi OutOfMemory này trong java diễn ra khi permanent generation của heap đã đầy. Để khắc phục OutOfMemoryError, bạn cần tăng kích thước không gian heap Perm bằng cách sử dụng tùy chọn JVM “-XX: MaxPermSize”. Bạn cũng có thể xác định kích thước ban đầu của không gian Perm bằng cách sử dụng “-XX: PermSize” và giữ cả không gian Heap ban đầu và tối đa. Bạn có thể ngăn chặn một số bộ thu gom rác có thể xảy ra khi Perm Space được giới hạn lại. Đây là cách bạn có thể xác định kích thước Perm ban đầu và tối đa trong Java:

export JVM_ARGS = “- XX: PermSize = 64M -XX: MaxPermSize = 256m”

Đôi lúc java.lang.OutOfMemoryError trong Java trở nên khó khăn nên với những trường hợp này và profiling là giải pháp cuối cùng .Nếu bạn có quyền tự do tăng kích thước heap trong java, bạn nên thực hiện theo cách quản lí bộ nhớ thông thường trong khi coding và gán null cho bất kì tham chiếu nào không được sử dung.

Đó là tất cả những gì tôi biết về OutOfMemoryError trong Java Tôi sẽ cố gắng viết nhiều hơn về tìm kiếm rò rỉ bộ nhớ trong java và sử dụng profiler trong một số bài khác. Xin vui lòng chia sẻ cách tiếp cận của bạn để giải quyết java.lang.OutOfMemoryError trong Java là gì.

Công cụ tìm kiếm và khắc phục OutOfMemoryError trong Java

Java.lang.OutOfMemoryError là một loại lỗi đòi hỏi rất nhiều lần kiểm tra để tìm ra nguyên nhân gốc rễ của vấn đề, mà đối tượng là lấy bộ nhớ, bao nhiêu bộ nhớ nó đang dùng hoặc tìm kiếm rò rỉ bộ nhớ .Tất nhiên, bạn không thể làm điều này mà không có kiến ​​thức về các công cụ có sẵn trong java. Ở đây tôi liệt kê ra một số công cụ miễn phí được sử dụng để phân tích heap và giúp tìm ra nguyên nhân của OutOfMemoryError

1) Visualgc Visualgc

Visualgc Visualgc là viết tắt của Visual Garbage Collection Monitoring Tool ,có thể đính kèm nó vào công cụ hỗ trợ hotspot JVM . Điểm mạnh lớn nhất của visualgc là nó sẽ hiển thị tất cả các dữ liệu quan trọng bằng đồ hoạ bao gồm class loader, GC và dữ liệu hiệu suất trình biên dịch JVM. JVM được xác định bởi bộ nhận dạng máy ảo của nó cũng được gọi là vmid. Bạn có thể đọc thêm về tùy chọn visualgc và vmid ở đây.

2) Jmap

Jmap là một command line tiện ích đi kèm với JDK6 và cho phép bạn lấy một memory dump của heap trong một file. Xem ví dụ sử dụng sau:

jmap -dump: format = b, file = heapdump 6054

Ở đây tập tin xác định tên của tập tin memory dump là “heap dump” và 6054 là PID của tiến độ java. Bạn có thể tìm thấy PDI bằng cách sử dụng lệnh “ps -ef” hoặc Windows Task manager hoặc bằng cách sử dụng công cụ được gọi là “jps” (Công cụ trạng thái quy trình máy ảo Java)

3) Jhat

Jhat được biết đến với tên hat (heap analyzer tool) . Bây giờ là một phần của JDK6 .Bạn có thể sử dụng jhat để phân tích tập tin dump heap tạo ra bằng cách sử dụng “jmap” .Jhat cũng là một command line tiện ích và bạn có thể chạy nó từ cửa sổ cmd như hình dưới đây: jhat -J-Xmx256m heapdump Ở đây nó sẽ phân tích bộ nhớ chứa trong tập tin “heapdump”. Khi bạn bắt đầu jhat sẽ đọc tập tin dump heap và sau đó lắng nghe trên cổng HTTP, chỉ cần trỏ trình duyệt của bạn vào cổng mà jhat nơi nó đang lắng nghe theo mặc định 7.000 và sau đó có thể bắt đầu phân tích các đối tượng hiện tại.

4) Bộ phân tích bộ nhớ Eclipse

Bộ phân tích bộ nhớ Eclipse (MAT) là một công cụ từ nền tảng eclipse để phân tích các heap dump của java. Nó giúp tìm ra classloader leaks và memory leaks, giúp giảm thiểu mức tiêu thụ bộ nhớ. Bạn có thể sử dụng MAT để phân tích heap dump chứa hàng triệu đối tượng và nó cũng giúp rút ra vài thông tin từ sự nghi ngờ về rò rỉ bộ nhớ.

5) Các cuốn sách về Profiling

Khi kinh nghiệm Java của bạn tăng lên, kỳ vọng cũng tăng theo các kỹ năng cần thiết như phân tích vấn đề hiệu suất và thành thạo profiling. Bạn sẽ không thường học các kỹ năng đó trừ khi bạn gặp một áp lực khiến bạn phải tìm hiểu. Để xử lý hiệu quả lỗi như java.lang.OutOfMemoryError, bạn nên đọc những cuốn sách hay về khắc phục sự cố và điều chỉnh hiệu suất ví dụ: Java Performance The Definitive Guide của Scott Oaks.
