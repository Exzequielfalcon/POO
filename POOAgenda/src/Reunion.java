import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Reunion {
	private final int N = 10;
	private int CantAsis = 0;
	private String lugar;
	private String tema;
	private LocalDate fecha;
	private LocalTime hora;
	private int duracion;
	private Contacto[] asistentes;

	public Reunion(String lugar, String tema, LocalDate fecha, LocalTime hora, int duracion) {
		this.CantAsis = 0;
		this.lugar = lugar;
		this.tema = tema;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.asistentes = new Contacto[N];
	}

	public void AgregarAsistente(Contacto c) {
		if (CantAsis < N) {
			if (!this.asiste(c)) {
				asistentes[CantAsis] = c;
				CantAsis++;
			}
		} else {
			System.out.println("No se pudo agregar al asistente " + c);
		}
	}

	public void reporogramar(LocalDate fn, LocalTime hn) {
		this.fecha = fn;
		this.hora = hn;
	}

	public boolean asiste(Contacto c) {
		for (int i = 0; i < CantAsis; i++) {
			if (c.equals(asistentes[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Reunion  lugar=" + lugar + ", tema=" + tema + ", fecha=" + fecha + ", hora=" + hora + ", duracion="
				+ duracion + " horas, asistentes=" + Arrays.toString(asistentes) + "]";
	}

}
