import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parcial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=0;
				char c;
				try{
					
					BufferedReader entrada = new BufferedReader(new
							InputStreamReader(System.in));	
					System.out.println("Ingrese un numero");
					a = new Integer(entrada.readLine());
					while(a!=0){
						System.out.println("Ingrese un caracter");
						c = new Character(entrada.readLine().charAt(0));
						while ((c<'0')||(c>'9')){
							System.out.println("Ingrese un caracter");
							c = new Character(entrada.readLine().charAt(0));
						}
						if ((c>='0')&&(c<='9')){
							System.out.println("digito");
							if ((a%3==0)&&(a%5==0)){
								System.out.println("es multiplo de 3 y 5");
							}
								else{
									System.out.println("no es multiplo de 3 y 5");
								}
							}
						
						if (!((c>='0')&&(c<='9'))){
						switch (c){
						case 'a': case 'e': case 'i': case 'o': case 'u':System.out.println("vocal minuscula");break;
						default: System.out.println("otro");
						
						}
					
						}
				
				System.out.println("Ingrese 0 para terminar el programa u otro valor para reiniciar");
				a = new Integer (entrada.readLine());
					}
				}
					catch (Exception exc ) {
					System.out.println( exc );
				}
}
}