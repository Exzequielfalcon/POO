import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 3 numerops");
			a = new Integer(entrada.readLine());
			b = new Integer(entrada.readLine());
			c = new Integer(entrada.readLine());
			a /= b;
			a -= c;
			System.out.println(a);

		} catch (Exception e) {
			System.out.println("asd");
		}
	}

}
