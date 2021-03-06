public class ddr6 {

	final static int MAXr = 6; // CHANGE the number of rows
	final static int MAXc = 5; // CHANGE the number of collumns
	final static int MAXrandom = MAXr * MAXc; // CHANGE the maximum random

	public static void main(String[] args) {
		int b[][] = new int[MAXr][MAXc];
		RandomNoRepeat(b);
		ShowMatrix(b);
	}

	public static void RandomNoRepeat(int b[][]) {
		boolean c = true;
		if (MAXrandom < (MAXr * MAXc))
			;
		else {

			for (int i = 0; i < MAXr; i++) {
				for (int j = 0; j < MAXc; j++) {
					b[i][j] = (int) (Math.random() * MAXrandom);
					c = Check(b, b[i][j], i, j);
					while (c == false) {
						b[i][j] = (int) (Math.random() * MAXrandom);
						c = Check(b, b[i][j], i, j);
					}
				}
			}
		}
	}

	public static boolean Check(int b[][], int numero, int h, int k) {
		boolean c = true;
		for (int i = 0; i < MAXr; i++) {
			for (int j = 0; j < MAXc; j++) {
				if ((numero == b[i][j]) && ((i != h) || (k != j))) {
					c = false;
				}
			}
		}
		return c;
	}

	public static void ShowMatrix(int b[][]) {
		for (int d = 0; d < MAXr; d++) {
			for (int i = 0; i < MAXc; i++) {
				System.out.print(b[d][i] + "\t");
			}
			System.out.println("");
		}
	}

}