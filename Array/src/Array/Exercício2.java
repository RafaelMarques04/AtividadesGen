package Array;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = new int[10];

		for (int x = 0; x < vetor.length; x++) {
			System.out.printf("Digite um número inteiro: ");
			vetor[x] = ler.nextInt();
		}

		System.out.println("\nElementos nos índices ímpares: ");
		for (int x = 1; x < vetor.length; x += 2) {
			System.out.print(vetor[x] + " ");
		}

		System.out.println("\n\nElementos pares: ");
		for (int x = 0; x < vetor.length; x++) {
			if (vetor[x] % 2 == 0) {
				System.out.print(vetor[x] + " ");
			}
		}

		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		int media = (int) soma / vetor.length;

		System.out.println("\n\nSoma: " + soma);
		System.out.println("Média: " + media);

		ler.close();

	}
}
