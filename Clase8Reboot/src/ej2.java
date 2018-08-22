public class ej2 {
	final public static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAX][MAX];
		int c[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 3, d = 4;
		cargar_matriz(b);
		InsertarFila(b, c, n);
		EliminarFila(b, d);
		BurbujaxFilas(b);
		MostrarMatriz(b);
	}

	public static void cargar_matriz(int[][] arr) {
		for (int con = 0; con < MAX; con++) {
			for (int i = 0; i < MAX; i++) {
				arr[con][i] = (int) (Math.random() * 10 + 1);
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

	public static void InsertarFila(int b[][], int c[], int n) {
		for (int i = 0; i < MAX; i++) {
			b[n][i] = c[i];
		}
	}

	public static void EliminarFila(int b[][], int d) {
		for (int i = 0; i < MAX; i++) {
			b[d][i] = 0;
		}
	}

	public static void BurbujaxFilas(int[][] arr) {
		int temp;
		for (int i = 1; i < MAX; i++) { // Por columnas cambiar los +1
			for (int j = 0; j < MAX; j++) {
				for (int a = 0; a < MAX - 1; a++) {
					if (arr[j][a] > arr[j][a + 1]) {
						temp = arr[j][a];
						arr[j][a] = arr[j][a + 1];
						arr[j][a + 1] = temp;
					}
				}
			}
		}
	}
}
