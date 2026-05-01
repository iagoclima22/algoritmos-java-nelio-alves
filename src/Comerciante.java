import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao dugitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] lucro = new double[n];
		double[] percLucro = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			venda[i] = sc.nextDouble();
		}
		
		int abaixoDe10 = 0;
		int entre10e20 = 0;
		int acimaDe20 = 0;
		for (int i=0; i<n; i++) {
			lucro[i] = venda[i] - compra[i];
			percLucro[i] = lucro[i] * 100 / compra[i];
			if (percLucro[i] < 10) {
				abaixoDe10++;
			}
			else if (percLucro[i] <= 20) {
				entre10e20++;
			}
			else {
				acimaDe20++;
			}
		}
		
		double totalCompra = 0;
		double totalVenda = 0;
		for (int i=0; i<n; i++) {
			totalCompra += compra[i];
			totalVenda += venda[i];
		}
		double lucroTotal = totalVenda - totalCompra;
		
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + abaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + entre10e20);
		System.out.println("Lucro acima de 20%: " + acimaDe20);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		;
		sc.close();
	}
}
