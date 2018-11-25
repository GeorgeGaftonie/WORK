package Session5;

import java.util.Arrays;

//2. Sa se implementeze o metoda care primeste ca parametri doua siruri ordonate de numere si
//returneaza un sir ordonat compus din elementele celor doua siruri. */
public class SirOrdonat {
	public static void main(String[] args) {
		int arr1[] = { 2, 3, 5, 7, 8, 1 };
		int arr2[] = { 1, 3, 5, 6, 7, 2 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(sortedConcatenation(arr1, arr2));

	}

	private static int[] sortedConcatenation(int[] arr1, int[] arr2) {
		int lungimeArr1 = arr1.length;
		int lungimeArr2 = arr2.length;
		int newArray[] = new int[lungimeArr1 + lungimeArr2];
		System.arraycopy(arr1, 0, newArray, 0, lungimeArr1);
		System.arraycopy(arr2, 0, newArray, lungimeArr1, lungimeArr2);

		return newArray;

	}

}
