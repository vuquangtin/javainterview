# (Quiz) SCJP (Sun Certified Java Program) Threads
---

### Questions 1 What will happen when you attempt to compile and run the following code?

```java
public class Bground extends Thread {
	public static void main(String argv[]) {
		Bground b = new Bground();
		b.run();
	}

	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i = " + i);
		}
	}
}
```

 * (a) A compile time error indicating that no run method is defined for the Thread class.
 * (b) A run time error indicating that no run method is defined for the Thread class.
 * (c ) Clean compile and at run time the values 0 to 9 are printed out.
 * (d) Clean compile but no output at runtime.

Answers 1 (d)
>This is a bit of a sneaky one as I have swapped around the names of the methods you need to define and call when running a thread. 
>
>If the for loop were defined in a method called public void run() and the call in the main method had been to b.start()
The list of values from 0 to 9 would have been output.

### Questions 2 What can cause a thread to stop executing?
1. (a) The program exits via a call to System.exit(0);
2. (b) Another thread is given a higher priority.
3. (c ) A call to the thread's stop method.
4. (d) A call to the halt method of the Thread class.

Answers 2 (a), (b), (c)
>Java threads are somewhat platform dependent and you should be carefull when making assumptions about Thread priorities. On some platforms you may find that a Thread with higher priorities gets to "hog" the processor. 

>You can read up on this in more detail at http://java.sun.com/docs/books/tutorial/essential/threads/priority.html

### Questions 3 Which statement is true of the following code?
```java
public class Agg {
	public static void main(String argv[]) {
		Agg a = new Agg();
		a.go();
	}

	public void go() {
		DSRoss ds1 = new DSRoss("one");
		ds1.start();
	}
}

class DSRoss extends Thread {
	private String sTname = "";

	DSRoss(String s) {
		sTname = s;
	}

	public void run() {
		notwait();
		System.out.println("finished");
	}

	public void notwait() {
		while (true) {
			try {
				System.out.println("waiting");
				wait();
			} catch (InterruptedException ie) {
			}
			System.out.println(sTname);
			notifyAll();
		}
	}
}
```

1. (a) It will cause a compile time error.
2. (b) Compilation and output of "waiting".
3. (c ) Compilation and output of "waiting" followed by "finished".
4. (d) Runtime error, an exception will be thrown.


Answers 3 (d)
>A call to wait/notify must be within synchronized code.
>
With JDK1.2 this code throws the error message

```java
java.lang.IllegalMonitorStateException: 
current thread not owner
at java.lang.Object.wait(Native Method)
at java.lang.Object.wait(Object.java:424)
at DSRoss.notwait(Compiled Code)
at DSRoss.run(Agg.java:21)
```

### Questions 4 What will happen when you attempt to compile and run the following code?

```java
public class Holt extends Thread {
	private String sThreadName;

	public static void main(String argv[]) {
		Holt h = new Holt();
		h.go();
	}

	Holt() {
	}

	Holt(String s) {
		sThreadName = s;
	}

	public String getThreadName() {
		return sThreadName;
	}

	public void go() {
		Holt first = new Holt("first");
		first.start();
		Holt second = new Holt("second");
		second.start();
	}

	public void start() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getThreadName() + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
```

1. (a) Compile time error.
2. (b) Output of first0, second0, first0, second1.
3. (c ) Output of first0, first1, second0, second1.
4. (d) Runtime error.

Answers 4 (c )
>Note that this code overrides and calls the start method. If you wished to get the output mixed you would need to override the run method but call the start method.

### Questions 5 What will happen when you attempt to compile and run the following code?

```java
class Background implements Runnable {
	int i = 0;

	public int run() {
		while (true) {
			i++;
			System.out.println("i=" + i);
		}
		return 1;
	}
}// End class
```

1. (a) It will compile and the run method will print out the increasing value of i.
2. (b) It will compile and calling start will print out the increasing value of i.
3. (c ) The code will cause an error at compile time.
4. (d) Compilation will cause an error because while cannot take a parameter of true.

Answers 5 (c )
>The error is caused because run should have a void not an int return type.
Any class that is implements an interface must create a method to match all of the methods in the interface. 

>The Runnable interface has one method called run that has a void return type.

>The sun compiler gives the error Method redefined with different return type: int run() was defined as void run();

### Questions 6 Which statement is true of the following code?

```java
public class Rpcraven {
	public static void main(String argv[]) {
		Pmcraven pm1 = new Pmcraven("one");
		pm1.run();
		Pmcraven pm2 = new Pmcraven("two");
		pm2.run();
	}
}

class Pmcraven extends Thread {
	private String sTname = "";

	Pmcraven(String s) {
		sTname = s;
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
			yield();
			System.out.println(sTname);
		}
	}
}
```

1. (a) Compile time error, class Rpcraven does not import java.lang.Thread
2. (b) Output of One One Two Two
3. (c ) Output of One Two One Two
4. (d) Output of One Two One Two

