import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cobaias = 0;
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		int total = 0;
		int quantidade;
		char tipo;
		double percCoelhos, percRatos, percSapos;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			total += quantidade;
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			if (tipo == 'C') {
				coelhos += quantidade;
			}
			else if (tipo == 'R') {
				ratos += quantidade;
			}
			else if (tipo == 'S') {
				sapos += quantidade;
			}
		}
		
		percCoelhos = coelhos * 100.0 / total;
		percRatos = ratos * 100.0 / total;
		percSapos = sapos * 100.0 / total;
		
		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f%n", percCoelhos);
		System.out.printf("Percentual de ratos: %.2f%n", percRatos);
		System.out.printf("Percentual de sapos: %.2f%n", percSapos);
		
		sc.close();
	}
}
