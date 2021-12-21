package bolum02;

import java.util.Scanner;

public class KullaniciGirdisiyleAlanHesapla {
	public static void main(String[] args) {

		Scanner girdi = new Scanner(System.in);
		
		double yaricap;
		double alan;

		// yaricapi oku
		System.out.println("Alani hesaplanacak cemberin yari capini giriniz: ");
		yaricap = girdi.nextDouble();
		
		// alani hesapla
		alan = yaricap * yaricap * 3.14159;
		
		// alani yazdir
		System.out.println("yaricapi " + yaricap + " olan cemberin alani: " + alan + " dir");

	}
}