Answers 6 (b)
>Answer (c ) would would be true if the code called the start method instead of the run method (well it is on my Windows machine anyway, I'm not sure it would be for ever implementation of Java Threads).

>If you call the run method directly it just acts as any other method and does not return to the calling code until it has finished executing.


### Questions 7 
You are creating a class that extends Object and implements Runnable. 
You have already written a run method for this class, and you need a way to create a thread and have it execute the run method, Which of these start methods should you use? [3]

1. (a) ``` public void start() { new Thread(this).start(); }```
2. (b) ``` public void start() { Thread myT = new Thread(); myT.start(); }```
3. (c ) ``` public void start() { Thread myT = new Thread(this); myT.run(); }```

Answers 7 (a)
>Answer (a) is ok, it does not matter that there is no reference to the thread in the start method. Answer (b) is incorrect because the new Thread is not attached to the Runnable object so it cannot find the run method. 

>Instead, the default run in the Thread class will be executed. Answer (c) is incorrect because the Thread that is executing the start method calls run in the Thread class. The myT Thread is not started.

### Question 8 
Java Thread A is attached to an object B, which is responsible for writing data to a file. After writing data, Thread A calls the following method in object B, where it waits until more data is available.

```java
private void synchronized waitForData() { // (1)
try { // (2)
wait(); // (3)
} catch (InterruptedException ex) { // (4)
}
}
```
Another Thread, executing a method in another object C, needs to wake up Thread A. Assuming that object C has references to both A and B, select all of the following code fragments that would cause Thread A to exit the waitForData method.
(a) A.interrupt();
(b) synchronized(A) { A.notifyAll(); }
(c) synchronized(B) { B.notifyAll(); }
(d) A.resume();

Answers 8 (a), (c )
>Answer (a) is correct because it will generate an InterruptedException, bringing thread A out of the wait. Because line (4) catches this exception, the thread exits the waitForData method normally. Answer (c) is correct because it removes all Threads waiting for object B from the wait list, including thread A. Answer (b) is incorrect because it refers to the thread A, not to the object B for which the thread is waiting. Answer (d) is incorrect because the resume method works only with suspended threads and is a deprecated method.

### Questions 9 
You have created a TimeOut class as an extension of Thread, the purpose of which is to print a “Time’s Up” message if the Thread is not interrupted within 10 seconds of being started. Here is the run method that you have coded:

```java
public void run() {
System.out.println(“Start!”);
try {
Thread.sleep(10000);
System.out.println(“Time’s Up!”);
} catch (InterruptedException e) {
System.out.println(“Interrupted!”);
}
}
```

Given that a program creates and starts a TimeOut object, which of the following statements is true?

1. (a) Exactly 10 seconds after the start method is called, “Time’s Up!” will be printed.
2. (b) Exactly 10 seconds after the “Start!” is printed, “Time’s Up!” will be printed.
3. (c ) The delay between “Start!” being printed and “Time’s Up!” will be 10 seconds plus or minus one tick of the system clock.
4. (d) If “Time’s Up!” is printed, you can be sure that at least 10 seconds have elapsed since “Start!” was printed.

Answers 9 (d)
>It is the only statement that can be made with confidence. Answer (a), (b), (c) are all incorrect because the expiration of a sleep timer does not guarantee that a Thread will run – only that it can run. 

# Java™ Certification: SCJP™ 6- Sun Certified Java Programmer Exam
---
### Q1. Which of these statements are legal. Select the three correct answers.

A. int arr[][] = new int[5][5];

B. int[]arr[] = new int[5][5];

C. int[] arr = new int[5][];

D. int[] arr = new int[][5];

>Correct Answer: A,B,C

Explanation:

>NA

### Q2. How can you force garbage collection of an object?

A. Garbage collection cannot be forced.

B. Call System.gc().

C. Call System.gc() passing in a reference to the object to be garbage collected.

D. Call Runtime.gc().

E. Set all references to the object to new values(null, for example).

>Correct Answer: A

Explanation:

>A is correct. Garbage collection cannot be forced.
>
>B and D are not correct as calling System.gc() or Runtime.gc() is not 100 percent
reliable, since the garbage collection thread might defer to a thread of higher 
priority.

>C is incorrect as gc method does not take argument.
>
>E makes object to be garbage collected while next time it refers.

### Q3. Given the following code:

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

Which one or more of the following correctly describe the behavior when this 
program is compiled and run?

a) compilation is successful and the output is:

```
             d1 is Fri December 31 00:00:00 GMT 1999

             d2 is Fri December 31 00:00:00 GMT 1999
```

b) compilation is successful and the output is:

```
            d1 is Fri December 31 00:00:00 GMT 1999

            d2 is Sun December 31 00:00:00 GMT 2000
```

c) compilation is successful and the output is:

