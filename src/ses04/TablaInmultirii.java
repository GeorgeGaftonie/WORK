package ses04;

public class TablaInmultirii {
	public static void main(String[] args) {

		int num = 2;

		multiplier(num);
	}

	private static void multiplier(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(+num + " x " + i + " = " + num * i);
		}
	}

}
