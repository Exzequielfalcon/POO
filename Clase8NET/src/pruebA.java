
public class pruebA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Temperatura [][]= new int [12][3];
		cargar_matriz_temp(Temperatura);
		MostrarMatriz(Temperatura);
		burbuja(Temperatura);
		
	}
	public static void cargar_matriz_temp(int[][] arr) {
		for (int i = 0 ; i < 12; i++){
		arr[i][0]= i+1;
		arr[i][1]=(int)(Math.random()*15+1);
		arr[i][2]=(int)(Math.random()*30+15);
		
		}
	}
	
	public static void MostrarMatriz(int b[][]){
		for (int d=0; d<12; d++){
			for (int i=0; i<3; i++){
			System.out.print("\t" + b[d][i]);
		}
		System.out.println("");
	}
	}
	public static int burbuja() {
		int arr[];
		int temp;
		for(int i = 1; i < 12; i++) {
			for(int j = 0; j < 12 - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr[];
	}
	
	}