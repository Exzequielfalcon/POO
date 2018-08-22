import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		char c, d;
		boolean fe = true;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un entero");
			a = new Integer(entrada.readLine());
			while (fe) {
				c = vocalvalido();
				d = vocalvalido();
				if (c < d) {
					System.out.println("entero " + a);
				}
				System.out.println("Ingrese un numero");
				a = new Integer(entrada.readLine());
			}
		} catch (Exception e) {
			fe = false;
			System.out.println("programa terminado");
		}
	}

	public static char vocalvalido() {
		char c = ' ';
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese una vocal");
			c = (char) (entrada.readLine().charAt(0));
			while (!((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))) {
				System.out.println("Ingrese una vocal");
				c = (char) (entrada.readLine().charAt(0));
			}
		} catch (Exception e) {

		}
		return c;
	}

}
