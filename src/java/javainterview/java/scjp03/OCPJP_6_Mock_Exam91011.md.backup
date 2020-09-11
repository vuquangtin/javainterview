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


### 45 . What is the result when you compile and run the following code?


```java
import java.awt.*;
public class TestBorder extends Frame {
	public static void main(String args[]) {
		Button b = new Button("Hello");
		TestBorder t = new TestBorder();
		t.setSize(150, 150);
		t.add(b);
	}
}

```

Choose the one below:

1.     A Frame with one big button named Hello
2.     A small button Hello in the center of the frame
3.     A small button Hello in the right corner of the frame
4.     Frame does not visible

### 46 . Select all correct answers from the following?

1.     public abstract void Test() { }
2.     public void abstract Test();
3.     public abstract void Test();
4.     native void doSomthing( int i );

### 47 . Please select all correct statements from the following?

1.     toString() method is defined in Object class.
2.     toString() method is defined in Class class.
3.     wait(), notify(), notifyAll() methods are defined in Object class and used for Thread communication.
4.     toString() method provides string representation of an Object state.

### 48 . From the following declarations select all correct variables/method declarations?


```java
Button bt = new Button ("Hello");

```

Choose the one below:

1.     public transient int val;
2.     public synchronized void Test() ;
3.     bt.addActionListener( new ActionListener () );
4.    

```java
synchronized ( this ) {
    // Assume that “this” is an arbitrary object instance.
    }
```


### 49 . Which of the following classes will throw “NumberFormatException”?

1.     Double
2.     Boolean
3.     Integer
4.     Byte

### 50 . Fill all the blanks from the following ?

1)

```java
Math.abs(3.0) returns 3.0     
Math.abs(-3.4) returns ——–
```
2) 
    
```java
Math.ceil(3.4) returns ——–
Math.ceil(-3.4) returns -3.0
```
3)     

```java
Math.floor(3.4) returns ——–
Math.ceil(-3.4) returns -4.0
```

4)     

```java
Math.round(3.4) returns 3
Math.round(-3.4) returns ——-
```

### 51 . Select from the following which is legal to put in the place of XXX?


```java
public class OuterClass {
    private String s = "I am outer class member variable";
    class InnerClass {
           private String s1 = "I am inner class variable";
           public void innerMethod() {
                  System.out.println(s);
                  System.out.println(s1);
           }
  }
    public static void outerMethod() {
           // XXX legal code here
           inner.innerMethod();
    }
}

```

Choose the one below:

1.     **OuterClass.InnerClass inner = new OuterClass().new InnerClass();**
2.     InnerClass inner = new InnerClass();
3.     new InnerClass();
4.     None of the above

>OuterClass.InnerClass inner = new OuterClass().new InnerClass();

### 52 . If you save and compile the following code, it gives compile time error. How do you correct the compile time error?


```java
public class OuterClass52 {
	final String s = "I am outer class member variable";

	public void Method() {
		String s1 = "I am inner class variable";
		class InnerClass {
			public void innerMethod() {
				int xyz = 20;
				System.out.println(s);
				System.out.println("Integer value is" + xyz);
				System.out.println(s1); // Illegal, compiler error
			}
		}
	}

}
```

Choose the one below:

1.     By making s1 as static variable
2.     By making s1 as public variable
3.     **By making s1 as final variable**
4.     By making InnerClass as static


### 53 . What is the reason using $ in inner class representation?

1.     Because the inner classes are defined inside of any class
2.     Due to the reason that inner classes can be defined inside any method
3.     This is convention adopted by Sun, to insure that there is no ambiguity between packages and inner classes.
4.     Because if use getClass().getName() will gives you the error

### 54 . What is the result when you compile and run the following code?


```java
import java.util.*;
public class MyVector54 {

      public Vector myVector () {
            Vector v = new Vector();
            return v.addElement( "Adding element to vector");
       }

        public static void main ( String [] args) {
        	MyVector54 mv = new MyVector54();
                               System.out.println(mv.myVector());
         }
}
```

Choose the one below:

1.     Prints Adding element to vector
2.     **Compile time error**
3.     Runtime error
4.     Compiles and runs successfully



### 55 . What is the output on the screen when compile and run the following code?


