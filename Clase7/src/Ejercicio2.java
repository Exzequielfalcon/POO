import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {1,2,7,4,5};
		int a=obtenerposicion();
			System.out.println(b[a]);
	}
	public static int obtenerposicion() {
		int pos=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese una posición");
		pos = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return pos;
	}
	
}
