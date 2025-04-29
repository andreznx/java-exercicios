/*******************************************************************************
 * 54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em
 * C que imprima todos os elementos comuns aos dois vetores.
 *******************************************************************************/
//Não, isso não é um programa em C... apenas especifique o vetor C

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ex54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[8];
        List<Integer> C = new ArrayList<Integer>();

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor do número " + (i + 1) + " para o vetor A: ");
            vetorA[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor do número " + (i + 1) + " para o vetor B: ");
            vetorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j] && !C.contains(vetorA[i])) {
                    C.add(vetorA[i]);
                }
            }
        }

        System.out.println("Números comuns:");
        for (int i = 0; i < C.size(); i++) {
            System.out.println(C.get(i));
        }
    }
}