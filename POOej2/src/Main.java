
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta(1,1000);
		int opcion = Cuenta.opcion();
		while(opcion!=0){
		if (opcion==1){
		cuenta1.saldo = cuenta1.Ingreso(cuenta1.saldo);
		}
		else if (opcion==2) {
			cuenta1.saldo =cuenta1.retiro(cuenta1.saldo);
		}
		else if (opcion==3){
			cuenta1.ConsultarSaldo(cuenta1.saldo);
		}
		opcion=Cuenta.opcion();
		}
	}

}
