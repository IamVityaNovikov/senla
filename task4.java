package senla;

import java.util.Scanner;

public class task4 {

	public static int NOD(int a, int b) {
		int res;

		if (b == 0) {
			res = a;
		} else {
			res = NOD(b, a % b);
		}

		return res;
	}

	public static int NOK(int a, int b) {

		return Math.abs(a * b) / NOD(a, b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		System.out.println("Первое число: ");
		n1 = input.nextInt();
		int n2 = 0;
		System.out.println("Второе число: ");
		n2 = input.nextInt();
		input.close();

		int nod = NOD(n1, n2);
		int nok = NOK(n1, n2);

		System.out.println("НОД: " + nod);
		System.out.print("НОК: " + nok);
	}

}