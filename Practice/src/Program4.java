import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero");
			a = new Integer(entrada.readLine());
			if (((a%6)==0)&&((a%2)==0)){
				System.out.println("Es multiplo de 6 y 7");
			}
			if (((a>30)&&((a%2)==0))||(a<=30)){
				System.out.println("Es mayor a 30 y multiplo de 2 o menos o igual a 30");
			}
			if ((a/5)>(10)){
				System.out.println("el cociente de la division es mayor que 10");
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
