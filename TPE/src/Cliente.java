import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Cliente {
	final public static int MAXC=10;
	private String nombre, apellido;
	private int dni;
	private boolean monotributista;
	
	public Cliente(String nombre, String apellido, int dni, boolean monotributista) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.monotributista = monotributista;
	}

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public boolean isMonotributista() {
		return monotributista;
	}



	public void setMonotributista(boolean monotributista) {
		this.monotributista = monotributista;
	}





	
	public static String carganombre() {
		String nombre=null;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el nombre");
		nombre = new String(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return nombre;
	}
	public static String cargaapellido() {
		String nombre=null;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el apellido");
		nombre = new String(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return nombre;
	}
	public static int cargadni() {
		int dni=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el DNI");
		dni = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return dni;
	}
	public static boolean cargamon() {
		String mon=null;
		boolean moni=true;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Si es monotributista ingrese Si o No");
		mon = new String(entrada.readLine());
		if ((mon.equals("si")) || mon.equals("Si")){
			moni=true;
		}
		else if ((mon.equals("No")) || (mon.equals("no"))){
			moni=false;
		}
		while(!((mon.equals("No")) || (mon.equals("no"))||(mon.equals("si")) || mon.equals("Si"))){
			System.out.println("Si es monotributista ingrese Si o No");
			mon = new String(entrada.readLine());
		}
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		
		return moni;
	}
	public void mostrarcliente (String nombre, String apellido, int dni, boolean monotributista ){
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("DNI: "+dni);
		if (monotributista==true)
		System.out.println("Monotributista: Si ");
		else{
			System.out.println("Monotributista: No");
		}
	}
	
}
