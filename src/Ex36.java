/*******************************************************************************
 * 36) Faça um programa que leia 10 valores inteiros e positivos e:
 * - Encontre o maior valor
 * - Encontre o menor valor
 * - Calcule a média dos números lidos
 *******************************************************************************/

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int somaNumeros = 0;
        double media;
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++)  {
            System.out.println("Digite o número " +(i+1) + ":");
            numeros[i] = entrada.nextInt();
            somaNumeros += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            } if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        media =  (double) somaNumeros / numeros.length;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("A média dos números é: " + media);

    }
}
