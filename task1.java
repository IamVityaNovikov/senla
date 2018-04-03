package senla;

import java.util.Scanner;
import java.util.Arrays;

public class task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		n = input.nextInt();
		boolean[] m = new boolean[n + 1];
		Arrays.fill(m, true);
		for (int i = 2; i <= n; i++) {
			if (m[i]) {
				for (int j = 2; i * j <= n; j++) {
					m[i * j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (m[i])
				System.out.println(i);
		}
		input.close();
	}

}
