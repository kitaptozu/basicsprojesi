package tr.org.linux.kamp.analysis;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result = 0;

		while (studentCounter <= 10) {

			System.out.println("Lütfen notu giriniz! 1 Geçti,2 Kaldı");
			result = input.nextInt();

			if (result == 1) {
				passes++;
				studentCounter++;
			} else if (result == 2) {
				failures++;
				studentCounter++;
			} else {
				System.out.println("Lütfen 1 ve 2 dışında değer girmeyiniz");
			}

		}
		System.out.println("Geçenler: " + passes + " Kalanlar: " + failures);

		input.close();
	}

}
