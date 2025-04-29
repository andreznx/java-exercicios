/*******************************************************************************
 * 52) Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas
 * vezes aparece o número 1, 3 e 4, nesta ordem. O vetor terá no máximo 100
 * posições. Sair do programa quando for digitado -1.
 *******************************************************************************/

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[100];
        int contador = 0;

        System.out.println("Digite números inteiros positivos (digite -1 para encerrar):");
        while (contador < vetor.length) {
            int numero = entrada.nextInt();
            if (numero == -1) {
                break;
            } else if (numero >= 0) {
                vetor[contador] = numero;
                contador++;
            } else {
                System.out.println("Número inválido! Digite um número positivo ou -1 para sair.");
            }
        }

        int count1 = 0, count3 = 0, count4 = 0;

        for (int i = 0; i < contador; i++) {
            if (vetor[i] == 1) {
                count1++;
            } else if (vetor[i] == 3) {
                count3++;
            } else if (vetor[i] == 4) {
                count4++;
            }
        }

        System.out.println("Quantidade de vezes que o número 1 aparece: " + count1);
        System.out.println("Quantidade de vezes que o número 3 aparece: " + count3);
        System.out.println("Quantidade de vezes que o número 4 aparece: " + count4);

        entrada.close();
    }
}