```java
public class TestComp {

	public static void main(String args[]) {
		int x = 1;
		System.out.println("The value of x is " + (~x >> x));
	}
}
```

Choose the one below:

1.     1
2.     2
3.     -1
4.     -2


### 56 . The method getWhen() is defined in which of the following class?

1.     AWTEvent
2.     EventObject
3.     InputEvent
4.     MouseEvent

### 57 . Select all correct answers from the following?

1.     getSource() method is defined in java.awt.AWTEvent class
2.     getSource() method is defined in java.util.EventObject class
3.     getID() method is defined in java.awt.AWTEvent class
4.     getID() method is defined in java.util.EventObject class

### 58 . Which of the following are correct answers?

1.     A listener object is an instance of a class that implements a listener interface.
2.     An event source is an object , which can register listener objects and sends notifications whenever event occurs.
3.     Event sources fires the events.
4.     Event listeners fires events.

### 59 . What are possible ways to implement LinkedList class?

1.     As a HashMap
2.     As a Queue
3.     As a TreeSet
4.     As a Stack

### 60 . Please select the correct answer from the following?


```java
public class ThrowsDemo {
	static void throwMethod() throws Exception {
		System.out.println("Inside throwMethod.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwMethod();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}
}
```

Choose the one below:

1.     Compilation error
2.     Runtime error
3.     Compile successfully, nothing is printed.
4.     inside throwMethod. followed by caught: java.lang.IllegalAccessException: demo

# Answers
----

1 : 1 is correct. Compile Time error.
Explanation:Generally static methods can be overridden by static methods only .. Static methods may not be overridden by non static methods..

2 : 3 is correct.
for ( int i = 0; i < 1; i++ ) {
System.out.print(args[i]);
}
Explanation:Answer 3 will cause an “ArrayOutOfBoundsException” if you do not pass the command line arguments to the Java Program. 1 and 2 will work without any problem.

 3 : 1 is correct. Compile time error.
Explanation:The final variables behaves like constants, so the final variables must be initialized before accessing them. They can be initialized where they are declared or in every “constructor” if the class. ( even if class has one or more constructors defined ).

4 : 2 is correct. Printing myTest in Test class followed by Printing myStat in MyTest class.

Explanation:Static methods are determined at compile time but the non static ( instance methods ) methods are identified at runtime using Run Time Type Identification ( RTTI).

5 : 1,2 & 3 is correct.
1 . catch ( InterruptedException ie) {}
2 . catch ( IllegalArgumentException il ) {}
3 . catch ( IllegalMonitorStateException im ) {}

Explanation:The wait() method of an Object class throws InterruptedException when the thread moving from running state to wait state. If the value of timeout is negative or the value of nanos is not in the range 0-999999 then wait() method throws IllegalArgumentException exception at runtime. If the current thread is not the owner of this object’s monitor then it throws IllegalMonitorStateException exception. Click here for more information from Java Documentation.

6 : 1,3 & 4 is correct.
1 . String
3 . Double
4 . Integer
Explanation:String, Integer, Double are immutable classes, once assign a values it cannot be changed. Please refer the wrapper classes for more information on Integer, and Double.

7 : 1 is correct. Prints Hello how are you
Explanation:Assigning or interchanging the object references does not change the values, but if you change the values through object references , changes the values.

8 : 2 & 3 is correct.
2 . Runtime error
3 . ArrayOutOfBoundsException

Explanation:This piece of code throws an ArrayOutOfBoundsException at runtime . If you modify the code int myArray[] = new int[1]; to int myArray[] = new int[2]; , it prints 1 on the screen. The changes you made on the array subscript seen by the caller.

9 : 1,3 & 5 is correct.
1 . int 100
3 . aString
5 . Boolean
Explanation:The byte, strictfp are Java keywords and cannot be defined as identifiers, the a-Big-Integer has “-” which is not a valid identifier. The identifiers must starts with letters, $, or _ ( underscore), subsequent characters may be letters, dollar signs, underscores or digits, any other combination will gives you the compiler error.

10 : 2 is correct.
x = b ? y : z ;
Explanation:If b is true the value of x is y, else the value is z. This is “ternary” operator provides the way to simple conditions into a single expression. If the b is true, the left of ( : ) is assigned to x else right of the ( : ) is assigned to x. Both side of the ( : ) must have the data type.

