import java.io.BufferedReader;
import java.io.InputStreamReader;

//ELIMINAR SECUENCIAS con secuencia
public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[] = { 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 3, 5, 0 };
		int c[] = { 1, 2, 3 };
		int r[] = { 7, 2, 9 };
		boolean d = true;
		int posi = 0, posf = 0;
		mostrar(b);
		for (int i = 0; i < b.length - 1; i++) {
			if (((b[i] == 0) && (b[i + 1] != 0)) && d) {
				posi = i + 1; // Empieza la secuencia
				d = false;
			}
			if (d == false && ((b[i] != 0) && (b[i + 1] == 0))) {
				posf = i; // Termina la secuencia
				eliminarporarreglo(posi, posf, b, c, r);
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
					.println("Ingrese el tamaño de las secuencias que desea eliminar");
			pos = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return pos;
	}

	public static void eliminarporarreglo(int posi, int posf, int b[], int c[],
			int r[]) {
		int i = posi, a = 0;
		boolean d = true;
		if (posf - posi == c.length - 1) {
			while (i < posf && d) {
				if (b[i] == c[a]) {
					a++;
				} else {
					d = false;
				}
				i++;
			}
			if (d) {
				reemplazar(posi, posf, b, r);
			}
		}
	}

	public static void reemplazar(int posi, int posf, int b[], int r[]) {
		int a = 0;
		for (int i = posi; i <= posf; i++) {
			b[i] = r[a];
			a++;
		}
	}

	public static void mostrar(int b[]) {
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("");
	}
}
