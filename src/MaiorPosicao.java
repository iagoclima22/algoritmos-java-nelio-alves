import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double maiorValor = vet[0];
		int posMaiorValor = 0;
		
		for (int i=0; i<vet.length; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				posMaiorValor = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);
		System.out.print("POSICAO DO MAIOR VALOR = " + posMaiorValor);
		
		sc.close();
	}

}
