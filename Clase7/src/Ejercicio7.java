
public class Ejercicio7 {
	final public static int MAX=10;
	final public static int maxrandom=100;
	
	public static void main (String[]args){
		int[] b = new int [MAX];
		cargar_arreglo(b);
		burbujeo(b);
		MostrarArreglo(b);
	}
	
	public static void cargar_arreglo(int[] arr) {
		for (int con = 0 ; con < MAX; con++)

		arr[con]=(int)(Math.random()*maxrandom+1);
		}
	public static void ordenar_arreglo(int [] arr){
		for (int i=0;i<MAX;i++){
			//arr[i]
		}
	}
	public static void burbujeo(int [] array){
		int aux=0;
		for (int i=0; i<array.length-1;i++){
			for(int j=0; j<array.length-1;j++){
				if (array[j]>array[j+1]){
				aux=array[j];
				array[j] = array[j+1];
				array[j+1]=aux;
			}
		}
	}
	}
	public static void MostrarArreglo(int b[]){
		for (int d=0; d<b.length; d++){
			System.out.print("\t" + b[d]);
		}
		System.out.println("");
	}
}