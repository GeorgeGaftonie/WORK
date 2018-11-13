package sessions;

public class Returnnumber {
	public static void main(String[] args) {
		show10();
		int[] number = { 1, 6, 9, 3 };
		reverse(number);
		System.out.println("convert(number)");
	}

	private static void reverse(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	private static void show10() {
		int n = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(n);
			n = n * 10;

		}
	}

	private static int convert(int[] number) {
		int sum = 0;
		int valoarecfira = 1;
		for (int i = number.length - 1; i >= 0; i--) {
			int ceva = number[i];
			sum += ceva;
			int valoareCifra = 10;
		}
		return sum;

	}
}
