package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetiçao6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero, soma = 0, contador = 0;
		double media;

		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador == 0) {
			System.out.println("Não foi digitado nenhum número múltiplo de 3.");
		} else {
			media = (double) soma / contador;
			System.out.println("A média dos números múltiplos de 3 é: " + media);

			ler.close();

		}
	}
}