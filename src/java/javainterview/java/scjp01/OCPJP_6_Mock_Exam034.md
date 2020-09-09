# OCPJP 6 Mock Exam – 3
---

### Q 1 : What will be the output?


```java
public class Test301{
    public static void main(String args[]){
        System.out.println(method());
    }
    public static int method(){
       try{
          return 1;
       }
       catch(Exception e){
          return 2;
       }
       finally{
          return 3;
       }
    }
}

```

Choose the one below:

1.    1
2.    2
3.    3
4.    0


### Q 2 : What will be the output?


```java
public class Test302 {
	public static void main(String args[]) {
		System.out.println(method());
	}

	public static int method() {
		try {
			throw new Exception();
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}

```

1.     1
2.     2
3.     3
4.     4
5.     **Compiler error** //Unreachable code in return 1;

### Q 3 : What will be the output?


```java
public class Test303{
    public static void main(String args[]){
        System.out.println(method());
    }
    public static int method(){
        try{
            throw new Exception();
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            return 3;
        }
    }
}
```

1.     **3**
2.     0
3.     Runtime Exception
4.     Compiler error

### Q 4 : What will be the output?


```java
public class Test304{
    public static void main(String args[]){
        System.out.println(method());
    }
    public static int method(){
        return;
    }
}

```

1.     null
2.     0
3.     Runtime exception
4.     **Compiler error** //in return;


### Q 5 : What will be the output?


```java
public class Test305 {
	public static void main(String args[]) {
		try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("Excepion");
		} catch (IOException e) {
			System.out.println("IOExcepion");
		}
	}
}

```

1.     Exception
2.     IOException
3.     Exception IOException
4.     **Compilers error**

### Q 6 : What will be the output?


```java
public class Test306{
    public static void main(String args[]) throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("No Error");
        }
     }
}

```

1.    **No Error followed by java.lang.Exception**
2.     java.lang.Exception followed by No Error
3.     No Error
4.     Compiler Error

###  Q 7


```java
public class Test307 {
	public static void main(String args[]) throws Exception {
		Test307 t = new Test307();
		t.method();
		System.out.println("Print");
	}

	public void method() throws Exception {
		throw new Exception();
	}
}

```

1.  Print
2.   **Exception thrown at runtime**
3.    no output
4.    Compiler Error


### Q 8 : What will be the output?


```java
public class Test308 {
	public static void main(String args[]) throws Exception {
		Test308 t = new Test308();
		t.method();
		System.out.println("Print");
	}

	public void method() {
		try {
			throw new Exception();
		} catch (Exception e) {
		}
	}
}

```

1.     **Print**
2.     Exception thrown at runtime
3.     no output
4.     Compiler Error

### Q 9 : What will be the output?


```java
public class Test309 extends A {
	public static void main(String args[]) throws Exception {
		Test309 t = new Test309();
	}
}

class A {
	A() throws Exception {
		System.out.println("A Class");
	}
}

```

1.     A Class
2.     **Runtime Exception**
3.     no output
4.     Compiler Error

>Default constructor cannot handle exception type Exception thrown by implicit super constructor. Must define an explicit constructor

>fixed add constructor:

```java 
public Test309()  throws Exception{
		
}
```

### Q 10 : What will be the output?


```java
public class Test310 extends A310 {
	Test310() throws Exception {
		System.out.println("Test10 Class");
	}

	public static void main(String args[]) throws Exception {
		Test10 t = new Test10();
	}
}

class A310 {
	A310() throws Exception {
		System.out.println("A Class");
	}
}

```

1.     **A Class Test10 Class**
2.     Runtime Exception
3.     no output
4.     Compiler Error

### Q 11 : What will be the output?


```java
public class Test311 extends A311 {
	Test311() throws Exception {
		System.out.println("Test10 Class");
	}

	Test311(int i) {
	}

	public static void main(String args[]) throws Exception {
		Test311 t = new Test311();
	}
}

class A311 {
	A311() throws Exception {
		System.out.println("A Class");
	}
}
```

1.     A Class Test10 Class
2.     Runtime Exception
3.     no output
4.     Compiler Error

>Unhandled exception type Exception

> in Test311(int i){}
>

### Q 12 : What will be the output?


