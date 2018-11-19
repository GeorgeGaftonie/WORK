package ses04;

public class ReturnNextNumber {
	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 6, 5 };
		int num = 5;
		System.out.println(findNumber(array, num));
	}

	private static int findNumber(int[] array, int num) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			counter++;

			if (array[i] == num) {
				if (counter == array.length) {
					return -2;
				} else {
					return array[++i];
				}
			}

		}
		return -1;
	}
}
