package bolum02;

public class OrtakHatalar {

	public static void main(String[] args) {
		int value = 2147483647 + 1000;
		
		System.out.println(value);
		
		long l = 3_000_000_000L;
		
		value = (int)l;
		
		System.out.println(value);
		
		System.out.println(l);
		
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		
		boolean b = false;
		System.out.println(b);
	}

}
