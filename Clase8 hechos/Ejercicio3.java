

public class Ejercicio3 {
	
	final static int MAX=10;
	final static int MAXIMO=100;
	
	public static void main (String args[]) {
		
		int B[]=new int[MAX];
		int posicion = 0;
		int posicionOrdenada = 0;


		cargar_arreglo(B);
		
			System.out.println("Los datos son:");
		
		for (int con = 0 ; con < MAX; con++) {
			System.out.println(posicion + ". " + B[con]);
			posicion++;
		}
		
		burbuja(B);
		System.out.println("\nLa forma ordenada es: \n");
		for (int con = 0 ; con < MAX; con++) {
			System.out.println(posicionOrdenada + ". " + B[con]);
			posicionOrdenada++;
		}

	}
	
	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)
			arr[con]=(int)(Math.random()*MAXIMO+1);
	}
	

	public static int burbuja(int B[]){
		int temp=0;;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (B[j] > B[j+1]){
					temp = B[j];
					B[j] = B[j+1];
					B[j+1] = temp;
				}
			
			}
	
		}
		return temp;
	}

	public static void insercion(int arr[]) {
		for (int i = 1; i < MAX; i++) {
			int aux = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] > aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
}
	
}
