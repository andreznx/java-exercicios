/*******************************************************************************
 * 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
 * valores em ordem decrescente.
 *******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        int quantidade = 3;
        int[] numeros = new int[quantidade];

        System.out.println("Insira os números inteiros");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o " + (i+1) + " número");
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem decrescente:");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

