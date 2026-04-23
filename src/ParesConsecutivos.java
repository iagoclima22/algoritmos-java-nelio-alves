import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		int soma;
		while (n != 0) {
			if (n % 2 == 0) {
				soma = 5 * n + 20;
			}
			else {
				soma = 5 * n + 25;
			}
			System.out.println("SOMA = " + soma);
			
			System.out.print("Digite um numero inteiro: ");
			n = sc.nextInt();
		}
		

		
		sc.close();
	}
}
