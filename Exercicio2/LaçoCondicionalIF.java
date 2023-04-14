package Exercicio2;

import java.util.Scanner;

public class LaçoCondicionalIF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um Número: ");
		int nmr = ler.nextInt();

		if (nmr % 2 == 0) {
			System.out.printf("\nO Número " + nmr + " é par! ");
		} else {
			System.out.printf("\nO Número " + nmr + " é ímpar! ");
		}

		if (nmr >= 0) {
			System.out.printf("\ne Positivo! ");
		} else {
			System.out.printf("\ne Negativo! ");

			ler.close();

		}
	}

}
