package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idd = 0, x21 = 0, y50 = 0;
		
		while (idd >= 0) {

			System.out.println("Digite uma Idade: ");
			idd = ler.nextInt();

			if (idd >= 1 && idd < 21) {
				x21++;

			} else if (idd > 50) {
				y50++;

			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + x21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + y50);

		ler.close();

	}
}