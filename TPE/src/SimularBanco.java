import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SimularBanco {
	final public static int MAXC=1000;
	private Cliente clientes[] = new Cliente [MAXC];
	private Cuenta cuentas[] = new Cuenta [MAXC];
	private Movimiento mov[] = new Movimiento[10];
	
	public SimularBanco(Cliente[] clientes, Cuenta[] cuentas, Movimiento[] mov) {
		this.clientes = clientes;
		this.cuentas = cuentas;
		this.mov = mov;
	}

	public Cliente[] getCliente() {
		return clientes;
	}

	public void setCliente(Cliente clientes, int i) {
		this.clientes[i] = clientes;
		
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public Movimiento[] getMov() {
		return mov;
	}

	public void setMov(Movimiento[] mov) {
		this.mov = mov;
	}
	
	
	//CUENTAS

	public int CrearCuenta (int ncliente){
		boolean encontrado=true;
		String mon;
		Movimiento mov[]= new Movimiento [10];
		int i=0, aux=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Desea crear una nueva cuenta? Ingrese Si o No");
		mon = new String(entrada.readLine());
		while(!((mon.equals("No")) || (mon.equals("no"))||(mon.equals("si")) || mon.equals("Si"))){
			System.out.println("Desea crear una nueva cuenta? Ingrese Si o No");
			mon = new String(entrada.readLine());
		}
		if ((mon.equals("si")) || mon.equals("Si")){
			while ((i<MAXC)&&(encontrado==true)){
				if ((cuentas[i]==null)&&(encontrado==true)){
					cuentas[i]= new Cuenta(0,clientes[ncliente], mov);
					encontrado=false;
					aux=i;
				}
				i++;
			}
		}
		else if ((mon.equals("No")) || (mon.equals("no"))){
			
		}
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return aux;
}

	
	
	public int BuscarCuentas(int posc){
		int acc=0, b=0;
		int arr[] =  new int [MAXC];
		
		  //posicion del cliente
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			
			for (int i=0;i<MAXC;i++){
				if (cuentas[i]!=null){
				if (cuentas[i].getCliente().getDni()==clientes[posc].getDni()){ 
					System.out.println("Usted tiene una cuenta en la posicion " + (i+1));
					arr[b]= i;			//posicion de cuenta
					b++;
				}
				}
			}
		
			System.out.println("QUe cuenta desea seleccionar?");
			acc = new Integer(entrada.readLine());
			acc--;
			for (int d=0;d<=b;d++){
				if(arr[d]==acc){
					return acc;
				}
				
			}
			
			
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return acc;
	}
	public void CerrarCuenta(int ncuenta){
		String mon;
		
		
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Seguro que quiere cerrar esta cuenta? Ingrese si o no");
		mon = new String(entrada.readLine());
		while(!((mon.equals("No")) || (mon.equals("no"))||(mon.equals("si")) || mon.equals("Si"))){
			System.out.println("Seguro que quiere cerrar esta cuenta? Ingrese si o no");
			mon = new String(entrada.readLine());
		}
		if ((mon.equals("si")) || mon.equals("Si")){
			cuentas[ncuenta] = new Cuenta(0,null, null);
			}
		
		else if ((mon.equals("No")) || (mon.equals("no"))){
			
		}
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
	}
	public void MostrarCuenta(int ncuenta){
		System.out.println("Su saldo actual es de "+cuentas[ncuenta].getMonto());
		MostrarMovimientos(ncuenta);
	}
	
	
								//Clientes
	
	
	public int EncontrarDni (){  //Encontrar cliente por DNI
		int a=Cliente.cargadni();
		boolean encontrado= false;
		int ret=-1;
		int i=0;
		while ((i<MAXC) && (encontrado==false)){
			if (clientes[i]!=null){
			if (clientes[i].getDni()==a){
				ret=i;
				encontrado=true;
			}
			}
			i++;
		}
		if (encontrado==false){
			String mon;
			System.out.println("El cliente no existe");
		}
		return ret; //Si ret queda en -1 Es porque no hay cliente ni quiere crearlo
	}
	
	public int CrearCliente (){
		int aux=0,i=0;
		boolean encontrado=true;
		while((i<MAXC)&&(encontrado==true)){
			if ((clientes[i]==null)&&(encontrado==true)){
			clientes[i]=new Cliente(Cliente.carganombre(),Cliente.cargaapellido(),Cliente.cargadni(),Cliente.cargamon());
			encontrado=false;
			aux=i;
		}
			//clientes[i].mostrarcliente(clientes[i].nombre, clientes[i].apellido, clientes[i].dni, clientes[i].monotributista);
			i++;
		}
		return aux;
	}
	public void MostrarCliente(int dni){
		int a = EncontrarDni();
		System.out.println("Nombre: "+ clientes[a].getNombre());
		System.out.println("Apellido: "+ clientes[a].getApellido());
		System.out.println("Dni: "+ clientes[a].getDni());
		if (clientes[a].isMonotributista()==true)
			System.out.println("Monotributista: Si ");
			else{
				System.out.println("Monotributista: No");
			}
		System.out.println("");
	}
	
	public void ListarCliente (){
		int ncliente = EncontrarDni();
		clientes[ncliente].mostrarcliente(clientes[ncliente].getNombre(), clientes[ncliente].getApellido()
				, clientes[ncliente].getDni(), clientes[ncliente].isMonotributista());
		
		for (int i=0;i<MAXC;i++){
			if (cuentas[i]!=null){
			if (cuentas[i].getCliente().getDni()==clientes[ncliente].getDni()){ 
				System.out.println("/Cuenta " + (i+1));
				System.out.println("Su saldo actual es de "+cuentas[i].getMonto());
				System.out.println("");
				MostrarMovimientos(i);
			}
			}
		}
	
	}
	
	
	
								
									//Movimientos
	
	
	

	public double deposito (int ncuenta, int ncliente){
		String type="Deposito";
		int tipo=1;
		double dep=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el monto que quiere depositar");
		dep = new Double(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		dep=IIBB(dep, ncliente,ncuenta);
		dep=cuentas[ncuenta].getMonto()+dep;
		
		return dep;//Combinar con setMonto entonces el return que devuelve es igual al setmonto
	}
	public void depositosincuenta (){
		String operacion="Deposito";
		int tipo=1;
		double dep=0;
		int nd;
		try{
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		int encliente=EncontrarDni();
		if (encliente!=-1){
		System.out.println("A que numero de cuenta desea depositar?");
		nd = new Integer(entrada.readLine());
		nd--;
		if (cuentas[nd]!=null){
		System.out.println("Ingrese el monto que quiere depositar");		//Por aca tendria que poner los movimientos de la cuenta
		dep = new Double(entrada.readLine());
		Movimiento nuevo= new Movimiento(dep, tipo, operacion);
		Cuenta.AgregarMov(nuevo, cuentas, nd);
		dep=cuentas[nd].getMonto()+dep;
		cuentas[nd].setMonto(cuentas[nd].getMonto()+dep);
		
				}
		else System.out.println("La cuenta no existe");
			}
		else System.out.println("El cliente no existe");
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
	}
	public void TransferenciaDinero(){
		String operaciona="Ingreso por transferencia";
		int tipoa=2;
		String operacionb="Egreso por transferencia";
		int tipob=4;
		int nd=0;
		double a=0;
		try{
			int ncliente=EncontrarDni();   // Si el dni lo pasa por metodo poner en ncliente arriba
			int ncuenta=BuscarCuentas(ncliente);
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A que numero de cuenta desea depositar?");
		nd = new Integer(entrada.readLine());
		nd--;
		System.out.println("Cuanto desea depositar?");
		System.out.println("Su saldo actual es "+ cuentas[ncuenta].getMonto());
		a = new Integer(entrada.readLine());
		while (a>cuentas[ncuenta].getMonto()){
			System.out.println("Su saldo es insuficiente");
			a = new Integer(entrada.readLine());
		}
		
		double d= cuentas[ncuenta].getMonto();
		if (cuentas[nd].getCliente()!=cuentas[ncuenta].getCliente()){
		cuentas[nd].setMonto(IIBB(a, ncliente,  nd));
		Movimiento nuevo= new Movimiento(a, tipoa, operaciona);
		Cuenta.AgregarMov(nuevo, cuentas, nd);
		}
		else{
			cuentas[nd].setMonto(a+cuentas[nd].getMonto());
			Movimiento nuevo= new Movimiento(a, tipoa, operaciona);
			Cuenta.AgregarMov(nuevo, cuentas, nd);
		}
		cuentas[ncuenta].setMonto(d-a);
		a=a*-1;
		Movimiento nuevo2= new Movimiento(a, tipob, operacionb);
		Cuenta.AgregarMov(nuevo2, cuentas, ncuenta);
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
	}
	
	public double IIBB(double a, int ncliente, int nd){ //IIBB
		int tipo=3;
		double b;
		String operacion="IIBB";
		
		if ((clientes[ncliente]).isMonotributista()==true){
			b=a*0.02;
			b=b*-1;
			a=a-a*0.02;
			Movimiento nuevo= new Movimiento(b, tipo, operacion);
			Cuenta.AgregarMov(nuevo, cuentas, nd);
			return a;
		}
		else{
			return a;
		}
		
		
	}
	public  void retiro(){
		int tipo=5;
		String operacion="Retiro de dinero";
		double dinero=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
			int encliente= EncontrarDni();
			if (encliente!=-1){
				int acc=BuscarCuentas(encliente);
				System.out.println("Cuanto dinero desea retirar?");
				System.out.println("Su saldo actual es "+ cuentas[acc].getMonto());
				dinero = new Double(entrada.readLine());
				while (dinero>cuentas[acc].getMonto()){
					System.out.println("Su saldo es insuficiente, ingrese otro monto");
					dinero = new Integer(entrada.readLine());
				}
				cuentas[acc].setMonto(cuentas[acc].getMonto()-dinero);
				System.out.println("Su saldo actual es "+ cuentas[acc].getMonto());
				dinero=dinero*-1;
				Movimiento nuevo= new Movimiento(dinero, tipo, operacion);
				Cuenta.AgregarMov(nuevo, cuentas, acc);
			}
			
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		
	}
	public void MostrarMovimientosv1(int ncuenta){
		for (int i=0;i<10;i++){
			if(cuentas[ncuenta].getMov()[i]!=null){
				System.out.println("Movimiento " +(i+1));
				System.out.println("Monto: "+ cuentas[ncuenta].getMov()[i].getMonto());
				System.out.println("Tipo: "+ cuentas[ncuenta].getMov()[i].getTipo());
				System.out.println("Operacion: "+ cuentas[ncuenta].getMov()[i].getOperacion());
				System.out.println("");
			}
		}
	}
	
	public void MostrarMovimientos(int ncuenta){
		System.out.println("Cuenta "+ (ncuenta+1));
		System.out.println("Movimiento \tMonto \t\tTipo \tOperacion");
		for (int i=0;i<10;i++){
			if(cuentas[ncuenta].getMov()[i]!=null){
				System.out.println("    "+(i+1)+"\t\t"+cuentas[ncuenta].getMov()[i].getMonto()+"\t\t "+ cuentas[ncuenta].getMov()[i].getTipo()
						+"\t"+cuentas[ncuenta].getMov()[i].getOperacion());
			}
		}
	}
	
}
