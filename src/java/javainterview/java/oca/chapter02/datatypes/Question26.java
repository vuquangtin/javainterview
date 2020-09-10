package javainterview.java.oca.chapter02.datatypes;

/**
 * @author Mariana Azevedo
 * @since 19/06/2019
 * 
 * Question 1.2.26 (page 94) - What is the output in the two cases, respectively?
 * 
 * class Question26 {
 *	  public static void main(String[] args) {
 *		 String s = "Caelum";
 *       s.concat(" - Ensino e Inova��o");
 *       System.out.println(s);
 *       
 *       StringBuffer s = new StringBuffer("Caelum");
 *       s.append(" - Ensino e Inova��o");
 *       System.out.println(s);
 *	  }
 * }
 * 
 * a) Caelum e Caelum - Ensino e Inova��o. (x)
 * b) Caelum - Ensino e Inova��o e Caelum - Ensino Inova��o.
 * c) Caelum e Caelum.
 * d) Caelum - Ensino e Inova��o e Caelum.
 */
class Question26 {
	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inova��o");
		System.out.println(s);
		      
		StringBuffer sb = new StringBuffer("Caelum");
		sb.append(" - Ensino e Inova��o");
		System.out.println(sb);
	}
}
