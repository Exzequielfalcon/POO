import java.io.BufferedReader;
import java.io.InputStreamReader;

public class partial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		char c;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un numero");
			a = new Integer(entrada.readLine());
			while (a != 0) {
				System.out.println("Ingrese un caracter");
				c = (char) (entrada.readLine().charAt(0));
				if ((c >= '0') && (c <= '9')) {
					System.out.println("Digito");
					if ((c % 3 == 0) && (c % 5 == 0)) {
						System.out.println("Es multiplio de 3 y 5");
					} else {
						System.out.println("No es multiplo de 3 y 5");
					}
				} else {
					switch (c) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						System.out.println("Es vocal");
						break;
					default:
						System.out.println("otro");
					}
				}
				System.out
						.println("Ingrese un numero diferente de 0 para continuar");
				a = new Integer(entrada.readLine());
			}
		} catch (Exception e) {
			System.out.println("Un numero pelotudo");
		}
	}

}
