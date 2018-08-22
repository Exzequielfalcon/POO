import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = IngresoValido();
		while (a != 0) {
			if (a < 10) {
				System.out.println("1");
			} else if (a < 100) {
				System.out.println("2");
			} else if (a < 1000) {
				System.out.println("3");
				System.out.println(a);
			}
			a = IngresoValido();
		}
	}

	public static int IngresoValido() {
		int a = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 1 entre 0 y 999");
			a = new Integer(entrada.readLine());
			while ((a < 0) || (a > 999)) {
				System.out.println("Ingrese 1 entre 0 y 999");
				a = new Integer(entrada.readLine());
			}
		} catch (Exception e) {

		}
		return a;
	}

}
