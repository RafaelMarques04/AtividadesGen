package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, x;
		
		System.out.print("Escreva o 1º Número: ");
		n1 = ler.nextInt();
		System.out.print("\nEscreva o 2º Número: ");
		n2 = ler.nextInt();
		
		if (n1 >= n2) {	
			
		System.out.printf("\nO intervalo é Inválido! ");
		return;
		
		}
		
		System.out.printf("\nNo Intervalo entre " + n1 + " e " + n2 + ":");
		
		for (x = n1; x <= n2; x++) {
			
			if (x % 3 == 0 && x % 5 == 0) {
				
				System.out.println (x + " é múltiplo de 3 e 5");
				
				
				}
			}
		}
	}

