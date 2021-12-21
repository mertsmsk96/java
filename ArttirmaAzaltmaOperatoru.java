package bolum02;

public class ArttirmaAzaltmaOperatoru {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		i++; // i becomes 4 i = i + 1; yada i += 1;
		j--; // j becomes 2 j = j - 1; yada j -= 1;
		
		System.out.println(i);
		
		System.out.println(j);
		
		
		i = 3;
		j = 3;
		++i; // i becomes 4
		--j; // j becomes 2
		
		System.out.println(i);
		
		System.out.println(j);
		
		
		int var = 10;
		
		int a = var;
		
		System.out.println(a);
		
		var = 5;
		
		System.out.println(a);
		
		a = ++var;
		
		System.out.println("a: " + a);
		System.out.println("var: " + var);
		
		i = 5;
		j = ++i + i++ + ++i + ++i;
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
