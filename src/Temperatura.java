import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char escala;
		double f, c;
		
		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);
		if (escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			c = 5.0 / 9.0 * (f - 32);
			System.out.printf("Temperatura equivalente em Celsius: %.2f", c);
		}
		else if (escala == 'C') {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = c * 9 / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", f);
		}
		
		sc.close();
	}

}
