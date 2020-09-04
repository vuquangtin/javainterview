## Multi-threading
******


#### 144. How Multi-threading works in Java?
Java provides support for Multithreading. In a Multithreading environment, one process can execute multiple threads in parallel at the same time.

In Java, you can create process and then create multiple threads from that process. Each process can execute in parallel to perform
independent tasks.

Java provides methods like- start(), notify(), wait(), sleep() etc. to
maintain a multi-threading environment.



#### 145. What are the advantages of Multithreading?

Main advantages of Multithreading are:

1. **Improved performance**: We can improve performance of a job by Multi-threading.
2. **Simultaneous access to Multiple Applications**: We can access multiple applications from a process by doing multithreading
3. **Reduced number of Servers required**: With Multi-threading we need lesser number of servers, since one process can spawn multiple threads.
4. **Simplified Coding**: In certain scenarios, it is easier to code multiple threads than managing it from same thread.



#### 146. What are the disadvantages of Multithreading?

There are certain downsides to Multithreading. Thes are:

1. **Difficult to Debug**: Multithreading code is difficult to debug in case of an issue.
2. **Difficult to manage concurrency**: Due to multiple threads, we may experience different kinds of issues.
3. **Difficulty of porting code**: It is difficult to convert existing single threaded code into multi-threading code.
4. **Deadlocks**: In case of multi-threading we can experience deadlocks in threads that are waiting for same resource.


#### 147. What is a Thread in Java?

In Java, A thread is a lightweight parallel process in execution that runs within another process or thread.

It is an independent path of execution in an application. Each thread runs in a separate stack frame. By default Java starts one thread when the main method of a class is called.


#### 148. What is a Thread’s priority and how it is used in scheduling?

In Java, every Thread has a priority. This priority is specified as an
integer value. The priority value is used in scheduling to pick up the
thread with higher priority for execution. The threads with higher
priority get more preference in execution than the threads with
lower priority.

The task scheduler schedules the higher priority threads first,
followed by the lower priority threads.


#### 149. What are the differences between Pre-emptive Scheduling Scheduler and Time Slicing Scheduler?

In Pre-emptive scheduling, the highest priority task will keep getting
time to execute until it goes to waiting state or dead state or a task
with higher priority comes into queue for scheduling.

In Time slicing scheduling, every task gets a predefined slice of
time for execution, and then it goes to the pool of tasks ready for
execution. The scheduler picks up the next task for execution, based
on priority and various other factors.


#### 150. Is it possible to call run() method instead of start() on a thread in Java?

Yes. We can call run() method of a thread. But it does not work as a
separate thread. It will just work as a normal object in main thread
and there will not be context-switching between the threads.


#### 151. How will you make a user thread into daemon thread if it has already started?
No. We cannot make a user thread to daemon thread once it has
already started.
If we do it by calling `setDaemon()`, it will throw `IllegalThreadStateException` .




#### 152. Can we start a thread two times in Java?
No. We can call start() method only once on a thread in Java. If we call it twice, it will give us exception.


#### 153. In what scenarios can we interrupt a thread?
We can interrupt a thread if we want to wake it up from the sleep or
wait state.



#### 154. In Java, is it possible to lock an object for exclusive use by a thread ?

Yes. We can use synchronized block to lock an object. The locked
object is inaccessible to any other thread. Only the thread that has
locked it can access it.



#### 155. How `notify()` method is different from `notifyAll()` method?

In Java, `notify()` method is used to unblock a specific thread that is
in waiting stated. Whereas, `notifyAll()` method is used to unblock
all the threads that are in waiting state.