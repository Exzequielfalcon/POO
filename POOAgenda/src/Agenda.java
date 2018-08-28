import java.util.Arrays;

public class Agenda {
	private Contacto dueño;
	private Contacto contactos[];
	private Reunion reuniones[];
	private int CantReuniones = 0;

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

	public void setReuniones(Reunion reuniones) {
		this.reuniones[CantReuniones] = reuniones;
		CantReuniones++;
	}

	@Override
	public String toString() {
		return "Agenda [dueño=" + dueño + ", contactos=" + Arrays.toString(contactos) + ", reuniones="
				+ Arrays.toString(reuniones) + "]";
	}

	public void ShowAgenda() {
		System.out.println("Dueño= " + this.dueño);
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
