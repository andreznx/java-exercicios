/*******************************************************************************
 * 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada
 * uma delas:
 *		1 – Adição
 *		2 – Subtração
 *		3 – Multiplicação
 *		4 – Divisão
 *******************************************************************************/

import java.util.Scanner;

class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado;
        int menu;

        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextDouble();

        System.out.println("Menu:");
        System.out.println("1: Adição.");
        System.out.println("2: Subtração.");
        System.out.println("3: Multiplicação.");
        System.out.println("4: Divisão.");
        System.out.println("Digite o número da operação:");
        menu = entrada.nextInt();
        switch (menu){
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da Adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da Subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("O resultado da Divisão é: " + resultado);
                break;
            default:
                System.out.println("Houve um erro na digitação do menu.");
        }

    }
}