public class Recuprofe {
	final static int NCOL = 9;
	final static int NFIL = 2;

	public static void main(String[] args) {
		int b[][] = { { 0, 3, 2, 1, 0, 3, 2, 1, 0 }, { 0, 3, 2, 1, 0, 3, 2, 1, 0 } };
		int CANT = 3;
		MostrarMatriz(b, NFIL, NCOL);
		ordenar_secuencias_matriz(b, CANT);
		MostrarMatriz(b, NFIL, NCOL);
	}

	public static void ordenar_secuencias_matriz(int[][] mat, int CANT) {
		int inicio;
		int fin;
		int fil = NFIL - 1;
		while ((fil >= 0) && (CANT > 0)) {
			inicio = NCOL;
			fin = NCOL - 1;
			while ((fin >= 0) && (CANT > 0)) {
				fin = obtener_fin_secuencia(mat, fil, inicio - 1);
				if (fin >= 0) {
					inicio = obtener_inicio_secuencia(mat, fil, fin);
					ord_seleccion_secuencia(mat, fil, inicio, fin);
					CANT--;
				}
			}
			fil--;
		}
	}

	public static int obtener_fin_secuencia(int[][] mat, int fil, int fin) {
		while ((fin >= 0) && (mat[fil][fin] == 0))
			fin--;
		return fin;
	}

	public static int obtener_inicio_secuencia(int[][] mat, int fil, int inicio) {
		while ((inicio >= 0) && (mat[fil][inicio] != 0))
			inicio--;
		return inicio + 1;
	}

	public static void ord_seleccion_secuencia(int mat[][], int fil, int inicio, int fin) {
		int i, j, menor, pos, tmp;
		for (i = inicio; i <= fin; i++) {
			menor = mat[fil][i];
			pos = i;
			for (j = i + 1; j <= fin; j++) {
				if (mat[fil][j] < menor) {
					menor = mat[fil][j];
					pos = j;
				}
			}
			if (pos != i) {
				tmp = mat[fil][i];
				mat[fil][i] = mat[fil][pos];
				mat[fil][pos] = tmp;
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