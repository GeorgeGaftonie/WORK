package sessions.s03;
public class Numerenenule {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 0, 1, 4, 3 };
		int produs = Produs(arr);
		System.out.println("Rezultat: " + produs);
	}

	private static int Produs(int[] arr) {
		int produs = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			produs *= arr[i];
		}
		return produs;
	}
}
