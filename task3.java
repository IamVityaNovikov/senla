package senla;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float x1 = 0;
		System.out.println("x1: ");
		x1 = input.nextFloat();
		float y1 = 0;
		System.out.println("y1: ");
		y1 = input.nextFloat();

		float x2 = 0;
		System.out.println("x2: ");
		x2 = input.nextFloat();
		float y2 = 0;
		System.out.println("y2: ");
		y2 = input.nextFloat();

		float x3 = 0;
		System.out.println("x3: ");
		x3 = input.nextFloat();
		float y3 = 0;
		System.out.println("y3: ");
		y3 = input.nextFloat();

		float x4 = 0;
		System.out.println("x4: ");
		x4 = input.nextFloat();
		float y4 = 0;
		System.out.println("y4: ");
		y4 = input.nextFloat();

		float v1 = (x4 - x3) * (y1 - y3) - (x1 - x3) * (y4 - y3);
		float v2 = (x4 - x3) * (y2 - y3) - (x2 - x3) * (y4 - y3);
		float v3 = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
		float v4 = (x2 - x1) * (y4 - y1) - (x4 - x1) * (y2 - y1);

		if ((v1 * v2 < 0) || (v3 * v4 < 0)) {
			System.out.println("Cross");
		} else {
			System.out.println("Do not cross");
		}

		input.close();
	}

}