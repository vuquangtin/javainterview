@see https://javabeat.net/page/3/?s=OCPJP

# OCPJP 6 Mock Exam -1
---

### Q 1 : What will be the output?

```java
public class Test1{
   public static void main(String[] args){
      int arr[] = new int[3];
      for(int i = 0;i < arr.length;i++){
         System.out.println(arr[i]);
      }
   }
}
```

Choose the one below:

1. 0 0 0
2. ArrayIndexoutOfBoundsException
3. NullPointerException
4. null null null

### Q 2 : Which of the following are valid array declarations?

1. int arr[] = new int[];
2. float arr[10] = new fl
3. double []arr = new double[10];
4. None Of the Above.

### Q 3 : What will be the output?

```java
public class Test3{
   public void method(){
       System.out.println("Called");
   }
   public static void main(String[] args){
       method();
   }
}
```
Choose the one below:

1. “Called”
2. Compiler
3. Runtime
4. Nothing

### Q 4 : What will be the output?

```java
public class Test4{
     public static void method(){
         System.out.println("Called");
     }
     public static void main(String[] args){
         Test4 t4 = null;
         t4.method();
     }
  }
```

Choose the one below:

1.     “Called”
2.     Compiler
3.     Runtime Exception
4.     Nothing is printed in screen

### Q 5 : What will be the output?

```java
public class Test5{
    public void Test5(){
       System.out.println("Constructor1");
    }
    public Test5(){
       System.out.println("Constructor2");
    }
    public static void main(String[] args){
       Test5 t5 = new Test5();
    }
}
```
Choose the one below:

1.     “Constructor1”
2.     “Constructor2”
3.     “Constructor1″”Constructor2”
4.     Compiler Errror

### Q 6 : What will be the output?

```java
public class Test6{
    public Test6(){
       this(4);
    }
    public Test6(byte var){
       System.out.println(var);
    }
    public static void main(String[] args){
       Test6 t6 = new Test6();
    }
}
```

Choose the one below:

1.     4
2.     4 4
3.     Compiler Error
4.     Compiles and Runs without error

### Q 7 : What will be the output?

```java
public class Test7{
     public Test7(){}
     public Test7(Test7 ref){
         this (ref,"Hai");
     }
     public Test7(Test7 ref,String str){
         ref.Test7(str);
         System.out.println("Hi");
     }
     public void Test7(String str){
         System.out.println(str);
     }
     public static void main(String[] args){
         Test7 t = new Test7();
         Test7 t7 = new Test7(t);
     }
 }
```

Choose the one below:

1.     HI
2.     hai
3.     Hai Hi
4.     Hi Hai

### Q 8 : Which of the following are valid Constructors?

1.     public Test8(){}
2.     private void Test8(){}
3.     protected Test8(int k){}
4.     Test8(){}

### Q 9 : Which of the following are valid method declarations?

1.     abstract method(){}
2.     abstrct void method(){}
3.     final void method(){}
4.     int method(){}

### Q 10 : Which of the following are valid top-level class declarations?

1.     class Test10
2.     public class Test10
3.     final class Test10
4.     abstract final class Test10

### Q 11 : transient keywaord can be used with?

1.     method
2.     variable
3.     class
4.     constructor

### Q 12 : which of the following are valid combinations for class declaration?

1.     abstract final class Test12{}
2.     abstract static class Test12{}
3.     final static class Test12{}
4.     public final strictfp class Test12{}

### Q 13 : which of the following are valid constructor signatures?

1.     public void className()
2.     public void className()
3.     private className()
4.     static className()

### Q 14 : Which of the following modifiers can be used with top class declaration?

1.     static
2.     private
3.     public
4.     final
5.     abstract

### Q 15 : Which of the following are valid array declarations?

1.    int arr[] = new int[];
2.     int arr[][] = new int [10][10];
3.     float arr[][] = new float[][10];
4.     float arr[] = new float[10];

### Q 16 : What will be the output of the following program?

```java
public class Test1 {
      static{
           System.out.println("Static");
      }
      {
           System.out.println("Instance");
       }
       public void Test1(){
           System.out.println("Constructor");
       }
       public static void main(String[] args) {
          Test1 t = null;
       }
}
```
Choose the one below:

1.     Instance Static
2.     Static Instance
3.     Static
4.     Static Instance Constructor

### Q 17 : What will be the output of the following program?

```java
class Sup{
    public Sup(String str){
        System.out.println("Super class");
    }
}

public class Test2 extends Sup{
      public Test2(){
            System.out.println("Sub class");
      }
      public static void main(String[] args) {
            Test2 t2 = new Test2();
      }
}
```
Choose the one below:

1.     Super class,SubClass
2.     Super class
3.     Sub class
4.     Compiler Error

### Q 18 : What will be the output of the following program?

