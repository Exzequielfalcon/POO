public class Ejercicio1 {
	final static int MAX = 10;
	final static int maxrandom = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = new int[MAX];
		cargar_arreglo(b);
		for (int con = 0; con < MAX; con++) {
			System.out.println(b[con]);
		}
	}

	public static void cargar_arreglo(int[] arr) {
		for (int con = 0; con < MAX; con++)

			arr[con] = (int) (Math.random() * maxrandom + 1);
	}
}
