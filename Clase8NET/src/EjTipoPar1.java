
public class EjTipoPar1 {
	final static int maxc=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Temperatura [][]= new int [11][3];
		cargar_matriz_temp(Temperatura);
		MostrarMatriz(Temperatura);
		int[] aux1=CopiarMatriz(Temperatura,1,maxc);
		int[] aux2=CopiarMatriz(Temperatura,2,maxc);		
		
		for (int i=0;i<3;i++){
			
		}
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
	public static int[] CopiarMatriz(int matriz[][], int maxc, int fila){
		int []aux=new int [maxc];
		for(int i=0;i<maxc;i++){
			aux[i]=matriz[fila][i];
		}
		return aux;
	}
	public static int[][] ReemplazarMatriz(int matriz[][],int maxc,int aux[],int fila){
		for (int i=0;i<maxc;i++){
			matriz[fila][i]=aux[i];
		}
		return matriz;
	}
}

