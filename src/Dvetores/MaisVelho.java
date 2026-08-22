package Dvetores;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a passeoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int idadeMaior = idade[0];
        String maisVelha = nome[0];
        for (int i = 0; i < n; i++) {
            if (idade[i] > idadeMaior) {
                idadeMaior = idade[i];
                maisVelha = nome[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + maisVelha);

        sc.close();
    }
}
