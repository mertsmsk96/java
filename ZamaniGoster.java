package bolum02;

import java.util.Scanner;

public class ZamaniGoster {
	public static void main(String[] args) {
		System.out.println("Saniye cinsinden bir tam sayi giriniz: ");
		
		Scanner klavye = new Scanner(System.in);
		
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir");
	}
}
