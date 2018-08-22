public class ejTemp {
	public static final int MAX = 11;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int b[][] = new int[2][11];
		boolean c[] = new boolean[11];
		CargaMes(b);
		CargaTemp(b);
		MostrarMatriz(b);
		BajoCero(c, b);
		MostrarVec(c);
	}

	public static void CargaMes(int b[][]) {
		for (int i = 0; i < 11; i++) {
			b[0][i] = i + 1;
		}
	}

	public static void CargaTemp(int b[][]) {
		for (int i = 0; i < 11; i++) {
			b[1][i] = randomWithRange(-20, 50);
		}
	}

	public static void MostrarMatriz(int b[][]) {
		for (int d = 0; d < 2; d++) {
			for (int i = 0; i < MAX; i++) {

				System.out.print("\t" + b[d][i]);
				if (d == 1) {
					System.out.print("°");
				}
			}
			System.out.println("");
		}
	}

	public static void BajoCero(boolean c[], int b[][]) {
		for (int i = 0; i < MAX; i++) {
			if (b[1][i] < 0) {
				c[i] = true;
			}

		}
	}

	public static void MostrarVec(boolean b[]) {
		for (int i = 0; i < MAX; i++) {
			System.out.print("\t" + b[i]);
		}
		System.out.println("");
	}

	public static int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}
