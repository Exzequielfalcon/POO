import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 1 numerops");
			a = new Integer(entrada.readLine());
			while ((a < 0) || (a > 10)) {
				System.out.println("Ingrese 1 numerops");
				a = new Integer(entrada.readLine());
			}
			for (int i = a; i >= 0; i--) {
				System.out.println(i);
			}
		} catch (Exception e) {

		}
	}

}