11 : 1,2 & 3 is correct.
1 . int a [][] = new int [20][20];
2 . int [] a [] = new int [20][];
3 . int [][] a = new int [10][];
Explanation:Multidimensional arrays in Java are just arrays within arrays. Multidimensional arrays are defined as rows and columns. The outer array must be initialized. If you look at the answers the outer arrays are initialized.

12 : 2 is correct.
Compiler error , you cannot assign a value to final variable
Explanation:In Java final variables are treated as constants ( comparing to other languages like Visual Basic and etc.) , once it is initialized you cannot change the values of primitive, if final variables are object references then you cannot assign any other references.

13 : 2 & 5 is correct.
2 . Contains any number of non-public classes and only one public class
5 . Package statements should appear only in the first line or before any import statements of source file

Explanation:The source files always contains only one package statement, you cannot define multiple package statements and these statements must be before the import statements. At any point of time Java source files can have any number of non-public class definitions and only one public definition class. If you have any import statements those should be defined before class definition and after the package definition.

14 : 4 is correct. a = 1, b = -1
Explanation:The operator >>> is unsigned right shift, the new bits are set to zero, so the -1 is shifted 31 times and became 1 ( because a is defined as integer ). The operator >> is signed right shift operator, the new bits take the value of the MSB ( Most Significant Bit ) . The operator <>> operator. The sifting operation is applicable to only integer data types.

15 : 4 is correct. 4.
Explanation:The operator is bitwise XOR operator. The values of a, b, c are first converted to binary equivalents and calculated using ^ operator and the results are converted back to original format.

16 : 3 is correct. Test() method declaration.
Explanation:The abstract methods cannot have body. In any class if one method is defined as abstract the class should be defined as abstract class. So in our example the Test() method must be redefined.

17 : 4 is correct. B b = new C(); // Line 4
Explanation:According to the inheritance rules, a parent class references can appear to the child class objects in the inheritance chain from top to bottom. But in our example class B, and class C are in the same level of hierarchy and also these two classes does not have parent and child relationship which violates the inheritance rules.

18 : 1 & 2 is correct.
1 . s == s1
2 . s.equals(s1);
Explanation:The string objects can be compared for equality using == or the equals() method ( even though these two have different meaning ). In our example the string objects have same wording but both are different in case. So the string object object comparison is case sensitive.

19 : 1,2 & 4 is correct.
1 . It is a blue print
2 . A new data type
4 . To provide multiple inheritance
Explanation:One of the major fundamental change in Java comparing with C++ is interfaces. In Java the interfaces will provide multiple inheritance functionality. In Java always a class can be derived from only one parent, but in C++ a class can derive from multiple parents.

20 : 3 & 4 is correct.
3 . package com;
import java.awt.*;
// Comments

4 . // Comments
package com;
import java.awt.*;
public class MyTest {}
Explanation:In a given Java source file, the package statement should be defined before all the import statement or the first line in the .java file provided if you do not have any comments or JavacDoc definitions. The sequence of definitions are:

// Comments ( if any)
Package definition
Multiple imports
Class definition

21 : 4 is correct. Compile time error.
Explanation:The code fails at the time Math class instantiation. The java.lang.Math class is final class and the default constructor defined as private. If any class has private constructors , we cannot instantiate them from out the class ( except from another constructor ).

22 : 1 & 2 is correct.
1 . IOException
2 . MalformedURLException
Explanation:In Java the the URL class will throw “MalformedURLException while construncting the URL, and while reading incoming stream of data they will throw IOException..

23 : 4 is correct. Compile time error.
Explanation:In Java the constructors can throw exceptions. If parent class default constructor is throwing an exception, the derived class default constructor should handle the exception thrown by the parent.

24 : 1 is correct.
Executing class A constructor followed by Executing class B constructor
Explanation:In Java the constructors can throw exceptions. According to the Java language exceptions, if any piece of code throwing an exception it is callers worry is to handle the exceptions thrown by the piece of code. If parent class default constructor is throwing an exception, the derived class default constructor should handle the exception thrown by the parent. But in our example the non default constructor is throwing an exception if some one calls that constructor they have to handle the exception.

