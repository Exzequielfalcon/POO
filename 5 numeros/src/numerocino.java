import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class numerocino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0 ,b=0,c=0,d=0,e=0;
		try{
		BufferedReader entrada = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Ingrese 5 numeros");
		a = new Integer(entrada.readLine());
		b = new Integer(entrada.readLine());
		c = new Integer(entrada.readLine());
		d = new Integer(entrada.readLine());
		e = new Integer(entrada.readLine());
		System.out.println(+e);
		System.out.println("int : " +d);
		System.out.println("int : " +c);
		System.out.println("int : " +b);
		System.out.println("int : " +a);
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
	}

		
		
		
		
		
	
		
		
	
		

	}


