import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {1,2,3,4,5};
		int posicion=obtenerposicion();
		CorrimientoDerecha(b ,posicion);
		
		
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
		public static void CorrimientoDerecha(int b[], int posicion){
			for (int i=posicion;i<b.length-1;i++){
				b[i]=b[i+1];
				
			}
			for (int d = 0 ; d < 5; d++){
				System.out.println(b[d]);
			}
			
		}
		
	}	