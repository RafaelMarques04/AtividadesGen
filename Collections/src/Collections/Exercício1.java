package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Entre com uma cor: ");

		for (int x = 0; x < 5; x++) {
			System.out.printf("\nEscreva a %dº cor:  ", x + 1);
			String cor = ler.next();
			cores.add(cor);

		}
		System.out.println("\nCores digitadas: ");
		for (int x = 0; x < cores.size(); x++) {
			System.out.println(cores.get(x));

		}
		Collections.sort(cores);
		System.out.println("\nCores digitas em ordem crescente! ");
		for (int x = 0; x < cores.size(); x++) {
			System.out.println(cores.get(x));

		}

		ler.close();
	}
}
