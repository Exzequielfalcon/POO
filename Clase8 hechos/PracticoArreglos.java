package clase8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticoArreglos {
	
	
	/*
	 * Fijarme como puedo arreglar para que dentro del primer for, llame a una funcion
	 * que sea "seleccionarSecuencia", que se de tipo void, y que dentro de esta,
	 *en vez de retornar la posicion, haga la funcion eliminarSecuencia.
	 *De esta manera estaria sin el if... buscar el error, para aplicarlo en matrices
	 */

	final static int MAX=15;	
	public static void main(String args[]) {

		int B[]= new int [MAX];
		int N = elegirN();
		int buscarSecuencia;

		crearArreglo(B);
		mostrarArreglo(B);


		for (int i= 0; i<MAX; i++) {

			buscarSecuencia=seleccionarSecuencia(B,N);


			if (buscarSecuencia !=-1) {
				eliminarSecuencia(B, buscarSecuencia, N);
				i=i-N;
			}
		}
		mostrarArreglo(B);
	}

	public static void crearArreglo(int B[]) {
		for (int con=0;con<MAX;con++) {
			System.out.println ("Ingrese valor nº"+ (con+1));
			B[con]=obtenerEntero();
		}
	}
		
	public static int obtenerEntero(){
		int valor = 0;
		boolean enterovalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				valor = new Integer(entrada.readLine());
				enterovalido = true;
			}
			catch (Exception exc ) { 
				enterovalido = false; 
			}
		} while ((!enterovalido)&&(valor<0));
		return valor;
	}
	
	public static void mostrarArreglo (int arr[]) {
		System.out.print("\nLos datos son: ");
		for (int i = 0; i < MAX; i++) {
			System.out.print(arr[i] + " | ");

		}
	}


	public static int elegirN(){
		int numero=0;
		boolean esValido = true;

		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		do {
			try {
				System.out.println ("¿Las secuencias de cuantos numeros (sin 0) quieres eliminar?");
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

	public static int seleccionarSecuencia(int[] B,int valor) {
		int contador=0;
		int posicion=0;

			while (posicion<MAX){
				if ((B[posicion] !=0)&&(posicion<MAX)) {
					contador++;					

					if ((contador==valor)&&(B[posicion + 1]==0)){
						return posicion;
					}
				}
				else if ((B[posicion]==0)&&(posicion<MAX)) {
					contador=0;

				}	
				posicion++;
			}
		
		return -1;
	}

	public static void eliminarSecuencia(int B[],int posSecuencia,int valor){
		int inicio = 0;
		int borrar=MAX-valor;

		for (int i = posSecuencia+1; i<MAX ; i++){
			inicio = i - valor;
			B[inicio] = B[i];
		}
		
		for(int h=MAX-1; h>=borrar; h--)
			B[h]=0;

	}
}

