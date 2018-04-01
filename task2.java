package senla;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int a = 0;
		int b = 1;
		int c;
		n = input.nextInt();
		if (n == 1) {
			System.out.println("0");
		} else {
			System.out.println("0\n1");
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.println(b + "  ");
			}
		}
		input.close();
	}

}
