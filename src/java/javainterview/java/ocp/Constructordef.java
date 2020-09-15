package javainterview.java.ocp;

public class Constructordef {
	
	int id;
	String name;
	
	
	public Constructordef(int sid, String sname ){
		
		this.id = sid;
		this.name= sname;
		
	}
	
	public void display(){
		
		System.out.println(id + " "+ name);
		
	}
	
	public static void main(String[] args) {
		
		Constructordef c = new Constructordef(111,"rajani");
		c.display();
		
		
		

	}

}
