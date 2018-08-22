import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Cuenta {
	int cuenta, saldo;

	public Cuenta(int cuenta, int saldo) {
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	public void ConsultarSaldo (int saldo){
		System.out.println(saldo);
	}
	public int Ingreso (int saldo){
		int aux=0;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Cuanto quiere depositar?");
			aux = new Integer(entrada.readLine());
			}
			catch(Exception exc){
			
			}
		saldo = saldo+aux;
		return saldo;
	}
	public int retiro (int saldo){
		int aux=0;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Cuanto quiere retirar?");
			aux = new Integer(entrada.readLine());
			}
			catch(Exception exc){
			
			}
		saldo = saldo-aux;
		return saldo;
	}
	public static int opcion (){
		int x=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese 1 para depositar, 2 para reitrar dinero,3 consulta de saldo o 0 para terminar");
		x = new Integer(entrada.readLine());
		
		
		
		}
		catch(Exception exc){
		
		}
		
	return x;
	}
}
