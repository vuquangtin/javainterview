package javainterview.java.ocp.ch1;

/**
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a href="https://github.com/vuquangtin/javainterview">https://github.com
 *      /vuquangtin/javainterview</a>
 *
 */
public class FieldsAndMethods {
	private boolean b;
	private short s;
	private int i;
	private long l;
	private float f;
	private String text;

	public static void main(String[] args) {
		FieldsAndMethods fam = new FieldsAndMethods();
		fam.setS((short) 2_147);
		fam.setI(0x11F);
		fam.setL(3_123_456_789L);
		fam.setF((float) 42.24);
		fam.setText("g");
		System.out.println(fam.toString());
	}

	public short getS() {
		return s;
	}

	public int getI() {
		return i;
	}

	public long getL() {
		return l;
	}

	public void setS(short s) {
		this.s = s;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setL(long l) {
		this.l = l;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setF(float f) {
		this.f = f;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "FieldsAndMethods{" + "b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", text='" + text
				+ '\'' + '}';
	}
}