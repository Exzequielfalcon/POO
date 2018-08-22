
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		punto p1 = new punto(15,20);
		p1.Mostrar(p1.x, p1.y);
		p1.x = p1.Modificax();
		p1.y = p1.Modificay();
		p1.Mostrar(p1.x, p1.y);
		p1.distancia(p1.x, p1.y);
		int cuadrante =p1.cuadrantePunto(p1.x,p1.y);
		System.out.println("El punto esta en el cuadrante "+cuadrante);
	}
	
	
}
