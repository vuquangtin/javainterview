package javainterview.java.ocp.ch4;


/*
Overloading Methods
===================
It is time to look at creating methods with the same signature in the same class.
Method overloading.- Occurs when there are different method signatures with the same name but different type parameters
The only change was the type of the parameter. Overloading also allows different numbers of parameters.
Everything other than the method signature can vary for overloaded methods. This means there can be different access modifiers,
specifiers (like static), return types, and exception lists.

Example:
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() {return false;}
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
As you can see, we can overload by changing anything in the parameter list. We can have a different type, more types, or the same types in a different order.
Also notice that the access modifier and exception list are irrelevant to overloading.

    public void fly(int numMiles) { }
    public int fly(int numMiles) { } //DOES NOT COMPILE
This method doesn’t compile because it only differs from the original by return type. The parameter lists are the same so they are duplicate methods as far
as Java is concerned.

    public void fly(int numMiles) { }
    public static void fly(int numMiles) { } // DOES NOT COMPILE
Again, the parameter list is the same. The only difference is that one is an instance method and one is a static method.
    public void fly(int numMiles) {
        System.out.println("short");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }
    //Good

Overloading and Varargs
=======================
Which method do you think is called if we pass an int[]?
    public void fly(int[] lengths) { }
    public void fly(int... lengths) { } // DOES NOT COMPILE
Trick question! Remember that Java treats varargs as if they were an array. This means that the method signature is the same for both methods.
Since we are not allowed to overload methods with the same parameter list, this code doesn't compile

Now that we’ve just gotten through explaining that they are the same, it is time to mention how they are not the same. It shouldn’t be a surprise that you can
call either method by passing an array:
    fly(new int[] { 1, 2, 3 });
However, you can only call the varargs version with stand-alone parameters:
    fly(1, 2, 3);
 */
public class E_A_Autoboxing {
//In the previous chapter, you saw how Java will convert a primitive int to an object Integer to add it to an ArrayList through the wonders of autoboxing
    public void fly(Integer numMiles) {}
    public void fly(int numMiles) {}
    public void main(String[] args) {
        this.fly(3);
    }
/*-
Explication:
    Java will match the int numMiles version.
    Java tries to use the most specific parameter list it can find When the primitive int version isn't present, it will autobox.
    However, when the primitive int version is provided, there is no reason for Java to do the extra work of autoboxing.
 */
}
