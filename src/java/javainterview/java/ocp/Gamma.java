package javainterview.java.ocp;

public class Gamma extends Beta{
	
	public String getType(){
		
	 return "gamma";	
		
	}

	public static void main(String[] args){
		
		Alpha g1 = new Alpha();
		
		
		System.out.println(g1.getType());
		
		
	}
	
}
