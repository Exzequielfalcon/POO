import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {9,8,7,6,5,4,3,2,1,0}; 
		int pos=0;
		pos = obtenerposicion();
		CorrimientoIzquierda(b,pos);
		b[9] = 0;
		MostrarArreglo(b);
	}
	public static void MostrarArreglo(int b[]){
		for (int d=0; d<b.length; d++){
			System.out.print("\t" + b[d]);
		}
		System.out.println("");
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
	public static void CorrimientoIzquierda(int b[], int posicion){
		for (int i=posicion;i<b.length-1;i++){
			b[i]=b[i+1];	
		}
		
}	
}