```
            d1 is Sun December 31 00:00:00 GMT 2000

            d2 is Sun December 31 00:00:00 GMT 200
```

d) the assignment 'd1 = d2' is rejected by the compiler because the Date class cannot overload the operator '='.

e) the expression (d1 is " + d1 + "\nd2 is " + d2) is rejected by the compiler because the Date class cannot overload the operator '+'.

>Correct Answer: B

Explanation:

>a) is false because the data in d2 was changed in method. 

>c) is false because the data in d1 was not changed

>d) is false as code is perfectly legal, Object d1 is set to be the same as d2. This is a change of the actual reference, not in the data at d1.

>e) is false, because Java is smart enough to call the method toString() for any object that is used in a String context. toString() is defined by the Object class and so it is available on all classes in Java. Most non-trivial classes override toString() to return more explicit information about themselves.

### Q4. Consider these classes, defined in separate source files, 

```java
public class Test1{ 

public float aMethod(float a, float b) throws IOException{

}

}
1. public class Test2 extends Test1{
2.
3. }
```

Which of the following methods would be legal at line 2 in class Test2?

A. float aMethod(float a, float b){}

B. public int aMethod(int a, int b) throws Exception{ }

C. public float aMethod(float a, float b) throws Exception{ }

D. public float aMethod(float p, float q){ }

>Correct Answer: D

Explanation:

>B and D are correct. B is legal as it is an example of method overloading. 

>A is illegal because it is less accessible than the original method, because method in Test1 is public. And for any overriding method, accessibility must not be more restricted than the original method. 

>C is illegal because for overriding method, it must not throw checked exception of classess that are not possible for the origincal classes.

### Q5. In Java, an abstract class cannot be sub-classed.

A. True

B. False

>Correct Answer: B

Explanation:

>The answer is false, in java abstract class must be sub classessed to make it concrete class.

### Q6. TreeMap class is used to implement which collection interface. Select the one correct answer

A. Set

B. SortedSet

C. List

D. Tree

E. SortedMap

>Correct Answer: E

### Q7. What is the name of collection interface used to maintain unique elements. _____________________ (Fill-in-the-blank)

>Correct Answer: Set Interface

### Q8. A monitor called mon has 5 threads in its waiting pool; all these waiting threads have the same priority. One of the threads is thread1. How can you notify thread1 so that it alone moves from Waiting state to Ready State?

A. Execute notify(thread1); from within synchronized code of mon.

B. Execute mon.notify(thread1); from synchronized code of any object.

C. Execute thread1.notify(); from synchronized code of any object.

D. Execute thread1.notify(); from any code(synchronized or not) of any object.

E. You cannot specify which thread will get notified.

>Correct Answer: E

Explanation:

>E is correct, when you call notify() on a monitor, you have no control over which waiting thread gets notified.

### Q9. What happens when the following code is compiled and run. Select the one correct answer.

for(int i = 1; i < 3; i++)
for(int j = 3; j >= 1; j--)
assert i!=j : i;

A. The class compiles and runs, but does not print anything.

B. The number 1 gets printed with AssertionError

C. The number 2 gets printed with AssertionError

D. The number 3 gets printed with AssertionError

E. The program generates a compilation error.

>Correct Answer: B

Explanation:

>correct answer is B. When i and j are both 1, assert condition is false, and AssertionError gets generated.

### Q10. What is the optput of this code fragment.


1. int X=3; int Y =10;

2. System.out.println(y%x);

A. 0

B. 1

C. 2

D. 3

>Correct Answer: B

Explanation:

>B is a correct answer. Dividing 10 by 3 gives 3 reminder 1, and this 1 forms the result of the modulo expression. Same rule applies for the negative numbers, you should ignore the signs during calculation part, and simply attach the sign of the Left-hand operand to the result.

# Mock exam 1 for SCJP 6
---

### 1) Which declaration of the main method below would allow a class to be started as a standalone program. Select the one correct answer.

A. public static int main(char args[])

B. public static void main(String args[])

C. public static void MAIN(String args[])

D. public static void main(String args)

E. public static void main(char args[])

### 2) What will be the output of the following program?

```java
package chapters.chap04;

public class Ques01 {

	public static void main(String[] args) {
		
		HelloThread hello = new HelloThread();
		hello.start();
	}
}


class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("My thread");
	}
}

class HelloThread extends Thread{
	
	public void start(){
		System.out.println("Hello thread");
	}
	
	public void run(){
		Thread thread = new Thread(new MyThread());
		thread.start();		
	}
}
```

1. The program will output 'Hello Thread' and 'My Thread'.
2. The program will output 'My Thread' and 'Hello Thread'.
3. The order of the outputs is not will vary upon execution.
4. The program will output 'Hello Thread'.

>Answer
>2) d.

>Since the start() method in the HelloThread has been overridden, the run() method won't be called and hence the output will only be 'My thread'.