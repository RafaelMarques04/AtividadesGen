package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Nota 1: ");
		nota1 = input.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = input.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = input.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = input.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("\nMédia final: %.1f", media);

	}
}