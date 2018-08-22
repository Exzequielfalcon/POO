public class Persona {
	public final char h = 'h';
	String nombre = "";
	int edad = 0;
	int dni = generarDNI();
	char sexo = h;
	double peso = 0.0;
	double altura = 0.0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
		comprobarSexo(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Persona(String nombre, int edad, int dni, char sexo, double peso,
			double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona() {
	}

	public String toString() {

		return "Nombre: " + nombre + "\n Edad " + edad + "\n Dni: " + dni
				+ "\n Sexo: " + sexo + "\n Peso: " + peso + "\n Altura: "
				+ altura;
	}

	public int calcularIMC() {
		double total = (this.peso) / (Math.pow(this.altura, 2));
		int div = 0;
		if (total < 20) {
			div = -1;
		} else if ((total >= 20) && (total <= 25)) {
			div = 0;
		} else if (total > 25) {
			div = 1;
		}
		return div;
	}

	public boolean esMayorDeEdad() {
		boolean c;
		if (this.edad >= 18) {
			c = true;
		} else {
			c = false;
		}
		return c;
	}

	public void comprobarSexo(char sexo) {
		switch (sexo) {
		case 'm':
			this.sexo = 'm';
		case h:
			this.sexo = h;
		default:
			this.sexo = h;
		}
	}

	public int generarDNI() {
		int b = (int) (Math.random() * 99999999);
		return b;
	}

}
