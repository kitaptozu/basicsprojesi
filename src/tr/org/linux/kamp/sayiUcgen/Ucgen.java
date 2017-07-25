package tr.org.linux.kamp.sayiUcgen;

import java.util.Scanner;

public class Ucgen {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz!");
		int sayi=input.nextInt();
		int tut=sayi;
		
		for(int i=0;i<tut;i++) {
			
			for(int j=sayi;j>=1;j--) {
				System.out.print(j+"  ");
			}
			for(int j=2;j<=sayi;j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
			sayi--;
		}
		
		
		
		input.close();
		
		
	}
	

}
