package bolum02;

public class TurDonusturme {
	public static void main(String[] args) {
		int i = 5;
		
		long l;
		
		
		l = i;
		
		i = (int)l;
		
		System.out.println(i);
		System.out.println(l);
		
		l = 2148000000L;
		i = (int)l;
		
		System.out.println(i);
		System.out.println(l);
		
		
		int sayi = 2_147_483_647;
		
		sayi = sayi + 1;
		System.out.println(sayi);
		
		byte b = 127;
		b++;
		System.out.println(b);
		
		sayi = (int)(3 * 5L);
		
		System.out.println((int)1.7);
		
		System.out.println(sayi);
		
		sayi += 4.5; // sayi = (int)(sayi + 4.5).
		
		System.out.println(sayi);
		
		
	}

}
