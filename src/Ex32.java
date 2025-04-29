/*******************************************************************************
 * 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
 * números inteiros positivos ímpares a partir do número informado pelo usuário menor que 10
 * e maior que zero.
 *******************************************************************************/

import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, resultado = 0, soma;

        System.out.println("Digite um número maior que zero e menor que 10: ");
        num = entrada.nextInt();

        if(num > 0 && num < 10 ) {
            for(int x = num;x < 40+num;x++) {
                if (x % 2 == 1) {
                    resultado += x * x;
                }
            }
            System.out.println("O resultado da soma dos quadrados é: " + resultado);
        }
    }
}
