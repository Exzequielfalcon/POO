import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("genia");
		list.add("flor");
		list.add("te amo");
		Collections.sort(list);
		for (int i = 0; i < 10; i++) {
			System.out.print(list.get(0));
		}
	}
}
