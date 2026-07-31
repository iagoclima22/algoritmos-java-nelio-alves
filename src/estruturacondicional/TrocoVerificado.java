package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double valorTotal = preco * qtd;
        if (dinheiroRecebido >= valorTotal) {
            double troco = dinheiroRecebido - valorTotal;
            System.out.printf("Troco = %.2f", troco);
        } else {
            double valorFaltante = valorTotal - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", valorFaltante);
        }

        sc.close();
    }
}
