package tr.org.linux.kamp.asal;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz!");
		int sayi = input.nextInt();

		for (int i = 2; i <= sayi; i++) {
			boolean tut = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					tut = false;
				}
			}
			if (tut == true) {
				System.out.println(i);
			}
		}

		input.close();
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int count = input.nextInt();
		int loop = 0;
		int num = 2;
		boolean isPrime = true;

		while (loop < count) {
			isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;

				}
			}

			if (isPrime) {
				loop++;
				System.out.print(num + " ");
			}
			num++;

		}
		input.close();

	}

}
