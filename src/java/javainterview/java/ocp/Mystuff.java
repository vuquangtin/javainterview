package javainterview.java.ocp;

public class Mystuff {
	
	String name;
	
	Mystuff(String n){
		this.name =n;
		
		//System.out.println(n);
		}

	public static void main(String[] args) {
		
		Mystuff m1 = new Mystuff("guitar");
		Mystuff m2 =new Mystuff("tv");
		
		System.out.println(m2.equals(m1));
	}
	
	public boolean equals(Object o){
		
		Mystuff m = (Mystuff)o;
		
		String  s= m.name;
		System.out.println(s);
		
		if(m.name !=null){
			
			return true;
		}
		
		return false;
	}
		
		

	}


