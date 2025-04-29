/*******************************************************************************
 * 10) Escrever um programa que leia dois números inteiros e mostre todos os
 * relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis
 * são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 *******************************************************************************/

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        boolean igual=false, naoIgual=false, maior=false, menor=false, maiorOuIgual=false, menorOuIgual=false;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 == num2) igual = true;
        if (num1 != num2) naoIgual = true;
        if (num1 > num2) maior = true;
        if (num1 < num2) menor = true;
        if (num1 >= num2) maiorOuIgual = true;
        if (num1 <= num2) menorOuIgual = true;

        System.out.println("O primeiro número é igual o segundo: " + igual);
        System.out.println("O primeiro numero não é igual o segundo: " + naoIgual);
        System.out.println("O primeiro numero é maior que o segundo: " + maior);
        System.out.println("O primeiro número é menor que o segundo: " + menor);
        System.out.println("O primeiro número é maior ou igual o segundo: " + maiorOuIgual);
        System.out.println("O primeiro número é menor ou igual o segundo: " + menorOuIgual);
    }
}

