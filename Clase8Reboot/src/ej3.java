public class ej3 {
	final public static int MAX = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b[][] = { { 'a', 'g', 'd', 'e', 'i' },
				{ 'e', 'h', 'a', 't', 'y' }, { 'e', 'w', 'q', 'u', 'y' },
				{ 'e', 'w', 'q', 'd', 'c' }, { 'e', 'b', 'q', 'a', 'y' } };
		MostrarMatriz(b);
		BurbujaxFilas(b);
		System.out.println("------------------------------");
		MostrarMatriz(b);
	}

	public static void MostrarMatriz(char b[][]) {
		for (int d = 0; d < b.length; d++) {
			for (int i = 0; i < b.length; i++) {
				System.out.print("\t" + b[d][i]);
			}
			System.out.println("");
		}
	}

	public static void BurbujaxFilas(char[][] arr) {
		char temp;
		for (int i = 1; i < MAX; i++) {
			for (int j = 0; j < MAX - 1; j++) {
				for (int a = 0; a < MAX; a++) {
					if (arr[j][a] > arr[j + 1][a]) {
						temp = arr[j][a];
						arr[j][a] = arr[j + 1][a];
						arr[j + 1][a] = temp;
					}
				}
			}
		}
	}
}
