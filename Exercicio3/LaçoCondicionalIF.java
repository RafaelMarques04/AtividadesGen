package Exercicio3;

import java.util.Scanner;

public class LaçoCondicionalIF {
	
	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);

        System.out.printf("Digite o Nome do doador: ");
        String nome = ler.nextLine();

        System.out.printf("\nDigite a Idade do doador: ");
        int idade = ler.nextInt();

        System.out.printf("\nPrimeira doação de sangue? ");
        boolean primeiraDoacao = ler.nextBoolean();

        if (idade >= 18 && idade <= 69) {
        if (idade >= 60 && primeiraDoacao) {
        	
                System.out.println(nome + " não está apto para doar sangue! ");
        } else {
                System.out.println(nome + " está apto para doar sangue! ");  
        }
        
        } else {
            	System.out.println(nome + "\nNão está apto para doar sangue!");
        }
        
		ler.close();
	}

}
