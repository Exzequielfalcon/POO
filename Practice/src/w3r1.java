import java.util.ArrayList;

public class w3r1 {
	public static final int MAXf = 2;
	public final static int MAXc = 4;
	public static final int MAXf2 = 2;
	public final static int MAXc2 = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = { { 1, 2, 3, 4 }, { 8, 5, 3, 23 } };
		int c[][] = { { 54, 3, 43, 65 }, { 84, 55, 24, 23 } };
		ArrayList<Integer> arr;
		arr = new ArrayList<Integer>();
		FindCommon(b, c, arr);
		System.out.println(arr.toString());
	}

	public static void FindCommon(int b[][], int c[][], ArrayList<Integer> arr) {
		for (int i = 0; i < MAXf; i++) {
			for (int j = 0; j < MAXc; j++) {
				for (int h = 0; h < MAXf2; h++) {
					for (int k = 0; k < MAXc2; k++) {
						if (b[i][j] == c[h][k]) {
							// System.out.println("Common in b " + i + " " + j);
							// System.out.println("Common in c " + h + " " + k);
							if (Check(arr, b[i][j])) {
								arr.add(b[i][j]);
							}
						}
					}
				}
			}
		}
	}

	public static boolean Check(ArrayList<Integer> arr, int number) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == number) {
				return false;
			}
		}
		return true;
	}

}
