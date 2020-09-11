# OCPJP 6 Mock Exam – 9
----

### 1 . What is the result when you compile and run the following code?


```java
class Top {

	static void myTop() {
		System.out.println("Testing myTop method in Top class");
	}
}

public class Down extends Top {

	void myTop() {
		System.out.println("Testing myTop method in Down class");
	}

	public static void main(String[] args) {
		Top t = new Down();
		t.myTop();
	}
}
```

Choose the one below:

1.     **Compile Time error**
2.     Runtime error
3.     Prints Testing myTop method in Top class on the console
4.     Prints Testing myTop method in Down class on the screen


>This instance method cannot override the static method from Top

### 2 . Which of the code fragments will throw an “ArrayOutOfBoundsException” ?


1.     for (int i = 0; i < args.length; i ++ ) {
     System.out.print( i ) ;
     }
2.     System.out.print(args.length);
3.     **for ( int i = 0; i < 1; i++ ) {
     	System.out.print(args[i]);
     }**
4.     None of the above

>	Exception in thread "main" ```java.lang.ArrayIndexOutOfBoundsException```: 0
	at javainterview.java.scjp03.Down.main(Down.java:27)
>

### 3 . What is the result of the following program, when you compile and run?

```java
public class MyTest {

    final int x;
    public MyTest() {
        System.out.println( x + 10 );
    }
    public static void main( String args[] ) {
           MyTest mt = new MyTest();
    }
}
```

Choose the one below:

1.     **Compile time error**
2.     Runtime error
3.     Prints on the screen 10
4.     Throws an exception


### 4 . What is the output when you compile and run the following code fragment?


```java
class MyTest04 {

	public void myTest() {
		System.out.println("Printing myTest in MyTest class");
	}

	public static void myStat() {
		System.out.println("Printing myStat in MyTest class");
	}
}

public class Test extends MyTest04 {

	public void myTest() {
		System.out.println("Printing myTest in Test class");
	}

	public static void myStat() {
		System.out.println("Printing myStat in Test class");
	}

	public static void main(String args[]) {

		MyTest04 mt = new Test();
		mt.myTest();
		mt.myStat();
	}
}
```

Choose the one below:

1.     Printing myTest in MyTest class followed by Printing myStat in MyTest class
2.     **Printing myTest in Test class followed by Printing myStat in MyTest class**
3.     Printing myTest in MyTest class followed by Printing myStat in MyTest class
4.     Printing myStat in MyTest class followed by Printing myStat in MyTest class

>Printing myTest in Test class Printing myStat in MyTest class

### Select all the exceptions thrown by wait() method of an Object class, which you can replace in the place of xxx legally?


```java
class T implements Runnable {

	public void run() {
		System.out.println("Executing run() method");
		myTest();
	}

	public synchronized void myTest() {
            try {
                wait(-1000);
                System.out.println( "Executing the myTest() method" );
            }   XXX
    }
}

public class MyTest05 {

	public static void main(String args[]) {
		T t = new T();
		Thread th = new Thread(t);
		th.start();
	}
}
```

Choose the one below:

1.     catch ( InterruptedException ie) {}
2.     catch ( IllegalArgumentException il ) {}
3.     catch ( IllegalMonitorStateException im ) {}
4.     **Only catch ( InterruptedException e ) {} exception**

```
try {
		wait(-1000);
			System.out.println("Executing the myTest() method");
	} catch (InterruptedException im) {		
	}
```

### Which of the following are examples of immutable classes , select all correct answer(s)?

1.     **String**
2.     StringBuffer
3.     Double
4.     Integer

### 7 . Select the correct answer for the code fragment given below?

```java
public class TestBuffer {

	public void myBuf(StringBuffer s, StringBuffer s1) {
		s.append(" how are you");
		s = s1;
	}

	public static void main(String args[]) {
		TestBuffer tb = new TestBuffer();
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer("doing");
		tb.myBuf(s, s1);
		System.out.print(s);
	}
}
```

Choose the one below:

1.     **Prints Hello how are you**
2.     Prints Hello
3.     Prints Hello how are you doing
4.     Compile time error


### 8. What is the result when you compile and run the following code?


```java
public class MyTest08 {

	public void myTest(int[] increment) {
		increment[1]++;
	}

	public static void main(String args[]) {
		int myArray[] = new int[1];
		MyTest08 mt = new MyTest08();
		mt.myTest(myArray);
		System.out.println(myArray[1]);
	}
}
```

Choose the one below:

1.     Compile time error
2.     Runtime error
3.     **ArrayOutOfBoundsException**
4.     Prints 1 on the screen

>Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
>array index bat dau = 0

