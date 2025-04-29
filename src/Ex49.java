/*******************************************************************************
 * 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
 * Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
 * mesmas posições.
 *******************************************************************************/

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Armazene o número " + (i+1) + " no vetor v1: ");
            v1[i] = entrada.nextInt();

            System.out.println("Armazene o número " + (i+1) + " no vetor v2: ");
            v2[i] = entrada.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < 5; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
                System.out.println("\nNa posição " + (i+1) + ": V1 = " + v1[i] + ", V2 = " + v2[i]);
            }
        }
        System.out.println("Números iguais: " + iguais);
    }
}
