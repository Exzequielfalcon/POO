import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Cliente {
	String nombre, apellido;
	int dni;
	boolean monotributista;
	
	
	
	public Cliente(String nombre, String apellido, int dni, boolean monotributista) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
		System.out.println("Ingrese una posición");
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
}
