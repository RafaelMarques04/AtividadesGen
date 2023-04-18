package Array;

import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Informe o elemento [" + x + "][" + y + "]: ");
                matriz[x][y] = ler.nextInt();
            }
        }

        System.out.printf("\n\nElementos da Diagonal Principal:" );
        for (int x = 0; x < 3; x++) {
            System.out.print(matriz[x][x] + " " );
            somaDiagonalPrincipal += matriz[x][x];
        }

        System.out.printf("\n\nElementos da Diagonal Secundária:" );
        for (int x = 0; x < 3; x++) {
            System.out.print(matriz[x][2 - x] + " ");
            somaDiagonalSecundaria += matriz[x][2 - x];
        }

        System.out.printf("\n\nSoma dos Elementos da Diagonal Principal:" );
        System.out.println(somaDiagonalPrincipal);

        System.out.printf("\nSoma dos Elementos da Diagonal Secundária:" );
        System.out.print(somaDiagonalSecundaria);
        
        ler.close();
        
	}
}