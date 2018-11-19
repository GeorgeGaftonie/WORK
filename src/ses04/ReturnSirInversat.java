package ses04;

import java.util.Arrays;

public class ReturnSirInversat {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int backArray[] = new int[arr.length];

		reverseArray(arr, backArray);
		System.out.println(Arrays.toString(backArray));

	}

	private static void reverseArray(int[] arr, int[] backArray) {
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			int num = arr[i];
			backArray[j] = num;

		}
	}
}
