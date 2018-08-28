import java.util.Arrays;

public class Agenda {
	private Contacto due�o;
	private Contacto contactos[];
	private Reunion reuniones[];
	private int CantReuniones = 0;

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

	public void setReuniones(Reunion reuniones) {
		this.reuniones[CantReuniones] = reuniones;
		CantReuniones++;
	}

	@Override
	public String toString() {
		return "Agenda [due�o=" + due�o + ", contactos=" + Arrays.toString(contactos) + ", reuniones="
				+ Arrays.toString(reuniones) + "]";
	}

	public void ShowAgenda() {
		System.out.println("Due�o= " + this.due�o);
		for (int i = 0; i < getContactos().length; i++) {
			System.out.println("Nombre: " + this.contactos[i].getNombre());
			System.out.println("Apellido: " + this.contactos[i].getApellido());
			System.out.println("Mail: " + this.contactos[i].getMail());
			System.out.println();

		}
		for (int j = 0; j < getContactos().length; j++) {
			System.out.println(this.reuniones[j].toString());
		}

	}
}
