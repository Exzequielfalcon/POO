
public class Burbujeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void burbujeo(int [] array){
		int temp=0;
		for (int i=1; i<MAX;i++){
			for(int j=0; j<MAX-1;j++){
				if (array[j]>array[j+1])
				temp=array[j];
				array[j] = array[j+1];
				array[j+1]=temp;
			}
		}
	
}
