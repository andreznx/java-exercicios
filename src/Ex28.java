/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double quantidadeMinima, quantidadeMaxima, estoqueMedio;

        System.out.println("Calculadora de estoque.");

        System.out.println("Digite a quantidade minima do seu estoque: ");
        quantidadeMinima = entrada.nextDouble();

        System.out.println("Digite a quantidade maxima do seu estoque: ");
        quantidadeMaxima = entrada.nextDouble();

        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("O estoque medio do seu produto é de: " + estoqueMedio);
    }
}