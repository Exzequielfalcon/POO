public class ej1 {

	final public static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = new int[10][10];
		int n = 3, f = 4;

		cargar_matriz(b);
		MostrarMatriz(b);
		SumarColumnas(b, n);
		SumarFilas(b, f);
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

	public static void SumarColumnas(int b[][], int n) {
		System.out.println("Columna " + n);
		int suma = 0;
		for (int i = 0; i < MAX; i++) {
			suma += b[i][n]; // Primer numero filas segundo columnas
		}
		System.out.println(suma);
	}

	public static void SumarFilas(int b[][], int f) {
		System.out.println("Fila " + f);
		int suma = 0;
		for (int i = 0; i < MAX; i++) {
			suma += b[f][i]; // Primer numero filas segundo columnas
		}
		System.out.println("Suma de columnas " + suma);
	}

}
