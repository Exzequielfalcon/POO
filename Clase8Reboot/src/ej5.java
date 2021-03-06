public class ej5 {
	public static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAX][MAX];
		cargar_matriz(b);
		MostrarMatriz(b);
		OrdenSecuencias(b);
		MostrarMatriz(b);
	}

	public static void cargar_matriz(int[][] arr) {
		for (int con = 0; con < MAX; con++) {
			for (int i = 0; i < MAX; i++) {
				arr[con][i] = (int) (Math.random() * 2);
			}
		}
	}

	public static void OrdenSecuencias(int b[][]) {
		boolean c = false;
		int a = 0, temp = 0;
		int secs[] = new int[MAX];
		int h[] = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			for (int d = 0; d < MAX; d++) {
				if (d + 1 < MAX) {
					if ((b[i][d] == 0) && (b[i][d + 1] == 1)) {
						c = true;
						a = i;
					}
					if ((b[i][d] == 1) && (b[i][d + 1] == 0) && (c == true)
							&& (i == a)) {
						secs[i] += 1;
					}
				}
			}

			System.out.println(secs[i]);
		}
		for (int l = 0; l < MAX; l++) {
			for (int y = 0; y < MAX - 1; y++) {
				if (secs[y] > secs[y + 1]) {
					secs[y] = temp;
					secs[y] = secs[y + 1];
					secs[y + 1] = temp;
					for (int j = 0; j < MAX; j++) {
						h[j] = b[y][j];
						b[y][j] = b[y + 1][j];
						b[y + 1][j] = h[j];
					}
				}
			}
		}
	}

	public static void MostrarMatriz(int b[][]) {
		for (int d = 0; d < b.length; d++) {
			for (int i = 0; i < b.length; i++) {
				System.out.print("\t" + b[d][i]);
			}
			System.out.println("");
		}
	}

}
