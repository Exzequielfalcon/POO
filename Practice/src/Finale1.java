
public class Finale1 {
	final static int MAXc = 10;
	final static int MAXf = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAXc][MAXf];
		cargar_matriz(b, MAXf, MAXc);
		MostrarMatriz(b, MAXf, MAXc);
		Ordenar(b);
		System.out.println("");
		MostrarMatriz(b, MAXf, MAXc);

	}

	public static void Ordenar(int b[][]) {
		int aux = 0;
		for (int i = 0; i < MAXf; i++) {
			for (int j = 0; j < MAXc; j++) {
				for (int x = 0; x < MAXf; x++) {
					for (int y = 0; y < MAXc; y++) {
						if (b[i][j] < b[x][y]) {
							aux = b[x][y];
							b[x][y] = b[i][j];
							b[i][j] = aux;
						}
					}
				}
			}
		}
	}

	public static void cargar_matriz(int[][] arr, int n, int m) {
		for (int con = 0; con < n; con++) {
			for (int i = 0; i < m; i++) {
				arr[con][i] = (int) (Math.random() * 10);
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
