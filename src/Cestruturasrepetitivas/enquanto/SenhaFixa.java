package Cestruturasrepetitivas.enquanto;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002;

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != senhaCorreta) {
            System.out.print("Senha Inválida! Tente novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}