```java
public class MyTest08 {

	public void myTest(int[] increment) {
		increment[0]++;
	}

	public static void main(String args[]) {
		int myArray[] = new int[1];//init =0
		MyTest08 mt = new MyTest08();
		mt.myTest(myArray);
		System.out.println(myArray[0]);
		//print 1
	}
}
```

### 9 . Choose all valid identifiers?

1.     **int100**
2.     byte
3.     **aString**
4.     a-Big-Integer
5.     **Boolean**
6.     strictfp



### 10 . Select the equivalent answer for the code given below?

```java
boolean b = true;
if ( b ) {
    x =  y;
} else {
   x = z;
}

```

Choose the one below:

1.     x = b ? x = y : x = z ;
2.     x = b ? y : z ;
3.     b = x ? y : z ;
4.     b = x ? x = y : x = z ;


### 11 . Choose all correct answers?

1.     int a [][] = new int [20][20];
2.     int [] a [] = new int [20][];
3.     int [][] a = new int [10][];
4.     int [][] a = new int [][10];

### 12 . Consider the following code and select the correct answer?


```java
class Vehicle {

	String str;

	public Vehicle() {
	}

	public Vehicle(String s) {
		str = s;
	}
}

public class Car extends Vehicle {

	public static void main(String args[]) {
		final Vehicle v = new Vehicle(" Hello");
		v = new Vehicle(" How are you");
		v.str = "How is going";
		System.out.println("Greeting is : " + v.str);
	}
}
```

Choose the one below:

1.     Compiler error while subclassing the Vehicle
2.     **Compiler error , you cannot assign a value to final variable**
3.     Prints Hello
4.     Prints How is going

### 13 . Java source files are concerned which of the following are true ?

1.     Java source files can have more than one package statements.
2.     Contains any number of non-public classes and only one public class
3.     Contains any number of non-public classes and any number of public classes
4.     import statements can appear anywhere in the class
5.     Package statements should appear only in the first line or before any import statements of source file



### 14 . Select all correct answers from the following?


```java
int a = -1;
int b = -1;
a  = a>>> 31;
b = b>> 31;

```

Choose the one below:

1.     a = 1, b =1
2.     a = -1, b -1
3.     a = 1, b = 0
4.     a = 1, b = -1


### 15 . What is the value of a , when you compile and run the following code?


```java
public class MyTest15 {

	public static void main(String args[]) {

		int a = 10;
		int b = 9;
		int c = 7;
		a = a ^ b ^ c;
		System.out.println(a);

	}

}
```

Choose the one below:

1.     10
2.     9
3.     7
4.     **4**


### 16 . The following code has some errors, select all the correct answers from the following?


```java
public class MyTest16 {

    public void myTest( int i ) {
            for ( int x = 0; x < i; x++ ) {
                  System.out.println( x ) ;
            }
     }
     public abstract void Test() {
             myTest(10);
     }
}
```

Choose the one below:

1.     At class declaration
2.     myTest() method declaration
3.     Test() method declaration
4.     No errors, compiles successfully


### 17 . At what point the following code shows compile time error?


```java
class A {
	A() {
		System.out.println("Class A constructor");
	}
}

class B extends A {
	B() {
		System.out.println("Class B constructor");
	}
}

public class C extends A {
	C() {
		System.out.println("Class C constructor");
	}

	public static void main(String args[]) {
		A a = new A(); // Line 1
		A a1 = new B(); // Line 2
		A a2 = new C(); // Line 3
		B b = new C(); // Line 4
	}
}

```

Choose the one below:

1.     A a = new A(); // Line 1
2.     A a1 = new B(); // Line 2
3.     A a2 = new C(); // Line 3
4.     **B b = new C(); // Line 4**


### 18 . Which of the following statements would return false?


```java
String s = new String ("New year");
String s1 = new String("new Year");
```

Choose the one below:

1.     **s == s1**
2.     **s.equals(s1);**
3.     s = s1;
4.     None of the above


### 19 . Select all correct answers about what is the definition of an interface?

1.     It is a blue print
2.     A new data type
3.     Nothing but a class definition
4.     To provide multiple inheritance




### 20.Select all correct answers from the following code snippets?

1.

```    
// Comments
    import java.awt.*;
    package com;
    import java.awt.*;
```

2.

```
     // Comments
    package com;
```

3.

```
     package com;
    import java.awt.*;
     // Comments
```

4.

``` 
    // Comments
    package com;
    import java.awt.*;
    public class MyTest {}
```


### 21 . What is the result when you compile and run the following code?


```java
public class MyError {

	public static void main(String args[]) {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			x = new Math(i);
			new System.out.println(x);
		}
	}
}

```


Choose the one below:

