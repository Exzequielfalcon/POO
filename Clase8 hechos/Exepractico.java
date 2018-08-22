package clase8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exepractico {
	
	final static int MAX = 10;

	public static void main(String[] args) {
		int A[] = new int[MAX];
		cargar_arreglo(A);
		int N= obtener_enteroN();
		imprimir_arreglo(A);
		procedimiento_general(A, N);

	}

	public static void cargar_arreglo(int arr[]) {
		int valor;
		for (int i = 0; i < MAX; i++) {
			valor=obtener_entero();
			arr[i] = valor;
		}
	}

	public static void imprimir_arreglo(int A[]) {

		System.out.println("\nEl arreglo es: ");
		for (int i = 0; i < MAX; i++) {
			System.out.print(A[i]);
			System.out.print(" ");
		}
	}

	public static int obtener_entero() {
		int numero = -1;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingresar numero de distintas cifras separados por ceros: ");
				numero = new Integer(entrada.readLine());
			} catch (Exception exc) {
				System.out.println("Ingrese un valor entre el 0 y el 9:");
				System.out.println(exc);
			}

		} while (!((numero>=0)&&(numero<=10)));
		return numero;
	}
	public static int obtener_enteroN() {
		int numero = 0;
		boolean valorvalido=true;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingresar un numero de cifras que desea eliminar: ");
				numero = new Integer(entrada.readLine());
				valorvalido=true;
			} catch (Exception exc) {
				System.out.println(exc);
				valorvalido=false;
			}

		} while (!valorvalido);
		return numero;
	}

	public static void corrimiento_izquierda(int arr[],int pos){
		int aux = 0;
		for (int i = pos; i<MAX ; i++){
			aux = i - 1;
			arr[aux] = arr[i];
		}
		int ultimaPos = MAX - 1;
		arr[ultimaPos]= 0;
	}

	public static int encontrar_secuencia(int arr[],int N){
		int i = 0;
		int cifras;
		int pos;
		while (i<MAX){
			cifras=0;
			pos=i;
			while((cifras<N)&&(pos<MAX)&&(arr[pos]!=0)){
				cifras++;
				pos++;
				
				System.out.println("la posicion es " + pos + " el contador es " + cifras + "el arreglo es " + arr[pos]);
				System.out.println("la posicion i es " + i);

			}
			if (((cifras==N)&&(pos<MAX)&&(arr[pos]==0)))
				
				return pos;
			else{
				while ((i<MAX)&&(arr[i]!=0))
					i++;
			}
		i++;
		}
		return -1;
	}
	public static void procedimiento_general(int A[],int N){
		int inicio = encontrar_secuencia(A, N);
		while(inicio!=-1){
			for (int i=0; i<N ; i++){
				corrimiento_izquierda(A, inicio);
				inicio = inicio - 1 ;
			}
			inicio=encontrar_secuencia(A,N);
			imprimir_arreglo(A);
		}
		imprimir_arreglo(A);
	}
}
