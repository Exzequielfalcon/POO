

public class Cuenta {
	final static int MAXC=100;
	static double monto;
	int mov[]= new int [10];
	boolean monotributista;
	int ncuenta[] = new int [MAXC];
	Cliente clientes[] = new Cliente[10];
	
	clientes[0]= new Cliente("juan","gonzales",123123,true);


	public Cuenta(int[] mov, boolean monotributista, int[] ncuenta,Cliente[] clientes) {
		this.mov = mov;
		this.monotributista = monotributista;
		this.ncuenta = ncuenta;
		this.clientes = clientes;
	}
	
	public static void CrearCuenta (int clientes[]){
		
	}
}
