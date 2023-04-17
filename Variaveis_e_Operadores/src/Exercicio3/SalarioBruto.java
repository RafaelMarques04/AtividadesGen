package Exercicio3;

import java.util.Scanner;
import java.util.Locale;

public class SalarioBruto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Escreva seu Salario: ");
		float salarioBruto = leia.nextFloat();
		System.out.print("\nSeu Adicional Noturno: ");
		float adicionalNoturno = leia.nextFloat();
		System.out.print("\nEscreva suas Horas Extras: ");
		float horasExtras = leia.nextFloat();
		System.out.print("\nDesconto: ");
		float descontos = leia.nextFloat();

		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("\nSeu Salario Liquido: %.2f%n", salarioLiquido);

		leia.close();

	}
}
