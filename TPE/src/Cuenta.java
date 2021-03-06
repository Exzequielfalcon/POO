import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Cuenta {
	
	
	final static int MAXC=1000;
	final static int MAXmov=10;
	private double monto=0;
	private Movimiento mov[]= new Movimiento [MAXmov];
	private Cliente cliente;
	
	public Cuenta(double monto, Cliente cliente, Movimiento[] mov) {
		mov= new Movimiento[MAXC];
		this.monto = monto;
		this.mov = mov;
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setClientes(Cliente clientes) {
		this.cliente = clientes;
	}
	public Cuenta(Cliente clientes) {
		this.cliente = clientes;
	}
	public void setMov(Movimiento[] mov) {
		this.mov = mov;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Movimiento[] getMov() {
		return mov;
	}
	public void setMov(Movimiento mov, int i) {
		this.mov[i] = mov;
		
	}
	
	public static void AgregarMov(Movimiento nuevo, Cuenta cuentas[], int ncuenta){
		for (int i=MAXmov-1;i>=0;i--){
			
			if (i-1!=-1){
			if (cuentas[ncuenta].getMov()[i-1]!=null){
				
				cuentas[ncuenta].setMov(cuentas[ncuenta].getMov()[i-1],i);
			}
			}
		}
		cuentas[ncuenta].setMov(nuevo, 0);
	}
	
	
	
}
