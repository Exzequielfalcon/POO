import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contactos[] = new Contacto[10];
		Reunion reuniones[] = new Reunion[10];
		Contacto c1 = new Contacto("Eze", "falcon", "sadf@asfd.com");
		Agenda agenda = new Agenda(c1, contactos, reuniones);
		GenerateContacts(contactos);
		GenerateReunion(reuniones);
		reuniones[0].AgregarAsistente(c1);
		reuniones[0].AgregarAsistente(contactos[3]);
		agenda.ShowAgenda();

	}

	public static void ShowContacts(Contacto c[]) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getNombre());
		}
	}

	public static void GenerateContacts(Contacto c[]) {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Contacto("El eze " + i, "hake", "kae@asd");
		}
	}

	public static void GenerateReunion(Reunion c[]) {

		for (int i = 0; i < c.length; i++) {
			c[i] = new Reunion("La quiaca" + i, "Lechuzc", LocalDate.now(), LocalTime.now(), 3);
		}
	}
}
