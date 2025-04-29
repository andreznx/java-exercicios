/*******************************************************************************
 * 58) Fazer um programa para armazenar em um vetor, vários números inteiros e
 * positivos e calcular a média. Imprimir também o maior. A quantidade de números
 * lidos será definida pelo usuário.
 *******************************************************************************/

import java.util.Scanner;
public class Ex58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade;
        double soma = 0, media = 0;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite a quantidade de números a ser armazenados: ");
        quantidade = entrada.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            do {
                System.out.println("Armazene o " + (i+1) + " número: ");
                vetor[i] = entrada.nextInt();
                if (vetor[i] < 0){
                    System.out.println("Número inválido, digite um número positivo.");
                }
            } while (vetor[i] <= 0);

            soma += vetor[i];

            media = soma / quantidade;

            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("A média dos números armazenados: " + media);
        System.out.println("Maior número armazenado: " + maior);
    }
}
