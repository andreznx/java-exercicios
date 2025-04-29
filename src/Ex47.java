/*******************************************************************************
 * 47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
 * inteiro, também positivo e maior que zero. Faça um programa para:
 * 		a. ler pelo teclado o vetor;
 * 		b. ler pelo teclado o número X;
 * 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
 *******************************************************************************/

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade = 10, x;

        System.out.println("Armazene um valor para x: ");
        x = entrada.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Armazene o número " + (i + 1) + " do vetor:");
            vetor[i] = entrada.nextInt();
        }

        int maiores = 0, menores = 0, iguais = 0;
        for(int i = 0; i < quantidade; i++) {
            if (vetor[i] > x){
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Quantidade de números maiores que X: " + maiores);
        System.out.println("Quantidade de números menores que X: " + menores);
        System.out.println("Quantidade de números iguais que X: " + iguais);
    }
}