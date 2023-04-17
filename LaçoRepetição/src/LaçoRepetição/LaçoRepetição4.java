package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idd, sx, ctgr, nmrBackend = 0, nmrMulheresFrontend = 0, nmrHomensMobileMaiores40 = 0,
				nmrMulheresFullStackMenores30 = 0;
		char x = 's';

		while (x == 's' || x == 'S') {
			System.out.print("Digite a idade do colaborador: ");
			idd = ler.nextInt();

			System.out.print("Digite o sexo do colaborador ");
		    System.out.print("\n1-Masculino\n2-Feminino\n3-Outros ");
			sx = ler.nextInt();

			System.out.print("Digite a categoria do colaborador: ");
			System.out.print("\n1-Backend\n2-FrontEnd\n3-Mobile\n4-FullStack ");
			ctgr = ler.nextInt();

			if (ctgr == 1) {
				nmrBackend++;
			} else if (ctgr == 2 && sx == 2) {
				nmrMulheresFrontend++;
			} else if (ctgr == 3 && sx == 1 && idd > 40) {
				nmrHomensMobileMaiores40++;
			} else if (ctgr == 4 && sx == 2 && idd < 30) {
				nmrMulheresFullStackMenores30++;
			}

			System.out.print("Deseja continuar a leitura de dados de um novo colaborador? (S/N): ");
			x = ler.next().charAt(0);
		}

		System.out.println("Número de pessoas desenvolvedoras Backend: " + nmrBackend);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + nmrMulheresFrontend);
		System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + nmrHomensMobileMaiores40);
		System.out.println(
				"Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + nmrMulheresFullStackMenores30);

		ler.close();

	}
}