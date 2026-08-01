package Bestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as três distâncias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double maior;
        if (d1 > d2 && d2 > d3) {
            maior = d1;
        } else if (d2 > d3) {
            maior = d2;
        } else {
            maior = d3;
        }
        System.out.printf("MAIOR DISTANCIA = %.2f", maior);

        sc.close();
    }
}
