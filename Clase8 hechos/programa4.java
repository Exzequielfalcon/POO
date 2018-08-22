package clase8;

public class programa4 {
	
	final static int MAX = 10;
	public static int buscar_pos_des(int[] arr,int valor) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]!=valor))
			pos++;
		if (pos>=MAX) return -1;
		else return pos;
	}
	
	public static int buscar_pos_ord(int[] arr,int valor) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]>valor))
			pos++;
		if ((pos<MAX)&&(arr[pos]==valor)) return pos;
		else return -1;
		}
}
