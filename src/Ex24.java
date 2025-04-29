/*******************************************************************************
 * 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
 * realizar:
 * 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 * 2 – Verificar se os dois números lidos são pares
 * 3 – Verificar se a média dos dois números é maior ou igual a 7.
 * 4 – Sair
 *******************************************************************************/

import java.util.Scanner;

class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, par1, par2;
        double media, multiplo;
        int opcao;

        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextInt();

        System.out.println("Digite uma opção abaixo:");
        System.out.println("1: Verificar se um dos números lidos é ou não multiplo do outro.");
        System.out.println("2: Verificar se dois números lidos são pares.");
        System.out.println("3: Verificar se a média dos dois números  é maior ou igual a 7.");

        opcao = entrada.nextInt();
        switch(opcao) {
            case 1:
                multiplo = num1 / num2;
                if (multiplo == 0) {
                    System.out.println("O número 1 é multiplo do número 2.");
                } else {
                    System.out.println("O número 1 não é multiplo do número 2.");
                }
                break;

            case 2:
                par1 = num1 % 2;
                par2 = num2 % 2;
                if(par1 == 0 && par2 == 0) {
                    System.out.println("Os números " + num1 + " e " + num2 + " são pares.");
                } else {
                    System.out.println("Os números " + num1 + " e " + num2 + " não são pares.");
                }
                break;

            case 3:
                media = (num1 + num2) / 2;
                if (media >= 7) {
                    System.out.println("A média dos números " + num1 + " e " + num2 + " é igual ou maior a 7.");
                    System.out.println("Média: " + media);
                }
                break;

        }
    }
}