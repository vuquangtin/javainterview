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











