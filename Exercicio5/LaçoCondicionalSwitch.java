package Exercicio5;

import java.util.Scanner;

public class LaçoCondicionalSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int codigo, quantidade;

		System.out.printf("Código do Produto: ");
		codigo = ler.nextInt();

		System.out.print("Quantidade: ");
		quantidade = ler.nextInt();

		double preco;
		String pdt;

		switch (codigo) {
		case 1:
			pdt = "Cachorro Quente";
			preco = 10.00;
			break;
		case 2:
			pdt = "X-Salada";
			preco = 15.00;
			break;
		case 3:
			pdt = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			pdt = "Bauru";
			preco = 12.00;
			break;
		case 5:
			pdt = "Refrigerante";
			preco = 8.00;
			break;
		case 6:
			pdt = "Suco de laranja";
			preco = 13.00;
			break;
		default:
			pdt = "Produto Inválido";
			preco = 0.00;
			break;
		}

		double total = quantidade * preco;

		System.out.println("\nProduto: " + pdt);
		System.out.printf("\nValor total: R$ %.2f", total);

		ler.close();

	}
}
