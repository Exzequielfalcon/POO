import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try{
			BufferedReader entrada = new BufferedReader(new
					InputStreamReader(System.in));
			System.out.println("Ingrese un numero del 1 al 7");
			a = new Integer(entrada.readLine());
			while ((a<1)||(a>7)){
				System.out.println("Ingrese un numero del 1 al 7");
				a = new Integer(entrada.readLine());
				
			}
			switch (a) {
			case 1: System.out.println("Domingo");break;
			case 2: System.out.println("Lunes");break;
			case 3: System.out.println("Martes");break;
			default: System.out.println("Default");
			}
		}
		catch (Exception exc ) {
			System.out.println( exc );
	}
	}
}