25 : 3 is correct. Compile time error while multiplication.
Explanation:This does not compile because according to the arithmetic promotion rules, the * ( multiplication ) represents binary operator. There are four rules apply for binary operators. If one operand is float,double,long then other operand is converted to float,double,long else the both operands are converted to int data type. So in our example we are trying put integer into byte which is illegal.

26 : 1,2 & 3 is correct.
1 . setBounds(), setVisible(), setFont()
2 . add(), remove()
3 . setEnabled(), setVisible()
Explanation:The component class is the parent class of all AWT components like Button, List, Label and etc. Using these methods you can set the properties of components. The add(), remove() methods are used to add PopMenu and to remove MenuComponent.

27 : 3 is correct. Frame.
Explanation:Java supports two kinds of menus, pull-down and pop-up menus. Pull-down menus are accessed are accessed via a menu bar. Menu bars are only added to Frames.

28 : 1 & 4 is correct.
1 . Frame’s default layout manager is BorderLayout
4 . Canvas has no default behavior or appearance
Explanation:In Java AWT each container has it’s own default layout manager implemented as part of implementation. For example Frame has default layout manager is BorderLayout , Applet has FlowLayout and etc. The Canvas is kind of component where you can draw custom drawings. The Canvas generates Mouse, MouseMotion, and Key events.

29 : 1,3 & 4 is correct.
1 . void addItem(String s), int getRows()
3 . int[] getSelectedIndexes(), int getItemCount()
4 . int[] getSelectedIndexes(), String[] getSelectedItems()
Explanation:The java.awt.List has methods to select , count the visible rows.
void addItem(String s) –> adds an item to the bottom of the list
int getRows() –> returns the number of visible lines in the list
int[] getSelectedIndexes() –> returns array of indexes currently selected items
int getItemCount() –> returns the number of items in the list
String[] getSelectedItems() –> returns array of string values of currently selected items

30 : 1,3 & 4 is correct.
1 . java.awt.TextArea.SCROLLBARS_NONE
3 . java.awt.TextField generates Key events and Action events
4 . java.awt.TextArea can be scrolled using the keys.
Explanation:The TextArea and TextField are the subclasses of TextComponent class. The TextArea has static fields to give you the functionality of horizontal and vertical scroll bars. These are the following fields:
java.awt.TextArea.SCROLLBARS_BOTH
java.awt.TextArea.SCROLLBARS_NONE
java.awt.TextArea.SCROLLBARS_HORIZONTAL_ONLY
java.awt.TextArea.SCROLLBARS_VERTICAL_ONLY
The TextArea and TextField will generate Key events and TextField will generate Action events apart from the Key events.

 31 : 1 is correct. Compile time error.
Explanation:In Java there are two types of methods , static and non static methods. Static methods are belong to class and non static methods are belongs to instances. So from a non static method you can call static as well as static methods, but from a static method you cannot call non static methods ( unless create a instance of a class ) but you can call static methods.

32 : 3 is correct. At instantiation of FileReader object.
Explanation:While constructing the FileReader object, if the file is not found in the file system the “FileNotFoundException” is thrown. If the input stream is closed before reading the stream throws IOException.

33 : 3 is correct. While writing to the stream f.write(buffer[i]) throws an IOException
Explanation:While writing to a IO stream if the stream is closed before writing throws an IOException. In our example the f ( stream ) is closed via f1 reference variable before writing to it.

34 : 4 is correct.
While constructing the FileWriter f2 = new FileWriter(“MyFile2.txt”);
Explanation:Constructing the FileWriter object, if the file already exists it overrides it (unless explicitly specified to append to the file). FileWriter will create the file before opening it for output when you create the object. In the case of read-only files, if you try to open and IOException will be thrown.

35 : 1,2 & 3 is correct.
1 . A File class can be used to create files and directories
2 . A File class has a method mkdir() to create directories
3 . A File class has a method mkdirs() to create directory and its parent directories.
Explanation:The File class has three methods to create empty files, those are createNewFile(), createTempFile(String prefix, String suffix) and createTempFile(String prefix, String suffix, File directory).
File class has two utility methods mkdir() and mkdirs() to create directories. The mkdir() method creates the directory and returns either true or false. Returning false indicates that either directory already exists or directory cannot be created because the entire path does not exists. In the situation when the path does not exists use the mkdirs() method to create directory as well as parent directories as necessary.

