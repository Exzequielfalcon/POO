import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Movimiento {
	final static int MAXmov=10;
	final static int MAXC=1000;
	private double monto;
	private int tipo;
	private String operacion;
	
	public Movimiento(double monto, int tipo, String operacion) {
		this.monto = monto;
		this.tipo = tipo;
		this.operacion = operacion;
	}
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	
	public static int cargatipo() {
		int tipo=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese \n 1 Si quiere depositar");
		System.out.println("2 Si quiere transferir a otra cuenta");
		System.out.println("3 Si quiere transferir a otra de sus cuentas");
		System.out.println("4 Transferir a otra cuenta");
		System.out.println("5 Retirar dinero");
		System.out.println("0 para terminar");
		tipo = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return tipo;
	}
	public static void Operacion (int tipo){
		String operacion;
		switch(tipo){
		//case 1 : deposito() ; break;
		//case 2 : TransfereciaDinero(); break;
		//case 3 : Transferir(); break; 
		}
	}
	

}
