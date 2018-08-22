import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Recupar1 {
	public static void main(String[] args) {
		enterocaracteresvalidos();
	}

	public static char obtenervocalvalido() {
		char valorc = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		while (!((valorc == 'a') || (valorc == 'e') || (valorc == 'i')
				|| (valorc == 'o') || (valorc == 'u'))) {
			try {
				System.out.println("Ingrese vocal minuscula: ");
				valorc = (char) (entrada.readLine().charAt(0));
			} catch (Exception exc) {
			}
		}
		return valorc;
	}

	public static void enterocaracteresvalidos() {
		boolean valorvalido = true;
		int valori;
		char car1, car2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		do {
			try {
				System.out.println("Ingrese valor valido: ");
				valori = new Integer(entrada.readLine());
				car1 = obtenervocalvalido();
				car2 = obtenervocalvalido();
				if (car1 < car2) {
					System.out.println("entero: " + valori);
				}
			} catch (Exception exc) {
				valorvalido = false;
			}
		} while (valorvalido);
	}
}