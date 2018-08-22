import java.lang.Object;

public class Reunion {
	private final int N=100;
	private int CantAsis=0;
	private String lugar;
	private String tema;
	private LocalDate fecha;
	private LocalTime hora;
	private int duracion;
	private Contacto[] asistentes;
	
	public Reunion(String lugar, String tema, LocalDate fecha, LocalTime hora,
			int duracion) {
		this.CantAsis=0;
		this.lugar = lugar;
		this.tema = tema;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.asistentes = new Contacto[N];
	}
	
	public void AgregarAsistente(Contacto c){
		if (!this.asiste(c)){
			asistentes[CantAsis]=c;
			CantAsis++;
		}
	}
	
	public void reporogramar(LocalDate fn, LocalTime hn){
		this.fecha=fn;
		this.hora=hn;
	}
	
	public boolean asiste (Contacto c){
		for (int i=0;i<CantAsis;i++){
			if (c.equals(asistentes[i])){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}

