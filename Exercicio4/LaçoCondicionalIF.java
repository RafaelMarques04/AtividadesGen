package Exercicio4;

import java.util.Scanner;

public class LaçoCondicionalIF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String plv1, plv2, plv3;

		System.out.print("Digite a Primeira Palavra: ");
		plv1 = ler.nextLine();

		System.out.print("Digite a Segunda Palavra: ");
		plv2 = ler.nextLine();

		System.out.print("Digite a Terceira Palavra: ");
		plv3 = ler.nextLine();

		if (plv1.equalsIgnoreCase("Vertebrado")) {
			if (plv2.equalsIgnoreCase("Ave")) {
				if (plv3.equalsIgnoreCase("Carnivoro")) {
					System.out.printf("Águia");
				} else if (plv3.equalsIgnoreCase("Onívoro")) {
					System.out.printf("Pomba");
				}
			} else if (plv2.equalsIgnoreCase("Mamífero")) {
				if (plv3.equalsIgnoreCase("Onívoro")) {
					System.out.printf("Homem");
				} else if (plv3.equalsIgnoreCase("Herbivoro")) {
					System.out.printf("Vaca");
				}
			}
		} else if (plv1.equalsIgnoreCase("Invertebrado")) {
			if (plv2.equalsIgnoreCase("Inseto")) {
				if (plv3.equalsIgnoreCase("Hematofago")) {
					System.out.printf("Pulga");
				} else if (plv3.equalsIgnoreCase("Herbivoro")) {
					System.out.printf("Lagarta");
				}
			} else if (plv2.equalsIgnoreCase("Anelideo")) {
				if (plv3.equalsIgnoreCase("Hematofago")) {
					System.out.printf("Sanguessuga");
				} else if (plv3.equalsIgnoreCase("Onívoro")) {
					System.out.printf("Minhoca");
					
					ler.close();
				}
			}
		}
	}
}
