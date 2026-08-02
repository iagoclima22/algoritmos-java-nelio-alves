package Bestruturacondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2 && n1 % n2 == 0) {
            System.out.println("São multíplos");
        } else if (n2 > n1 && n2 % n1 == 0) {
            System.out.println("São multíplos");
        } else {
            System.out.println("Não são multíplos");
        }

        sc.close();
    }
}