1.     Prints 0 to 9 in sequence
2.     No output
3.     Runtime error
4.     **Compile time error**

### 22 . There are two computers are connected to internet, one computer is trying to open a socket connection to read the home page of another computer, what are the possible exceptions thrown while connection and reading InputStream?

1.     IOException
2.     MalformedURLException
3.     NetworkException
4.     ConnectException


### 23 . What is the result from the following code when you run?


```java
class A23 {

	A23() throws Exception {
		System.out.println("Executing class A constructor");
		throw new IOException();
	}
}

public class B23 extends A23 {
	B23() {
		System.out.println("Executing class B constructor");
	}

	public static void main(String args[]) {
		try {
			A23 a = new B23();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
```

Choose the one below:

1.     Executing class A constructor
2.     Executing class B constructor
3.     Runtime error
4.     **Compile time erro**

### 24 . What is the result from the following code when you run?


```java
class A24 {

	A24() {
		System.out.println("Executing class A constructor");
	}

	A24(int a) throws Exception {
		System.out.println("Executing class A constructor");
		throw new IOException();
	}

}

public class B24 extends A24 {
	B24() {
		System.out.println("Executing class B constructor");
	}

	public static void main(String args[]) {
		try {
			A24 a = new B24();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
```

Choose the one below:

1.     **Executing class A constructor followed by Executing class B constructor**
2.     No output
3.     Runtime error
4.     Compile time error


### 25 . What is the result when you compile and run the following code?


```java
		byte Byte = 10;
		byte Double = 12;
		byte Integer = Byte * Double;
```

Choose the one below:

1.     120;
2.     Compile time error while declaring variables
3.     **Compile time error while multiplication**
4.     None of the above


### 26 . Select all valid methods for Component class?


1.     setBounds(), setVisible(), setFont()
2.     add(), remove()
3.     setEnabled(), setVisible()
4.     addComponent()

### 27 . Which subclasses of the Component class will display the MenuBar?

1.     Window, Applet
2.     Applet, Panel
3.     Frame
4.     Menu, Dialog


### 28. Select all correct answers from the following statements?

1.     Frame’s default layout manager is BorderLayout
2.     CheckBox, List are examples of non visual components
3.     Applets are used to draw custom drawings
4.     Canvas has no default behavior or appearance

### 29 . Select all the methods of java.awt.List?

1.     void addItem(String s), int getRows()
2.     void addItem(String s, int index), void getRows()
3.     int[] getSelectedIndexes(), int getItemCount()
4.     int[] getSelectedIndexes(), String[] getSelectedItems()

### 30 . Please select all correct answers?

1.     java.awt.TextArea.SCROLLBARS_NONE
2.     java.awt.TextArea does not generate Key events
3.     java.awt.TextField generates Key events and Action events
4.     java.awt.TextArea can be scrolled using the keys.

### 31 . What is the result if you try to compile and run the following code ?

```java
public class MyTest {

   public static void myTest() {
          System.out.println( "Printing myTest() method" );
   }
   public void myMethod() {
         System.out.println( "Printing myMethod() method" );

   }
   public static void main(String[] args) {
          myTest();
          myMethod();
   }

}

```

Choose the one below:

1.     Compile time error
2.     Compiles successfully
3.     **Error in main method declaration**
4.     Prints on the screen Printing myTest() method followed by Printing myMethod() method


### 32 . What line of a given program will throw FileNotFoundException?


```java
package javainterview.java.scjp03;

import java.io.*;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class MyReader {

	public static void main(String args[]) {
		try {
			FileReader fileReader = new FileReader("MyFile.java");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String strString;
			fileReader.close();

			while ((strString = bufferedReader.readLine()) != null) {
				System.out.println(strString);
			}

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

	}
}

```

Choose the one below:

1.     This program never throws FileNotFoundException
2.     The line fileReader.close() throws FileNotFoundException
3.     At instantiation of FileReader object.
4.     While constructing the BufferedReader object


### 33 . When the following program will throw an IOException?


```java
import java.io.*;

public class FileWrite {
       public static void main(String args[]) {
              try {
              String strString = "Now is the time to take Sun Certification";
              char buffer[] = new char[strString.length()];
              strString.getChars(0, strString.length(), buffer, 0);
              FileWriter f = new FileWriter("MyFile1.txt");
              FileWriter f1 = f;
              f1.close();
              for (int i=0; i < buffer.length; i += 2) {
                   f.write(buffer[i]);
              }
             f.close();

            FileWriter f2 = new FileWriter("MyFile2.txt");
            f2.write(buffer);
            f2.close();
            } catch ( IOException ie ) {
                System.out.println( ie.getMessage());
            }
      }
}

```


Choose the one below:

