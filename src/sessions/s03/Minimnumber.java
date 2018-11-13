package sessions.s03;
import java.util.Arrays;

public class Minimnumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Arrays.sort(arr);
		System.out.println("Minim = " + arr[0]);
		System.out.println("Maxim = " + arr[arr.length - 1]);
	}

}
