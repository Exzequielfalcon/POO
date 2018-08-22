import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio1 {
	public static final int MAX=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=obtenerN();
		int M=obtenerM();
		char a=obtenerchar();
		if (a==a){
			System.out.println("La suma entre N y M es: "+(N+M));
		}
		else {
			System.out.println("La resta entre N y M es: "+(N-M));
		}
	}
	public static int obtenerN() {
		int N=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
				try {
					System.out.println ("Ingrese valor valido de N: ");
					N = new Integer(entrada.readLine());
					
					
				}
				catch (Exception exc ) {
					System.out.println( exc );
				
				}
		}while ((N>MAX));
		return N;
	}
	public static int obtenerM() {
		
		int M=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
				try {
					
					System.out.println ("Ingrese valor valido de M: ");
					M = new Integer(entrada.readLine());
					
				}
				catch (Exception exc ) {
					System.out.println( exc );
				
				}
		}while (M>MAX);
		return M;
	}
	public static char obtenerchar() {
		char a='0';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
				try {
					System.out.println ("Ingrese a para sumar y b para restar");
					a = new Character(entrada.readLine().charAt(0));
					
					
				}
				catch (Exception exc ) {
					System.out.println( exc );
				
				}
		}while (a!='a'&&a!='b');
		return a;
	}
}
