package javainterview.java.ocp.ch1;
/**
 * K_Destroying_Objects
 * 
 * Now that we’ve played with our objects, it is time to put them away. Luckily, Java automatically takes care of that for you.
Java provides a garbage collector to automatically look for objects that aren’t needed anymore.
All Java objects are stored in your program memory’s heap.
The heap, which is also referred to as the "free store", represents a large pool of unused memory allocated to your Java application.
The heap may be quite large, depending on your environment, but there is always a limit to its size.
If your program keeps instantiating objects and leaving them on the heap, eventually it will run out of memory.
In the following sections, we’ll look at garbage collection and the finalize() method.
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class K_A_GarbageCollection {
    /*-
    Garbage collection refers to the process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program.
    There are many different algorithms for garbage collection, but you don’t need to know any of them for the exam.
    You do need to know that System.gc() is not guaranteed to run, and you should be able to recognize when objects become eligible for garbage collection.
    Let’s start with the first one. Java provides a method called System.gc(). Now you might think from the name that this tells Java to run garbage collection.
    Nope! It meekly suggests that now might be a good time for Java to kick off a garbage collection run. Java is free to ignore the request.
    The more interesting part of garbage collection is when the memory belonging to an object can be reclaimed.
    Java waits patiently until the code no longer needs that memory. An object will remain on the heap until it is no longer reachable.
    An object is no longer reachable when one of two situations occurs:
    - The object no longer has any references pointing to it.
    - All references to the object have gone out of scope.
    ===================================================================================================
    Objects vs. References
    ===================================================================================================
    Do not confuse a reference with the object that it refers to; they are two different entities. The reference is a variable that has a name and can be used to access the contents of an object.
    A reference can be assigned to another reference, passed to a method, or returned from a method. All references are the same size, no matter what their type is.
    An object sits on the heap and does not have a name. Therefore, you have no way to access an object except through a reference.
    Objects come in all different shapes and sizes and consume varying amounts of memory.
    An object cannot be assigned to another object, nor can an object be passed to a method or returned from a method. It is the object that gets garbage collected, not its reference.
    A Reference                             The Heap
                                            An Object
     name                                    _______
    ------                                  |       |
            -------------------------->     |
                                            |_______|
    A reference may or may
    not be created on the heap.
    All references are the same
    size, no matter what their
    data type is, and are accessed
    by their variable name
                                        Objects are always on the heap.
                                        They have no name and can only be
                                        accessed via a reference. Objects vary in
                                        size depending on their class definition.
    ======================================================================================================
    Realizing the difference between a "reference" and an "object" goes a long way toward understanding garbage collection, the "new operator", and many other facets of the Java language.
    Look at this code and see if you can figure out when each object first becomes eligible for garbage collection:
    */
}

    /*public*/ class Scope {                            //______1
         public static void main(String[] args) {       //______2
             String one, two;                           //______3
             one = new String("a");              //______4
             two = new String("b");              //______5
             one = two;                                 //______6
             String three = one;                        //______7
             one = null;                                //______8
         }                                              //______9
    }                                                   //______10
    /*-
    When you get asked a question about garbage collection on the exam, we recommend you draw what’s going on.
    There’s a lot to keep track of in your head and it’s easy to make a silly mistake trying to keep it all in your memory.
    Let’s try it together now. Really. Get a pencil and paper.
    Got that paper? Okay, let’s get started.
    On line 3, we write one and two. Just the words. No need for boxes or arrows yet since no objects have gone on the heap yet.
    On line 4, we have our first object. Draw a box with the string "a" in it and draw an arrow from the word one to that box.
    Line 5 is similar. Draw another box with the string "b" in it this time and an arrow from the word two. At this point, your work should look like Figure 1.2
    FIGURE 1.2: Your drawing after line 5
                                 _____
                                |     |
            one ------------->  | "a" |
                                |_____|
                                 _____
                                |     |
            two ------------->  | "b" |
                                |_____|
    On line 6, the variable one changes to point to "b". Either erase or cross out the arrow from one and draw a new arrow from one to "b".
    On line 7, we have a new variable, so write the word three and draw an arrow from three to "b".
    Notice that three points to what one is pointing to right now and not what it was pointing to at the beginning.
    This is why we are drawing pictures. It’s easy to forget something like that. At this point, your work should look like Figure 1.3.
    FIGURE 1.3: Your drawing after line 7
                                 _____
                                |     |
                                | "a" |
                                |_____|
                                 _____
            one ------------->  |     |
            two ------------->  | "b" |
            three------------>  |_____|
    Finally, cross out the line between one and "b" since line 8 sets this variable to null.
    Now, we were trying to fi nd out when the objects were first eligible for garbage collection.
    On line 6, we got rid of the only arrow pointing to "a", making that object eligible for garbage collection.
    "b" has arrows pointing to it until it goes out of scope.
    This means "b" doesn’t go out of scope until the end of the method on line 9.
     */