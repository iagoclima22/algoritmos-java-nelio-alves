package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        double pagar;
        if (minutos <= 100) {
            pagar = 50.0;
        } else {
            pagar = 50.0 + (minutos - 100) * 2;
        }
        System.out.printf("Valor a pagar = R$ %.2f", pagar);

        sc.close();
    }
}