36 : 1 is correct. True.
Explanation:File class can be used to navigate the directories in the underlying file system. But in the File class there is no way you change the directory . Constructing the File class instance will always point to only one particular directory. To go to another directory you may have to create another instance of a File class.

37 : 1 & 2 is correct.
1 . FileOutputStream(FileDescriptor fd)
2 . FileOutputStream(String fileName, boolean append)
Explanation:The valid FileOutputStream constructors are:

FileOutputStream(String fileName)
FileOutputStream(File file)
FileOutputStream(FileDescriptor fd)
FileOutputStream(String fileName, boolean append)

38 : 3,4 & 5 is correct.
3 . new Font ( “Serif”, Font.PLAIN, 24);
4 . new Font ( “SanSerif”, Font.ITALIC, 24);
5 . new Font ( “SanSerif”, Font.BOLD+Font.ITALIC, 24);
Explanation:The Font class gives you to set the font of a graphics context. While constructing the Font object you pass font name, style, and size of the font. The font availability is dependent on platform. The Font class has three types of font names called ” Serif”, “SanSerif”, Monospaced” these are called in JDK 1.1 and after “Times Roman”, Helavatica” and “Courier”.

39 : 1 is correct.
public void update ( Graphics g) {
paint( g) ;
}
Explanation:If you want accumulate the previous information on the graphics context override the update() and inside the method call the paint() method by passing the graphics object as an argument. The repaint() method always calls update() method

40 : 1 is correct.
public void init() {
Image i = getImage ( getDocumentBase(), “Logo.jpeg”);
}
Explanation:The Applet and Toolkit classes has a method getImage() , which has two forms:

getImage(URL file)
getImage(URL dir, String file)
These are two ways to refer an image in the server . The Applet class getDocumentBase() methods returns the URL object which is your url to the server where you came from or where your image resides.

41 : 4 is correct. Object, Check, ICheck.
Explanation:The instanceof operator checks the class of an object at runtime. In our example o refers to Object class and Check and ICheck refers to the subclasses of Object class. Due to the inheritance hierarchy Check and ICheck returns true.

42 : 5 is correct. None of the above.
Explanation:There is no way to call a particular thread from a waiting pool. The methods notify() will calls thread from waiting pool, but there is no guaranty which thread is invoked. The method notifyAll() method puts all the waiting threads from the waiting pool in ready state.

43 : 1,3 & 4 is correct.
1 . You can synchronize entire method
3 . Block of code can be synchronized
4 . The notify() and notifyAll() methods are called only within a synchronized code
Explanation:The keyword controls accessing the single resource from multiple threads at the same time. A method or a piece of code can be synchronized, but there is no way to synchronize a calls. To synchronize a method use synchronized keyword before method definition. To synchronize block of code use the synchronized keyword and the arbitrary instance.

44 : 1 is correct. Compile time error.
Explanation:The IOException never thrown here. The exception is thrown is InterruptedException. To correct instead of catching IOException use InterruptedException.

45 : 4 is correct. Frame does not visible.
Explanation:The Frame is not going to be visible unless you call setVisible(true) method on the Frame’s instance. But the frame instance is available in computers memory. If do not set the size of the Frame you see default size of the frame ( i.e.. in minimized mode)

46 : 3 & 4 is correct.
3 . public abstract void Test();
4 . native void doSomthing( int i );
Explanation:The abstract methods does not have method bodies. In any given class if one method is defined as abstract the class must defined as abstract class.

47 : 1,3 & 4 is correct.
1 . toString() method is defined in Object class.
3 . wait(), notify(), notifyAll() methods are defined in Object class and used for Thread communication.
4 . toString() method provides string representation of an Object state.
Explanation:The toString() is defined in Object class the parent all classes which will gives you the string representation of the object’s state. This more useful for debugging purpose. The wait(), notify(), notifyAll() methods are also defined in Object class are very helpful for Thread communication. These methods are called only in synchronized methods.

