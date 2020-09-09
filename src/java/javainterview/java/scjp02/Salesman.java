package javainterview.java.scjp02;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
/** Employee.java file */
class Employee {
	int salary = 1000;

	public int getSalary() {
		return salary;
	}
}

/** End of Employee.java file */
/** Salesman.java file */
public class Salesman extends Employee {
	int commission = 100;

	public int getSalary() {
		return salary + commission;
	}

	public static void main(String[] args) {
		Salesman sm = new Salesman();
		Employee em = sm;
		System.out.println(em.getSalary());
	}
}
/** End of Salesman.java file */
