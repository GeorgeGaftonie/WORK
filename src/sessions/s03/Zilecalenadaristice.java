public class Zilecalenadaristice {
	public static void main(String[] args) {

		int suma = 0;
		for (int luni = 1; luni <= 12; luni++) {

			suma += zileleluni(luni);

		}
		System.out.println(suma);
	}

	private static int zileleluni(int luni) {
		switch (luni) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0;
	}

}
