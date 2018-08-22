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
			if ((a % 6 == 0) && (a % 7 == 0)) {
				System.out.println("1");
			}
			if (((a > 30) && (a % 2 == 0)) || (a <= 30)) {
				System.out.println("asd");
			}
			if (a / 5 > 10) {
				System.out.println("Mayor");
			}
		} catch (Exception e) {
		}
	}
}
