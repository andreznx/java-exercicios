/*******************************************************************************
 * 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor
 * maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler
 * novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
 * menor.
 *******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores[] = new int[3];


        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println("Digite o valor " + (i + 1) + " (maior que zero):");
                valores[i] = entrada.nextInt();
                if (valores[i] > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Por favor, digite um valor maior que zero.");
                }
            }
        }
        Arrays.sort(valores);
        System.out.println("Exibe o menor valor multiplicado pelo maior: " + (valores[0]*valores[2]));
        System.out.println("Exibe o maior valor multiplicado pelo menor: " + (valores[2]/valores[0]));
    }
}

