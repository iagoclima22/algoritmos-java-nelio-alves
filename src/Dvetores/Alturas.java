package Dvetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        System.out.println();

        double somaAltura = 0.0;
        for (int i = 0; i < n; i++) {
            somaAltura += altura[i];
        }
        double mediaAltura = somaAltura / n;
        System.out.printf("Altura média = %.2f%% %n", mediaAltura);

        int somaMenor16 = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                somaMenor16++;
            }
        }
        double percMenor16 = somaMenor16 * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percMenor16);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
