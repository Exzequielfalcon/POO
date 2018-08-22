import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Libro {
	String titulo, autor;
	int pags,clasf;
	
	
	
	public Libro(String titulo, String autor, int pags, int clasf) {
		this.titulo = titulo;
		this.autor = autor;
		this.pags = pags;
		this.clasf = clasf;
	}



	public static String Cargatitulo (){
		String y = null;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el titulo");
		y = new String(entrada.readLine());
		
		
		}
		catch(Exception exc){
		
		}
		
	return y;
	}
	public static String Cargaautor (){
		String y = null;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el autor");
		y = new String(entrada.readLine());
		
		
		}
		catch(Exception exc){
		
		}
		
	return y;
	}
	public static int Cargapag (){
		int y=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el numero de paginas del libro");
		y = new Integer(entrada.readLine());
		
		
		}
		catch(Exception exc){
		
		}
		
	return y;
	}
	public static int Cargaclasf (){
		int y=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese una clasificacion del 1 al 10");
		y = new Integer(entrada.readLine());
		
		
		}
		catch(Exception exc){
		
		}
		
	return y;
	}
	public static void SeleccionarOpcion(String titulo, String autor, int pags, int clasf, int opcion){
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while (opcion!=0){
			switch (opcion){
			case 1: titulo = Cargatitulo();break;
			case 2: autor = Cargaautor();break;
			case 3: pags = Cargapag();break;
			case 4: clasf = Cargaclasf();break;
			case 5: Mostrar(titulo,autor,pags,clasf);break;
			//default: opcion=opcion();break;
			}
			opcion=opcion();
			
			}
		}
		catch (Exception exc){
			
		} 
	}
	public static int opcion(){
		int x=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese 1 para cambiar el titulo\n 2 para cambiar el autor\n 3 cambiar las paginas\n 4 para cambiar la clasificacion \n 5 para mostrar el libro \n 0 para terminar\n");
		x = new Integer(entrada.readLine());
		
		
		
		}
		catch(Exception exc){
		
		}
		
	return x;
	}
	public static void Mostrar(String titulo, String autor, int pags, int clasf){
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(pags);
		System.out.println(clasf);
	}
}
