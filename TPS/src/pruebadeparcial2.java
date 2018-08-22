

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pruebadeparcial2 {
	public static void main(String[] args) {
		// 
		
		final int maxf=5;
		final int maxc=20;
		final int maxm=100;
		int[][] mat=new int [maxf][maxc];
		int[] secuencia=new int [2];
		int[] secuenciacero=new int [2];
		int ultpos;
		int n=0;
		boolean sigo=true;
		final int datinicio=0;
		final int datfinal=1;
		int[] arreglo=new int [maxm];

		try {
			
			mat=cargarmatriz(maxf, maxc, mat);
			imprimirmatriz(maxf, maxc, mat);
			n=cargarn (n, maxc);
			arreglo=inicializararr(arreglo, maxf, maxc);
			for (int x=0; x < maxf; x++) {
				ultpos=0;
				sigo=true;
				while(sigo==true) {
					secuencia=buscarsecuencia(maxc, mat, ultpos, x, datinicio, datfinal);
					ultpos=ultimaposicion(secuencia, secuencia, datfinal);
					secuenciacero=buscarnosecuencia(maxc, mat, ultpos, x, datinicio, datfinal);
					ultpos=ultimaposicion(secuencia, secuenciacero, datfinal);
					if (verificar (datinicio, datfinal, secuencia, n, mat, x)) {
						mat=invertir(x, mat, secuencia, datinicio, datfinal);
						arreglo=copiararr(arreglo, maxm, mat, secuencia, x);
					}
					ultpos=ultimaposicion(secuencia, secuenciacero, datfinal)+1;
					if(ultpos<maxc) {
						sigo=true;
					}
					else {
						sigo=false;
					}
				}
			}
			System.out.println("matriz nueva");
			imprimirmatriz(maxf, maxc, mat);
			System.out.println("arreglo nueva");
			imprimirarray(arreglo, maxf, maxc);
		}
		catch (Exception exc) {
			System.out.println(exc);
		}	
	}
	
	
	public static int[] copiararr(int [] arreglo, int maxm, int[][] matriz, int[] secuencia, int x) {
		int inicio=0;
		int fin=0;
		int ult=0;
		int u=maxm-1;
		boolean noencontre=true;
		
		inicio=secuencia[0];
		fin=secuencia[1];
		
		while( u>=0) {
			if (arreglo[u]!=0 && noencontre) {
				ult=u+2;
				noencontre=false;
			}
			u=u-1;
		}
		for (int i=inicio; i<=fin; i++) {
			arreglo[ult]= matriz[x][i];
			ult=ult+1;
		}
		return arreglo;
	}
	
	
	
	
	public static int[] inicializararr(int [] arreglo, int maxf, int maxc) {
		int[] array= new int [maxf*maxc];
		for (int i=0; i<maxf*maxc; i++) {
			array[i]=0;
		}
		return array;
	}
	
	public static void imprimirarray(int [] arreglo, int maxf, int maxc) {
		for (int i=0; i<maxf*maxc; i++) {
			System.out.print(" ["+arreglo[i]+"]");
		}
		return;
	}
	
	
	
	
	public static int ultimaposicion (int[] secuencia, int[] secuenciaaux, int datfinal){
		int o=0;
			if(secuencia[datfinal]>secuenciaaux[datfinal]) {
				o=secuencia[datfinal];
			}
			else {
				o=secuenciaaux[datfinal];
			}	
	return o;
	}
	
	public static int cargarn (int n, int maxc){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el tamaño de la secuencia que desea invertir");
			n=new Integer(entrada.readLine());
			while (n<0 || n> maxc) {
				System.out.println("Ingrese nuevamente el tamaño de la secuencia que desea invertir");
				n=new Integer(entrada.readLine());
			}	
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	return n;
	}
	
	public static int[][] cargarmatriz (int maxf,int maxc, int[][] matriz){
		int c;
		int f;
		try {
			for (f=0; f < maxf; f++ ) {
				for (c=0; c<maxc; c++) {
					matriz[f][c] = (int)(Math.random()*3);;
				}
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
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
	public static int[] buscarsecuencia (int maxc, int[][] matriz, int ultpos, int x, int datinicio, int datfinal) {
		
		int[] secuencia= new int[2];
		boolean noencontrei=true;
		boolean noencontref=true;
		try {
				for(int y=ultpos; y<maxc; y++){
					if (matriz[x][y]!=0 && noencontrei) {
						secuencia[datinicio]=y;
						secuencia[datfinal]=y;
						noencontrei=false;
					}
					else if (noencontref && !noencontrei){
						if (matriz[x][y]!=0){
							secuencia[datfinal]=y;
						}
					else {
						noencontref=false;					
					}			
				}
			}
		}	
		catch (Exception exc) {
			System.out.println(exc);
		}		
		return secuencia;
	}
	
public static int[] buscarnosecuencia (int maxc, int[][] matriz, int ultpos, int x, int datinicio, int datfinal) {
				
		int[] secuencia= new int[2];
		boolean noencontrei=true;
		boolean noencontref=true;
		try {
			for(int y=ultpos; y<maxc; y++){
				if (matriz[x][y]==0 && noencontrei) {
					secuencia[datinicio]=y;
					secuencia[datfinal]=y;
					noencontrei=false;
				}
				else if (noencontref && !noencontrei){
					if (matriz[x][y]==0){
						secuencia[1]=y;

					}
					else {
						noencontref=false;				
					}			
				}
			}
		}	
		catch (Exception exc) {
			System.out.println(exc);
		}		
		return secuencia;
	}

public static int[][] invertir(int x, int[][] matriz, int[] datsecuencia, int datinicio, int datfinal){

	int mitad;
	int aux;
	int fin;
	int inicio;
	
	fin=datsecuencia[datfinal];
	aux=datsecuencia[datinicio];
	mitad= fin-aux;
	mitad= mitad+1;
	mitad=mitad/2;
	fin=datsecuencia[datfinal];
	inicio=datsecuencia[datinicio];
	
	for ( int i= 0; i<mitad; i++) {
		aux=matriz[x][fin-i];
		matriz[x][fin-i] = matriz[x][inicio+i];
		matriz[x][inicio+i]=aux;
		}
	return matriz;
}

public static boolean verificar (int datinicio, int datfinal, int[] datsecuencia, int n, int[][] matriz, int x){
	
	boolean valordeverdad=false;
	int inicio;
	int fin;
	int tamano;
	
	inicio=datsecuencia[datinicio];
	fin=datsecuencia[datfinal];
	
	if(matriz[x][inicio]==1 && matriz[x][fin]==1) {
			tamano=fin-inicio;
			tamano=tamano+1;
			if (tamano==n) {
				valordeverdad=true;	
			}
			else {
				valordeverdad=false;
			}
	}
	return valordeverdad;	
}	
}