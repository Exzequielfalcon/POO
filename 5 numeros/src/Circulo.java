import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class Circulo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0 ,y=0,r=0,d=0,e=0;
		try{
		BufferedReader entrada = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Ingrese el valor del eje x del circulo");
		x = new Integer(entrada.readLine());
		System.out.println("Ingrese el valor del eje y del circulo");
		y = new Integer(entrada.readLine());
		System.out.println("Ingrese el valor del radio del circulo");
		r = new Integer(entrada.readLine());
		
		System.out.println("El valor en eje x es de "+x);
		System.out.println("El valor en eje y es de "+y);
		System.out.println("El valor del radio es de "+r);
		
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}


}
