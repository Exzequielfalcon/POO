
public class RecuDo {
	final static int Maxf = 2;
	final static int Maxc = 9;

	public static void main(String[] args) {
		int b[][] = { { 0, 3, 2, 1, 0, 3, 2, 1, 0 }, { 0, 3, 2, 1, 0, 3, 2, 1, 0 } };
		MostrarMatriz(b, Maxf, Maxc);
		EncontrarSec(b, 2);
		MostrarMatriz(b, Maxf, Maxc);

	}

	public static int iniciosec(int b[][], int fila, int inicio) {
		int i = inicio;
		while ((i >= 0) && (b[fila][i] == 0)) {
			i--;
		}
		if (i == -1) {
			return i + 1;
		} else
			return i;
	}

	public static int finsec(int b[][], int fila, int inicio) {
		int i = inicio;
		while ((i >= 0) && (b[fila][i] != 0)) {
			i--;
		}
		return i + 1;
	}

	public static void EncontrarSec(int b[][], int contar) {
		int fila = Maxf - 1;
		int i = Maxc - 1;
		while ((fila >= 0) && (contar > 0)) {
			i = iniciosec(b, fila, i);
			while ((i > 0) && (contar > 0)) {
				OrdenarSec(b, i, finsec(b, fila, i), fila);
				contar--;
				i = iniciosec(b, fila, finsec(b, fila, i) - 1);
			}
			fila--;
		}

	}

	public static void OrdenarSec(int b[][], int in, int fin, int fila) {
		int aux = 0;
		for (int i = in; i > fin; i--) {
			for (int j = in; j > fin; j--) {
				if (b[fila][j] < b[fila][j - 1]) {
					aux = b[fila][j - 1];
					b[fila][j - 1] = b[fila][j];
					b[fila][j] = aux;
				}
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
