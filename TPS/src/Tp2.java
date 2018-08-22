import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Tp2 {
	final public static int maxF=5;
	final public static int maxC=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAT[][] = new int [maxF][maxC];
		cargar_matriz(MAT);
		MostrarMatriz(MAT);
		int N=obtenerN();
		InvertirSecuencia(MAT,N);
		MostrarMatriz(MAT);
		
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
	public static int obtenerN() {
		int pos=0;
		try{
			BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el tamaño de las secuencias que quiere invertir de 0 a 20");
		pos = new Integer(entrada.readLine());
		while((pos<0)&&(pos>maxC)){
			System.out.println("Ingrese el tamaño de las secuencias que quiere invertir de 0 a 20");
			pos = new Integer(entrada.readLine());
			}
		}
		catch (Exception exc ) {
			System.out.println( exc );			
			}
		return pos;
	}
	public static void InvertirSecuencia (int matriz[][], int pos) {
		boolean encontrado=true;
		int finf=0,finc=0,contador=0;
		int iniciof=0,inicioc=0, aux=0; 
		for(int x=0; x<maxF;x++){
			for (int y=0; y<maxC;y++){
				
					if (matriz[x][y]==1 && (encontrado = true)){
						iniciof=x;
						inicioc=y;
						encontrado=false;
						contador=0;
						System.out.println("Empieza  "+"fila = "+x+ "    columna = "+"  "+y);
						
					}
					if (encontrado=false){
						contador=contador+1;
						System.out.println(contador);
					}
					if (!(y+1>20)){
					if ((x+1>4) && (matriz[x][y]==1) && (encontrado == false) && (matriz[0][y+1]==0)){
						finf=x;
						finc=y;
						encontrado=true;
						System.out.println("Termina "+"fila = "+x+ "     columna="+"  "+y);
					}
					}
					if (!(x+1>4)) {
					if ((matriz[x][y]==1) && (matriz[x+1][y]==0) && (encontrado == false)){
						finf=x;
						finc=y;
						encontrado=true;
						System.out.println("Termina "+"fila = "+x+ "     columna="+"  "+y);
					}
					}
					
					if ((contador==pos)&&(encontrado=true)){
						System.out.println(contador);
						for (int d=inicioc;d<=finc;d++){
							for (int d2=finc;d2>=inicioc;d2--){
								for (int i=iniciof; i<=finf;i++){
									for (int i2=finc;i2>=inicioc;i2--){
								matriz[i][d]=aux;
								matriz[i][d]=matriz[i2][d2];
								matriz[i2][d2]=aux;
								
								
									}
								}
							}
						}
					}
				}
	}

}
}
