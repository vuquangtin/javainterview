### So sánh JAVA vs C++
| C++|Java|
|-----|----|
| Mở rộng C với lập trình hướng đối tượng và lập trình thuần túy. Code  C có thể được sử dụng một cách riêng biệt. | Ảnh hưởng lớn bởi cú pháp C ++ / C. |
| Tương thích với mã nguồn C, trừ một vài trường hợp. | Cung cấp Giao diện Native Java và Java Native Access bằng cách để trực tiếp gọi mã C / C ++. |
| Viết một lần, biên dịch bất cứ nơi nào (WOCA). | Viết một lần, chạy ở bất cứ đâu / ở mọi nơi (WORA / WORE).
| Cho phép lập trình thủ tục, lập trình chức năng, lập trình hướng đối tượng, lập trình chung . Hỗ trợ sự kết hợp giữa các mô hình. | Cho phép lập trình thủ tục, lập trình chức năng (kể từ Java 8) và lập trình chung (kể từ Java 5), nhưng mạnh mẽ khuyến khích mô hình lập trình hướng đối tượng. Bao gồm hỗ trợ cho việc tạo ra ngôn ngữ kịch bản. |
| Chạy như mã máy thực thi cho tập lệnh cần thực thi. | Chạy trên một máy ảo. |
| Cung cấp các kiểu đối tượng và tên kiểu. Cho phép phản chiếu qua thông tin loại thời gian chạy (RTTI). | Là phản xạ, cho phép metaprogramming  và tạo mã động  runtime. |
| Có nhiều tiêu chuẩn tương thích nhị phân (thường là Microsoft (cho trình biên dịch MSVC) và Itanium / GNU (cho hầu hết các trình biên dịch khác)). | Có một chuẩn tương thích nhị phân, nền tảng cho hệ điều hành và trình biên dịch. |
| Tùy chọn tự động kiểm tra phạm vi (ví dụ: phương thức at () trong véc tơ và string). | Tất cả các hoạt động được yêu cầu kiểm tra ràng buộc bởi tất cả các bản phân phối tương thích của Java. HotSpot có thể loại bỏ kiểm tra giới hạn. |
| Hỗ trợ số học unsigned. | Số học unsigned chưa được hỗ trợ. Java 8 đã thay đổi nhưng các khía cạnh của nó chưa rõ ràng. |
| Giới hạn tối thiểu được chuẩn hóa cho tất cả các kiểu dữ liệu số, nhưng kích thước thực tế được xác định thực hiện. Các loại chuẩn được cung cấp qua thư viện chuẩn. | Giới hạn tiêu chuẩn và kích cỡ của tất cả các loại nguyên thủy trên tất cả các nền tảng. |
| Con trỏ, reference, và pass-by-value được hỗ trợ cho tất cả các kiểu(nguyên thủy hoặc người dùng xác định). | Tất cả các kiểu (các kiểu nguyên thủy và reference) luôn được truyền bằng giá trị. |
| Quản lý bộ nhớ có thể được thực hiện bằng tay thông qua new / delete, tự động theo phạm vi, hoặc bằng các smart pointer. Thu gom rác ABI được chuẩn hóa trong C ++ 11, mặc dù trình biên dịch không bắt buộc phải thực hiện việc thu gom rác. | Tự động thu gom rác. Hỗ trợ 1 phương thức không xác định finalize() nhưng được khuyến nghị không nên dùng. |
| Quản lý tài nguyên có thể được thực hiện bằng tay hoặc bằng cách tự động quản lý tài nguyên dựa trên vòng đời (RAII). | Quản lý tài nguyên thường phải được thực hiện thủ công, hoặc tự động thông qua finalizers. Đã thử với các nguồn lực để quản lý tài nguyên dựa trên phạm vi tự động (phiên bản 7 trở đi). Nó cũng có thể được thực hiện bằng cách sử dụng API nội bộ sun.misc.Unsafe nhưng sử dụng nó  rất nản lòng và sẽ được thay thế bởi một API công cộng trong một phiên bản Java sắp tới. |
| Hỗ trợ class, struct (kiểu dữ liệu thụ động (PDS)) và các liên kết, và có thể phân bổ chúng trên heap hoặc stack. | Các class được phân bổ trên heap. Java SE 6 tối ưu hóa với phân tích thoát để phân bổ một số đối tượng trên stack. |
| Cho phép overriding rõ ràng các kiểu và một số chuyển đổi thu hẹp không rõ ràng (để tương thích với C). | Kiểu dữ liệu cứng thì an toàn ngoại trừ trong việc chuyển đổi. |
| Thư viện tiêu chuẩn C ++ được thiết kế để có một phạm vi giới hạn và các chức năng, nhưng bao gồm hỗ trợ ngôn ngữ, chẩn đoán, tiện ích chung, chuỗi, vị trí, container, thuật toán, vòng lặp, số, đầu vào / đầu ra, máy phát số ngẫu nhiên, phân tích cú pháp thường, , các tính trạng kiểu (đối với sự phân tâm tĩnh) và Thư viện C chuẩn. Thư viện Boost cung cấp nhiều chức năng hơn bao gồm mạng I / O. Một số lượng lớn các thư viện của bên thứ ba tồn tại cho GUI và các chức năng khác như: Adaptive Communication Environment (ACE), Crypto ++, các thư viện IM Instant Messaging (XMPP) khác nhau, [4] OpenLDAP, Qt, gtkmm. | Thư viện chuẩn đã phát triển với mỗi lần phát hành. Trong phiên bản 1.6, thư viện bao gồm hỗ trợ cho các ngôn ngữ, khai thác gỗ, các container và các vòng lặp, các thuật toán, lập trình GUI (nhưng không sử dụng GUI hệ thống), đồ hoạ, đa luồng, mạng, an ninh nền tảng, introspection, nạp lớp động, chặn và không -chặn I / O. Nó cung cấp các giao diện hoặc các lớp hỗ trợ cho XML, XSLT, MIDI, kết nối cơ sở dữ liệu, các dịch vụ đặt tên (ví dụ: LDAP), mật mã, dịch vụ bảo mật (ví dụ như Kerberos), dịch vụ in và các dịch vụ web. SWT cung cấp một trừu tượng cho GUIs nền tảng cụ thể, nhưng đã được thay thế bởi JavaFX trong bản phát hành mới nhất; cho phép tăng tốc đồ hoạ và giao diện người dùng có thể điều chỉnh CSS. Nó mặc dù không hỗ trợ bất kỳ loại hỗ trợ "nền tảng bản địa" hỗ trợ. |
| Nạp chồng toán tử cho phần lớn toán tử. Nên giữ nguyên ý nghĩa toán tử | Toán tử không thể nạp chồng. Ngôn ngữ thay thế toán tử + và += cho lớp String. |
| Đơn thừa kế và đa thừa kế cho các lớp, kể cả thừa kế ảo | Đơn thừa kế cho các lớp. Hỗ trợ đa thừa kế thông qua Interface, tương đương với lớp trừu tượng của C++ |
| Template trong quá trình biên dịch. Hỗ trợ meta-programing - siêu lập trình | Generics được sử dụng để thực hiện "kiểu như tham số truyền vào" nhưng không được biên dịch ra bytecode, do tính type erasure của trình biên dịch Java - chỉ kiểm tra kiểu hợp lệ ở compile-time. |
| Con trỏ hàm, đối tượng hàm, biểu thức lambda(được thêm vào từ C++11) và interfaces | Tham chiếu hàm, đối tượng hàm và biểu thức lambda đã được thêm vào từ Java 8. Lớp (và interfaces) có thể được truyền bằng tham chiếu qua LopNaoDo.class.  |
| Không có cơ chế chuẩn cho việc inline tài liệu vào hàm và các lớp | Javadoc cung cấp đầy đủ tài liệu inline cho tất cả các lớp và hàm |
| Từ khóa const dùng để khai báo hằng và phương thức mà không thay đổi đối tượng. Tính "const" được dùng như 1 phương thức đảm bảo tính đúng đắn của code và tôn trọng sự thay đổi của đối tượng trong compile-time. | Từ khóa final cung cấp chức năng của const trong Java, tương đương với việc dùng con trỏ "type* const" cho đối tượng và const cho kiểu đơn giản. Tính hằng đạt được thông qua interfaces chỉ đọc và tính bao đóng. |
| Hỗ trợ từ khóa goto | Hỗ trợ label cho vòng lặp và khối lệnh. Từ khóa goto được dành riêng nhưng được đánh dấu là "không sử dụng" trong chuẩn của Java.  |
| Mã nguồn có thể được viết để trở thành đa nền tảng (có thể biên dịch cho Windows,BSD,Linux,MacOS,Solaris,... mà không cần sửa đổi) và viết cho những chức năng riêng cho từng nền tảng. Thường được biên dịch thành mã native, phải biên dịch lại cho mỗi nền tảng. | Biên dịch thành Java bytecode để chạy trong JVM - Java Virtual Machine - Máy ảo Java. Bytecode phụ thuộc vào nền tảng Java nhưng thường thì không phụ thuộc vào nền tảng hệ điều hành bên dưới. |