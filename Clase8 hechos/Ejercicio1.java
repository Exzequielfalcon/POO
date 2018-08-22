package clase8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {
	
	final static int MAX=10;
	final static int MAXIMO=100;
	
	public static void main(String args[]) {
		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION
		//E IMPRESION
		int B[]=new int[MAX];
		cargar_arreglo(B);
			System.out.println("Los datos son:");
		
		for (int con = 0 ; con < MAX; con++)
			System.out.println(B[con]);

	}
	

	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)
			arr[con]=(int)(Math.random()*MAXIMO+1);
	}
}