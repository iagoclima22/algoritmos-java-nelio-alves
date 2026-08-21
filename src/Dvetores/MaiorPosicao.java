package Dvetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maiorValor = vet[0];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] > maiorValor) {
                maiorValor = vet[i];
                posicao = i;
            }
        }
        System.out.printf("%nMAIOR VALOR = %.2f%n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);

        sc.close();
    }
}
