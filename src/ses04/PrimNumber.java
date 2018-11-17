package ses04;

import java.util.Scanner;

public class PrimNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti un numar");

		Scanner scanner = null;
		int numar1 = in.nextInt();
		System.out.println("Introduceti numarul final");
		int numar2 = in.nextInt();

		if (numar1 > numar2) {
			showPrime(numar2, numar1);
		} else {
			showPrime(numar1, numar2);

		}

	}

	public static int divisors(int numar) {
		int nrDivizori = 0;
		for (int i = 1; i <= numar; i++) {
			if (numar % i == 0)
				nrDivizori++;
		}
		return nrDivizori;
	}

	public static void showPrime(int numar1, int numar2) {
		int nr1 = 125;
		int nr2 = 10;
		for (int i = nr1; i < nr2; i++) {
			int rez = divisors(i);
			if (rez == 2)
				System.out.println(i + " ");

		}
	}

	private static int divisor(int i) {

		return 0;
	}

}
