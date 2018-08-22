
public class Main {
	public static void main (String [] args){
		Libro libro1 = new Libro("Vikings", "Paulo Cohelo", 120, 3);
		int x = Libro.opcion();
		Libro.SeleccionarOpcion(libro1.titulo, libro1.autor,libro1.pags,libro1.clasf,x);
	}
}
