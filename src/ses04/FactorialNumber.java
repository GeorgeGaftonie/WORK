package ses04;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] numar = null;
		System.out.println(numar);
		int nr = in.nextInt();
		int n;

	}

	private static int factorial(int i, int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1, n);
	}
}
