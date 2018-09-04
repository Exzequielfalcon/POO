
public class Clase8LAST {
	public final static int MAXf = 3;
	public final static int MAXc = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = { { 0, 1, 2, 3, 0, 2, 2, 0, 1, 6 }, { 0, 1, 2, 3, 0, 0, 2, 3, 0, 6 },
				{ 0, 1, 2, 3, 0, 2, 2, 3, 0, 6 } };
		int number = 3;
		MostrarMatriz(b, 3, MAXc);
		System.out.println("");
		Sumequ(b, number);
		MostrarMatriz(b, 3, MAXc);

	}

	public static void Sumequ(int b[][], int number) {
		int seci = 0, secj = 0, cont = 0;
		boolean encontrado = false;

		for (int i = 0; i < MAXf; i++) {
			encontrado = false;
			for (int j = 0; j < MAXc; j++) {
				if (first(b, i, j) && (encontrado == false)) {
					encontrado = true;
					seci = i;
					secj = j;
				}
				if (encontrado && (b[i][j] == 0)) {
					encontrado = false;
					if (cont == number) {
						Destroy(b, seci, secj, j - 1);
						// Order(j, i, b, secj);
					}
					cont = 0;
				}
				if (encontrado) {
					cont++;
				}

			}
		}
	}

	public static void Find(int b[][], int number) {
		int seci = 0, secj = 0, cont = 0;
		boolean encontrado = false;

		for (int i = 0; i < MAXf; i++) {
			encontrado = false;
			for (int j = 0; j < MAXc; j++) {
				if (first(b, i, j) && (encontrado == false)) {
					encontrado = true;
					seci = i;
					secj = j;
				}
				if (encontrado && (b[i][j] == 0)) {
					encontrado = false;
					if (cont == number) {
						Destroy(b, seci, secj, j - 1);
					}
					cont = 0;
				}
				if (encontrado) {
					cont++;
				}

			}
		}
	}

	public static void Destroy(int b[][], int seci, int secj, int j) {
		for (int h = secj; h <= j; h++) {
			b[seci][h] = 0;
		}
	}

	public static void Order(int finsec, int fila, int b[][], int inisec) {
		int c[] = new int[MAXc];
		int a = 0;
		for (int i = finsec + 1; i < MAXc; i++) {
			c[a] = b[fila][i];
			a++;
		}
		a = 0;
		for (int j = inisec; j < MAXc; j++) {
			b[fila][j] = c[a];
			a++;
		}
	}

	public static void OrderatLast(int b[][]) {
		int marca;
		for (int i = 0; i < MAXf; i++) {
			for (int j = 0; j < MAXc; j++) {
				marca = Marca(b, i, j);
				if (marca != -1) {
					FindSec(b, i, j, marca);
				}
			}
		}
	}

	public static void FindSec(int b[][], int i, int j, int marca) {
		boolean encontrado = false, fle = true;
		int inis = 0, fins = 0;
		while (j < MAXc && (fle)) {
			if (first(b, i, j) && (encontrado == false)) { // inicio de secuencia
				encontrado = true;
				inis = j;
			}
			if (encontrado && ((b[i][j] == 0))) { // fin de secuencia
				encontrado = false;
				fins = j - 1;
				CopiarenMarca(b, inis, fins, i, marca);
				fle = false;
			}
			if (encontrado && j == MAXc - 1) {
				encontrado = false;
				fins = j;
				CopiarenMarca(b, inis, fins, i, marca);
				fle = false;
			}
			j++;
		}
	}

	public static void CopiarenMarca(int b[][], int inis, int fins, int fila, int marca) {
		int a = 0;
		int c[] = new int[fins - inis + 1];
		for (int i = inis; i <= fins; i++) {
			c[a] = b[fila][i];
			b[fila][marca] = b[fila][i];
			b[fila][i] = 0;
			a++;
		}
	}

	public static int Marca(int b[][], int i, int j) {
		if (j - 1 >= 0) {
			if ((b[i][j - 1] == 0) && (b[i][j] == 0)) {
				return j;
			}
		}
		return -1;
	}

	public static boolean first(int b[][], int i, int j) {
		if (j - 1 >= 0) {
			if ((b[i][j - 1] == 0) && (b[i][j] != 0)) {
				return true;
			}
		}
		return false;
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
