import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 1 numerops");
			a = new Integer(entrada.readLine());
			while (a < 50) {
				System.out.println("Ingrese 1 numero diferente de 0");
				a = new Integer(entrada.readLine());
			}
			for (int i = a; i >= 0; i--) {
				if ((i % 2 == 0) || (i % 3 == 0)) {
					System.out.println(i + " multiplo de 2 o 3");
				}

			}
			System.out.println("Programa terminado");
		} catch (Exception e) {

		}
	}

}
