public class Password {
	private int longitud = 8;
	private int contraseña;

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	public Password(int longitud, int contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public Password() {
	}

	public void GenerarPw(int longitud) {

	}
}
