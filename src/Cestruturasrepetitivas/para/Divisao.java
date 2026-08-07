package Cestruturasrepetitivas.para;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos você vai digitar? ");
        int n = sc.nextInt();

        int numerador, denominador;
        double divisao;
        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();
            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSÍVEL");
            } else {
                divisao = (double) numerador / denominador;
                System.out.printf("DIVISÃO = %.2f%n", divisao);
            }
        }

        sc.close();
    }
}
