import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio8 {
	final public static int MAX=10;
	final public static int maxrandom=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b [] = new int [MAX];
		cargar_arreglo(b);
		int posinicio=obtenerposicion();
		int posfin=obtenerposicion();
		System.out.println(b[posinicio]);
		System.out.println(b[posfin]);
	}
	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)

		arr[con]=(int)(Math.random()*maxrandom+1);
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
