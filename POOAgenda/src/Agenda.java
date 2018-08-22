
public class Agenda {
	private Contacto dueño;
	private Contacto contactos[];
	private Reunion reuniones[];

	public Agenda(Contacto dueño, Contacto[] contactos, Reunion[] reuniones) {
		this.dueño = dueño;
		this.contactos = contactos;
		this.reuniones = reuniones;
	}

	public Contacto getDueño() {
		return dueño;
	}

	public void setDueño(Contacto dueño) {
		this.dueño = dueño;
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