48 : 1 & 4 is correct.
1 . public transient int val;
4 . synchronized ( this ) {
// Assume that “this” is an arbitrary object instance.
}
Explanation:To define transient variables just include “transient” keyword in the variable definition. The transient variables are not written out any where, this is the way when you do object serialization not to write the critical data to a disk or to a database.
The “synchronized” keyword controls the single resource not to access by multiple threads at the same time. The synchronized keyword can be applied to a method or to a block of code by passing the arbitrary object instance name as an argument.

49 : 1,3 & 4 is correct.
1 . Double
3 . Integer
4 . Byte
Explanation:In Java all the primitive data types has wrapper classes to represent in object format and will throw “NumberFormatException”. The Boolean does not throw “NumberFormatException” because while constructing the wrapper class for Boolean which accepts string also as an argument.

50 :
1 . Math.abs(3.0) returns 3.0
Math.abs(-3.4) returns 3.4

2 . Math.ceil(3.4) returns 4.0
Math.ceil(-3.4) returns -3.0

3 . Math.floor(3.4) returns 3.0
Math.floor(-3.4) returns -4.0

4 . Math.round(3.4) returns 3
Math.round(-3.4) returns -3
Explanation:The Math class abs() method returns the absolute values, for negative values it just trips off the negation and returns positive absolute value. This method returns always double value.

The method ceil(), returns double value not less than the integer ( in our case 3 ). The other ways to say this method returns max integer value . ( All the decimals are rounded to 1 and is added to integer value ). For negative values it behaves exactly opposite.

The method floor() is exactly reverse process of what ceil() method does.

The round() method just rounds to closest integer value.

51 : 1 is correct.
OuterClass.InnerClass inner = new OuterClass().new InnerClass();
Explanation:The static methods are class level methods to execute those you do not need a class instance. If you try to execute any non static method or variables from static methods you need to have instance of a class. In our example we need to have OuterClass reference to execute InnerClass method.

52 : 3 is correct. By making s1 as final variable.
Explanation:In Java it is possible to declare a class inside a method. If you do this there are certain rules will be applied to access the variables of enclosing class and enclosing methods. The classes defined inside any method can access only final variables of enclosing class.

53 : 3 is correct.
This is convention adopted by Sun , to insure that there is no ambiguity between packages and inner classes.
Explanation:This is convention adopted to distinguish between packages and inner classes. If you try to use Class.forName() method the call will fail instead use getCLass().getName() on an instance of inner class.

54 : 2 is correct. Compile time error.
Explanation:The method in Vector class , addElement() returns type of void which you cannot return in our example. The myVector() method in our MyVector class returns only type of Vector.

55 : 3 is correct. -1.
Explanation:Internally the x value first gets inverted ( two’s compliment ) and then shifted 1 times. First when it is inverted it becomes negative value and shifted by one bit.

56 : 3 is correct. InputEvent.
Explanation:The InputEvent class has method getWhen() which returns the time when the event took place and the return type is long.

57 : 2 & 3 is correct.
2 . getSource() method is defined in java.util.EventObject class
3 . getID() method is defined in java.awt.AWTEvent class
Explanation:The super class of all event handling is java.util.EventObject which has a method called getSource() , which returns the object that originated the event.

The subclass of EventObject is AWTEvent has a method getID() , which returns the ID of the event which specifies the nature of the event.

58 : 1,2 & 3 is correct.
1 . A listener object is an instance of a class that implements a listener interface.
2 . An event source is an object , which can register listener objects and sends notifications whenever event occurs.
3 . Event sources fires the events.
Explanation:The event listeners are instance of the class that implements listener interface . An event source is an instance of class like Button or TextField that can register listener objects and sends notifications whenever event occurs.

59 : 2 & 4 is correct.
2 . As a Queue
4 . As a Stack
Explanation:This implements java.util.List interface and uses linked list for storage. A linked list allows elements to be added, removed from the collection at any location in the container by ordering the elements. With this implementation you can only access the elements in sequentially.You can easily treat the LinkedList as a stack, queue and etc., by using the LinkedList methods.

60 : 1 is correct. Compilation error.
Explanation:The method throwMethod() is throwing and type Exception class instance, while catching the exception you are catching the subclass of Exception class.

File class can be used to navigate the directories in the underlying file system. But in the File class there is no way you change the directory . Constructing the File class instance will always point to only one particular directory. To go to another directory you may have to create another instance of a File class.

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