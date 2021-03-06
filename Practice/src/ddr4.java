import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ddr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = obtenerN(), m = obtenerM();
		int b[][] = new int[n][m];
		int c[][] = new int[n][m];
		int suma[][] = new int[n][m];
		cargar_matriz(b, n, m);
		cargar_matriz(c, n, m);
		SumaMatrices(b, c, n, m, suma);
		System.out.println("B -------------------------------------------");
		MostrarMatriz(b, n, m);
		System.out.println("c -------------------------------------------");
		MostrarMatriz(c, n, m);
		System.out.println("Suma -------------------------------------------");
		MostrarMatriz(suma, n, m);
	}

	public static void SumaMatrices(int b[][], int c[][], int n, int m,
			int suma[][]) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				suma[i][j] = b[i][j] + c[i][j];
			}
		}
	}

	public static int obtenerN() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese n");
			pos = new Integer(entrada.readLine());
			while ((pos < 0)) {
				System.out
						.println("Ingrese el tama�o de las secuencias que quiere invertir de 0 a 20");
				pos = new Integer(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static int obtenerM() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese m");
			pos = new Integer(entrada.readLine());
			while ((pos < 0)) {
				System.out
						.println("Ingrese el tama�o de las secuencias que quiere invertir de 0 a 20");
				pos = new Integer(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
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
