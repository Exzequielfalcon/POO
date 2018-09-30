
public class FinalE2 {
	final static int MAXc = 4;
	final static int MAXf = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = { { 1, 2, 3, 4 }, { 3, 8, 3, 5 }, { 6, 8, 5, 8 } };

		MostrarMatriz(b, MAXf, MAXc);
		Encontraryeliminar(b);
		System.out.println("");
		MostrarMatriz(b, MAXf, MAXc);

	}

	public static int SumaColumna(int b[][], int col) {
		int aux = 0;
		for (int i = 0; i < MAXf; i++) {
			aux += b[i][col];
		}
		return aux;
	}

	public static int SumaFila(int b[][], int fil) {
		int aux = 0;
		for (int i = 0; i < MAXc; i++) {
			aux += b[fil][i];
		}
		return aux;
	}

	public static void Eliminar(int b[][], int fil, int col) {
		for (int i = 0; i < MAXc; i++) {
			b[fil][i] = 0;
		}
		for (int j = 0; j < MAXf; j++) {
			b[j][col] = 0;
		}
	}

	public static boolean Filavacia(int b[][], int fil) {
		int aux = 0;
		for (int i = 0; i < MAXc; i++) {
			aux += b[fil][i];
		}
		if (aux == 0) {
			return true;
		} else
			return false;
	}

	public static boolean Columnavacia(int b[][], int col) {
		int aux = 0;
		for (int i = 0; i < MAXf; i++) {
			aux += b[i][col];
		}
		if (aux == 0) {
			return true;
		} else
			return false;
	}

	public static void Encontraryeliminar(int b[][]) {
		int i = 0;
		int j = 0;
		for (i = 0; i < MAXf; i++) {
			for (j = 0; j < MAXc; j++) {
				if (!((Filavacia(b, i)) && (Columnavacia(b, j)))) {
					if ((SumaFila(b, i)) == SumaColumna(b, j)) {
						Eliminar(b, i, j);
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
