import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("NUMEROS PARES:");
		for (int i=0; i<vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		int contPares = 0;
		for (int i=0; i<vet.length; i++) {
			if (vet[i] % 2 == 0) {
				contPares++;
			}
		}
		System.out.println("QUANTIDADE DE PARES = " + contPares);
		
		sc.close();
	}
}
