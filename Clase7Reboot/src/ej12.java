public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 1, 2, 3 };

		InvertirArr(b);
		mostrar(b);
	}

	public static void InvertirArr(int b[]) {
		int c[] = new int[b.length];
		int a = 0;
		for (int i = b.length - 1; i >= 0; i--) {
			c[a] = b[i];
			a++;
		}
		a = 0;
		for (int j = 0; j < b.length; j++) {
			b[j] = c[a];
			a++;
		}
	}

	public static void mostrar(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("");
	}

}
