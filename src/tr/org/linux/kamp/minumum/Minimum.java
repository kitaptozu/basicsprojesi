package tr.org.linux.kamp.minumum;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen 2 adet sayı girniz!");

		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double result = minimum(number1, number2);

		System.out.println("Minimum sayı: " + result);

		input.close();
	}

	public static double minimum(double x, double y) {
		double mini = x;

		if (mini > y)
			mini = y;

		return mini;

	}

}
