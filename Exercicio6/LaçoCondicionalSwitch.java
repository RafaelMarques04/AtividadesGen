package Exercicio6;

import java.util.Scanner;

public class LaçoCondicionalSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.printf("Digite seu nome: ");
		String nome = ler.nextLine();

		System.out.printf("\nCódigo Cargo: ");
		String cargo = ler.nextLine();

		System.out.printf("\nDigite seu Salário: ");
		float salario = ler.nextFloat();

		float reajuste;
		int codigo = 0;

		switch (codigo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
		default:
			cargo = "Cargo Inválido";
			reajuste = 0.0f;
			break;
		}

		float novoSalario = salario + (reajuste * salario);

		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f\n", novoSalario);
		
		ler.close();
		
	}

}
