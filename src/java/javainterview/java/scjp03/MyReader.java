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

public class MyReader {

	public static void main(String args[]) {
		try {
			FileReader fileReader = new FileReader("MyFile.java");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String strString;
			fileReader.close();

			while ((strString = bufferedReader.readLine()) != null) {
				System.out.println(strString);
			}

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

	}
}
