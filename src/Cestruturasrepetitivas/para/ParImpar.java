package Cestruturasrepetitivas.para;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int x;
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            x = sc.nextInt();
            if (x % 2 == 0 && x < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (x % 2 == 0 && x > 0) {
                System.out.println("PAR POSITIVO");
            } else if (x % 2 != 0 && x < 0) {
                System.out.println("ÍMPAR NEGATIVO");
            } else if (x % 2 != 0 && x > 0) {
                System.out.println("ÍMPAR POSITIVO");
            } else {
                System.out.println("NULO");
            }
        }

        sc.close();
    }
}
