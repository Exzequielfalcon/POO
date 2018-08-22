package clase8;

public class programa3 {

	final static int MAX = 10;
	public static void main(String args[]) {
		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION
		//E IMPRESION
		int B[]=new int[MAX];
		cargar_arreglo(B);
			System.out.println("Los datos son:");
		
		for (int con = 0 ; con < MAX; con++)
			System.out.println(B[con]);
		int a = 20;
		cargar_variable_simple(a);
			System.out.println("La variable es:");
			System.out.println(a);
	}
	
	public static void cargar_variable_simple(int c) {
		c = 10;
	}
	
	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)
			arr[con]=(int)(Math.random()*MAX+1);
	}
}
