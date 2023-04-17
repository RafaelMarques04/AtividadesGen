package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição5 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int nmr, soma = 0;

		do {
			System.out.print("Digite um número: ");
			nmr = ler.nextInt();

			if (nmr > 0) {
				soma += nmr;
			}

		} while (nmr != 0);

		System.out.println("A soma dos números positivos é: " + soma);
		
		ler.close();
		
	}

}
