package bolum02;

import java.util.Scanner;

public class EkrandanSayiOkuma {
	public static void main(String[] volkan) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		
		int sayi = klavye.nextInt();
		
		System.out.println("Girdiginiz sayi: " + sayi);
	}

}
