import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EjTipoParcialFIN {
	final static int maxF=10;
	final static int maxC=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]=new int [maxF][maxC];
		cargar_matriz(b);
		MostrarMatriz(b);
		int pos=obtenersecuencia();
		SearchandDestroy(b,pos);
		MostrarMatriz(b);
		
	}
	public static void cargar_matriz(int[][] arr) {
		for (int con = 0 ; con < maxF; con++){
			for (int i=0; i<maxC; i++){
		arr[con][i]=(int)(Math.random()*2);
		}
	}
	}
	public static void MostrarMatriz(int b[][]){
		for (int d=0; d<maxF; d++){
			for (int i=0; i<maxC; i++){
			System.out.print("\t" + b[d][i]);
		}
		System.out.println("");
	}
	}
	public static void SearchandDestroy(int matriz[][], int pos){
		int sec=0;
		for (int d=0; d<maxF; d++){
			for (int i=0; i<maxC; i++){
				if (matriz[d][i]!=0){
					sec=sec+1;
				}
				else if (sec==pos){
					for(int x=1;x<sec;x++){
						matriz[d][i]=0;
						System.out.println(d+" "+i+" "+matriz[d][i]);
						sec=0;
					}
				}
				else{
					
					sec=0;
				}
			}
	}
}
	public static int obtenersecuencia() {
		int pos=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese que secuencias quiere elminiar");
		pos = new Integer(entrada.readLine());
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return pos;
	}
	
}
