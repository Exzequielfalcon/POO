import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 1 numerops");
			a = new Integer(entrada.readLine());
			for (int i = 0; i <= 10; i++) {
				System.out.println(a + "*" + i + "=" + (a * i));
			}
		} catch (Exception e) {

		}
	}

}
