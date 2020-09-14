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

# OCPJP 6 Mock Exam -10
----

### 1 . Given:


```java
public abstract class Prod {
   public abstract void prmth1();
  public static void prmth2() {
     int mth2 = 30;
     System.out.println("prmth2 = " + mth2);
   }
  public abstract void prmth3();
 }

```

What is the result?

1.     Compilation succeeds
2.     Compilation fails because of an error on line 1
3.     Compilation fails because of an error on line 3
4.     Compilation fails because of an error on line 7



### 2 . Given:


```java
 public class ClassA {
   public static void main(String [] args) {

     switch(x) {
       default:
        System.out.println("Here it is.");
      }
    }
}

```

The ClassA class can be compiled successfully by inserting one of three possible options on line 3. When inserted separately, which three will allow compilation to succeed?

Choose three of the below:

1.     int x = 6;
2.     short x = 3;
3.     char x = ‘y’;
4.     long x = 354;
5.     boolean x = true;



### 3 . Given:


```java
public class NewGarb {
 public static Object getIt() {
    Object rg = new Integer(3);
  Object dg[][] = new Object[1][2];
   dg[0][1] = rg;
  dg[0][0] = rg;
   rg = null;
   return rg;
  }
}

```

Which statement is true?

1.     The NewGarb class will not compile
2.     The getIt() method must not be declared as static
3.     The NewGarb class compiles, but an exception is received because dg is not set to null
4.     The rg object is eligible for garbage collection after a call to the getIt() method has returned


### 4 . Given:


```java
public class SetFor {

   public static void main(String [] args) {

    System.out.println("You will need to use " + c);
   }
 }

```

Which two additions will individually allow compilation to succeed? (Choose two.)

1.     “char c;” placed on line 2
2.     “char c;” placed on line 4
3.     “char c = ‘f’;” placed on line 2
4.     “char c = ‘f’;” placed on line 4
5.     “static char c;” placed on line 2
6.     “char c = new char();” placed on line 4


### 5 . Given:


```java
public class TeSet {
  public static void main(String args[]) {
    int m = 2;
    int p = 1;
    int t = 0;
   for(;p < 5;p++) {
      if(t++ > m) {
       m = p + t;
     }
    }
    System.out.println("t equals " + t);
 }
}

```

What is the resulting value of t?

1.     2
2.     4
3.     6
4.     7


### 6 . Given:


```java
 class IntType {
  public String getType(String a, int b, char c) {
     String holdit1 = new String();
    holdit1 = a;
     return holdit1;
  }
 }

 class OverType extends IntType {

    String holdit2 = new String();
    holdit2 = holdit2.concat("This is ").concat(a);
    return holdit2;
  }
public static void main(String args[]) {
     OverType ot = new OverType();
    String x = new String("x");
    int y = 1;
     char z = 'b';
    System.out.println(ot.getType(x, y, z));
  }
 }

```

When inserted on line 10, which line will override the getType method, allowing compilation to succeed and the output “This is x”?

