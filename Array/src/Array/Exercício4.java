package Array;

import java.util.Locale;
import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);

		int participantes = 10;
		int bimestre = 4;

		double notas[][] = new double[participantes][bimestre];

		for (int x = 0; x < participantes; x++) {
			System.out.printf("Digite as notas dos 4 bimestres do aluno %d: ", x + 1);
			for (int y = 0; y < bimestre; y++) {
				notas[x][y] = ler.nextDouble();
			}
		}

		double medias[] = new double[participantes];

		for (int i = 0; i < participantes; i++) {
			double soma = 0;
			for (int j = 0; j < bimestre; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / bimestre;
		}

		for (int i = 0; i < participantes; i++) {
			System.out.printf("A media do aluno %d e: %.1f\n", i + 1, medias[i]);
			
			ler.close();
			
		}
	}
}