```java
public class Test312 extends A312 {
	public void method() throws Exception {
		System.out.println("Subclass");
	}

	public static void main(String args[]) throws Exception {
		A312 a = new A312();
		a.method();
		a = new Test312();
		a.method();
	}
}

class A312 {
	public void method() throws IOException {
		System.out.println("Superclass");
	}
}
```

1.     Subclass Superclass
2.     Runtime Exception
3.     Superclass Superclass
4.     **Compiler Error**

>Exception Exception is not compatible with throws clause in A312.method()

### Q 13 : What are the legal arguments types for switch?

1.     int
2.     byte
3.     char
4.     **All the above.**



### Q 14 : Which of the following are valid if constructs?

1.     **if(2>3){}**
2.     **if(false){}**
3.     **if(false){}**
4.     if(true)


### Q 15 : What will be the output?


```java
public class Test315{
    public static void main(String args[]) throws Exception{
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(i);
                System.out.print(j+",");
                break;
            }
         }
     }
}

```

1.     00,
2.     **00,10,20,**
3.     000102
4.     None of the above

### Q 16 : What will be the output?


```java
public class Test316 extends A316 {
	Test316() {
		System.out.println("Sub");
	}

	public static void main(String args[]) {
		Test316 t = new Test316();
	}
}

class A316 {
	A316(int i) {
		System.out.println("Super");
	}
}
```

1.     Super Sub
2.     Super
3.     Sub
4.     **Compiler Error**

>Implicit super constructor A316() is undefined. Must explicitly invoke another constructor
>
>in Test316() fixed -->Test316(int i)

### Q 17 : What will be the output?


```java
public class Test317 extends A317{
	Test317(int i){
        System.out.println(i);
        super(2);
    }
    public static void main(String args[]) {
    	Test317 t = new Test317(5);
    }
}
class A317{
	A317(int i){
        System.out.println(i);
    }
}

```

1.     5 2
2.     2 5
3.     5 5
4.     **Compiler error**

>Implicit super constructor A317() is undefined. Must explicitly invoke another constructor
>
> ```super(2);``` Constructor call must be the first statement in a constructor


### Q 18 : What will be the output?


```java
public class Test318 {
	Test318() {
		this(7);
	}

	Test318(int i) {
		this(1.0);
		Test318(i);
	}

	Test318(float f) {
		System.out.println(f * 2);
	}

	Test318(double d) {
		System.out.println(d * 3);
	}

	void Test318(int i) {
		System.out.println(i);
	}

	public static void main(String args[]) {
		Test318 t = new Test318();
	}
}

```

Choose the one below:

1.     **3.0 7**
2.     2.0 7
3.     7 3.0
4.     Compiler Error


### Q 19 : What will be the output?


```java
public class Test319 {
	float f;

	Test319() {
		this(f);
		f = 3;
	}

	Test319(float f) {
		System.out.println(f);
	}

	public static void main(String args[]) {
		Test319 t = new Test319();
	}
}
```

Choose the one below:

1.     0.0
2.     0
3.     3
4.     **Compiler error**

>Cannot refer to an instance field f while explicitly invoking a constructor ```this(f);```

@see https://stackoverflow.com/questions/3685506/why-cant-i-refer-to-an-instance-method-while-explicitly-invoking-a-constructor

>Non-static methods are instance methods. This are only accessible in existing instance, and instance does not exist yet when you are in constructor (it is still under construction).

>Why it is so? Because instance methods can access instance (non-static) fields, which can have different values in different instances, so it doesn't make sense to call such method on something else than existing, finished instance.

Consider the following working:

```java
public class TestWorking{
    private A a = null;
    public TestWorking(A aParam){
       this.a = aParam;
    }

    public TestWorking(B bParam)
    {
        this(TestWorking.getAFromB(bParam));
    }

    //It works because its marked static.
    private static A getAFromB(B param){
        A a = new A();
        a.setName(param.getName());
        return a;
    }
}
```

And the following Non-Working example:

```java
public class TestNotWorking{
    private A a = null;
    public TestNotWorking(A aParam){
       this.a = aParam;
    }

    public TestNotWorking(B bParam)
    {
        this(this.getAFromB(bParam));
    }

    //This does not work. WHY???
    private A getAFromB(B param){
        A a = new A();
        a.setName(param.getName());
        return a;
    }
}
```

>Cannot refer to 'this' nor 'super' while explicitly invoking a constructor (in ```this(this.getAFromB(bParam));```)

See the Java Language Specification 8.8.7.1. This states that

