package Cestruturasrepetitivas.para;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos você vai digitar? ");
        int n = sc.nextInt();

        double n1, n2, n3, media;
        for (int i=0; i < n; i++) {
            System.out.println("Digite três números:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = (n1*2 + n2*3 + n3*5) / 10.0;
            System.out.printf("MEDIA = %.1f%n", media);
        }

        sc.close();
    }
}
