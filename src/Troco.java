import java.util.Locale;
import java.util.Scanner;

public class Troco {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiroRecebido, troco;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		troco = dinheiroRecebido - preco * quantidade;
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();
	}

}
