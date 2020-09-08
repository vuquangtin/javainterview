package javainterview.java.basic;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

class Animal {
	/*-
	 * What is runtime polymorphism in Java?
	 Polymorphism is the capability of an action or method to do different things based 
	 on the object that it is acting upon. In other words, polymorphism allows you define 
	 one interface and have multiple implementation. This is one of the basic principles 
	 of object oriented programming.
	 The method overriding is an example of runtime polymorphism. You can have a method in 
	 subclass overrides the method in its super classes with the same name and signature. 
	 Java virtual machine determines the proper method to call at the runtime, not at the compile time.
	 Let's take a look at the following example:*/
	void whoAmI() {
		System.out.println("I am a generic Animal.");
	}
}

class Dog extends Animal {
	void whoAmI() {
		System.out.println("I am a Dog.");
	}
}

class Cow extends Animal {
	void whoAmI() {
		System.out.println("I am a Cow.");
	}
}

class Calf extends Cow {
	void whoAmI() {
		System.out.println("I am a Calf.");
	}
}

class Snake extends Animal {
	void whoAmI() {
		System.out.println("I am a Snake.");
	}
}

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Animal ref1 = new Animal();
		Animal ref2 = new Dog();
		Animal ref3 = new Cow();
		// test the benefit of taking Animal ref to point dog class
		// here ref3 pointing to cow class, but ref3 of animal can point to dog
		// also.
		// ref3 = new Dog();
		// eve can point to sub class of dog also.
		// ref3 = new Calf();

		Animal ref4 = new Snake();
		ref1.whoAmI();
		ref2.whoAmI();
		ref3.whoAmI();
		ref4.whoAmI();
	}
}

/*-
 * 
 The output is
 I am a generic Animal.
 I am a Dog.
 I am a Cow.
 I am a Snake.

 In the example, there are four variables of type Animal (e.g., ref1, ref2, ref3, and ref4). 
 Only ref1 refers to an instance of Animal class, 
 all others refer to an instance of the subclasses of Animal. 
 From the output results, you can confirm that version of a method is invoked 
 based on the actually object's type.
 In Java, a variable declared type of class A can hold a reference to an object of class A 
 or an object belonging to any subclasses of class A.

 The program is able to resolve the correct method related to the subclass object at runtime. 
 This is called the runtime polymorphism in Java. 
 This provides the ability to override functionality already available in the class hierarchy tree.

 At runtime, which version of the method will be invoked is based on the type of actual 
 object stored in that reference variable and not on the type of the reference variable.
 */
