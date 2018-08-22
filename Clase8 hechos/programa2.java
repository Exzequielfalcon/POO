package clase8;

public class programa2 {

	final static int MAX = 10;
	public static void main(String args[]) {
		//MAS ADELANTE HABRÍA QUE MODULARIZAR LA INICIALIZACION,
		//CARGA E IMPRESION
		int B[]=new int[MAX];
		for (int con = 0 ; con < MAX; con++) {
			B[con]=(int) (MAX*Math.random() + 1); // Entre 1 y 10
		}
		System.out.println("el promedio es: "+promedio(B));
	}
	
	public static float promedio (int[] arr){
		float prom = 0.0f;
		for (int con = 0 ; con < MAX; con++) {
			prom += arr[con];
		}
		prom=prom/MAX;
		return prom;
	}
}
