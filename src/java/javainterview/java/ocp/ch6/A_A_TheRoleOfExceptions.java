package javainterview.java.ocp.ch6;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

/*
A program can fail for just about any reason:
- The code tries to connect to a website, but the Internet connection is down.
- You made a coding mistake and tried to access an invalid index in an array.
- One method calls another with a value that the method doesn’t support.

 */

public class A_A_TheRoleOfExceptions {
/*
"I give up. I don't know what to do right now. You deal with it."
"Me doy por vencido. No sé qué hacer en este momento. Usted se ocupa de ello."
================================================================
When you write a method:
-You can either deal with the exception
-Make it the calling code’s problem.

History example:
think of Java as a child who visits the zoo. The happy path is when nothing goes wrong.
The child continues to look at the animals until the program nicely ends. Nothing went wrong and there were no exceptions to deal with.
This child’s younger sister doesn’t experience the happy path. In all the excitement she trips and falls.
Luckily, it isn’t a bad fall. The little girl gets up and proceeds to look at more animals.
She has handled the issue all by herself. Unfortunately, she falls again later in the day and starts crying.
This time, she has declared she needs help by crying. The story ends well.
Her daddy rubs her knee and gives her a hug. Then they go back to seeing more animals and enjoy the rest of the day.

These are the two approaches Java uses when dealing with exceptions.
-A method can handle the exception case itself
-Make it the caller’s responsibility.
You saw both in the trip to the zoo.
You saw an exception in Chapter 1, "Java Building Blocks," with a very simple Zoo example.
You wrote a class that printed out the name of the zoo:

*/

}

class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

/* Then you tried to call it without enough arguments:
    ZooException in thread "main"
    java.lang.ArrayIndexOutOfBoundsException: 1
    at mainmethod.Zoo.main(Zoo.java:7)
*/

