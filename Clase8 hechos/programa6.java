package clase8;

public class programa6 {
	
	final static int MAX = 10;
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
	public static void burbuja(int[] arr){
		int temp;
		for(int i = 1;i < MAX;i++){
			for (int j = 0 ; j < MAX - 1; j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
