package Cestruturasrepetitivas.para;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos de teste serao digitados? ");
        int n = sc.nextInt();

        int quantidade;
        char tipo;
        int total = 0;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            quantidade = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipo = sc.next().charAt(0);
            total += quantidade;
            if (tipo == 'C') {
                coelho += quantidade;
            } else if (tipo == 'R') {
                rato += quantidade;
            } else if (tipo == 'S') {
                sapo += quantidade;
            }
        }

        double percentCoelho = (double) coelho * 100 / total;
        double percentRato = (double) rato * 100 / total;
        double percentSapo = (double) sapo * 100 / total;

        System.out.println();
        System.out.println("RELATÓRIO FINAL:");
        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", coelho);
        System.out.printf("Total de ratos: %d%n", rato);
        System.out.printf("Total de sapos: %d%n", sapo);
        System.out.printf("Percentual de coelhos: %.2f%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f%n", percentRato);
        System.out.printf("Percentual de sapos: %.2f%n", percentSapo);

        sc.close();
    }
}