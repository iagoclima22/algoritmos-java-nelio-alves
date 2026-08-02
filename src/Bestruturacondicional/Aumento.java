package Bestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();

        double aumento;
        int porcentagem;
        if (salario <= 1000.0) {
            aumento = 0.20 * salario;
            porcentagem = 20;
        } else if (salario <= 3000.0) {
            aumento = 0.15 * salario;
            porcentagem = 15;
        } else if (salario <= 8000.0) {
            aumento = 0.10 * salario;
            porcentagem = 10;
        } else {
            aumento = 0.05 * salario;
            porcentagem = 5;
        }

        double novoSalario = salario + aumento;
        System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %d %%", porcentagem);

        sc.close();
    }
}
