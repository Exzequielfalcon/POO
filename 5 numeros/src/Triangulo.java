import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class Triangulo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0 ,y=0,r=0,d=0,e=0;
		try{
		BufferedReader entrada = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Para dibujar un triangulo rectangulo en cm");
		System.out.println("Ingrese el valor del cateto opuesto");
		x = new Integer(entrada.readLine());
		System.out.println("Ingrese el valor del cateto adyacente");
		y = new Integer(entrada.readLine());
		System.out.println("Ingrese el valor de alfa");
		r = new Integer(entrada.readLine());
		
		System.out.println("El valor del cateto opuesto es de "+x+ "cm");
		System.out.println("El valor del cateto adyacente es de "+y+ "cm");
		System.out.println("El valor de alfa es de " +r+ "cm");
		
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}


}



