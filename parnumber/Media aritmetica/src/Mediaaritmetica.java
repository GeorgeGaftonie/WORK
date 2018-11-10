public class Mediaaritmetica {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, };
		float suma = Suma(arr);
		System.out.println("Suma: " + suma);
		System.out.println("Medie: " + suma / arr.length);

	}

	private static float Suma(int[] arr) {
		float suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
		}
		return suma;
	}
}
