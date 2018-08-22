import java.io.BufferedReader;
import java.io.InputStreamReader;


public class punto {
	int x,y;
	

	public punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void Mostrar (int x, int y){
		System.out.println("El valor de x es= "+x);
		System.out.println("El valor de x es= "+y);
	}
	public static int Modificay (){
		int y=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el valor de x");
		y = new Integer(entrada.readLine());
		
		
		}
		catch(Exception exc){
		
		}
		
	return y;
	}
	public static int Modificax (){
		int x=0;
		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el valor de x");
		x = new Integer(entrada.readLine());
		
		
		
		}
		catch(Exception exc){
		
		}
		
	return x;
	}
	public void distancia(int x, int y) {
		double dist=0;
		dist= Math.sqrt((Math.pow(x,2)+(Math.pow(y,2))));
		System.out.println(dist);
	}
	public int cuadrantePunto(int x, int y){
		int cuadrante=0;
		if((x>=0)&&(y>=0)) return cuadrante=1;
		else if((x<0)&&(y>=0)) return cuadrante=2;
		else if((x<0)&&(y<0)) return cuadrante=3;
		else return cuadrante=4;
		}
}
