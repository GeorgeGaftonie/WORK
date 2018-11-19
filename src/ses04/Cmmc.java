package ses04;

public class Cmmc {
	public static void main(String[] args) {

		int n1 = 235;
		int n2 = 120;
		findLCM(n1, n2);

	}

	private static void findLCM(int n1, int n2) {
		int lcm;

		lcm = (n1 > n2) ? n1 : n2;

		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.print("The LCM of " + n1 + " and " + n2 + " is "
						+ lcm);
				break;
			}
			++lcm;
		}
	}

}
