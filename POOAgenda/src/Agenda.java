
public class Agenda {
	private Contacto due�o;
	private Contacto contactos[];
	private Reunion reuniones[];

	public Agenda(Contacto due�o, Contacto[] contactos, Reunion[] reuniones) {
		this.due�o = due�o;
		this.contactos = contactos;
		this.reuniones = reuniones;
	}

	public Contacto getDue�o() {
		return due�o;
	}

	public void setDue�o(Contacto due�o) {
		this.due�o = due�o;
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public Reunion[] getReuniones() {
		return reuniones;
	}

	public void setReuniones(Reunion[] reuniones) {
		this.reuniones = reuniones;
	}

}