```java
public class Test3 {
      public static void main(String[] args) {
            System.out.println("Main Method1");
      }
      public static void main(String args){
            System.out.println("Main Method2");
     }
}
```
Choose the one below:

1.     Main Method1
2.     Main Method1 Main Method2
3.     Main Method2
4.     Runtime Exception

### Q 19 : What will be the output of the following program?

```java
public class Test4 {
     public static void main(String args) {
           System.out.println("Sample Program");
     }
}
```
Choose the one below:

1.     Sample Program
2.     Compiler Error
3.     Runtime Exception
4.     None

### Q 20 : What will be the output of the following program?

```java
class Sup1{
      public Sup1(){
           System.out.println("Hai");
      }
      private Sup1(String str){
          System.out.println(str);
      }
}

public class Test5 extends Sup1{
      private Test5(String str){
           System.out.println(str);
           super();
      }
      public static void main(String[] args) {
          Test5 t5 = new Test5("HI");
      }
}
```
Choose the one below:

1.     Hai,Hi,Hi
2.     Hai,Hi
3.     Hi,Hi
4.     Compiler Error

### Q 21 : Which of the following are not a wrapper class?

1.    String
2.     Integer
3.     StringBuffer
4.     Boolean

### Q 22 : Select the correct syntax for main method :

1.     public void main(String args[])
2.     public static void main(String args)
3.     public static void Main(String args[])
4.     None of the Above

### Q 23 : Which of the following are not a valid declarations?

1.     float f = 1;
2.     float f = 1.2f;
3.     float f = 1.2;
4.     float f = (float)1.2;

### Q 24 : String s1 = new String(“hi”);

```java
String s2 = "hi";
System.out.println(s1 ==s2);
System.out.println(s1.equals(s2));
```

1.     false true
2.     true false
3.     true true
4.     None of the above.

### Q 25 : Integer i = new Integer(0);

```java
Float f = new Float(0);
System.out.println(i==f);
System.out.println(i.equals(f));
```

1.     true false
2.     false true
3.     true true
4.     Compiler error



# Answers
---

Q 1 : 1 is correct. Local Array variables are initialized to their default values.

Q 2 : 3 is correct. double []arr = new double[10];

Q 3 : 2 is correct. Compiler Error.

Q 4 : 1 is correct. “Called”.

Q 5 : 2 is correct. “Constructor2”.

Q 6 : 3 is correct. Compiler Error.

Q 7 : 3 is correct. Hai Hi.

Q 8 : 1 is correct. public Test8(){}.
3 is correct. protected Test8(int k){}.

Q 9 : 3 is correct. final void method(){}.
4 is correct. int method(){}.

Q 10 : 1 is correct. class Test10.
2 is correct. public Test10.
3 is correct. final Test10.

Q 11 : 2 is correct. variable.

Q 12 : 3 is correct. final static class().
4 is correct. public final strictfp class{}.

Q 13 : 2 is correct. public className().
3 is correct. private className().

Q 14 : 3 is correct. public.
4 is correct. final.
5 is correct. abstract.

Q 15 : 2 is correct. int arr[][] = new int [10][10];
4 is correct. float arr[] = new float[10];

Q 16 : 3 is correct. Static.

Q 17 : 4 is correct. Compiler Error.

Q 18 : 1 is correct. Main Method1.

Q 19 : 3 is correct. Runtime Exception.

Q 20 : 4 is correct. Compiler Error.

Q 21 : 1 is correct. String.
4 is correct. String Buffer.

Q 22 : 4 is correct. None of the Above.

Q 23 : 3 is correct. float f = 1.2;

Q 24 : 1 is correct. false true.

Q 25 : 4 is correct. Compiler error.

---

# OCPJP 6 Mock Exam – 2
---

### Q 1 : What is the output?

```java
import java.util.*;
public class Test1{
    public static void main(String a[]){
       Set s = new TreeSet();
       s.add(new Person(20));
       s.add(new Person(10));
       System.out.println(s);
    }
}
class Person{
   Person(int i){}
}

```

Choose the one below:

1.     10 20
2.     **Person cannot be cast to java.lang.Comparable** in ``` s.add(new Person(20));```
3.     Compiler Error
4.     Compiler Error

### Q 2 : What is the output?

```java
import java.util.*;
public class Test2{
    public static void main(String a[]){
        Map s = new Hashtable();
        s.put(null,null);
        System.out.println(s);
    }
}

```

Choose the one below:

1.     [null = null]
2.     **Exception in thread "main" java.lang.NullPointerException**
3.     null
4.     []

### Q 3 : What is the output?

```java
import java.util.*;
public class Test3{
   public static void main(String a[]){
      Map s = new WeakHashMap(10);
      s.put(null,null);
      System.out.println(s);
   }
}

```

