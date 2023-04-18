package Array;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.print("Digite o número que você deseja encontrar: ");
		int num = ler.nextInt();

		boolean encontrado = false;
		int posicao = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] == num) {
				encontrado = true;
				posicao = i;
				break;
			}
		}

		if (encontrado) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + num + " não foi encontrado!");

			ler.close();

		}
	}
}
