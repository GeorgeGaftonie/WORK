package ses04;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no = 5;
		int fac = 1;
		for(int i = 1;i<=no;i++) 
			fac = fac*i;
	}
	
	System.out.println("Factorial of"+no+"+fac);
}

}