1.     This program never throws IOException
2.     **The line f1.close() throws IOException**
3.     While writing to the stream f.write(buffer[i]) throws an IOExcpetion
4.     While constructing the FileWriter object


### 34 . Which line of the program could be throwing an exception, if the program is as listed below. Assume that “MyFile2.txt” is a read only file.?


```java
import java.io.*;

class FileWrite34 {
	public static void main(String args[]) {
		try {
			String strString = "Updating the critical data section";
			char buffer[] = new char[strString.length()];
			strString.getChars(0, strString.length(), buffer, 0);
			FileWriter f = new FileWriter("MyFile1.txt");
			FileWriter f1 = f;
			for (int i = 0; i < buffer.length; i += 2) {
				f1.write(buffer[i]);
			}
			f1.close();

			FileWriter f2 = new FileWriter("MyFile2.txt");
			f2.write(buffer);
			f2.close();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
```

Choose the one below:

1.     This program never throws IOException
2.     The line f1.close() throws IOException
3.     While writing to the stream f1.write(buffer[i]) throws an IOException
4.     While constructing the FileWriter f2 = new FileWriter(“MyFile2.txt”);


### 35 . Select all the correct answers about File Class?

1.     A File class can be used to create files and directories
2.     A File class has a method mkdir() to create directories
3.     A File class has a method mkdirs() to create directory and its parent directories
4.     A File cannot be used to create directories

### 36 . Using File class, you can navigate the different directories and list all the files in the those directories?

1.     True
2.     False

### 37 . Select all the constructor definitions of “FileOutputStream”?

1.     FileOutputStream(FileDescriptor fd)
2.     FileOutputStream(String fileName, boolean append)
3.     FileOutputStream(RandomAccessFile raFile)
4.     FileOutputStream( String dirName, String filename)

### 38 . Select all correct answers for Font class?

1.     new Font ( Font.BOLD, 18, 16)
2.     new Font ( Font.SERIF, 24, 18)
3.     new Font ( “Serif”, Font.PLAIN, 24);
4.     new Font ( “SanSerif”, Font.ITALIC, 24);
5.     new Font ( “SanSerif”, Font.BOLD+Font.ITALIC, 24);

### 39 . In an applet programing the requirement is that, what ever the changes you do in the applets graphics context need to be accumulated to the previous drawn information. Select all the correct code snippets?

1.

```
    public void update ( Graphics g) {
    paint( g) ;
    }
```

2.

```
    public void update ( Graphics g) {
    update( g) ;
    }
```

3.

```
    public void update ( Graphics g) {
    repaint( g) ;
    }
```

4.

```
    public void update ( Graphics g) {
    print( g) ;
    }
```

40 . How can you load the image from the same server where you are loading the applet, select the correct answer form the following?

1.

```
    public void init() {
    Image i = getImage ( getDocumentBase(), “Logo.jpeg”);
    }
```

2.

```
    public void init() {
    Image i = getImage ( “Logo.jpeg”);
    }
```

3.

```
    public void init() {
    Image i = new Image ( “Logo.jpeg”);
    }
```

4.

```
    public void init() {
    Image i = getImage ( new Image( “Logo.jpeg”) );
    }
```

### 41 . Which of the following answers can be legally placed in the place of XXX?


```java
class Check {
	Check() {
	}
}

public class ICheck extends Check {
	public static void main(String[] args) {
		Object o = new ICheck();
		Check i = new ICheck();
		Check c = new Check();

		if (o instanceof XXX) {
			System.out.println("True");
		}
	}

}
```

Choose the one below:

1.     Object, ICheck only
2.     Check , ICheck only
3.     Object only
4.     Object, Check, ICheck

### 42 . There are 20 threads are waiting in the waiting pool with same priority, how can you invoke 15th thread from the waiting pool?

1.     By calling resume() method
2.     By calling interrupt() method
3.     Calling call() method
4.     By calling notify(15) method on the thread instance
5.     None of the above

### 43 . Select all the correct answers regarding thread synchronization ?

1.     You can synchronize entire method
2.     A class can be synchronized
3.     Block of code can be synchronized
4.     The notify() and notifyAll() methods are called only within a synchronized code

### 44 . The thread run() method has the following code, what is the result when the thread runs?


```java
try {
     sleep( 200 );
     System.out.println( "Printing from thread run() method" );
} catch ( IOException ie) { }

```

Choose the one below:

1.     Compile time error
2.     Prints on the console Printing from thread run() method
3.     At line 2 the thread will be stop running and resumes after 200 milliseconds and prints Printing from thread run() method
4.     At line 2 the thread will be stop running and resumes exactly 200 milliseconds elapsed


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```



### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```

### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```


### 


```java
```



### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 