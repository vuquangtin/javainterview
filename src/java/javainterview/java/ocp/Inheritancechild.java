package javainterview.java.ocp;

public class Inheritancechild extends Inheritance{
	
	int a=20;
	static int b=10;
	int depid;
	
	public void m1(){
	   
	   System.out.println("I am in m1 method");
   }
   
   public Inheritancechild(String name, int epid){
	   
	  super(name);
	  this.depid=epid;
   }
	
  public void display(){
	  
	  System.out.println(name + " "+ depid);
  }
  public static void main(String[] args) {
		
		Inheritancechild ic = new Inheritancechild ("rajani", 111);
		
		ic.m1();
		
		System.out.println(ic.a);
		System.out.println(Inheritancechild.b);
		ic.display();
		
		

	}

}
