public class ej14 {

	final static int MAX = 100;

	public static void main(String[] args) {
		int b[] = new int[100];
		CargarArreglo(b);
		burbuja(b);
		MostrarArreglo(b);

	}

	public static void CargarArreglo(int b[]) {
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 100);
		}
	}

	public static void burbuja(int[] arr) {
		int temp;
		for (int i = 1; i < MAX; i++) {
			for (int j = 0; j < MAX - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}
	}

	public static void MostrarArreglo(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print("\t" + b[i]);
		}
		System.out.println("");
	}
}
