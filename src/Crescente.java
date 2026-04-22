import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		do {
			System.out.println("Digite dois numeros:");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("DECRESCENTE!");
			}
			else if (n1 < n2) {
				System.out.println("CRESCENTE!");
			}
		} while (n1 != n2);
		
		sc.close();
	}
}
