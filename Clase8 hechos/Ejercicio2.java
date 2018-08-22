package clase8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {

	final static int MAX=10;
	final static int MAXIMO=100;
	
	public static void main(String args[]) {
		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION
		//E IMPRESION
		int B[]=new int[MAX];
		int posicion = 0;
		int posicionOrdenada = 0;
		int buscarValor = buscarNumero();
		int elemento = 0;

		cargar_arreglo(B);
		
			System.out.println("Los datos son:");
		
		for (int con = 0 ; con < MAX; con++) {
			System.out.println(posicion + ". " + B[con]);
			posicion++;
		}
		
		burbuja(B);
		System.out.println("\nLa forma ordenada es: \n");
		for (int con = 0 ; con < MAX; con++) {
			System.out.println(posicionOrdenada + ". " + B[con]);
			posicionOrdenada++;
		}
		
		
		elemento=buscar_pos_ord(B, buscarValor);
		
		System.out.println("El valor esta en la posición: " + elemento);

		
		

	}
	
	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)
			arr[con]=(int)(Math.random()*MAXIMO+1);
	}
	

	public static int burbuja(int B[]){
		int temp=0;;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (B[j] > B[j+1]){
					temp = B[j];
					B[j] = B[j+1];
					B[j+1] = temp;
				}
			
			}
	
		}
		return temp;
	}
	
	public static int buscarNumero(){
		int numero=0;
		boolean esValido = true;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		do {
			try {
				System.out.println ("¿Que valor queres buscar si esta dentro del arreglo?");
				numero = new Integer(entrada.readLine());	
				esValido = true;
			}
			catch (NumberFormatException e) {
				System.out.println ("Numero invalido");
				esValido= false;
			}
			catch (Exception exc) {
				System.out.println ( exc );
				esValido=false;
			}
		}while (!esValido);
		
		return numero;
	}
	
	public static int buscar_pos_ord(int[] arr,int valor) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]!=valor))
			pos++;
		if ((pos<MAX)&&(arr[pos]==valor)) return pos;
		else return -1;
		}

}