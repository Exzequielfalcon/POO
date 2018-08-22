import java.io.BufferedReader;
import java.io.InputStreamReader;

public class getvalor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = obtenervalor();
		switch (a) {
		case 1:
			System.out.println("bajo");
			break;
		case 2:
			System.out.println("medio");
			break;
		case 3:
			System.out.println("alto");
		}
	}

	public static int obtenervalor() {
		int a = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("numero entre 1 y 3");
			a = new Integer(entrada.readLine());
			while ((a < 1) || (a > 3)) {
				System.out.println("numero entre 1 y 3");
				a = new Integer(entrada.readLine());
			}
		} catch (Exception e) {

		}
		return a;
	}
}
