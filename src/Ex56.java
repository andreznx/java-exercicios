/*******************************************************************************
 * 56) Fazer um programa para ler um vetor de inteiros positivos de 50 posições.
 * Imprimir a quantidade de números pares e de múltiplos de 5.
 *******************************************************************************/

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contPar = 0, contMultiplo = 0;

        int[] vetor = new int[50];


        for (int i = 0; i < 50; i++){
            System.out.println("Armazene o número " + (i+1) + " : ");
            vetor[i] = entrada.nextInt();

            if (vetor[i] %2==0) {
                contPar++;
            }

            if (vetor[i] %5==0){
                contMultiplo++;
            }
        }
        System.out.println("Quantidades de números pares armazenados: " + contPar);
        System.out.println("Quantidade de números multiplos de 5 armazenados: " + contMultiplo);
    }
}
