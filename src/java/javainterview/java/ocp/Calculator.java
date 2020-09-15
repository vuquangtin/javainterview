package javainterview.java.ocp;

public class Calculator {
	
	static int x =100;
	int y ;
	static int k;
	public void calc(int z){
		
		int k = z *10;
		x = x + k;
		y = y * x;
	}	
		public void printnum(){
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(k);
		}	
		
		public static void main(String[] args){
			Calculator obj1 = new Calculator();
			obj1.calc(2);
			obj1.printnum();
			Calculator obj2 = new Calculator();
			obj2.calc(2);
			obj1.printnum();
			obj2.printnum();
			
			
			
		}
		
		
	}


