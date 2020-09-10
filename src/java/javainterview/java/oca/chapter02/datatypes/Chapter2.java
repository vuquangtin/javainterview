package javainterview.java.oca.chapter02.datatypes;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Chapter2 {


    public static void ifElseOne2(int hourOfDay ){

        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

    }

    public static void ifElseOne(int hourOfDay ){

        if(hourOfDay < 10) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }


    public static void compileChecking(){

        long x = 5;
        long y = 2 * x;
    }


    public void checkMultipleElse(){
        int x = 4;
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        //else System.out.println("Too High");
    }


    public static void testTernary(){

        int x = 20;

        System.out.println(x < 7 ? x > 5 ? x == 6 ? "First Inner inner Clase " : "Second Inner Inner  Clase"
                        : "Second Inner Clause"  : "Second Outer Clause" );

        int a = 20;
        int b = 20;

        System.out.println(a> b ? a == b ? "a>b" : "a=b" :"a<b");


    }
    public static void main(String[] args) {

       // ifElseOne2(0);

        //testTernary();

        //testForLoop();

       // multipleVariableForLoop();

       // opertarPrecedence();

       // booleanCheck();

       // infinteWhileLoop();

      //  doWhileQuestion17();

        checkAssigmentOperator();


    }

    public static void testForLoop(){

        for(int i=0; i<10 ; i++ ) {
          i=i++;
            System.out.println("Hello World");
        }
    }

    public static void forceCasting(){

        byte a = 40, b = 50;
      //  byte sum =  a + b;
      //  System.out.println(sum);

    }



    public static void multipleVariableForLoop(){

        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.print(y + " ");
        }
        System.out.println(x);

      /*-
       *   int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/
    }


    public static void opertarPrecedence(){

        int x = 5 * 4 % 3;

        int y = 4 % 3 * 5;
        System.out.println("x : "+x +" y : "+y);
    }



    public static void booleanCheck(){
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true) System.out.println("Success");
        else System.out.println("Failure");
    }

    public static void infinteWhileLoop(){

        int x = 1, y = 15;
        while (x < 10){
           y--;
        }
        x++;
        System.out.println(x+", "+y);

    }

    public static void infiniteWileLoop(){
        int y = 0;
        do{


        }while( y > 10);
    }

    public static void doWhileQuestion17(){
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
            result -= 2;
        } while(keepGoing);
        System.out.println(result);
    }

    public static void checkAssigmentOperator(){
        int x = 3;
        int  y = ++x*5/x-- + --x;

        System.out.println("x : "+x);
        System.out.println("y : "+y);

    }

    public static void question11(){
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);


        /*-
         *
         A. 1
         B. 2
         C. 3
         D. 7
         E. An exception is thrown.
         F. The code does not compile.
         */

    }



}