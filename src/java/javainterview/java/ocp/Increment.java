package javainterview.java.ocp;

public class Increment {
	
	
	int x= 6;
	
	 
	 
	boolean y = (x>=6)||(++x<=7);
	
	public static void main(String[] args){
		
		Increment i = new Increment();
		
		System.out.println(++i.x);
		System.out.println(i.x);
		System.out.println(i.y);
		
		
	
	}

}


