package Session5;

//1. Sa se implementeze o metoda care returneaza dimensiunea celei mai lungi secvente de numere egale dintr-un sir de numere primit ca parametru.

//int longestSeq(int[] sir) { ...

//Example: 
//longestSeq({1, 1, 2, 3, 5, 1, 5, 6, 9}) => 2
//longestSeq ({1, 2, 3, 2, 3, 4}) => 1
//longestSeq ({1, 1, 1, 2, 2, 3, 3, 3, 3, 2, 3, 4}) => 4

public class LongestSequence {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 3, 5, 6, 9 };

		System.out.println(longestSeq(arr));

	}

	private static int longestSeq(int[] arr) {
		int counter = 0;
		int max = 1;
		for (int i = 1; 1 < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				counter++;
				if (counter > max) {
					max = counter;
				}

			} else {

				counter = 1;
			}
		}

		return max;
	}
}
