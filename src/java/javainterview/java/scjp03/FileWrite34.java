package javainterview.java.scjp03;

import java.io.*;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */

public class FileWrite34 {
	public static void main(String args[]) {
		try {
			String strString = "Updating the critical data section";
			char buffer[] = new char[strString.length()];
			strString.getChars(0, strString.length(), buffer, 0);
			FileWriter f = new FileWriter("MyFile1.txt");
			FileWriter f1 = f;
			for (int i = 0; i < buffer.length; i += 2) {
				f1.write(buffer[i]);
			}
			f1.close();

			FileWriter f2 = new FileWriter("MyFile2.txt");
			f2.write(buffer);
			f2.close();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
