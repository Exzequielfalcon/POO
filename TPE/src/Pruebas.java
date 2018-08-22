
public class Pruebas {
	final static int MAXC=10;
	 final static int MAXmov=10;
		public static void main(String[] args) {
			Cliente clientes[] = new Cliente[MAXC];
			Movimiento mov[] = new Movimiento [10];
			boolean encontrado= true;
			Cuenta cuentas[]= new Cuenta[MAXC];
			SimularBanco b= new SimularBanco(clientes, cuentas, mov);
			
			
			
			b.setCliente(new Cliente("juan","gonzales",123123,true),0);
			b.setCliente(new Cliente("mauro","kio",234,true), 1);
			b.setCliente(new Cliente("Matias","Manca",456,true), 2);
			b.setCliente(new Cliente("Fran","Elite",890,true), 3);
			b.setCliente(new Cliente("roberto", "rltecla",6431,true), 4);
			
			
			cuentas[0] = new Cuenta(0,clientes[0], mov);
			cuentas[0].setMonto(5000);
			cuentas[1] = new Cuenta(0,clientes[1], mov);
			cuentas[1].setMonto(4000);
			Movimiento nuevo =  new Movimiento(100, 2, "retiro");
			Movimiento nuevo2 =  new Movimiento(50000, 2, "retiro");
			//b.depositosincuenta(clientes, cuentas);
			
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo2, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo2, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo2, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo, cuentas, 0);
			Cuenta.AgregarMov(nuevo2, cuentas, 0);
			
			b.MostrarMovimientos(1);
			b.depositosincuenta();
			b.MostrarMovimientos(0);
			
			b.MostrarMovimientos(1);
		}
}
