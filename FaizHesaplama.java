package bolum02;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Yıllık faiz oranını giriniz: (Ör. 4.5) ");
		double yillikFaizOrani = klavye.nextDouble();
		
		System.out.println("Kaç yılda ödemek istiyorsunuz: (Ör. 5) ");
		int yil = klavye.nextInt();
		
		System.out.println("Borç alınacak miktar: (Ör. 1567,98) ");
		double borcMiktari = klavye.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12))); 
		
		double toplamBorc = aylikOdemeMiktari * 12 * yil;
		
		System.out.println("Aylik ödeme miktari: " + (int)(aylikOdemeMiktari * 100) / 100.0);
		System.out.println("Toplam ödenecek miktar: " + (int)(toplamBorc * 100) / 100.0);
	}
}
