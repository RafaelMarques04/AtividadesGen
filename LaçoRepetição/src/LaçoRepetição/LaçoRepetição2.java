package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nmr, pares = 0, impares = 0;

        for (int x = 1; x <= 10; x++) {
        	
            System.out.print("Digite o " + x + "º número: ");
            nmr = ler.nextInt();

            if (nmr % 2 == 0) {
                pares++;
            } else {
                impares++;
                
            }
        }

        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("\nTotal de números ímpares: " + impares);
        
        ler.close();
		
	}
}
