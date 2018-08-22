import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entre 1 y 999. 0 para terminar");
			a = new Integer(entrada.readLine());
			while (((a>0)||(a<=999))&&(a!=0)){
				
			
			if (a!=0){
			if ((a>0)&&(a<10)){
				System.out.println("Tiene 1 digito");
			}
			if ((a>=10)&&(a<100)){
				System.out.println("tiene 2 digitos");
			}
			if ((a>=100)&&(a<1000)){
				System.out.println("Tiene 3 digitos");
				System.out.println("El numero es"+a);
			}
			}
			System.out.println("Ingrese un numero entre 0 y 999.0 para terminar");
			a = new Integer(entrada.readLine());
		
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