>An explicit constructor invocation statement in a constructor body may not refer to any instance variables or instance methods or inner classes declared in this class or any superclass, or use this or super in any expression; otherwise, a compile-time error occurs.


### Q 20 : What will be the output?


```java
public class Test320 extends A320 {
	Test320() {
		this("Hi");
	}

	Test320(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {
		Test320 t = new Test320();
	}
}

class A320 {
	A320() {
		System.out.println("Super");
	}
}
```

Choose the one below:

1.     **Super Hi**
2.     Hi Super
3.     Super
4.     Compiler Error


### Q 21 : What will be the output?


```java
public class Test321{
    public static void main(String args[]) {
    	Test321 t;
        t.method();
    }
    public static void method(){
        System.out.println("NullPointerException");
    }
}

```

Choose the one below:

1.     Nothing is printed.
2.     RuntimeException
3.     NullPointerException
4.     **Compiler Error**

>Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

>```The local variable t may not have been initialized```

### Q 22 : What will be the output?

```java
public class Test322 {
	
	public static void main(String args[]) {
		Test322 t = null;
		t.method();
	}

	public static void method() {
		System.out.println("NullPointerException");
	}
}

```

Choose the one below:

1.     Nothing is printed.
2.     RuntimeException
3.     **NullPointerException**
4.     Compiler Error


### Q 23 : Which of the following modifiers are allowed in constructor?

1.     **private**
2.     default
3.     **public**
4.     static


### Q 24 : Which of the following modifiers are allowed for top-level classes?

1.     private
2.     static
3.     **public**
4.     **strictfp**



### Q 25 :  which one of the keyword cannot be used with instance variables?

1.     transient
2.     volatile
3.     **synchronized**
4.     **abstract**

# Answers
---
Q 1 : 3 is correct. 3.

Q 2 : 4 is correct. Compiler Error.

Q 3 : 4 is correct. Compiler Error.

Q 4 : 4 is correct. Compiler Error.

Q 5 : 4 is correct. Compiler Error.

Q 6 : 1 is correct. No Error followed by java.lang.Exception

Q 7 : 2 is correct. Exception thrown at runtime.

Q 8 : 1 is correct. Print.

Q 9 : 4 is correct. Compiler Error.
Q 10 : 1 is correct. A Class Test10 Class.

Q 11 : 4 is correct. Compiler Error.

Q 12 : 4 is correct. Compiler Error.

Q 13 : 4 is correct. All the above.

Q 14 : 1 is correct. if(2>3){}
2 is correct. if(false){}
4 is correct. if(true){}

Q 15 : 2 is correct. 00,10,20,

Q 16 : 4 is correct. Compiler Error.

Q 17 : 4 is correct. Compiler Error.

Q 18 : 1 is correct. 3.0 7

Q 19 : 4 is correct. Compiler Error.

Q 20 : 1 is correct. Super Hi.

Q 21 : 4 is correct. Compiler Error.

Q 22 : 3 is correct. NullPointerException.

Q 23 : 1 is correct. private.
3 is correct. public.

Q 24 : 4 is correct. strictfp.
3 is correct. public.

Q 25 : 3 is correct. synchronized.
4 is correct. abstrct.

# OCPJP 6 Mock Exam – 4
---
@see https://javabeat.net/ocpjp-6-mock-exam-java-4/

### Q 1 : What will be the output?


```java
public class Test401{
    static void method(Object obj){
        System.out.println("Object");
    }
    static void method(String str){
        System.out.println("String");
    }
    public static void main(String args[]){
        method(null);
    }
}

```

Choose the one below:

1.     **String**
2.     Object
3.     null
4.     Compiler Error


### Q 2 : What will be the output?


```java
public class Test402{
    static void method(StringBuffer obj){
        System.out.println("StringBuffer");
    }
    static void method(String str){
        System.out.println("String");
    }
    public static void main(String args[]){
        method(null);
    }
}

```

Choose the one below:

1.     String
2.     Object
3.     null
4.     **Compiler Error**

>The method method(StringBuffer) is ambiguous for the type Test402



**The method fun(String) is ambiguous for the type TestInterviewquestion class**

This public class TestInterviewquestion has these methods and all parameters are unique. But I get the compile time error "The method fun(String) is ambiguous for the type TestInterviewquestion class". Can someone see the problem?

