import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Coche {
	String color, marca;
	int km;
	
	public void pcolor(){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
		color = new String(entrada.readLine());
		}
		catch (Exception exc){
			
		}
	}

	public Coche(String color, String marca, int km) {
		this.color = color;
		this.marca = marca;
		this.km = km;
	}
	
	
}
