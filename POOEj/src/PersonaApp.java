import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonaApp {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Ingreso(p1);
		System.out.println(p1);
	}

	public void Ingreso(Persona p1) {
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un nombre ");
			p1.setNombre(new String(entrada.readLine()));
			System.out.println("Ingrese una edad ");
			p1.setEdad(new Integer(entrada.readLine()));
			System.out.println("Ingrese un sexo ");
			p1.setSexo((char) (entrada.readLine().charAt(0)));
			System.out.println("Ingrese un peso ");
			p1.setPeso(new Double(entrada.readLine()));
			System.out.println("Ingrese una altura ");
			p1.setAltura(new Double(entrada.readLine()));
		}

		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
