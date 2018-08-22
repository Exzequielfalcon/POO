import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class Formulario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre, Ocupacion;
		int Edad=0;
		float Altura;
		try{
		BufferedReader entrada = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Ingrese su nombre");
		Nombre = new String(entrada.readLine());
		System.out.println("Ingrese su edad");
		Edad = new Integer(entrada.readLine());
		System.out.println("Su altura");
		Altura= new Float(entrada.readLine());
		System.out.println("Y su Ocupacion");
		Ocupacion= new String(entrada.readLine());
		System.out.println("Nombre: " +Nombre);
		System.out.println("Edad: " +Edad);
		System.out.println("Altura: " +Altura);
		System.out.println("Ocupacion: " +Ocupacion);
		
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}


}
