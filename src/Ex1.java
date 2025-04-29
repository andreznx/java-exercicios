/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdMin, qtdMax;
        double estoqueMedio;

        System.out.println("Digite a quantidade minima da peça: ");
        qtdMin = entrada.nextInt();

        System.out.println("Digite a quantidade maxima da peça: ");
        qtdMax = entrada.nextInt();

        estoqueMedio = (qtdMin + qtdMax) / 2;

        System.out.println("Estoque médio da peça: " + estoqueMedio);
    }
}
