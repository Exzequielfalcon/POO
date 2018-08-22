import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class Factura {
	public static void main(String[] args) {
	int numero,ip1,ip2,total=0;
	String cliente,p1,p2,tipo;
	
	
	
	
	try{
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Tipo de Factura:");
		tipo = new String (entrada.readLine());
		System.out.println ("Factura N°:");
		numero= new Integer (entrada.readLine());
		System.out.println ("Cliente:");
		cliente = new String (entrada.readLine());
		System.out.println ("Producto 1:");
		p1 = new String (entrada.readLine());
		System.out.println ("Importe del producto:");
		ip1 = new Integer (entrada.readLine());
		System.out.println ("Producto 2:");
		p2 = new String (entrada.readLine());
		System.out.println ("Importe del producto:");
		ip2 = new Integer (entrada.readLine());
		total= ip1+ip2;
		System.out.println("Factura \t\t" +tipo+"\tN° "+numero);
		System.out.println (cliente);
		System.out.println ("Producto\t\t Importe");
		System.out.println (p1+"\t\t\t"+ip1);
		System.out.println (p2+"\t\t\t"+ip2);
		System.out.println ("Total\t\t\t"+ total);
		
		
		
		
		
	}
	
	catch (Exception exc) {
		System.out.println (exc);
	}
}
	
}
