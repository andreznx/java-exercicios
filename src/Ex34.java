/*******************************************************************************
 * 34) Escreva um programa que leia um conjunto de números positivos e exiba o
 * menor e o maior. Suporemos que o número de elementos deste conjunto não é
 * conhecido, e que um número negativo será utilizado para sinalizar o fim dos
 * dados.
 *******************************************************************************/

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite números positivos (negativos para encerrar):");

        while (true) {
            numero = entrada.nextInt();

            if (numero < 0) {
                break;
            } if (numero > maior) {
                maior = numero;
            } if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }

        entrada.close();
    }
}
