import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		try{
			BufferedReader entrada = new BufferedReader(new
					InputStreamReader(System.in));
			System.out.println("Ingrese un numero entre 1 y 999");
			a = new Integer(entrada.readLine());
			while ((a<0)||(a>999)){
				System.out.println("Ingrese un numero entre 1 y 999");
				a = new Integer(entrada.readLine());
			}
			while (a!=0){
				if ((a>0)&&(a<10)){
					System.out.println("Tiene 1 digito");
				}
				else if ((a>=10)&&(a<=99)){
					System.out.println("Tiene 2 digitos");
				}
				else if ((a>=100)&&(a<=999)){
					System.out.println("Tiene 3 digitos");
					System.out.println("El numero es "+a);
				}
				System.out.println("Ingrese otro numero");
				a=new Integer (entrada.readLine());
				while ((a<0)||(a>999)){
					System.out.println("Ingrese un numero entre 1 y 999");
					a = new Integer(entrada.readLine());
				}
			}
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}

}
