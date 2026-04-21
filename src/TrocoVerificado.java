import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiroRecebido, troco, valorTotal;
		int qtd;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		valorTotal = preco * qtd;
		
		if (dinheiroRecebido >= valorTotal) {
			troco = dinheiroRecebido - valorTotal;
			System.out.printf("TROCO = %.2f%n", troco);
		} else {
			double falta = valorTotal - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", falta);
		}
		
		sc.close();
	}
}