```java
public static void fun(String s) {
    System.out.println("String");
}

public static void fun(Object o) { 
    System.out.println("Object");
}

public static void fun(Integer i) {
    System.out.println("Integer");
}

public static void main(String arg[]) {
    fun(null);
}
```

>If the question is why fun(null) is ambiguous, the reason is that both public static void fun(Integer i) and public static void fun(String s) can accept a null, but since neither of String and Integer is more specific than the other, the compiler can't choose between the two

### Q 3 : What will be the output?


```java
class Test {
}

public class Test403 {
	static void method(Object obj) {
		System.out.println("StringBuffer");
	}

	static void method(String str) {
		System.out.println("String");
	}

	static void method(Test t) {
		System.out.println("Test");
	}

	public static void main(String args[]) {
		method(null);
	}
}

```

Choose the one below:

1.     String
2.     Object
3.     Test
4.    **Compiler Error**

>The method method(Object) is ambiguous for the type Test403 in ```method(null);```

### Q 4 : What will be the output?


```java
public class Test404 {
	public static void main(String args[]) {
		I i1 = new A404();
		I i2 = new B404();
		A404 a = new A404();
		System.out.println(i1 instanceof I);
		System.out.println(i2 instanceof B404);
		System.out.println(a instanceof I);
	}
}

interface I {
}

class A404 implements I {
}

class B404 implements I {
}
```

Choose the one below:

1.     **true true true**
2.     true false true
3.     true false false
4.     Compiler Error


### Q 5 : What will be the output?


```java
public class Test405{
    public static void main(String args[]){
        System.out.println(I405.k);
    }
}
interface I405{
    int k;
}
```

Choose the one below:

1.     0
2.     1
3.     null
4.     **Compiler Error**

>The blank final field k may not have been initialized

### Q 6 : What will be the output?


```java
public class Test406 implements I406{
    int k = 1;
    public static void main(String args[]){
        System.out.println(k);
    }
}
interface I406{
    int k = 0;
}

```

Choose the one below:

1.     0
2.     1
3.     null
4.    **Compiler Error**


### Q 7 : What will be the output?


```java
public class Test407 implements I {
	int k = 1;
	static {
		k = k * 2;
	}
	{
		k = k * 2;
	}

	public static void main(String args[]) {
		Test407 t1 = new Test407();
		Test407 t2 = new Test407();
		System.out.println(t1.k);
		System.out.println(t2.k);
		System.out.println(k);
	}
}
```

Choose the one below:

1.     0
2.     1
3.     null
4.    **Compiler Error**

>Cannot make a static reference to the non-static field k

> k = k * 2;

>Cannot make a static reference to the non-static field k

> System.out.println(k);

### Q 8 : What will be the output?


```java
public class Test408 {
	static int k = 1;
	static {
		k = k * 2;
	}
	{
		k = k * 2;
	}

	public static void main(String args[]) {
		System.out.println(k);
	}
}
```

Choose the one below:

1.     1
2.     **2**
3.     4
4.     Compiler Error

>```static {
		k = k * 2;
	}```

>Khối static luôn được gọi khi lớp được gọi. còn khối non-static sẽ được gọi khi đối tuợng được tạo và được gọi. ở đây đối tượng không được tạo ra. -->**2**

### Q 9 : What will be the output?


```java
public class Test409{
    static int k = 1;
    {
        k = k * 2;
    }
    public static void main(String args[]){
        System.out.println(k);
    }
}

```

Choose the one below:

1.     **1**
2.     2
3.     4
4.     Compiler Error

>Khối static luôn được gọi khi lớp được gọi. còn khối non-static sẽ được gọi khi đối tuợng được tạo và được gọi. ở đây đối tượng không được tạo ra. -->**1**

### Q 10 : What will be the output?

```java
public class Test410{
    final static int k;
    static{
        k = 0;
    }
    public static void main(String args[]){
        System.out.println(k);
    }
}
```

Choose the one below:

1. **0**
2. 1
3. null
4. Compiler Error

# Answers
----

Q 1 : 1 is correct. String.

Q 2 : 4 is correct. Compiler Error.

Q 3 : 4 is correct. Compiler Error.

Q 4 : 1 is correct. true true true.

Q 5 : 4 is correct. Compile time error.

Q 6 : 4 is correct. Compiler Error.

Q 7 : 4 is correct. Compiler Error.

Q 8 : 2 is correct. 2.

Q 9 : 1 is correct. 1.

Q 10 : 1 is correct. 0.