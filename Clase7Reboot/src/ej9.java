import java.io.BufferedReader;
import java.io.InputStreamReader;

//ELIMINAR SECUENCIAS
public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[] = { 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 3, 5, 0 };
		boolean d = true;
		int n = obtenerposicion();
		int posi = 0, posf = 0;
		mostrar(b);
		for (int i = 0; i < b.length - 1; i++) {
			if (((b[i] == 0) && (b[i + 1] != 0)) && d) {
				posi = i + 1; // Empieza la secuencia
				d = false;
			}
			if (d == false && ((b[i] != 0) && (b[i + 1] == 0))) {
				posf = i; // Termina la secuencia
				if (posf - posi == n) {
					eliminar(posi, posf, b);
				}
				d = true;
			}
		}
		mostrar(b);
	}

	public static int obtenerposicion() {
		int pos = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("Ingrese el tama�o de las secuencias que desea eliminar");
			pos = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static void eliminar(int posi, int posf, int b[]) {
		for (int i = posi; i <= posf; i++) {
			b[i] = 0;
		}
	}

	public static void mostrar(int b[]) {
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("");
	}
}
