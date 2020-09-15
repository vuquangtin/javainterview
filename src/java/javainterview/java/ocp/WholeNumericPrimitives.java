package javainterview.java.ocp;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/javainterview">https://github.com/vuquangtin/javainterview</a>
 *
 */
public class WholeNumericPrimitives {
	public static void main(String[] args) {
		long max = 32_123_456_789L;
		long n = 2_300;

		// Octal numbers
		int oct = 07; // octal (0-7)
		int firstOct = 010; // 8 decimal
		int secondOct = 022; // 18 decimal

		int sumOct = firstOct + secondOct;
		System.out.println("first= " + firstOct + " second=  " + secondOct);
		System.out.println("decimal sum= " + sumOct + " octSum = "
				+ Integer.toOctalString(sumOct));

		// Hexadecimal (0-9 and A-F)
		int firstHex = 0xF; // 15 decimal
		int secondHex = 0x1E; // 30 decimal
		int sumHex = firstHex + secondHex; // 45 decimal 2d hex
		System.out.println("first= " + firstHex + "secondHex= " + secondHex);
		System.out.println("decimalSum= " + sumHex + "hexSum= "
				+ Integer.toHexString(sumHex));

		// Binary
		int firstBin = 0b1001; // / 9 decimal
		int secondBin = 0b0111; // 7 decimal
		int sumBin = firstBin + secondBin; // 16 decimal, 10000 binary
		System.out
				.println("firstBin= " + firstBin + "secondBind= " + secondBin);
		System.out.println("decimalSum= " + sumBin + "binSum= "
				+ Integer.toBinaryString(sumBin));

	}

}