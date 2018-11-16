package ses04;

import java.util.Scanner;

public class Palindrom {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("The number is a palindrome.");
		else
			System.out.println("The number isn't a palindrome.");
	}
}