Choose the one below:

1.     **{null = null}**
2.     NullPointerException
3.     null
4.     []

### Q 4 : What is the output?

```java
import java.util.*;
public class Test4{
    public static void main(String a[]){
       Map s = new LinkedHashMap();
       s.put("1","one");
       s.put("3","three");
       s.put("2","two");
       System.out.println(s);
    }
}

```

Choose the one below:

1.     **{1=one, 3=three, 2=two}**
2.     NullPointerException
3.     [1=one,2=two,3=three]
4.     []

### Q 5 : What is the output?

```java
import java.util.*;
public class Test5{
    public static void main(String a[]){
       Map s = new HashMap();
       s.put("1","one");
       s.put("3","three");
       s.put("2","two");
       System.out.println(s);
    }
}
```

Choose the one below:

1.     [1=one,3=three,2=two]
2.     [3=three,2=two,1=one]
3.     **cannot predict the order** //result **{1=one, 2=two, 3=three}**
4.     []

### Q 6 : What is the output?

```java
public class Test6{
    public static void method(float f){
       System.out.println("Float");
    }
    public static void method(double f){
       System.out.println("Double");
    }
    public static void main(String a[]){
       float f1 = 2.0f;
       float f2 = 2.0f;
       method(1.0);
       method(1.0f);
       method(1.0f*2.0f);
       method(1.0f*2.0);
       method(f1*f2);
    }
}

```

Choose the one below:

1.     Double Double Double Double Double
2.     Float Float Float Float Float
3.     **Double Float Float Double Float**
4.     Double Float Float Double Double

### Q 7 : What is the output?

```java
public class Test7{
   public static void method(byte b){
      System.out.println("Byte");
   }
   public static void method(int i){
      System.out.println("Int");
   }
   public static void main(String a[]){
      byte b = 1;
      method(1);
      method(128);
      method((byte)128);
      method(b);
   }
}

```

Choose the one below:

1.     Byte Int Int Byte
2.     Byte Int Int Byte
3.     Byte Int Byte Byte
4.     **Int Int Byte Byte**

### Q 8 : Which of the following are correct?

```java
public class Test8{
    public static void main(String a[]){
       byte b = 1;
       char c = 2;
       short s = 3;
       int i = 4;

       c = b; // 1
       s = b; // 2
       i = b; //3
       s = c * b; //4
    }
}

```
Choose the one below:

1.     **Error at mark 1**
2.     Error at mark 2
3.     Error at mark 3
4.     **Error at mark 4**

### Q 9 : Which of the following are correct?


```java
public class Test9 {
	public static void main(String a[]) {
		final byte b = 1;
		char c = 2;
		short s = 3;
		int i = 4;

		c = b; // 1
		s = b; // 2
		i = b; // 3
		s = c * b; // 4
	}
}

```

Choose the one below:

1.     Error at mark 1
2.     Error at mark 2
3.     Error at mark 3
4.    **Error at mark 4**

### Q 10 : What is output?

```java
public class Test10{
     public static void main(String a[]){
        String s1 = "Sun";
        String s2 = "Java";
        s1.concat(s2);
        System.out.println(s1);
     }
}

```

Choose the one below:

1.     **Sun**
2.     Java
3.     SunJava
4.     JavaSun

### Q 11 : What is output?

```java
public class Test11{
    public static void main(String a[]){
       Integer i1 = new Integer(127);
       Integer i2 = new Integer(127);
       Long l = new Long(127);
       System.out.println(i1 == i2);
       System.out.println(i1.equals(i2));
       System.out.println(i1.equals(l));
    }
}

```

Choose the one below:

1.     false true true
2.     true true true
3.     **false true false**
4.     Compiler Error

### Q 12 : What is output?

```java
public class Test12{
   public static void main(String a[]){
       byte b = 100;
       Byte b1= new Byte(100);
       Byte b2 = new Byte(b);
       System.out.println(b1 == b2);
       System.out.println(b1.equals(b2));
   }
}

```

Choose the one below:

1.     false true
2.     true false
3.     true true
4.     **Compiler Error** //The constructor Byte(int) is undefined

### Q 13 : What is output?

```java
public class Test13{
   public static void method(String s){
      System.out.println("String Version");
   }
   public static void method(StringBuffer sb){
      System.out.println("String Buffer Version");
   }
   public static void main(String a[]){
      method(null);
   }
}

```

Choose the one below:

1.     String Version
2.     String Buffer Version
3.     Runtime Exception
4.     **Compiler Error** //The method method(String) is ambiguous for the type Test13

### Q 14 : What is output?

```java
public class Test14{
    static String s ="Instance";
    public static void method(String s){
        s+="Add";
    }
    public static void main(String a[]){
        Test14 t = new Test14();
        s = "New Instance";
        String s = "Local";
        method(s);
        System.out.println(s);
        System.out.println(t.s);
    }
}

```

