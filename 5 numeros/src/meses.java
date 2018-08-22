import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class meses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes=0;
		try{
		BufferedReader entrada = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Ingrese el numero del mes que quiere saber");
		mes = new Integer(entrada.readLine());
		switch (mes) {
		case 1: System.out.println("Enero");break;
		case 2: System.out.println("Febrero");break;
		case 3:System.out.println("Marzo");break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Mayo");break;
		case 6: System.out.println("Junio");break;
		case 7: System.out.println("Julio");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Septiembre");break;
		case 10: System.out.println("Octubre");break;
		case 11: System.out.println("Noviembre");break;
		case 12: System.out.println("Diciembre");
		}
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
		}
	}
	
