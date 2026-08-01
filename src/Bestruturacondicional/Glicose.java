package Bestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();
        if (glicose <= 100) {
            System.out.println("Classificação: normal");
        } else if (glicose <= 140) {
            System.out.println("Classificação: elevado");
        } else {
            System.out.println("Classificação: diabetes");
        }

        sc.close();
    }
}