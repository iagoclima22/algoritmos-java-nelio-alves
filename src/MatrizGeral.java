import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		System.out.println();
		
		double somaPositivos = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] > 0) {
					somaPositivos += mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n%n", somaPositivos);
		
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (i == linha) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("Escolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (j == coluna) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (i==j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					double quadrado = Math.pow(mat[i][j], 2);
					System.out.print(quadrado + " ");
				}
				else {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
