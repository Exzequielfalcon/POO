
public class Provincia {

	private int N = 23;
	private Ciudad ciudades[] = new Ciudad[N];
	private int habitantes;

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public Ciudad[] getCiudades() {
		return ciudades;
	}

	public void setCiudades(Ciudad[] ciudades) {
		this.ciudades = ciudades;
	}

	public int getHabitantes() {
		int total = 0;
		for (int i = 0; i < N; i++) {
			total += ciudades[i].getHabitantes();
		}
		return total;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public Provincia(int NumberofCities, Ciudad[] ciudades, int habitantes) {
		N = NumberofCities;
		this.ciudades = ciudades;
		this.habitantes = habitantes;
	}

}
