import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try{
			BufferedReader entrada = new BufferedReader(new
					InputStreamReader(System.in));
			System.out.println("Ingrese un numero mayor a 50");
			a = new Integer(entrada.readLine());
			while (a<50){
				System.out.println("Ingrese un numero mayor a 50");
				a = new Integer(entrada.readLine());
			}
			for (int i=0;i<=a;i++){
				if (i%2==0) {
					System.out.println(i+"es multiplo de 2");
				}
				if (i%3==0) {
					System.out.println(i+"es multiplo de 3");
				}
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		
	}

}
