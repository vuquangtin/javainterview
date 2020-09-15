package javainterview.java.ocp.ch1;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class C_E_CodeFormattingOnTheExam {
	/*-
	Not all questions will include the imports.
	If the exam isn’t asking about imports in the question, it will often omit the imports to save space.
	You’ll see examples with line numbers that don’t begin with 1 in this case.
	The question is telling you, “Don’t worry—imagine the code we omitted is correct; just focus on what I’m giving you.”
	This means when you do see the line number 1 or no line numbers at all, you have to make sure imports aren’t missing.
	Another thing the exam does to save space is to merge code on the same line.
	You should expect to see code like the following and to be asked whether it compiles.
	(You’ll learn about ArrayList in Chapter 3—assume that part is good for now.)
	6: public void method(ArrayList list) {
	7: if (list.isEmpty()) { System.out.println("e");
	8: } else { System.out.println("n");
	9: } }
	The answer here is that it does compile because the code starts below the imports. Now, what about this one? Does it compile?
	1: public class LineNumbers {
	2: public void method(ArrayList list) {
	3: if (list.isEmpty()) { System.out.println("e");
	4: } else { System.out.println("n");
	5: } } }
	For this one, you would answer “Does not compile.” Since the code begins with line 1, you don’t get to assume that valid imports were provided earlier.
	The exam will let you know what package classes are in unless they’re covered in the objectives.
	You’ll be expected to know that ArrayList is in java.util—at least you will once you get to Chapter 3 of this book!
	You’ll also see code that doesn’t have a main() method.
	When this happens, assume the main() method, class definition, and all necessary imports are present.
	You’re just being asked if the part of the code you’re shown compiles when dropped into valid surrounding code.
	 */
}