1.     public Char getType(String a, int b, char c) {
2.     public Char getType(int b, String a, char c) {
3.     public String getType(String a, int b, char c) {
4.     public String getType(int b, String a, char c) {



### 7 . Given:


```java
public class MyThread implements Runnable {
    private String holdA = "This is ";
     private int[] holdB = {1,2,3,4,5,6,7,8,9,10};
      public static void main(String args[]) {
       MyThread z = new MyThread();
       (new Thread(z)).start();
       (new Thread(z)).start();
  }

  public synchronized void run() {
    for(int w = 0;w < 10;w++) {
      System.out.println(holdA + holdB[w] + ".");
    }
  }
}

```

What is the result?

1.     Compilation fails because of an error on line 6
2.     Compilation fails because of an error on line 11
3.     Compilation fails because of errors on lines 7 and 8
4.     Compilation succeeds and the program prints each value in the holdB array at the end of the “This is ” line. Each value is printed two times before the program ends, and the values are not printed in sequential order
5.     Compilation succeeds & the prog. prints each val in the holdB array at the end of the “This is ” line. Each val is printed in order from 1-10 & after the val 10 prints, it starts printing the vals 1-10 in order again


### 8 . Given:


```java
import java.awt.*;

public class Birthdays extends Frame {
  Birthdays() {
    super("Birthday Reminder");
     String lblsP1[] = {"Name:", "Birthday:", "Address:"};
    String butnsP2[] = {"Add", "Save", "Exit"};
     Panel panelTop = new Panel();
     Panel panelBot = new Panel();
    panelTop.setLayout(new GridLayout(3,2,3,3));
    for(int x = 0; x < lblsP1.length; x++) {
      panelTop.add(new Label(lblsP1[x]));
      panelTop.add(new TextField());
    }
    for(int y = 0; y < butnsP2.length; y++) {
      panelBot.add(new Button(butnsP2[y]));
    }
    add(panelTop, BorderLayout.NORTH);
    add(panelBot, BorderLayout.SOUTH);
  }
}

```

Which main method should you add to the Birthdays class to allow the program to compile and run with all defined fields properly displayed?

1.     public static void main(String args[]) { Frame.visible = true; }
2.     public static void main(String args[]) { Frame f = new Frame(); f.setVisible(true);}
3.     public static void main(String args[]) { Birthdays b = new Birthdays(); b.pack(); b.setVisible(true); }
4.     public static void main(String args[]) { Frame f = Birthdays.new Frame(); f.pack(); f.visible = true; }


### 9 . Given:


```java
public class GetIt {
  public static void main(String args[]) {
    double x[] = {10.2, 9.1, 8.7};
    int i[] = new int[3];
    for(int a = 0;a < (x.length);a++) {

      System.out.println(i[a]);
     }
   }
}

```

The GetIt class should print the following:
11
10
9
Which line should you insert on line 6 to accomplish this?

1.     i[a] = ((int)Math.min(x[a]));
2.     i[a] = ((int)Math.max(x[a]));
3.     i[a] = ((int)Math.ceil(x[a]));
4.     i[a] = ((int)Math.floor(x[a]));


### 10 . Which statement about the Map interface is true?

1.     Entries are placed in a Map using the values() method
2.     Entries are placed in a Map using the entrySet() method
3.     A key/value association is added to a Map using the put() method
4.     A key/value association is added to a Map using the putAll() method

### 11 . Consider this class:


```java
public class Test1 {
  public float aMethod(float a, float b) {
  }

}

```

Which of the following methods would be legal if added (individually) at line 4?

1.     public int aMethod(int a, int b) { }
2.     public float aMethod(float a, float b) { }
3.     public float aMethod(float a, float b, int c) throws _Exception { }
4.     public float aMethod(float c, float d) { }
5.     private float aMethod(int a, int b, int c) { }


### 12 . Consider these classes, defined in separate source files:


```java
public class Test1 {
  public float aMethod(float a, float b)
      throws IOException {
  }
}

```


```java
public class Test2 extends Test1 {
 }

```

Which of the following methods would be legal (individually) at line 2 in class Test2?

1.     float aMethod(float a, float b) { }
2.     public int aMethod(int a, int b) throws Exception { }
3.     public float aMethod(float a, float b) throws _Exception { }
4.     public float aMethod(float p, float q) { }



### 13 . You have been given a design document for a veterinary registration system for implementation in Java technology. It states:


```java
"A pet has an owner, a registration date, and a vaccination-due date.
A cat is a pet that has a flag indicating if it has been neutered, and a
textual description of its markings."

```

Given that the Pet class has already been defined, which of the following fields would be appropriate for inclusion in the Cat class as members?

1.     Pet thePet;
2.     Date registered;
3.     Date vaccinationDue;
4.     Cat theCat;
5.     boolean neutered;
6.     String markings;


### 14 . You have been given a design document for a veterinary registration system for implementation in Java. It states:


```java
"A pet has an owner, a registration date, and a vaccination-due date. A cat is a pet that has a flag indicating if it has been neutered, and a textual description of its markings."

```

Given that the Pet class has already been defined and you expect the Cat class to be used freely throughout the application, how would you make the opening declaration of the Cat class, up to but not including the first opening brace?
Use only these words and spaces:
boolean, Cat, class, Date, extends, Object, Owner, Pet, private, protected, public, String.

### 15 . Consider the following classes, declared in separate source files:


```java
public class Base {
  public void method(int i) {
   System.out.println("Value is " + i);
  }
}
public class Sub extends Base {
    public void method(int j) {
      System.out.println("This value is " + j);
    }
    public void method(String s) {
     System.out.println("I was passed " + s);
    }
    public static void main(String args[]) {
      Base b1 = new Base();
     Base b2 = new Sub();
     b1.method(5);
     b2.method(6);
   }
 }

```

What output results when the main method of the class Sub is run?

1.     	Value is 5     
		Value is 6
2.     	This value is 5
		This value is 6
3.     	Value is 5
		This value is 6
4.     	This value is 5
		Value is 6
5.     	I was passed 5
		I was passed 6


### 16 . Consider the following class definition:


```java
public class Test extends Base {
  public Test(int j) {
  }
  public Test(int j, int k) {
    super(j, k);
  }
}

```

Which of the following are legitimate calls to construct instances of the Test class?

1.     Test t = new Test();
2.     Test t = new Test(1);
3.     Test t = new Test(1, 2);
4.     Test t = new Test(1, 2, 3);
5.     Test t = (new Base()).new Test(1);


### 17 . Consider the following class definition:


```java
public class Test extends Base {
 public Test(int j) {
  }
  public Test(int j, int k) {
    super(j, k);
  }
}

```

Which of the following forms of constructor must exist explicitly in the definition of the Base class?

1.     Base() { }
2.     Base(int j) { }
3.     Base(int j, int k) { }
4.     Base(int j, int k, int l) { }

### 18 . Which of the following statements are true?

1.     An inner class may be declared private
2.     An inner class may be declared static
3.     An inner class defined in a method should always be anonymous
4.     An inner class defined in a method can access all the method local variables
5.     Construction of an inner class may require an instance of the outer class



### 19 . Consider the following definition:


```java
 public class Outer {
   public int a = 1;
   private int b = 2;
  public void method(final int c) {
     int d = 3;
     class Inner {
       private void iMethod(int e) {

       }
    }
  }
}

```

Which variables may be referenced correctly at line 8?

1.     a
2.     b
3.     c
4.     d
5.     e


### 20 . Which of the following statements are true?

1.     Given that Inner is a non-static class declared inside a public class Outer, and appropriate constructor forms are defined, an instance of Inner may be constructed like this:<br/>
    **new Outer().new Inner()**
1.     If an anonymous inner class inside the class Outer is defined to implement the interface ActionListener, it may be constructed like this:<br/>
    **new Outer().new ActionListener()**
1.     Given that Inner is a non-static class declared inside a public class Outer and appropriate constructor forms are defined, an instance of Inner may be constructed in a static method like this:<br/>
    **new Inner()**
1.     An anonymous class instance that implements the interface MyInterface may be constructed and returned from a method like this:<br/> **1. return new MyInterface(int x) { <br/>2. int x; <br/>3. public MyInterface(int x) { <br/>4. this.x = x; <br/>5. } <br/>6. };**


### 21 . Given:


```java
 class J {
  private static int notFinalized;
  public static int notFinalized() {return notFinalized;}
  private K k;
  private int name;
  public int name() {return name;}
  public J(K k, int i) {this.k = k; name = i; notFinalized++;}
  public void finalize() {
    synchronized (k) {
      System.out.print(name);
      notFinalized--;
      k.notify();
    }
  }
}
class K {
  private void m1() {
    J j = null;
    for (int i = 0; i  0) {
        try {wait();} catch (InterruptedException ie) {}
      }
    }
  }
  public static void main(String[] args) {
    new K().m1();
  }
}

```

When the processing of line 2 begins how many objects of type J that were created at line 1 are eligible for garbage collection?

1.     0
2.     1
3.     4
4.     5
5.     Can not be determined without more information
6.     Compiler error
7.     Run time error
8.     None of the above


### 22 . What is the output of the following code when compiled and run?


```java
public class Sample {
	public static void main(String[] args) {
		int y = 0;
		int x = z = 1;
		System.out.println(y + "," + x + "," + z);
	}
}

```

Choose two correct answers.?

1.     Prints 0,1,1
2.     Error during compilation at line 3
3.     Prints 0,0,1
4.     **Error during compilation at line 4**
5.     Error during compilation at line 5


### 23 . What is the output of the following code when compiled and run?


```java
public class Sample {
public static void main(String[] args){
	int j = 017;
	int i = (byte)j >> 2;
	System.out.println(Integer.toBinaryString(i));
}
}

```

Choose the one below:

1.     Prints 3
2.     Error during compilation at line 4
3.     Error during compilation at line 5
4.     Prints 11
5.     Prints 0


### 24 . Select three correct statements?

1.     The garbage collection thread cannot outlive the last user thread
2.     The garbage collection can be forced by invoking System.gc().
3.     The garbage collection thread is a non-deamon thread
4.     The finalize() method is invoked at most once by the JVM for any given object
5.     The finalize() method may resurrect the object upon which it has been invoked

### 25 . What is the output of the following code when compiled and run?


```java
import java.io.*;
public class TechnoSample {
	public static void main(String[] args) {
		TechnoSampleSub myref = new TechnoSampleSub();
		try{
			myref.test();
		}catch(IOException ioe){}
	}
	void test() throws IOException{
		System.out.println("In TechnoSample");
		throw new IOException();
	}
}
class TechnoSampleSub extends TechnoSample {
	void test() {
		System.out.println("In TechnoSampleSub");
	}
}

```

Choose the one below:

1.     Prints:<br/>In TechnoSampleSub
2.     Prints:<br/>In TechnoSample
3.     Prints:<br/>In TechnoSample<br/>In TechnoSampleSub
4.     Prints:   <br/>In TechnoSampleSub<br/>In TechnoSample
5.     The code does not compile


### 26 . What is the output of the following code when compiled and run with the following command line?


```java
public class TechnoSample {
	public static void main(String[] args) throws Exception {
		int i=2;
		boolean b = true;
		throw new Exception("Values are:"+(b!=b)+","+(i=args.length)+","+(b=i==2));
	}
}

```

Choose two correct answers:

1.     The exception message is Values are:false,3,true
2.     The exception message is Values are:true,2,false
3.     The exception message is Values are:false,2,true
4.     The final value of b is false
5.     An exception is thrown at runtime


### 27 . Given:


```java
class A{}
class B extends A implements E{}	//line 1
class C extends A{}
class D extends B{}
interface E{}
public class Question07 {
	public static void main(String[] args) {
		A a = new D();	//line 2
		C c = new C();	//line 3
		E e = (E)a;	//line 4
		B b = (B)e;	//line 5
	}
}

```

Choose two correct answers:

1.     The code compiles without error and runs fine
2.     Compilation error on line 1 because interface E is not yet declared (forward-referencing)
3.     Compilation error on line 4 because class A does not implement interface E
4.     The cast on line 4 is mandatory
5.     The cast on line 5 is not mandatory


### 28 . How many objects are eligible for garbage collection immediately after line 1?


```java
public class TechnoGC {
	public static void main(String[] args) {
		TechnoGC tGC = new TechnoGC();
		tGC.doSomething();	//line 1
		Thread.sleep(20000);
	}

	public void doSomething(){
		Object[] objArray = new Object[2];
		for(int i = 0 ; i < objArray.length ; i++) {
			objArray[i] = new Object();
		}
	}
}

```

Choose the one below:

1.     0
2.     1
3.     2
4.     3
5.     4


### 29 . What is the output of the following code when compiled and run?


```java
public class TechnoSample {
	public static void main(String[] args) {
		try {
			int i = (int)(Math.random()*10);
			if(i 5");
		} catch (Exception e){
			System.err.println(e.getMessage()+" (i="+i+")");
		}
	}
}

```

Choose the one below:

1.     The output cannot be determined
2.     Compilation error
3.     An exception is thrown at runtime
4.     Output is i = 2
5.     Output is i > 5 (i=6)


### 30 . What is the output of the following code when compiled and run?


```java
public class TechnoSample {
	public static void main(String[] args) {
		new TechnoSample().doSomething();
	}

	public void doSomething(){
		int i=5;
		Thread t = new Thread(new Runnable(){
			public void run(){
				for(int j=0;j 1)
				System.out.println("No arithmetic exception");
		} catch (ArithmeticException ae){
			System.err.println("Arithmetic exception caught");
		}
	}
}

```

Choose the one below:

1.     Compilation error
2.     No arithmetic exception will never be printed
3.     The final value of i is 2
4.     The final value of i is 0
5.     The try-catch block is necessary for the code to compile

### 31 . What is the output of the following code when compiled and run?
 
```java
public class TechnoSample {
	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer("Hello W");
		addSomeStuff(buf1);
		System.out.println(buf1.toString());
	}

	public static void addSomeStuff(StringBuffer buf){
		StringBuffer b = buf.replace(6,10,"orld");
		System.out.println(b.delete(0,1).toString());
	}
}

```

Choose the one below:

1.     Prints <br/>Hello World <br/>Hello World
2.     Prints <br/>Hello orld <br/>Hello orld
3.     Prints<br/>Hello orld <br/>ello orld
4.     Prints <br/>ello orld <br/>ello orld
5.     Compilation error


### 32 . What is the output of the following code when compiled and run?
>(Note: when an instance of a Vector is printed, its content appear between square brackets [])


```java
import java.util.*;
public class TechnoSample {
	public static void main(String[] args) {
		Vector col = new Vector();
		col.add(new Integer(1));
		col.add(new Integer("2"));
		col.add(new Float(3.2d));	//line 1
		col.add(col.elementAt(1));
		col.setElementAt(col.elementAt(2),0);
		System.out.println(col);
	}
}

```

Choose two correct answers:

1.     Compilation error on line 1
2.     Only line 1 won’t compile
3.     The code compiles and runs fine
4.     Prints [3.2, 2, 3.2, 2]
5.     Prints [1, 2, 3.2, 2]

### 33 . What is the output of the following code when compiled and run?
(‘\u0048’ is ‘H’ and ‘\u000a’ is a linefeed (LF)).


```java
public class TechnoSample {
	public static void main(String[] args) {
		String s = "\u0048ello\u000aWorld!";
		System.out.println(s);
	}
}

```

Choose two correct answers:

1.     Prints:<br/>Hello<br/>World!
2.     Prints Hello World!(linefeed is ignored)
3.     Compilation error
4.     Compiles fine, but an exception is thrown at runtime
5.     Unicode characters like ‘\u0048’ may be used to create String literals


### 34 . What is the output of the following code when compiled and run?


```java
public class TechnoSample {
	public static void main(String[] args) {
		int i = 2;
		try {
			if((i/=(int)Math.floor(Math.random())) > 1)
				System.out.println("No arithmetic exception");
		} catch (ArithmeticException ae){
			System.err.println("Arithmetic exception caught");
		}
	}
}

```

Choose two correct answers:

1.     Compilation error
2.     No arithmetic exception will never be printed
3.     The final value of i is 2
4.     The final value of i is 0
5.     The try-catch block is necessary for the code to compile



### 35 . What is the output of the following code when compiled and run?


```java
public class TechnoSample {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(getRunnable(3));
		Thread t2 = new Thread(getRunnable(4));
		t1.join();
		System.out.println("End");
	}

	public static Runnable getRunnable(final int id){
		return new Runnable(){
			public void run(){
				for(int i = 0; i < id; i++){
					System.out.print(" "+i);
				}
			}
		};
	}
}

```

Choose two correct answers:

1.     The output will always be the same whatever the underlying platform is
2.     Prints: End
3.     Prints:<br/>0 1 2<br/>End
4.     The output cannot be determined
5.     Compilation error


### 36 . What is the output of the following code when compiled and run?


```java
public class TechnoSample {
	public static void main(String[] args){
		for(int i = 0;  i < 10; i++){
			System.out.println(getPrimitive(127));	//line 1
		}
	}
	public static int getPrimitive(byte b){	//line 2
		return (short)(Math.random()*b);	//line 3
	}
}

```

Choose two correct answers:

1.     Compilation error on line 1
2.     Compilation error on line 2
3.     Compilation error on line 3
4.     Line 3 compiles fine
5.     Prints 10 random numbers between 0 and 127

### 37 . Select three correct statements?

1.     A static method may override another static method
2.     A static method cannot override a non-static method
3.     A non-static method cannot override a static method
4.     A non-static method may be overloaded by a static method
5.     A synchronized method cannot be overridden


### 38 . Consider the following code:


```java
public class TechnoSample  {
	public static void main(String[] args) {
		TechnoSample myref = new TechnoSampleSub();
		try{
			myref.test();
		}catch(Exception e){}
	}
	void test() throws Exception{
		System.out.println("In TechnoSample");
		throw new Exception();
	}
}
class TechnoSample Sub extends TechnoSample {
	void test() {
		System.out.println("In TechnoSampleSub");
	}
}

```

Choose three correct statements:

1.     The try-catch block that encloses myref.test(); is mandatory for the code to compile
2.     Prints: In TechnoSample
3.     Prints: In TechnoSampleSub
4.     Method test() in class TechnoSampleSub has no obligation to declare a throws clause
5.     An exception is thrown at runtime


### 39 . Consider the following code:


```java
import java.util.Date;

public class Example {
        public static void main(String args[]) {
                Date d1 = new Date (99, 11, 31);
                Date d2 = new Date (99, 11, 31);
                method(d1, d2);
                System.out.println("d1 is " + d1
                                + "\nd2 is " + d2);
        }

        public static void method(Date d1, Date d2) {
                d2.setYear (100);
                d1 = d2;
        }
}

```

Which one or more of the following correctly describe the behavior when this program is compiled and run?

1.     compilation is successful and the output is:<br/>**d1 is Fri December 31 00:00:00 GMT 1999 d2 is Fri December 31 00:00:00 GMT 1999**
2.     compilation is successful and the output is:<br/>**d1 is Fri December 31 00:00:00 GMT 1999 d2 is Sun December 31 00:00:00 GMT 2000**
3.     compilation is successful and the output is:<br/>**d1 is Sun December 31 00:00:00 GMT 2000 d2 is Sun December 31 00:00:00 GMT 2000**
4.     the assignment ‘d1 = d2’ is rejected by the compiler because the Date class cannot overload the operator ‘=’
5.     the expression (d1 is ” + d1 + “\nd2 is ” + d2) is rejected by the compiler because the Date class cannot overload the operator ‘+’


### 40 . Read this code carefully:


```java
if("String".toString() == "String")

    System.out.println("Equal");

else

    System.out.println("Not Equal");

```

Choose the below:

1.     **the code will compile an print “Equal”**
2.     the code will compile an print “Not Equal”
3.     the code will cause a compiler error


### 41 . Given:


```java
class Base{
    static int oak=99;
}

public class Doverdale extends Base {
    public static void main(String argv[]) {
        Doverdale d = new Doverdale();
        d.amethod();
    }

    public void amethod() {
        //Here
    }
}

```

Which of the following if placed after the comment //Here, will compile and modify the value of the variable oak?
Choose the below:

1.     **super.oak = 1;**
2.     **oak = 33;**
3.     **Base.oak = 22;**
4.     oak = 50.1;

>oak int --> 4 error

### 42 . What will happen when you attempt to compile and run the following code?


```java
public class TechnoSample {
    public static void main(String argv[]) {
        TechnoSample inc = new TechnoSample();
        int i =0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }

    void fermin(int i) {
        i++;
    }
}

```

Choose the below:

1.     Compile time error
2.     Output of 2
3.     Output of 1
4.     **Output of 0**

> Output of 1 when ```i=++i;```
> 
> luu y: sau i++ neu i=0 i se tang nen 1. nhung (i++)=0--> i=(i++)=0
> 
> neu i=0; sau System.out.println(i++); i=1. con output se hien thi 0.

### 43 . Given:


```java
public class ZeroPrint {
    public static void main(String argv[]) {
        int i =0;
        //Here
    }
}

```

Which of the following lines if placed after the comment //Here will print out 0.

1.     System.out.println(i++);
2.     System.out.println(i+’0′);
3.     **System.out.println(i);**
4.     System.out.println(i–);


### 44 . What will happen when you attempt to compile and run this code?


```java
private class Base {}

public class Vis {
        transient int  iVal;

        public static void main(String elephant[]) {
        }
}

```

Choose the below:

1.     **Compile time error: Base cannot be private**
2.     Compile time error indicating that an integer cannot be transient
3.     Compile time error transient not a data type
4.     Compile time error malformed main method

### 45 . What best describes the appearance of an application with the following code?


```java
import java.awt.*;

public class FlowAp extends Frame {
    public static void main(String argv[]) {
        FlowAp fa=new FlowAp();
        fa.setSize(400,300);
        fa.setVisible(true);
    }

    FlowAp() {
        add(new Button("One"));
        add(new Button("Two"));
        add(new Button("Three"));
        add(new Button("Four"));
    }//End of constructor
}//End of Application

```

Choose the below:

1.     A Frame with buttons marked One to Four placed on each edge
2.     A Frame with buutons marked One to four running from the top to bottom
3.     A Frame with one large button marked Four in the Centre
4.     An Error at run time indicating you have not set a LayoutManager


### 46 . What will happen when you attempt to compile and run the following code?


```java
public class Bground extends Thread {
    public static void main(String argv[]) {
        Bground b = new Bground();
        b.run();
    }

    public void start() {
        for (int i = 0; i <10; i++) {
            System.out.println("Value of i = " + i);
        }
    }
}

```

Choose the below:

1.     A compile time error indicating that no run method is defined for the Thread class
2.     A run time error indicating that no run method is defined for the Thread class
3.     Clean compile and at run time the values 0 to 9 are printed out
4.     Clean compile but no output at runtime


### 47 . What will be the output?


```java
int Output = 10;
boolean b1 = false;

if((b1 == true) && ((Output += 10) == 20))
{
    System.out.println("We are equal " + Output);
}
else
{
    System.out.println("Not equal! " + Output);
}

```

Choose the below:

1.     Compilation error, attempting to perform binary comparison on logical data type
2.     Compilation and output of “We are equal 10”
3.     Compilation and output of “Not equal! 20”
4.     Compilation and output of “Not equal! 10”



### 48 . What will be the output?


```java
class Value
{
    public int i = 15;
} //Value

public class Test
{
    public static void main(String argv[])
	{
        Test t = new Test();
        t.first();
    }

    public void first()
    {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value v, int i)
    {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v =  val;
        System.out.println(v.i + " " + i);
    }
} // Test

```

Choose the below:

1.     15 0 <br/>20
2.     15 0 <br/>15
3.     20 0 <br/>20
4.     0 15 <br/>20


### 49 . Given the code below, and making no other changes, which access modifiers (public, protected or private) can legally be placed before myMethod() on line 3? If line 3 is left as it is, which keywords can legally be placed before myMethod on line 8?


```java
class HumptyDumpty
{
    void myMethod() {}
}

class HankyPanky extends HumptyDumpty
{
    void myMethod() {}
}

```

Choose the below:

1.     private or nothing (i.e. leaving it as it is) on line 3. Nothing (i.e. leaving it as it is) or protected or public on line 8
2.     public or protected on line 3. private or nothing (i.e. leaving it as it is) on line 8
3.     nothing (i.e. leaving it as it is) or protected or public on line 3. private or nothing (i.e. leaving it as it is) on line 8
4.     None of the above


### 50 . What is the result when you compile and run the following code?


```java
public class ThrowsDemo
{
    static void throwMethod()
    {
        System.out.println("Inside throwMethod.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try
        {
            throwMethod();
        }
        catch (IllegalAccessException e)
        {
            System.out.println("Caught " + e);
        }
    }
} // ThrowsDemo

```

Choose the below:

1.     Compilation error
2.     Runtime error
3.     Compile successfully, nothing is printed
4.     Inside throwMethod. followed by caught: java.lang.IllegalAccessExcption: demo


# Answers
----

1 : 1 is correct.
Explanation:
Option 1 is correct because a class must be declared abstract when it contains one or more abstract methods. Abstract methods are methods without a body.

Options 2, 3, and 4 are incorrect because compilation succeeds.

2 : 1,2 & 3 is correct.
Explanation:
Options 1, 2, and 3 are correct because a switch statement test requires an integer expression. If the values in the expression are of type byte, short, or char, promotion to the integer value will occur.

Options 4 and 5 are incorrect because class references, floating point values, and long values are not allowed in the expression.

3 : 4 is correct.
Explanation:
Option 4 is correct because no accessible references to the object created at line 3 exist after the method returns. This is because automatic variables are used for all the references in this code.Option 1 is incorrect because the NewGarb class compiles successfully. Option 2 is incorrect because the getIt() method may or may not be declared static. Option 3 is incorrect because an exception is not received.

4 : 4 & 5 is correct.
Explanation:
Option 4 is correct because “char c = ‘f’;” placed on line 4 will create a local variable, which is a variable declared within a method. These variables exist only as long as the method exists.

Option 5 is correct because “static char c;” placed on line 2 will create a class variable, which is a variable declared within the class. These variables are created and destroyed as the class is created and destroyed.

Option 1 is incorrect because it does not use the static keyword. A variable that is accessed by a static method must be declared static, or the access must be made using an instance reference.Likewise, option 3 is not declared static using the static keyword. Option 2 is incorrect because it does not initialize the variable. Option 6 is incorrect because char is not a class, and so cannot be instantiated.

5 : 2 is correct.
Explanation:
Option 2 is correct because t will result in a value of 4. The ++ operator will increment variables by one. Stepping through the for loop until p < 5, incrementing the variables, and performing the calculation will result in t being equal to 4.

6 : 3 is correct.
Explanation:
Option 3 is correct because the method name, argument list, and return type are the same as the getType method defined in the IntType class. Overriding methods must be declared with the same name, argument list, and return type as the overridden method.

Option 1 is incorrect because the return type is not the same as the getType method in the IntType class. Option 2 is incorrect because both the return type and argument list are different from the getType method in the IntType class. Option 4 is incorrect because the argument list is different from the getType method in the IntType class.

7 : 5 is correct.
Explanation:
Option 5 is correct because the Runnable interface is implemented by declaring a synchronized run() method. The method is declared as synchronized to signify that the object lock must be obtained

Options 1, 2, and 3 are incorrect because compilation succeeds. Option 4 is incorrect, but would be correct if the run() method were not declared as synchronized

8 : 3 is correct.
Explanation:
Option 3 is correct because it creates the Birthdays class and displays the Birthdays frame. The frame is displayed by calling the setVisible() method with an argument of true.

Options 1, 2, and 4 are incorrect because the Birthdays class is not created and the frame is not displayed.

9 : 3 is correct.
Explanation:
Option 3 is correct because it uses the ceil() method. This method rounds a value up (to ceiling).

Option 1 is incorrect because the min() method returns the smaller of two values. Option 2 is incorrect because the max() method returns the larger of two values. Option 4 is incorrect because the floor() method rounds a value down.

10 : 3 is correct.
Explanation:
Option 3 is correct because the put() method is used to add a key/value association to a Map.

Option 1 is incorrect because the values() method returns a Collection of all values in a Map.Option 2 is incorrect because the entrySet() method returns a Set of all mappings in a Map. Option 4 is incorrect because the pubAll() method copies all mappings from one Map to another.

11 : 1,3 & 5 is correct.
Explanation:
1, 3, and 4 are correct. In each of these answers, the argument list differs from the original, so the method is an overload.Overloaded methods are effectively independent, and there are no constraints on the accessibility, return type, or exceptions that may be thrown.2 would be a legal overriding method, except that it cannot be defined in the same class as the original method; rather, it must be declared in a subclass.4 is also an override, since the types of its arguments are the same: Changing the parameter names is not sufficient to count as overloading.

12 : 2 & 4 is correct.
Explanation:
2 and 4 are correct. 1 is illegal because it is less accessible than the original method; the fact that it throws no exceptions is perfectly acceptable. 2 is legal because it overloads the method of the parent class,and as such it is not constrained by any rules governing its return value, accessibility, or argument list. The exception thrown by 3 is sufficient to make that method illegal. 4 is legal because the accessibility and return type are identical,and the method is an override because the types of the arguments are identical–remember that the names of the arguments are irrelevant.The absence of an exception list in 4 is not a problem: An overriding method may legitimately throw fewer exceptions than its original, but it may not throw more.

13 : 5 & 6 is correct.
Explanation:
5 and 6 are correct. The Cat class is a subclass of the Pet class, and as such should extend Pet, rather than containing an instance of Pet. 2 and 3 should be members of the Pet class and as such are inherited into the Cat class; therefore, they should not be declared in the Cat class. 4 would declare a reference to an instance of the Cat class, which is not generally appropriate inside the Cat class itself(unless, perhaps, you were asked to give the Cat a member that refers to its mother). Finally, the neutered flag and markings descriptions, 5 and 6, are the items called for by the specification; these are correct items

14 : public class Cat extends Pet
Explanation:

public class Cat extends Pet
. The class should be public since it is to be used freely throughout the application. The statement “A cat is a pet” tells us that the Cat class should subclass Pet. The other words offered are required for the body of the definitions of either Cat or Pet–for use as member variables–but are not part of the opening declaration.

15 : 3 is correct.
Explanation:
3 is correct. The first message is produced by the Base class when b1.method(5) is called and is therefore Value is 5. Despite variable b2 being declared as being of the Base class, the behavior that results when method() is invoked upon it is the behavior associated with class of the actual object, not with the type of the variable. Since the object is of class Sub, not of class Base, the second message is generated by line 3 of class Sub: This value is 6.

16 : 2 & 3 is correct.
Explanation:
2 and 3 are correct. Since the class has explicit constructors defined, the default constructor is suppressed, so 1 is not possible. 2 and 3 have argument lists that match the constructors defined at lines 2 and 4 respectively,and so are correct constructions. 4 has three integer arguments, but there are no constructors that take three arguments of any kind in the Test class, so 4 is incorrect.Finally, 5 is a syntax used for construction of inner classes and is therefore wrong.

17 : 1 & 3 is correct.
Explanation:
1 and 3 are correct. In the constructor at lines 2 and 3, there is no explicit call to either this() or super(), which means that the compiler will generate a call to the zero argument superclass constructor, as in 1. The explicit call to super() at line 5 requires that the Base class must have a 7.constructor as in 3. This has two consequences. First, 3 must be one of the required constructors and therefore one of the answers.Second, the Base class must have at least that constructor defined explicitly, so the default constructor is not generated, but must be added explicitly. Therefore the constructor of 1 is also required and must be a correct answer.At no point in the Test class is there a call to either a superclass constructor with one or three arguments, so 2 and 4 need not explicitly exist.

 18 : 1,2 & 5 is correct.
Explanation:
1, 2, and 5 are correct. Inner classes may be defined with any accessibility, so private is entirely acceptable and 1 is correct. Similarly, the static modifier is permitted on an inner class, which causes it not to be associated with any particularinstance of the outer class. This means that 2 is also correct. Inner classes defined in methods may be anonymous–and indeed often are–but this is not required, so 3 is wrong. 4 is wrong because it is not possible for an inner class defined in a method to access the local variables of the method, except for those variables that are marked as final. Constructing an instance of a static inner class does not need an instance of the enclosing object, but all non-static inner classes do require such a reference, and that reference must be available to the new operation. The reference to the enclosing object is commonly implied as this, which is why it is commonly not explicit. These points make 5 true.

19 : 1,2,3 & 5 is correct.
Explanation:
1, 2, 3, and 5 are correct. Since Inner is not a static inner class, it has a reference to an enclosing object, and all the variables of that object are accessible. Therefore 1 and 2 are correct, despite the fact that b is marked private.Variables in the enclosing method are only accessible if those variables are marked final, so the method argument c is correct, but the variable d is not.Finally, the parameter e is of course accessible, since it is a parameter to the method containing line 8 itself.

20 : 1 is correct.
Explanation:
1 is correct. Construction of a normal inner class requires an instance of the enclosing class. Often this enclosing instance is provided via the implied this reference, but an explicit reference may be used in front of the new operator, as shown in 1.

Hence 2 is illegal–it actually attempts to instantiate the interface ActionListener as if that interface were itself an inner class inside Outer.

3 is illegal since Inner is a non-static inner class, and so it requires a reference to anenclosing instance when it is constructed. The form shown suggests the implied this reference, but since the method is static, there is no this reference and the construction is illegal.

4 is illegal since it attempts to use argumentsto the constructor of an anonymous inner class that implements an interface. The clue is in the attempt to define a constructor at line 3. This would be a constructor for the interface MyInterface not for the inner class–this is wrong on two counts.

21 : 3 is correct.
Explanation:
Method K.m1 creates five objects of type J. Each instance has a name represented by an integer between 0 and 4 inclusive. If the garbage collector does not run then the program will produce no output.If the garbage collector does run then the output of the program could be a series of integers that are the names of four of the five objects. As each new object is created its reference is assigned to the reference variable j.The previously referenced object then becomes eligible for garbage collection. The last object created, 4, is not available for garbage collection until method m1 runs to completion.The while loop in the synchronized block will never complete because J.notFinalized will never return zero. This program is intended to provide a working example of garbage collecting objects referenced by local variables.

22 : 4 & 5 is correct.
Explanation:
Variable z is not declared, thus, z cannot be resolved on lines 2 and 3. In Java, z cannot be declared that way. In order to get this code to compile, we have to write either:
int z=1,x=z;
Or
int z=1;
int x=z;
Or
int z=1;
int x=1;

23 : 4 is correct.
Explanation:
First off, 017 is an octal integer literal having the decimal value 15. Second, the cast to byte only applies to j and not to j >> 2 as a whole. Thus, j is downcast to byte and then upcast to int again before the shifting.Briefly, the cast has no effect here. Then, the binary sequence of 15 is 00000000 00000000 00000000 00001111, which, shifted 2 bits to the right, yields 00000000 00000000 00000000 00000011. Finally, the binary sequence, 11, is printed. Note that the prefixed 0’s are dismissed.

24 : 1,4 & 5 is correct.
Explanation:
The garbage collection thread is a deamon thread. The latter die when there are no more users threads running. The garbage collection cannot be forced.

25 : 5 is correct.
Explanation:
The code does not compile because no IOException is thrown when invoking myref.test(). Note that myref’s declared and runtime types are TechnoSampleSuband thus no dynamic lookup will be performed. However, if you change the declared type to TechnoSample, the code will compile and the correct answer would be A because method test() isoverridden in TechnoSampleSub

26 : 3 & 5 is correct.
Explanation:
Do not mix b!=b and b=!b. In the former, we check if b’s value is different from b’s value (?!) which is clearly false. In the latter, we assign b’s opposite value to itself, that is, if b is true, then after b=!b, b ends up being false.Moreover, be aware that b=i==2 is evaluated as b=(i==2) because operator = has the lowest precedence. Finally, note that the arguments to the Exception constructor are evaluatedfrom the left to the right. First, b!=b is evaluated, then i=args.length (args.length is 2, so i keeps its value), and finally, b=i==2.

27 : 1 & 4 is correct.
Explanation:
First, pay attention to the class hierarchy (B and C are sibling classes!!) Then, there is no such thing as forward-referencing issues when using interfaces declared later in the compilation unit.On line 4, we are dealing with an object whose runtime type is D which implements interface E. The cast is mandatory, though, since the reference type (A) is not assignmentcompatible with the reference type E. The cast on line 5 is mandatory for the same reasons.

28 : 4 is correct.
Explanation:
We declare an array of Object of length two. We then initialize each element to a new Object. We have 2 objects in the array and the array itself (which is an object, too!), that makes 3.

29 : 2 is correct.
Explanation:
The code does not compile because i (declared in the try block!) is not in scope when accessed from the catch block.

30 : 2 is correct.
Explanation:
The code does not compile because the anonymous inner class (new Runnable(){…}) tries to access the non-final local variable i

31 : 4 is correct.
Explanation:
Whenever you perform some operation upon a String object, you will get a new String object if the operation had some effect on the original String, we say that a String is immutable and that its sequence of characters cannot be changed.Here, we are dealing with a StringBuffer which is an implementation of a mutable String, that is you can modify the character sequence it contains. Whenever you perform an operation upon a StringBuffer, the same StringBuffer(whose content has been modified) is returned. The next important thing to remember is that when a reference to an object is passed as argument to a method, a copy of the reference is actually passed to the method. In this case,buf1 is passed to addSomeStuff and replace is invoked upon it. The changes operated by replace are affecting buf1. We then store the reference to buf (which references the same object as buf1 into a local StringBuffer called b.

32 : 3 & 4 is correct.
Explanation:
This question mainly tests your knowledge of the various wrapper classes’ constructors. The most notorious thing here is that we can actually give a double as an argument to the Float constructor.

Otherwise, the question tests your ability to understand how Collection classes work. The effect of add(), elementAt() and setElementAt() is trivial, just have a look at the API of the Vector class for more information

33 : 3 & 5 is correct.
Explanation:
This shows you that Unicode characters are processed very early during the lexical parsing of a Java source file. Here LF, which is a line terminator, isactually translated to a line terminator and this results in malformed Java code. For instance, the example given above is actually interpreted as:
String s = “Hello
World”;
You can notice that the first line is unterminated and the compiler lets you know that.

34 : 2 & 3 is correct.
Explanation:
An ArithmeticException is always thrown when executing this code because Math.random() returns a double between 0.00000 and 0.999999 and Math.floor() just removes the decimal part (the part after the dot).So, the result of the combination of Math.floor(Math.random()) is always 0.0.The cast to int guarantees that 0 will be returned, and an integer division by 0 does always throw an ArithmeticException.

35 : 1 & 2 is correct.
Explanation:
We wait on Thread t1 to finish before printing End but none of the threads are started so only End is printed. Moreover, the same output will be printed whichever the platform is.

36 : 1 & 4 is correct.
Explanation:
Line 1 does not compile because getPrimitive() takes a byte and we pass it an int. In a normal assignment (byte b = 127;) this would work because 127 is in the range for byte values and the compiler implicitely does a norrowing conversion.But this is not the case in method invocations. A quote from JLS 5.3: “The designers of the Java programming language felt that including these implicit narrowing conversions would add additional complexity to the overloaded method matchingresolution process”. This speaks for itself. Line 3 compiles fine because we have to do with a widening primitive conversion form short to int which is perfectly straightforward.

37 : 2,3 & 4 is correct.
Explanation:
Overriding is for non-static methods and hiding is for static methods. So the following statements are the only true statements about hiding and overriding:

a static method (in a subclass) may hide another static method (in a superclass)
a static method (in a subclass) cannot hide a non-static method (in a superclass)
a non-static method (in a subclass) may override another non-static method (in a superclass)
a non-static method (in a subclass) cannot override a static method (in a superclass)

38 : 1,3 & 4 is correct.
Explanation:
myref is an instance of class TechnoSampleSub referenced by a variable of type TechnoSample. Method test() in class TechnoSample is overridden in class TechnoSampleSub, thus the one to be invoked is the one declared in class TechnoSampleSub(Polymorphism!). Moreover, test() has no obligation to declare a throws clause (see overriding rules!). The try-catch block is mandatory because myref could as well reference an instanceof class TechnoSample and in that case the method test() to be invoked would be the one declared in class TechnoSample which throws an exception.

39 : 2 is correct.
Explanation:
1) is false because we know that the data in d2 was changed. 3) is false because we know that the data in d1 was not changed. The names d1 and d2 are used in both main and method to be confusing. They are different and stored on the stack in different plaAll the interesting stuff that happen in the Example class is in method. main simply initializes some data and prints the results. In method, the followning happens:
1.d2 has its year set to 100 (really 2000, as 2.Object d1 is set to be the same as d2. This is a change of the actual reference, not in the data at d1.
Both of these line are perfectly legal, and do not result in a compilation error, so d) is false. I will also point out here that e) is String context. toString() is defined by the Object class and so it is available on all classes in Java. Most non-trivial classes override toString() to return more explicit information about themselves.

40 : 1 is correct.

41 : 1,2 & 3 is correct.
Explanation:
Because the variable oak is declared as static only one copy of it will exist. Thus it can be changed either through the name of its class or through the name of any instance of that class.Because it is created as an integer it canot be assigned a fractional component without a cast.

42 : 4 is correct.
Explanation:
The method fermin only receives a copy of the variable i and any modifications to it are not reflected in the version in the calling method.The post increment operator ++ effectivly modifes the value of i after the initial value has been assiged to the left hand side of the equals operator.

43 : 1,3 & 4 is correct.
Explanation:
The options for this question might look suspiciously easy if you are not aware of the effects of the post-increment operators. The ++ and — operations for examples 1 and 4 only come into effect after the outputoperations, ie after whatever else is done to them on that line of code. Option 2 should be fairly obvious as you should know that the single quote characters indicate a char value, ie storing the character ratherthan the numberical value for 0.

44 : 1 is correct.
Explanation:
A top leve (non nested) class cannot be private.

45 : 3 is correct.
Explanation:
he default layout manager for a Frame is the BorderLayout manager. This Layout manager defaults to placing components in the centre if no constraint is passed with the call to the add method.

46 : 4 is correct.
Explanation:
If the for loop were defined in a method called:

public void run()
and the call in the main method had been to b.start(), the list of values from 0 to 9 would have been output.

47 : 4 is correct.
Explanation:
Note that && is short-circuit logical AND operator. If first operand (before &&) is false (or evaluated to false) then the other operand will not be evaluated.This illustrates that the Output +=10 calculation was never performed because processing stopped after the first operand was evaluated to be false.If you change the value of b1 to true, processing occurs as you would expect and the output would be “We are equal 20”.

48 : 1 is correct.
Explanation:
When we pass references in Java what actually gets passed is the value of that reference (i.e. memory address of the object being referenced and not the actual object called by that reference) and it gets passed as value (i.e a copy of thereference is made). Now when we make changes to the object referenced by that reference it reflects on that object even outside of the method being called but any changes made to the reference itself is not reflected on that reference outside ofthe method which is called.

49 : 1 is correct.
Explanation:
The basic principle is that a method cannot be overridden to be more private. Since the method is being overridden to be friendly (default modifier) it can only be private or friendly in the superclass.Also, if the method in superclass is left as it is (i.e. friendly access) the method in subclass can be friendly, protected or public.

50 : 1 is correct.
Explanation:
Exception :java.lang.IllegalAccessExcption must be caught or placed in the throws clause of the throwMethod(), i.e. the declaration of throwMethod() bechanged to “static void throwMethod() throws IllegalAccessExcption”. Thus compilation error will occur.

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