package bolum02;

import java.util.Scanner;

public class FahrenaytdanDereceyeCevir {
	public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			
			System.out.println("Dereceye donusturulmesi icin bir fahrenayt giriniz: ");
			
			int fahrenayt = klavye.nextInt();
			
			double derece = ((double)5 / 9) * (fahrenayt - 32);
			
			System.out.println(fahrenayt + " fahrenayt = " + derece + " derecedir.");
	}

}
