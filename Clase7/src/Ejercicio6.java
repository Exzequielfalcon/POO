
public class Ejercicio6 {
	final public static int MAX=10;
	public static void main(String[] args){
		int b[]=new int[MAX];
		CargaDecreciente(b);
		
	}
	public static void CargaDecreciente (int b[]){
		for (int i=MAX;i==7;i--){
			b[i]=i;
			System.out.println("es" +i);
		}
	}
	public static void MostrarArreglo(int b[]){
		for (int d=0; d<MAX; d++){
			System.out.print("\t" + b[d]);
		}
		System.out.println("");
	}
	
}
