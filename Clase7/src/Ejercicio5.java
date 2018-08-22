import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio5 {
	
	final public static int MAX=10;
	
	public static void main(String[] args){
		int b[]=new int[MAX];
		int pos=0, num=0;
		cargar_arreglo(b);
		MostrarArreglo(b);
		obtenerposicion(b,pos,num);
		MostrarArreglo(b);
		
	}
	public static void obtenerposicion(int b[], int pos, int num) {
		pos=0;
		num=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese una posición que desee cambiar");
		pos = new Integer(entrada.readLine());
		System.out.println("Que numero le quiere poner?");
		num = new Integer(entrada.readLine());
		b[pos]= num;
		}
		
		catch (Exception exc ) {
			System.out.println( exc );			
			}
	}
	public static void cargar_arreglo(int b[]){
		for (int i=0; i<MAX; i++){
			b[i]=(int)(Math.random()*100+1);
		}
	}
	public static void MostrarArreglo(int b[]){
		for (int d=0; d<MAX; d++){
			System.out.print("\t" + b[d]);
		}
		System.out.println("");
	}
}

