import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int somaPar = 0;
		int contPar = 0;
		for (int i = 0; i<vet.length; i++) {
			if (vet[i] % 2 == 0) {
				somaPar += vet[i];
				contPar++;
			}
		}	
		
		if (contPar != 0) {
			double mediaPar = (double) somaPar / contPar;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPar);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}		
		
		sc.close();
	}
}
