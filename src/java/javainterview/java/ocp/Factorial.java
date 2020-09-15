package javainterview.java.ocp;

public class Factorial {

	public static void main(String[] args) {
		
		 int number =8; int fact=1;
		
		for(int i=1; i<= number; i++){
			
			 fact= fact*i;
			
		}
		
		System.out.println("factorial of a given number is" +fact);
		
	}

}
