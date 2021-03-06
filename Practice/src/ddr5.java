import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ddr5 {

	final static int MAX = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[MAX][MAX];
		cargar_matriz(b, MAX, MAX);
		MostrarMatriz(b, MAX, MAX);
		Menu(b);
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

	public static void Menu(int b[][]) {
		int n = Opcion();
		while (n != 0) {
			switch (n) {
			case 0:
				System.out.println("Programa Terminado");
				break;
			case 1:
				MatrizUser(b);
				break;
			case 2:
				SumaFila(b);
				break;
			case 3:
				SumaColumna(b);
				break;
			case 4:
				SumarDiagonal(b);
				break;
			case 5:
				SumarDiagonalInversa(b);
				break;
			case 6:
				MediaMatriz(b);
				break;
			}
			n = Opcion();
		}
	}

	public static void SumarDiagonal(int b[][]) {
		int suma = 0;
		for (int i = 0; i < MAX; i++) {
			suma += b[i][i];
		}

		System.out.println("La suma de la diagonal es " + suma);
	}

	public static void SumarDiagonalInversa(int b[][]) {
		int suma = 0;
		int i = 0;
		for (int j = MAX - 1; j >= 0; j--) {
			suma += b[i][j];
			i++;
		}
		System.out.println("La suma de la diagonal inversa es " + suma);
	}

	public static void MediaMatriz(int b[][]) {
		int suma = 0;
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				suma += b[i][j];
			}
		}
		suma /= (MAX * MAX);
		System.out.println("La media de la matriz es " + suma);
	}

	public static int Opcion() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("0-Para terminar");
			System.out.println("1-Llenar matriz");
			System.out.println("2-Suma una fila");
			System.out.println("3-Suma una columna");
			System.out.println("4-Suma la diagonal");
			System.out.println("5-Suma la diagonal Inversa");
			System.out.println("6-La media de la matriz");
			pos = new Integer(entrada.readLine());
			while ((pos < 0) && (pos > 6)) {
				System.out.println("0-Para terminar");
				System.out.println("1-Llenar matriz");
				System.out.println("2-Suma una fila");
				System.out.println("3-Suma una columna");
				System.out.println("4-Suma la diagonal");
				System.out.println("5-Suma la diagonal Inversa");
				System.out.println("6-La media de la matriz");
				pos = new Integer(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static void SumaFila(int b[][]) {
		int suma = 0;
		int nfila = ObtenerFila();
		for (int i = 0; i < MAX; i++) {
			suma += b[nfila][i];
		}

		nfila++;
		System.out.println("La suma de la fila " + nfila + " es igual a "
				+ suma);
	}

	public static void SumaColumna(int b[][]) {
		int suma = 0;
		int ncol = ObtenerColumna();
		for (int i = 0; i < MAX; i++) {
			suma += b[i][ncol];
		}
		ncol++;
		System.out
				.println("La suma de la fila " + ncol + " es igual a " + suma);
	}

	public static void MatrizUser(int b[][]) {
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				b[i][j] = IngresoValor();
			}

		}
		MostrarMatriz(b, MAX, MAX);
	}

	public static int IngresoValor() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un valor");
			pos = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static int ObtenerFila() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Ingrese la fila que desea sumar, elija un valor entre 1 y 4");
			pos = new Integer(entrada.readLine());
			while ((pos < 1) && (pos > 4)) {
				System.out
						.println("Ingrese la fila que desea sumar, elija un valor entre 1 y 4");
				pos = new Integer(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}

		pos--;
		return pos;
	}

	public static int ObtenerColumna() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Ingrese la columna que desea sumar, elija un valor entre 1 y 4");
			pos = new Integer(entrada.readLine());
			while ((pos < 1) && (pos > 4)) {
				System.out
						.println("Ingrese la columna que desea sumar, elija un valor entre 1 y 4");
				pos = new Integer(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}

		pos--;
		return pos;
	}
}
