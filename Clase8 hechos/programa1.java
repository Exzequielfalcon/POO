package clase8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class programa1 {

	final static int MAX = 6;
	public static void main(String args[]) {
		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION, CARGA E IMPRESION
		int B[]=new int[MAX];
		for (int con=0;con<MAX;con++) {
			System.out.println ("Ingrese integer: "+con);
			B[con]=obtenerEntero();
		}
		for (int con=0;con<MAX;con++)
			System.out.println(B[con]);
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
		} while (!enterovalido);
		return valor;
	}

}
