import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valor;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		switch (codigo) {
			case 1:
				valor = 5.0 * qtd;
				System.out.printf("Valor a pagar: R$ %.2f", valor);
				break;
			case 2:
				valor = 3.50 * qtd;
				System.out.printf("Valor a pagar: R$ %.2f", valor);
				break;
			case 3:
				valor = 4.80 * qtd;
				System.out.printf("Valor a pagar: R$ %.2f", valor);
				break;
			case 4:
				valor = 8.90 * qtd;
				System.out.printf("Valor a pagar: R$ %.2f", valor);
				break;
			case 5:
				valor = 7.32 * qtd;
				System.out.printf("Valor a pagar: R$ %.2f", valor);
				break;
			default:
				System.out.println("Valor inválido");
		}
		
		sc.close();
	}

}
