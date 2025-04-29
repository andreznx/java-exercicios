/*******************************************************************************
 * 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
 *   O módulo de um número x é:
 *   x se x é maior ou igual a zero
 *   x * (-1) se x é menor que zero
 *******************************************************************************/

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, modulo;

        System.out.println("Digite um número inteiro: ");
        num1 = entrada.nextInt();

        if (num1 >= 0) {
            modulo = num1;
            System.out.println("Opcao 1: " + modulo);
        } else if (num1 <= 0) {
            modulo = num1 * -1;
            System.out.println("Opcao 2: " + modulo);
        }
    }
}

