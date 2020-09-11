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
public class FileWrite {
	public static void main(String args[]) {
		try {
			String strString = "Now is the time to take Sun Certification";
			char buffer[] = new char[strString.length()];
			strString.getChars(0, strString.length(), buffer, 0);
			FileWriter f = new FileWriter("MyFile1.txt");
			FileWriter f1 = f;
			f1.close();
			for (int i = 0; i < buffer.length; i += 2) {
				f.write(buffer[i]);
			}
			f.close();

			FileWriter f2 = new FileWriter("MyFile2.txt");
			f2.write(buffer);
			f2.close();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
