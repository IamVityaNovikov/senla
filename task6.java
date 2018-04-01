package senla;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		input.close();

		int i = 0;
		int length = str.length();

		while (i < length) {
			if (Character.isDigit(str.charAt(i))) {
				str = str.substring(0, i) + str.substring(i + 1);
				length--;
			} else {
				i++;
			}
		}

		System.out.println(str);

	}

}