import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio2 {

	public static void main(String[] args) {
		
		int d=obtenermayor();
		System.out.println("El mayor es "+d);
	}
			public static int obtenermayor(){
				int a=0,b=0,c=0;
				
				try{
					BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Ingrese dos numeros para ver cual es el mayor");
					a = new Integer(entrada.readLine());
					b = new Integer(entrada.readLine());
					if (a>=b){
						c=a;
					}
					else{
						c=b;
					}
					for (int i=0; i<=5;i++){
						System.out.println("Ingrese otro numero");
						a = new Integer(entrada.readLine());
						if (a>c){
							c=a;
						}
					}
					
				}
				catch (Exception exc ) {
					System.out.println( exc );
				
				}
				return c;
			}
	}


