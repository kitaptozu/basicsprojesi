package tr.org.linux.kamp.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = input.nextInt();

		/*if (sayi > 0) {

			for (int i = 1; i <= sayi; i++) {
				if (i % 3 == 0 && i % 15 != 0) {
					System.out.println(i + " fizz");

				} else if (i % 5 == 0 && i % 15 != 0) {
					System.out.println(i + " buzz");
				} else if (i % 15 == 0) {
					System.out.println(i + " fizzbuzz");
				} else
					continue;

			}

		}
		*/
		if(sayi>0) {
			
			for(int i=0;i<sayi;i++){
				String in ="";
				if(i%3==0) in+="fizz";
				if(i%5==0) in+="buzz";
				System.out.println(in);
			}
		}
		
		
		
		input.close();

	}

}
