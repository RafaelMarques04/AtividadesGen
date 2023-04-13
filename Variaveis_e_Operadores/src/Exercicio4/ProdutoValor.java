package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoValor {

	public static void variaveis(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva o Primeiro Valor: ");
		float valor1 = leia.nextFloat();
		System.out.println("\nEscreva o Segundo Valor: ");
		float valor2 = leia.nextFloat();
		System.out.println("\nEscrava o Terceiro Valor: ");
		float valor3 = leia.nextFloat();
		System.out.println("\nEscreva o Quarto Valor: ");
		float valor4 = leia.nextFloat();

		float diferençaProduto = (valor1 * valor2) - (valor3 * valor4);

		System.out.printf("\nResultado da Diferença do Produto: %.1f", diferençaProduto);

		leia.close();

	}

}
