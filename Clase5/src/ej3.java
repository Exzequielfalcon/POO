import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String nombre, apellido;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese 1 numerops");
			a = new Integer(entrada.readLine());
			while (a != 0) {
				System.out.println("Nombre");
				nombre = new String(entrada.readLine());
				System.out.println("Apellido");
				apellido = new String(entrada.readLine());
				System.out.println(nombre + " " + apellido);

				System.out.println("Ingrese 1 numero diferente de 0");
				a = new Integer(entrada.readLine());
			}
			System.out.println("Programa terminado");
		} catch (Exception e) {

		}
	}

}
