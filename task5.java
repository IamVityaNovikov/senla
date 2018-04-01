package senla;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		input.close();

		boolean isPalindrome = true;

		int i = 0;
		int length = str.length();

		while (i < (length / 2) + 1) {
			if (str.charAt(i) == str.charAt(length - i - 1)) {
				i++;
			} else {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Палиндром");
		} else {
			System.out.println("Не палиндром");
		}

	}

}