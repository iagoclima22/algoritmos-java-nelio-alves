import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.0) {
			aumento = 0.20 * salario;
			porcentagem = 20;
		}
		else if (salario <= 3000.0) {
			aumento = 0.15 * salario;
			porcentagem = 15;
		}
		else if (salario <= 8000.0) {
			aumento = 0.10 * salario;
			porcentagem = 10;
		}
		else {
			aumento = 0.05 * salario;
			porcentagem = 5;
		}
		
		novoSalario = salario + aumento;
		
		System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.printf("Porcentagem = %d %% %n", porcentagem);
		
		sc.close();
	}

}
