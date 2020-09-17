package javainterview.java.ocp.ch5;


/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class A_D_Defining_Constructors {
/*-
As you may recall from Chapter 4, every class has at least one constructor.
In the case that no constructor is declared, the compiler will automatically insert a default no-argument constructor.
In the case of extending a class, though, things are a bit more interesting.

In Java, the first statement of every constructor is either a call to another constructor within the class, using this(),
or a call to a constructor in the direct parent class, using super().
If a parent constructor takes arguments, the super constructor would also take arguments.
For simplicity in this section, we refer to the super() command as any parent constructor, even those that take an argument.
Notice the user of both super() and super(age) in the following example:
*/
public class Animal {
    private int age;

    public Animal(int age) {
        super();
        this.age = age;
    }
}

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }
}
/*-
In the first class, Animal, the first statement of the constructor is a call to the parent constructor defined in java.lang.Object, which takes no arguments.
In the second class, Zebra, the first statement of the first constructor is a call to Animal’s constructor, which takes a single argument.
The class Zebra also includes a second no-argument constructor that doesn’t call super() but instead calls the other constructor within the Zebra class using this(4).
Like the this() command that you saw in Chapter 4, the super() command may only be used as the first statement of the constructor.
For example, the following two class definitions will not compile:
*/
public class Zoo3 {
    public Zoo3() {
        System.out.println("Zoo created");
        //super(); // DOES NOT COMPILE, xq esto tiene que estar primero
    }
}

public class Zoo4 {
    public Zoo4() {
        super();
        System.out.println("Zoo created");
        //super(); // DOES NOT COMPILE, xq no puede haber 2
    }
}
/*-
The first class will not compile because the call to the parent constructor must be the first statement of the constructor, not the second statement.
In the second code snippet, super() is the first statement of the constructor, but it also used as the third statement.
Since super() can only be used as the first statement of the constructor, the code will likewise not compile.

If the parent class has more than one constructor, the child class may use any valid parent constructor in its definition, as shown in the following example:
*/
public class Animal2 {
    private int age;
    private String name;
    public Animal2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal2(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

public class Gorilla2 extends Animal2 {
    public Gorilla2(int age) {
        super(age,"Gorilla");
    }
    public Gorilla2() {
        super(5);
    }
}
/*-
In this example, the first child constructor takes one argument, age, and calls the parent constructor, which takes two arguments, age and name.
The second child constructor takes no arguments, and it calls the parent constructor, which takes one argument, age.
In this example, notice that the child constructors are not required to call matching parent constructors.
Any valid parent constructor is acceptable as long as the appropriate input parameters to the parent constructor are provided.
*/

    public void Understanding_Compiler_Enhancements() {
    }
/*-
Understanding_Compiler_Enhancements
===================================
Up to now, we defined numerous classes that did not explicitly call the parent constructor via the super() keyword, so why did the code compile? The answer
is that the Java compiler automatically inserts a call to the no-argument constructor super() if the first statement is not a call to the parent constructor.
For example, the following three class and constructor definitions are equivalent, because the compiler will automatically convert them all to the last example:
*/
public class Donkey {
}

public class Donkey2 {
    public Donkey2() {
    }
}

public class Donkey3 {
    public Donkey3() {
        super();
    }
}
/*
Make sure you understand the differences between these three Donkey class definitions and why Java will automatically convert them all to the last definition.
Keep the process the Java compile performs in mind as we discuss the next few examples.
What happens if the parent class doesn’t have a no-argument constructor?
Recall that the no-argument constructor is not required and only inserted if there is no constructor defined in the class.
In this case, the Java compiler will not help and you must create at least one constructor in your child class that explicitly calls a parent constructor via the super() command.
For example, the following code will not compile:
*/
    public class Mammal {
        public Mammal(int age) {
        }
    }

    //public class Elephant extends Mammal { // DOES NOT COMPILE
        //xq implicitamente esta llamando al super() y ese constructor no existe
    //}

/*
In this example no constructor is defined within the Elephant class, so the compiler tries to insert a default no-argument
constructor with a super() call, as it did in the Donkey example.
The compiler stops, though, when it realizes there is no parent constructor that takes no arguments.
In this example, we must explicitly define at least one constructor, as in the following code:
*/
    public class Mammal2 {
        public Mammal2(int age) {
        }
    }

    /*
    public class Elephant2 extends Mammal2 {
        public Elephant2() { // DOES NOT COMPILE
        }
    }
    */
/*
This code still doesn’t compile, though, because the compiler tries to insert the no argument super() as the first statement
of the constructor in the Elephant class, and there is no such constructor in the parent class.
We can fix this, though, by adding a call to a parent constructor that takes a fi xed argument:
*/
    public class Mammal3 {
        public Mammal3(int age) {
        }
    }

    public class Elephant3 extends Mammal3 {
        public Elephant3() {
            super(10);
        }
    }
/*
This code will compile because we have added a constructor with an explicit call to a parent constructor.
Note that the class Elephant now has a no-argument constructor even though its parent class Mammal doesn’t.
Subclasses may define no-argument constructors even if their parent classes do not, provided the constructor of the child maps
to a parent constructor via an explicit call of the super() command.
You should be wary of any exam question in which the parent class defines a constructor that takes arguments and doesn’t define a no-argument constructor.
Be sure to check that the code compiles before answering a question about it.
     */


    public void Reviewing_Constructor_Rules() {
    /*-
    Let’s review the rules we covered in this section. Constructor Definition Rules:

    1. The first statement of every constructor is a call to another constructor within the class using this(), or a call to a constructor in the direct parent class using super().
       (super para llamar a un constructor padre y this para llamar a constructor en la misma clase)
    2. The super() call may not be used after the first statement of the constructor.
       (super siempre debe estar en la primera declaracion)
    3. If no super() call is declared in a constructor, Java will insert a no-argument super() as the first statement of the constructor.
       (Si no se declara super, java lo insertara implicitamte en la primera linea)
    4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any constructors, the compiler will throw an error and try to insert
       a default no-argument constructor into the child class.
       (Si el padre tiene un contructor con argumentos, y la hija no defini ningun constructor, entonces se lanzara un error de compilacion)
    5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor.
       (Si el padre tiene un contructor con argumentos, sus clases hijas deben llamarlo explicitamente)

    Make sure you understand these rules; the exam will often provide code that breaks one or many of these rules and therefore doesn’t compile.
    */
    }

    public void Calling_Constructors() {
    }
    /*
    Calling_Constructors
    ====================
    Now that we have covered how to define a valid constructor, we’ll show you how Java calls the constructors.
    In Java, the parent constructor is always executed before the child constructor. For example, try to determine what the following code outputs:
*/
    class Primate {
        public Primate() {
            System.out.println("Primate");
        }
    }
    class Ape extends Primate {
        public Ape() {
            System.out.println("Ape");
        }
    }
    public class Chimpanzee extends Ape {
        public void main(String[] args) {
            new Chimpanzee();
        }
    }
/*-
The compiler first inserts the super() command as the first statement of both the Primate and Ape constructors.
Next, the compiler inserts a default no-argument constructor in the Chimpanzee class with super() as the first statement of the constructor.
The code will execute with the parent constructors called first and yields the following output:

    Primate
    Ape

The exam creators are fond of questions similar to the previous one that try to get you to determine the output of statements involving constructors.
Just remember to “think like the compiler” as much as possible and insert the missing constructors or statements as needed.
 */
}