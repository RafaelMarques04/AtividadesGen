package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Escreva seu Salario: ");
		float salario = leia.nextFloat();

		System.out.print("\nEscreva seu Abono: ");
		float abono = leia.nextFloat();

		float novoSalario = salario + abono;

		System.out.printf("\nSeu novo salario: %.2f%n", novoSalario);

		leia.close();
	}

}
