package Collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercício2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número que você deseja encontrar: ");
		int numero = ler.nextInt();

		int posicaoNumero = numeros.indexOf(numero);

		if (posicaoNumero != -1) {
			System.out.println("O número " + numero + " está na posição " + posicaoNumero + " da ArrayList.");
		} else {
			System.out.println("O número " + numero + " não foi encontrado na ArrayList.");
		}
		ler.close();
	}
}