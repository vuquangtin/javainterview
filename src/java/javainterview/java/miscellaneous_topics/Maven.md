## Maven là gì?
Apache Maven là chương trình quản lý dự án được sử dụng nhiều bởi Java developer, nó thực hiện các công việc như khởi tạo project, biên dịch, đóng gói, chạy test… một cách tự động và nhanh chóng. Nó đặc biệt hữu dụng với các dự án tầm trung và lớn.

- Nó thường được so sánh với Apache Ant, nhưng nó hoạt động khác hẳn với Apcache Ant.
- Mỗi dự án sẽ được mô tả trong một file có định dạng XML có tên "pom.xml". File này sẽ chứa một số thông tin như tên dự án, các thư mục tài nguyên liên quan, các libraries sử dụng… Khi bắt đầu biên dịch, trình Maven sẽ đọc file này và tự động tải các libraries cần thiết từ repositories của nó thông qua mạng hoặc nơi người dùng đã định nghĩa.

Mục tiêu chính của Maven đó là cho phép một developer hiểu được toàn bộ hệ thống trong thời gian ngắn nhất, để được như vậy, Maven phải thành công trong các lĩnh vực sau:

1. Làm cho việc xây dựng hệ thống một cách dễ dàng hơn. Khi sử dụng Maven, người dùng không cần phải biết bộ máy phía dưới, Maven che chắn rất tốt các chi tiết cụ thể của hệ thống rồi (=))).

2. Cung cấp cho người dùng một hệ thống xây dựng thống nhất. Maven cung cấp rất nhiều thông tin hữu ích mà một phần là được trích từ file POM của java project mà bạn đã build.

3. Cung cấp thông tin dự án một cách chuyên nghiệp

4. Đưa ra hướng dẫn cụ thể nhất cho việc phát triển thực nghiệm. Maven giữ source code thử nghiệm của người dùng trong một nơi riêng. Maven cũng nhằm mục đích hỗ trợ trong công viện quản lý dự án, phát hiện và theo dõi vấn đề. Hướng dẫn về cách bố trí cây thư mục của dự án để người dùng tìm hiểu có thể dễ dàng hơn.

5. Cho phép tự động update những tính năng mới. Maven cung cấp cho người dùng một cách đơn giản để cập nhật những bản update mới mà Maven đã làm.

Được phát triển bằng ngôn ngữ Java cho phép Maven chạy trên nhiều nền tảng khác nhau: Windows, Linux và Mac OS...
### Maven hoạt động như nào?
>Maven dùng khái niệm Project Object Model (POM) để mô tả việc build project, các thành phần phụ thuộc và các module. Nó định nghĩa trước các target cho việc khai báo task, trình biên dịch, đóng gói và thứ tự hoạt động để mọi việc diến ra tốt nhất.

Trong mỗi project Maven tạo ra một file .pom, trong file này định nghĩa ra những task như task khi chạy test, task khi build và khi chạy Maven sẽ dựa vào những định nghĩa này để thao tác với project.
Ví dụ file .pom

```xml
<!-- .pom -->
<project>
  <!-- model version is always 4.0.0 for Maven 2.x POMs -->
  <modelVersion>4.0.0</modelVersion>

  <!-- project coordinates, i.e. a group of values which
       uniquely identify this project -->

  <groupId>com.mycompany.app</groupId>
  <artifactId>my-app</artifactId>
  <version>1.0</version>

  <!-- library dependencies -->

  <dependencies>
    <dependency>

      <!-- coordinates of the required library -->

      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>

      <!-- this dependency is only used for running and compiling tests -->

      <scope>test</scope>

    </dependency>
  </dependencies>
</project>

```

### Tại Sao cần Maven?
Khi một project do nhiều nhóm phát triển ví dụ có 2 team cùng tham gia dự án, 2 team đó ở 2 quốc gia khác nhau vì thế chúng ta luôn cần có một sự liên lạc để thống nhất trong việc lập trình vì thế phải có một cái chuẩn nào đó để tất cả mọi người cùng tuân theo, như trong việc sử dụng những thư viện nào, version của thư viện tất cả những thứ như vậy đều được Maven quản lý.

Đối với những hệ thống lớn, phức tạp sử dụng nhiều thư viện lại đòi hỏi phải release liên tục cho nên công việc đóng gói (build & deploy), quản lý, nâng cấp và bào trì chúng rất mất thời gian, và lúc đó ta có Maven.
###  Khởi tạo một Project Java bằng Maven
Tạo Project:

```xml
mvn archetype:generate -DgroupId=com.mycompany.app 
    -DartifactId=my-app 
    -DarchetypeArtifactId=maven-archetype-quickstart 
    -DinteractiveMode=false
```
Tham số :

- **groupId**: thường đặt theo tên của tổ chức hoặc nhóm tạo ra dự án
- **artifactId**: thường lấy theo tên viết tắt của dự án.
- **archetypeArtifactId**: là loại dự án sẽ được tạo, Maven cung cấp nhiều kiểu mẫu có sẵn cho người dùng lựa chọn khi khởi tạo.

### Lượt sử
Maven ban đầu được xây dựng để thực hiện tiến trình build trên dự án mang tên Jakarta Turbine. Nhưng sau đó Apache đã phát triển Maven lên một tầm cao mới, có khả năng build nhiều project cùng nhau, chiết xuất thông tin dự án, triển khai, chia sẽ tệp JAR cho nhiều dự án.

### Cấu trúc POM.xml
- ```<groupId>, <artifactId>, <version>``` bộ ba thông tin để mô tả tên, version của project. com.framgia.maven (namespace)
- ```<artifactId>helloworld</artifactId>``` (tên project)
- ```<version>1.0</version>``` (vesion)
- ```<packaging>``` định nghĩa định dạng khi đóng gói thành phần, có thể là jar, war, ear… jar (đóng gói thành .jar )
- ```<dependency>``` nơi khai báo các thư viện sử dụng trong dự án

```xml <dependencies>
  <dependency>
    <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
  </dependency>
</dependencies>
```
- ```<plugins>``` định nghĩa những Plugin sử dụng trong project trong dự án:
(Ví dụ khi sử dụng Plugin để build một java project)

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
          <archive>
            <manifest>
              <addClasspath>true</addClasspath>
              <classpathPrefix>lib/</classpathPrefix>
              <mainClass>com.framgia.app.App</mainClass>
            </manifest>
          </archive>
          <source>1.5</source>
          <target>1.5</target>
        </configuration>
      <version>2.3.2</version>
   </plugin>
  </plugins>
</build>
```

### Cấu trúc thư mục chuẩn
Một dự án thông thường có cấu trúc cây thư mục như sau:

| | |
|-----|-----|
|Mã nguồn	 |{Thư mục chứa dự án}/src/main/java|
|Tài nguyên (config, hình ảnh, data file,…)|	 {Thư mục chứa dự án}/src/main/resources
|Tests	 |{Thư mục chứa dự án}/target/classes
|Các class đã biên dịch	 |{Thư mục chứa dự án}/src/test
|File đóng gói (jar,war,ear)	| {Thư mục chứa dự án}/target

### Maven commands
- Build project với maven: ```mvn package```
- Deploy to Tomcat: ```mvn tomcat:deploy```
- Tạo file .project để có thể import vào eclipse: ```mvn eclipse:eclipse```
- Chạy unit test ```mvn test```
- Clean project: ```mvn clean```

@see https://sites.google.com/site/datspringtuts/maven/4mavenplugins