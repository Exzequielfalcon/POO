import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejemplo1 {
public static final int MAX = 10;//constante global a todos
	public static void main(String[] args){ 
	
		int valor = obtenerenterovalido();
		System.out.println("resultado: " + valor*MAX);
}
	public static int obtenerenterovalido() {
		int valori = MAX;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
				try {
					System.out.println ("Ingrese valor valido: ");
					valori = new Integer(entrada.readLine());
					System.out.println("int: " + valori);
				}
				catch (Exception exc ) {
					System.out.println( exc );
					valori = MAX;
				}
		}while (valori>MAX);
return valori;
}
}