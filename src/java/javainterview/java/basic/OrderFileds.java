package javainterview.java.basic;

public class OrderFileds {
	private int a = 100;
	//private int b=a+c;
	private int c=10;
	private static int sA=100;
	//private static int sB=sA+sC;
	private static int sC=10;
	private static int sB=sA+sC;
	private static int sM=10;
	static{
		//private static int sM=0;	
		//private static final int sMF=0;
		sA=sB+sC;
		//sA=sB+sM;
		sM=100+sA+sB+sC;
	}
	//private static int sM=10;
	{
		c=100;
		k=100;
	}
	private int k=a+c;
	public static void main(String[] args) {
		System.out.println(OrderFileds.sM);
		System.out.println(new OrderFileds().k);

	}

}
