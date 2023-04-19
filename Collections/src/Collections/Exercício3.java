package Collections;

import java.util.*;

public class Exercício3 {
	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Scanner ler = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número inteiro não repetido: ");
			int numero = ler.nextInt();
		}

		System.out.println("Elementos do Set:");
		Iterator<Integer> iterator1 = numeros.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
			ler.close();

		}
	}
}
