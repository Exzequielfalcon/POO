
public class Class8Insert {
	public static int MAXc = 10;
	public static int MAXf = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAXf][MAXc];
		cargar_matriz(b, MAXf, MAXc);
		MostrarMatriz(b, MAXf, MAXc);
		System.out.println(" ");
		getSecuencias(b);
		MostrarMatriz(b, MAXf, MAXc);
	}

	public static void InsertarFila(int c[], int b[][], int n) {
		for (int i = 0; i < MAXc; i++) {
			b[n][i] = c[i];
		}
	}

	public static void getSecuencias(int b[][]) {
		int c[] = new int[MAXc];
		boolean sec = true;

		for (int i = 0; i < MAXf; i++) {
			sec = true;
			for (int j = 1; j < MAXc; j++) {
				if ((b[i][j] != 0) && (b[i][j - 1] == 0) && (sec)) {
					sec = false;
				}
				if ((b[i][j] == 0) && (b[i][j - 1] != 0) && (sec == false)) {
					c[i]++;
					sec = true;
				}
			}
		}

		OrdenarPorSecuencia(b, c);
	}

	public static void OrdenarPorSecuencia(int b[][], int c[]) {
		int temp;
		for (int i = 0; i < MAXc; i++) {
			for (int j = 0; j < MAXc - 1; j++) {
				if (c[j] > c[j + 1]) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
					CorrerFila(b, j, j + 1);
				}
			}
		}
	}

	public static void CorrerFila(int b[][], int j1, int j2) {
		int c[] = new int[MAXc];
		for (int i = 0; i < MAXf; i++) {
			c[i] = b[j1][i];
			b[j1][i] = b[j2][i];
			b[j2][i] = c[i];
		}
	}

	public static void cargar_matriz(int[][] arr, int n, int m) {
		for (int con = 0; con < n; con++) {
			for (int i = 0; i < m; i++) {
				arr[con][i] = (int) (Math.random() * 2);
			}
		}
	}

	public static void MostrarMatriz(int b[][], int n, int m) {
		for (int d = 0; d < n; d++) {
			for (int i = 0; i < m; i++) {
				System.out.print("\t" + b[d][i]);
			}
			System.out.println("");
		}
	}

}
