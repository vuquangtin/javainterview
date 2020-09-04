## Advanced Multi-threading



#### 266. What is the priority of a Thread and how it is used in scheduling?


#### 267. What is the default priority of a thread in Java?


#### 268. What are the three different priorities that can be set on a Thread in Java?


#### 269. What is the purpose of join() method in Thread class?


#### 270. What is the fundamental difference between wait() and sleep() methods?


#### 271. Is it possible to call run() method instead of start() on a thread inJava?


#### 272. What is a daemon thread in Java?
A daemon thread in Java is a low priority thread that does not
prevent the JVM from exiting when the program finishes. The thread
keeps running. Garbage Collection is an example of daemon thread.


#### 273. How can we make a regular thread Daemon thread in Java?
We can call `setDaemon(boolean)` method to change a thread to daemon thread before the thread starts.


#### 274. How will you make a user thread into daemon thread if it has already started?
No. We can't make a user thread to daemon thread once it has already started. If we do it by calling `setDaemon()`, it will throw `IllegalThreadStateException`.



#### 276. What is a Shutdown hook in Java?
The shutdown hook is a thread that is invoked implicitly by JVM just before the shut down. It can be used to clean up unused resources etc.
We can use `java.lang.Runtime.addShutdownHook(Thread hook)` method to register a new virtual-machine shutdown hook.


#### 277. What is synchronization in Java?
The concept of Synchronization in Java is used in Multi-threading
programming.

It is a feature in Java that helps in controlling the access of multiple
threads to a shared resource.

It is used to prevent Deadlock between multiple threads.


#### 278. What is the purpose of Synchronized block in Java?


#### 279. What is static synchronization?


#### 280. What is a Deadlock situation?


#### 281. What is the meaning of concurrency?


#### 282. What is the main difference between process and thread?


#### 283. What is a process and thread in the context of Java?


#### 284. What is a Scheduler?


#### 285. What is the minimum number of Threads in a Java program?


#### 286. What are the properties of a Java thread?


#### 287. What are the different states of a Thread in Java?


#### 288. How will you set the priority of a thread in Java?


#### 289. What is the purpose of Thread Groups in Java?


#### 290. Why we should not stop a thread by calling its stop() method?


#### 291. How will you create a Thread in Java?292.How can we stop a thread in the middle of execution in Java?


#### 293. How do you access the current thread in a Java program?


#### 294. What is Busy waiting in Multi-threading?


#### 295. How can we prevent busy waiting in Java?


#### 296. Can we use Thread.sleep() method for real-time processing in Java?


#### 297. Can we wake up a thread that has been put to sleep by using Thread.sleep() method?


#### 298. What are the two ways to check if a Thread has been interrupted?


#### 299. How can we make sure that Parent thread waits for termination of Child thread?


#### 300. How will you handle InterruptedException in Java?


#### 301. Which intrinsic lock is acquired by a synchronized method in Java?


#### 302. Can we mark a constructor as synchronized in Java?


#### 303. Can we use primitive values for intrinsic locks?


#### 304. Do we have re-entrant property in intrinsic locks?


#### 305. What is an atomic operation?


#### 306. Can we consider the statement i++ as an atomic operation in Java?


#### 307. What are the Atomic operations in Java?


#### 308. Can you check if following code is thread-safe?


#### 309. What are the minimum requirements for a Deadlock situation in a program?


#### 310. How can we prevent a Deadlock?


#### 311. How can we detect a Deadlock situation?


#### 312. What is a Livelock?


#### 313. What is Thread starvation?


#### 314. How can a synchronized block cause Thread starvation in Java?


#### 315. What is a Race condition?


#### 316. What is a Fair lock in multi-threading?


#### 317. Which two methods of Object class can be used to implement a Producer Consumer scenario?


#### 318. How JVM determines which thread should wake up on notify()?


#### 319. Check if following code is thread-safe for retrieving an integer value from a Queue?


#### 320. How can we check if a thread has a monitor lock on a given object?


#### 321. What is the use of yield() method in Thread class?


#### 322. What is an important point to consider while passing an object from one thread to another thread?


#### 323. What are the rules for creating Immutable Objects?


#### 324. What is the use of ThreadLocal class?


#### 325. What are the scenarios suitable for using ThreadLocal class?


#### 326. How will you improve the performance of an application by multi-threading?


#### 327. What is scalability in a Software program?


#### 328. How will you calculate the maximum speed up of an application by using multiple processors?


#### 329. What is Lock contention in multi-threading?


#### 330. What are the techniques to reduce Lock contention?


#### 331. What technique can be used in following code to reduce Lock contention?


#### 332. What is Lock splitting technique?


#### 333. Which technique is used in ReadWriteLock class for reducing Lock contention?


#### 334. What is Lock striping?


#### 335. What is a CAS operation?


#### 336. Which Java classes use CAS operation?


#### 337. Is it always possible to improve performance by object pooling in a multi-threading application?


#### 338. How can techniques used for performance improvement in a single thread application may degrade the performance in a multi-threading application?


#### 339. What is the relation between Executor and ExecutorService interface?


#### 340. What will happen on calling submit() method of an ExecutorService instance whose queue is already full?


#### 341. What is a ScheduledExecutorService?


#### 342. How will you create a Thread pool in Java?


#### 343. What is the main difference between Runnable and Callable interface?


#### 344. What are the uses of Future interface in Java?


#### 345. What is the difference in concurrency in HashMap and in Hashtable?


#### 346. How will you create synchronized instance of List or Map Collection?


#### 347. What is a Semaphore in Java?348.What is a CountDownLatch in Java?


#### 349. What is the difference between CountDownLatch and CyclicBarrier?


#### 350. What are the scenarios suitable for using Fork/Join framework?


#### 351. What is the difference between RecursiveTask and RecursiveAction class?


#### 352. In Java 8, can we process stream operations with a Thread pool?


#### 353. What are the scenarios to use parallel stream in Java 8?


#### 354. How Stack and Heap work in Java multi-threading environment?


#### 355. How can we take Thread dump in Java?


#### 356. Which parameter can be used to control stack size of a thread in Java?


#### 357. There are two threads T1 and T2? How will you ensure that these threads run in sequence T1, T2 in Java?

