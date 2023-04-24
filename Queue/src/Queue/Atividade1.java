package Queue;

import java.util.*;

public class Atividade1 {
	public static void main(String[] args) {

		Queue<String> filaClientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Menu: ");
			System.out.println("1 - Adicionar novo cliente na fila ");
			System.out.println("2 - Listar todos os clientes na fila ");
			System.out.println("3 - Chamar (retirar) um cliente da fila ");
			System.out.println("0 - Sair ");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				leia.nextLine();
				String nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente adicionado na fila. ");
				break;
			case 2:
				System.out.println("Clientes na fila: ");
				for (String cliente : filaClientes) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("Fila vazia. ");
				} else {
					String clienteChamado = filaClientes.remove();
					System.out.println("Cliente chamado: " + clienteChamado);
				}
				break;
			case 0:
				System.out.println("Programa finalizado. ");
				break;
			default:
				System.out.println("Opção inválida. ");
				break;
			}
		}
		leia.close();
	}
}
