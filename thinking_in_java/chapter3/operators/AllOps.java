public class AllOps {
	void f(boolean b) {}

	void boolTest(boolean x, boolean y) {
		f(x == y);
		f(x != y);
		f(!y);

		//! x &&= y;
		x &= y;
		x |= y;
		x ^= y;
	}

	void charTest(char x, char y) {
		x = (char)(x*y);
		x++;
		f(x > y);
		x = (char)-y;
		x = (char)(x ^ y);
		x <<= 1;
		x >>>= 1;

		byte b = (byte)x;
		short s = (short)x;
		int i = (int)x;
		long l = (long)x;
		float f = (float)x;
		double d = (double)x;
	}

	void byteTest(byte x, byte y) {
	}

	public static void main(String[] args) {
	}
}
