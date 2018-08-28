
public class SecondLargest {
	public final static int MAXf = 10;
	public final static int MAXc = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAXf][MAXc];
		cargar_matriz(b, MAXf, MAXc);
		MostrarMatriz(b, MAXf, MAXc);
		System.out.println("");
		SortMatrix(b);
		MostrarMatriz(b, MAXf, MAXc);
		System.out.println(FindtheSecond(b));
	}

	public static void SortMatrix(int b[][]) {
		int temp = 0;
		for (int i = 0; i < MAXf; i++) {
			for (int j = 0; j < MAXc; j++) {
				for (int h = 0; h < MAXf; h++) {
					for (int k = 0; k < MAXc; k++) {
						if (b[i][j] < b[h][k]) {
							temp = b[i][j];
							b[i][j] = b[h][k];
							b[h][k] = temp;
						}
					}
				}
			}
		}
	}

	public static void cargar_matriz(int[][] arr, int n, int m) {
		for (int con = 0; con < n; con++) {
			for (int i = 0; i < m; i++) {
				arr[con][i] = (int) (Math.random() * 1000);
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

	public static int FindtheSecond(int b[][]) {
		for (int i = MAXf - 1; i >= 0; i--) {
			for (int j = MAXc - 1; j >= 0; j--) {
				if (b[MAXf - 1][MAXc - 1] != b[i][j]) {
					System.out.println("asd");
					return b[i][j];
				}
			}
		}
		return 0;
	}
}
