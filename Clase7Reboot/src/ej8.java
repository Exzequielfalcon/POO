public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 1, 2, 3, 4, 0, 0, 1, 2, 3, 4, 0 };
		boolean d = true;
		int posi = 0, posf = 0;
		for (int i = 0; i < b.length - 1; i++) {
			if (((b[i] == 0) && (b[i + 1] != 0)) && d) {
				posi = i + 1; // Empieza la secuencia
				d = false;
			}
			if (d == false && ((b[i] != 0) && (b[i + 1] == 0))) {
				posf = i; // Termina la secuencia
				d = true;
			}
		}

		for (int i = posi; i <= posf; i++) {
			System.out.println(b[i]);
		}
		System.out.println(posi);
		System.out.println(posf);
	}

}
