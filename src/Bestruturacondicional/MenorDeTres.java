package Bestruturacondicional;

import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int n2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int n3 = sc.nextInt();

        int menor;
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        System.out.println("MENOR = " + menor);

        sc.close();
    }
}
