package javainterview.java.basic;

import java.util.Random;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class CreateRandomValue {
	/**
	 * @param maxLen
	 * @return
	 */
	public String getRandomString(int maxLen) {
		StringBuffer stringbuf = new StringBuffer("");
		Random ran = new Random();
		int leng = ran.nextInt(maxLen);
		for (int i = 0; i < leng;) {
			char chornum = ran.nextInt(2) % 2 == 0 ? 'n' : 'c';
			if (chornum == 'n') {
				stringbuf.append(ran.nextInt(10));
			} else {
				if (ran.nextInt(2) == 0) {
					stringbuf.append((char) (ran.nextInt(26) + 65));
				} else {
					stringbuf.append((char) (ran.nextInt(26) + 97));
				}
			}
			i++;
		}
		return stringbuf.toString() + "\n";
	}

	public static void main(String[] args) {
		CreateRandomValue crea = new CreateRandomValue();
		System.out.println(crea.getRandomString(10));
	}
}