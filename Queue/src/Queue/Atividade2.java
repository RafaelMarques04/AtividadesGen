package Queue;

import java.util.*;

public abstract class Atividade2 {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1 - Adicionar novo livro na pilha");
			System.out.println("2 - Listar todos os livros na pilha");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair");
			System.out.print("Digite a opção desejada: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				scanner.nextLine();
				String nomeLivro = scanner.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("Livro adicionado na pilha.");
				break;
			case 2:
				System.out.println("Livros na pilha:");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println("Livro retirado da pilha: " + livroRetirado);
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
		scanner.close();
	}
}