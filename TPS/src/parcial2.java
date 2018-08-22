package clase8;


public class parcial2 {

	public static void main(String[] args) {
		final int maxc=3;
		final int maxf=12;
		int[][] matriz = new int [maxf][maxc];
		
		try {
			matriz= cargarmatriztemp( maxf,maxc, matriz);
			System.out.println("");
			imprimirmatriz(maxf,maxc, matriz);
			System.out.println("---------------------------------------");
			matriz=ordenarmatrizsegundato(matriz, maxf, maxc);
			imprimirmatriz(maxf,maxc, matriz);
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static int[][] cargarmatriztemp (int maxf,int maxc, int[][] matriz){
		
		for (int i=0; i < maxf; i++ ) {
			matriz[i][0]=i+1;
			matriz[i][1]=(int)(Math.random()*10+1);
			matriz[i][2]=(int)(Math.random()*30+1);
		}
	
return matriz;
}
	
	
	

	
	public static int[][] ordenarmatrizsegundato (int[][]matriz, int maxf, int maxc) {
		int[]aux1= new int [maxc];
		int[]aux2= new int [maxc];
		int fila1;
		int fila2;
		for (int x=1; x<maxf; x++) {
			for(int y=0; y<maxf-1; y++) {
				if(matriz[y][2]>matriz[y+1][2]) {
					fila1=y;
					fila2=y+1;
					aux1=copiarfila(matriz, maxc, fila1);
					aux2=copiarfila(matriz, maxc, fila2);
					reemplazar(matriz,maxc, fila1, aux2);
					reemplazar(matriz,maxc, fila2, aux1);
				}
				
			}
		}		
		return matriz;
	}
	
	
	
	public static int[]copiarfila (int[][]matriz, int maxc, int fila) {
		int[] aux= new int [maxc];
			for(int i=0; i<maxc; i++) {
				aux[i]=matriz[fila][i];
				
		}		
		return aux;
	}
	
	public static int[][]reemplazar (int[][]matriz, int maxc, int fila, int[] aux) {
		
			for(int i=0; i<maxc; i++) {
				matriz[fila][i]=aux[i];
				
		}		
		return matriz;
	}
	
	
	public static void imprimirmatriz (int maxf, int maxc, int[][] matriz){
		int c;
		int f;
		
		for (f=0; f < maxf; f++ ) {
			for (c=0; c<maxc; c++) {
				System.out.print("\t"+matriz[f][c]);
			}
			System.out.println("");
		}
		return;
	}

}