Choose the one below:

1.     Local Instance
2.     **Local New Instance**
3.     Local Add New Instance
4.     Compiler Error

### Q 15 : What is output?


```java
public class Test15{
    public static void method(StringBuffer sb){
        sb.append(" Added");
        sb = new StringBuffer("Hai");
    }
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("String Buffer");
        method(sb);
        System.out.println(sb);
    }
}

```

Choose the one below:

1.     String Buffer
2.     **String Buffer Added**
3.     Hai
4.     Compiler Error

### Q 16 : What is output?


```java
public class Test16{
    public static void method(StringBuffer sb){
        sb = new StringBuffer("Hai");
        sb.append(" Added");
    }
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("String Buffer");
        method(sb);
        System.out.println(sb);
    }
}

```

Choose the one below:

1.    ** String Buffer**
2.     String Buffer Added
3.     Hai
4.     Compiler Error

### Q 17 : What is output?


```java
import java.util.*;
public class Test17{
    public static void main(String a[]){
        Map m = new Hashtable(10,0.75f);
        System.out.println(m.size());
    }
}

```

Choose the one below:

1.     **0**
2.     10
3.     7
4.     cOMPILER eRROR

### Q 18 : What is the default capacity of java.util.Hashtable?

1.     10
2.     16
3.     **11**
4.     20

```java
 /**
     * Constructs a new, empty hashtable with a default initial capacity (11)
     * and load factor (0.75).
     */
    public Hashtable() {
        this(11, 0.75f);
    }
```

### Q 19 : What is the default capacity of java.util.HashMap?

1.     10
2.     16
3.     11
4.     20

### Q 20 : Which of the following classes has synchronized methods?

1.     ArrayList
2.     **Vector**
3.     HashTable
4.     WeakHashMap


### Q 21 : What is output?


```java
public class Test21{
    public static void main(String a[]){
       String s1 = new String("Hai");
       String s2 = "Hai";
       String s3 = new String("Hai").intern();
       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s2 == s3);
    }
}

```


1.     **false false true**
2.     true false true
3.     false false false
4.     false true true

### Q 22 : What is output?


```java
public class Test22{
    public static void main(String a[]){
       String s1 = "SunMicroSystems";
       System.out.println(s1.substring(0));
       System.out.println(s1.substring(1,4));
       System.out.println(s1.substring(8));
    }
}

```


1.     SunMicrosystems sun oSystem
2.     **SunMicrosystems unM Systems**
3.     StringIndexOutOfBoundsException
4.     None Of the above

### Q 23 : What is output?


```java
public class Test23{
    public static void main(String a[]){
        String s1 = "Sun";
        System.out.println(s1.substring(5));
    }
}

```

1.     -1
2.     0
3.    ** StringIndexOutOfBoundsException** //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -2
4.     ArrayIndexOutOfBoundsException

### Q 24 : Which of the following are static methods in java.lang.String class?

1. **valueOf**
2. length
3. indexOf
4. All the above.


### Q 25 : What is output?


```java
public class Test25{
   public static void main(String a[]){
      StringBuffer sb = new StringBuffer(8);
      sb.append("TestString");
      System.out.println(sb.capacity());
      System.out.println(sb.length());
   }
}

```

1.     8 10
2.     10 10
3.     **18 10**
4.     18 18

## Answers

Q 1 : 2 is correct. ClassCastException.

Q 2 : 2 is correct. NullPointerException.

Q 3 : 1 is correct. [null = null].

Q 4 : 1 is correct. [1=one,3=three,2=two].

Q 5 : 3 is correct. cannot predict the order.

Q 6 : 3 is correct. Double Float Float Double Float.

Q 7 : 4 is correct. Int Int Byte Byte.

Q 8 : 1 is correct. Error at mark 1.
4 is correct. Error at mark 4.

Q 9 : 4 is correct. Error at mark 4.

Q 10 : 1 is correct. Sun.

Q 11 : 3 is correct. false true false.

Q 12 : 4 is correct. Compiler Error.

Q 13 : 4 is correct. Compiler Error.

Q 14 : 2 is correct. Local New Instance.

Q 15 : 2 is correct. String Buffer Added.

Q 16 : 1 is correct. String Buffer.

Q 17 : 1 is correct. 0.

Q 18 : 3 is correct. 11.

Q 19 : 2 is correct. 16.

Q 20 : 2 is correct. Vector.
3 is correct. HashTable.

Q 21 : 1 is correct. false false true.

Q 22 : 2 is correct. SunMicrosystems unM Systems.

Q 23 : 3 is correct. StringIndexOutOfBoundsException.

Q 24 : 1 is correct. valueOf.

Q 25 : 3 is correct. 18 10.
