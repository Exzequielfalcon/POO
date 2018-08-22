import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjLAST {
	final static int MAXf = 10;
	final static int MAXc = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAXf][MAXc];
		int n = obtenerposicion();
		cargar_matriz(b);
		MostrarMatriz(b);
		SearchAndDestroy(b, n);
		MostrarMatriz(b);
	}

	public static void SearchAndDestroy(int b[][], int n) {
		boolean d = true;
		int posi = 0, posf = 0;
		for (int i = 0; i < MAXf; i++) {
			d = true;
			for (int j = 0; j < MAXc - 1; j++) {
				if (((b[i][j] == 0) && (b[i][j + 1] != 0)) && d) {
					posi = j + 1; // Empieza la secuencia
					d = false;

				}
				if (d == false && ((b[i][j] != 0) && (b[i][j + 1] == 0))) {
					posf = j; // Termina la secuencia

					if (posf - posi + 1 == n) {
						eliminar(posi, posf, b, i);
						System.out.println("entro en" + j);
					}
					d = true;
				}
			}
		}
	}

	public static void eliminar(int posi, int posf, int b[][], int j) {
		for (int i = posi; i <= posf; i++) {
			b[j][i] = 0;
		}
	}

	public static int obtenerposicion() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Ingrese el tamaño de las secuencias que desea eliminar");
			pos = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static void MostrarMatriz(int b[][]) {
		for (int c = 0; c < MAXc; c++) {
			System.out.print("\t" + c);
		}
		System.out.println("\n");
		for (int d = 0; d < MAXf; d++) {
			for (int i = 0; i < MAXc; i++) {
				System.out.print("\t" + b[d][i]);
			}
			System.out.println("");
		}
	}

	public static void cargar_matriz(int[][] arr) {
		for (int con = 0; con < MAXf; con++) {
			for (int i = 0; i < MAXc; i++) {
				arr[con][i] = (int) (Math.random() * 2);
			}
		}
	}
}
