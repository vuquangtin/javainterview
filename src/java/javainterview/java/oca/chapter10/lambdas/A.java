package javainterview.java.oca.chapter10.lambdas;

class A {
    public static void main(String[] args) {
    	Printer p = null;
        p = () -> System.out.println("Hello World");
        p.printMessage();
    }
}