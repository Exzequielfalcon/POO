import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entre 0 y 10");
			a = new Integer(entrada.readLine());
			while((a<0)||(a>=10)){
				System.out.println("Ingrese un numero entre 0 y 10");
				a = new Integer(entrada.readLine());
			}
			for (int b=a;b>=0;b--){
				System.out.println(b);
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
