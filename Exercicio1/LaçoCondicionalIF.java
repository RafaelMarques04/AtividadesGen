package Exercicio1;

import java.util.Scanner;

public class LaçoCondicionalIF {

	public static void main(String[] args) {

		int valora, valorb, valorc, soma1;

		Scanner ler = new Scanner(System.in);

		System.out.print("\nDigite o Valor de A: ");
		valora = ler.nextInt();

		System.out.print("\nDigite o Valor de B: ");
		valorb = ler.nextInt();

		System.out.print("\nDigite o Valor de C: ");
		valorc = ler.nextInt();

		int soma = valora + valorb;

		if (soma > valorc) {
			System.out.println(soma + " > " + valorc);
			System.out.println("\nA Soma de A + B é Maior do que C");

		} else if (soma < valorc) {
			System.out.printf(soma + " < " + valorc);
			System.out.printf("\nA Soma de A + B é Menor do que C");

		} else {
			System.out.printf(soma + " = " + valorc);
			System.out.printf("\nA Soma de A + B é Igual a C");

			ler.close();
		}
	}
}