package javainterview.java.oca.chapter01;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class ChapterEndQuestions {

    public static void main(String[] args) {
        //question2();
        //ChapterEndQuestions chapterEndQuestions = new ChapterEndQuestions();
        //chapterEndQuestions.question6();
        //question8();
        stringQuestion10();
    }

    public static void question1(){
        int numFish = 4;
        String fishType = "tuna";
        //String anotherFish = numFish + 1;
        //System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);}

    public static void question2(){

        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }

     class Lion{

        public void roar(String roar1,StringBuilder roar2){
            roar1.concat("!!!");
            roar2.append("!!!");
        }
    }


    public void question6(){

        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");

        ChapterEndQuestions.Lion l = new Lion();
         l.roar(roar1,roar2);
       // new Lion().roar(roar1,roar2);

        System.out.println(roar1 + " " + roar2);

        //System.out.println(roar1.concat(" ").concat(roar2.toString()));
    }

    public void question7(){
        String letter = "abcedf";
        System.out.println(letter);
    }

    public static void question8(){
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));
    }

    public static void stringQuestion10(){
        String s = "";
        s+=2;
        s +='c';
        s+= false;
        if ( s == "2cfalse") System.out.println("==");
        if ( s.equals("2cfalse")) System.out.println("equals");
    }

    public static void questionOne(){
        int numFish = 4;
        String fishType = "tuna";
         //fishType += numFish; this allowed

        // String anotherFish = numFish + 1; this is not allowed

       // System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

}