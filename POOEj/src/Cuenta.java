import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cuenta {
	private String titular;
	private double cantidad;

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(Cuenta c1) {
		double a = 0.0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese una cantidad ");
			a = new Double(entrada.readLine());

			double b = c1.getCantidad();
			c1.setCantidad(a + b);

		}

		catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	public String toString() {
		return "El titular " + titular + " tiene " + cantidad
				+ " euros en la cuenta";
	}
}
