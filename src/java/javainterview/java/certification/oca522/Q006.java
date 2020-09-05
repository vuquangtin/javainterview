package javainterview.java.certification.oca522;
import java.io.IOException;
/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */


class X {
    public void printFileContent() throws IOException {
        /*code goes here */
        throw  new IOException();
    }
}

public class Q006 {
    public static void main(String[] args) throws Exception{
       X xobj = new X();
        xobj.printFileContent();
    }
}
/*-
Which two modifications should you make so that the code compiles successfully? (Choose two.)
A.  Replace line 13 with:
try {
xobj.printFileContent();
}
catch.(Exception e) { }
catch (IOException e) { }
B. Replace line 7 with throw ("IOException raised");
C. Replace line 11 with public static main(String [] args) throws Exception{
D. At line 14, insert throw new IOException ();
E. Replace line 5 with public void printFileContetnt() throws IOException{
Answer :
C.Option C
E.Option E
 */

//answer might be AE