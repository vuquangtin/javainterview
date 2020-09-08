package javainterview.java.scjp01;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class Test1{
    public static void main(String a[]){
       Set s = new TreeSet();
       s.add(new Person(20));
       s.add(new Person(10));
       System.out.println(s);
      
    }
}
class Person{
   Person(int i){}
}
