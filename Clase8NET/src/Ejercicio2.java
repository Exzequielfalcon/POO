import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio2 {
	final public static int MAX=10;
	final public static int maxrandom=100;
	final public static int resultado=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b [][]= new int [10][10];
		cargar_matriz(b);
		MostrarMatriz(b);
		int posicion = obtenerfila();
		int CSumadas = Sumarfila(b,posicion,resultado);
		System.out.println(CSumadas);
		
	}
	public static int obtenerfila() {
		int pos=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese que columna quiere sumar");
		pos = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return pos;
	}
	public static int Sumarfila (int [][]b, int pos, int resultado){
		for (int i=0; i<b.length-1;i++){
			int aux=0;
			aux = b[pos][i];
			resultado = resultado+ aux;
			System.out.println("\t" +b[pos][i]);
			
		}
		return resultado;
	}
	public static void cargar_matriz(int[][] arr) {
		for (int con = 0 ; con < MAX; con++){
			for (int i=0; i<MAX; i++){
		arr[con][i]=(int)(Math.random()*maxrandom+1);
		}
	}
	}
	public static void MostrarMatriz(int b[][]){
		for (int d=0; d<b.length; d++){
			for (int i=0; i<b.length; i++){
			System.out.print("\t" + b[d][i]);
		}
		System.out.println("");
	}
	}
}