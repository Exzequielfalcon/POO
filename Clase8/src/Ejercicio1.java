import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio1 {
	final public static int MAX=10;
	final public static int maxrandom=100;
	final public static int resultado=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b [][]= new int [4][4];
		CargaUsuario(b);
		MostrarMatriz(b);
		int posicion = obtenercolumna();
		int CSumadas = SumarColumna(b,posicion,resultado);
		System.out.println(CSumadas);
		
	}
	public static int obtenercolumna() {
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
	public static int SumarColumna (int [][]b, int pos, int resultado){
		for (int i=0; i<b.length-1;i++){
			int aux=0;
			aux = b[i][pos];
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
	public static void CargaUsuario(int[][] arr){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				try {
					System.out.println ("Ingrese valor valido: ");
					for (int con = 0 ; con < 4; con++){
						for (int i=0; i<4; i++){
					arr[con][i] = new Integer(entrada.readLine());
						}
					}
				}
				catch (Exception exc ) {
					System.out.println( exc );
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
