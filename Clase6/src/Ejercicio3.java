import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=valorposible();
		
		int dado = Math.floor(Math.random()*6+1);
	}
	public static int mathe(){
		for (int i=0; i<=1000;i++){
			
		}
		
	}
		public static int valorposible(){
			
			int a=0;
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero de dado");
				a = new Integer (entrada.readLine());
				while(a<1&&a>6){
					System.out.println("Ingrese un numero de dado");
					a = new Integer (entrada.readLine());
				}
		}
			catch (Exception exc ) {
				System.out.println( exc );
			
			}
			return a;
	}

}
