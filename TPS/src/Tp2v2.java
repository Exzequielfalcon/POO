import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Tp2v2 {
	final public static int maxF=5;
	final public static int maxC=20;
	final public static int maxA=100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAT[][] = new int [maxF][maxC];
		int b[] = new int [maxA];
		cargar_matriz(MAT);
		Columnas();
		MostrarMatriz(MAT);
		int N=obtenerN();
		BuscarSecuencia(MAT,N,b);
		System.out.println("Matriz invertida");
		Columnas();
		MostrarMatriz(MAT);
		System.out.println("Arreglo");
		MostrarArreglo(b);
		
		
	}
	public static void cargar_matriz(int[][] arr) {
		for (int con = 0 ; con < maxF; con++){
			for (int i=0; i<maxC; i++){
		arr[con][i]=(int)(Math.random()*3);
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
	public static void Columnas(){
		
		for (int i=0;i<maxC;i++){
			System.out.print("\t" + i);
		}
		System.out.println("");
		System.out.println("");
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
	public static void BuscarSecuencia (int matriz[][], int pos, int b[]) {
		boolean encontrado=true;
		boolean fin=false;
		
		int finf=0,finc=0,contador=0;
		int iniciof=0,inicioc=0; 
				for(int x=0; x<maxF;x++){ //ENCONTRAR SECUENCIA
					for (int y=0; y<maxC;y++){
					if ((y-1)>=0){
					if ((matriz[x][y]==1) && (encontrado == true) && (matriz[x][y-1]==0)){
						iniciof=x;
						inicioc=y;
						encontrado=false;
						System.out.println("Empieza  "+"fila = "+x+ "    columna = "+"  "+y);
					}
					}
					if (encontrado==false){
						contador=contador+1;
					}
					if ((encontrado==false)&&(matriz[x][y]==0)){
						encontrado=true;
					}
					if (!((y+1)>=20)){
					if ((matriz[x][y]==1) && (encontrado == false) && (matriz[x][y+1]==0)){
						finf=x;
						finc=y;
						encontrado=true;
						fin=true;
						System.out.println("Termina "+"fila = "+x+ "     columna="+"  "+y);
					}
					}
					if ((encontrado==true)&&(fin==true)){//SI SECUENCIA = A LA POSICION INVERTIR
						contador=finc-inicioc;
							if ((contador+1)==pos){
								System.out.println(contador);
								System.out.println(" inicio columna "+inicioc+" fin columna "+finc+ " inicio fila "+iniciof+" fin fila "+finf);
						
							Invertir(matriz,inicioc,iniciof,finc); 
							Copiar(b,inicioc,finc,matriz,iniciof);
							
							
							encontrado=true;
							fin=false;
							}
						}
						
					if(y==maxC){
						encontrado=true;
					}
					
				}
					
			}
		}
	
	
	public static void LlenarArreglo(int b[]){
		for (int i=0;i>=maxA;i++){
			b[i]=0;
		}
	}
	public static int[] CopiarSecuencia(int matriz[][],int inicioc, int finc, int iniciof,int b[]){
		int max=maxA-1;
		boolean encontrado=true;
		int ult=0;
		
		while( max>=0) {
			if ((b[max]!=0) && (encontrado==true)) {
				ult=max+2;
				encontrado=false;
			}
			max--;
		}
		for (int i=inicioc; i<=finc; i++) {
			b[ult]= matriz[iniciof][i];
			ult=ult+1;
		}
		return b;
	}
	public static void Invertir(int matriz[][], int inicioc, int iniciof, int finc){
		int mitad= finc-inicioc;
		mitad= mitad+1;
		mitad=mitad/2;
		int aux;
		for (int i=0;i<mitad;i++){
			aux=matriz[iniciof][finc-i];
			matriz[iniciof][finc-i]=matriz[iniciof][inicioc+i];
			matriz[iniciof][inicioc+i]=aux;
		}
		
	}
	public static void MostrarArreglo(int b[]){
		for (int d=0; d<maxA; d++){
			System.out.print("\t" + b[d]);
		}
		System.out.println("");
	}
	public static void CorrimientoDerecha(int b[]){
		for (int i=b[0];i<maxA-1;i++){
			b[i]=b[i+1];
			
		}
	} 
	public static void Copiar(int b[], int inicioc, int finc, int matriz[][], int iniciof){
		int aux=0;
		b[0]=0;
	for (int i=1;i>=maxA;i++){
		if ((b[i]==0)&&((b[i-1]!=0)||(b[1]==0))){
			aux=i;
			for (int j=inicioc; j>=finc; j++) {
				b[i+1]= matriz[iniciof][j];
				i++;
			}
			i=aux;
		}
		
	}
	}
}
