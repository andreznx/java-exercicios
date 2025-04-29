/*******************************************************************************
 * 44) Faça um programa que exiba as opções:
 * 	1 – Conversão de Graus Celsius em Graus Fahrenheit
 * 	2 – Conversão de Graus Fahrenheit em Graus Celsius
 * 	3 – Peso ideal do homem
 * 	4 – Peso ideal da mulher
 * O programa só deve encerrar quando o usuário digitar  ́S ́ para a pergunta
 *  “Deseja encerrar o programa?”
 * Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
 *******************************************************************************/

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double C, F, pesoIdeal, resultado, altura;
        double pesoH = 72.7;
        double pesoM = 62.1;
        boolean encerrar = false;
        String charOpcao;
        int opcao;

        while(encerrar == false) {
            System.out.println("Menu de opções:");
            System.out.println("\n1. Conversão em Graus Celsius para Farenheit");
            System.out.println("2. Conversão em Graus Farenheit para Celsius.");
            System.out.println("3. Peso ideal do Homem");
            System.out.println("4. Peso ideal da Mulher");
            System.out.println("\nDigite a opção que deseja:");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor em Graus Celsius para conversão.");
                    C = entrada.nextInt();
                    resultado = (C * 9/5) + 32;
                    System.out.println("Conversão: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o valor em Graus Farenheit para conversão.");
                    F = entrada.nextInt();
                    resultado = (F - 32) * 5/9;
                    System.out.println("Conversão: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite a sua altura:");
                    altura = entrada.nextDouble();

                    pesoIdeal =  pesoH * altura - 58;
                    System.out.println("O seu peso ideal é: " + pesoIdeal);
                    break;
                case 4:
                    System.out.println("Digite a sua altura:");
                    altura = entrada.nextDouble();

                    pesoIdeal = pesoM * altura - 44.7;
                    System.out.println("O seu peso ideal é: " + pesoIdeal);
                    break;
            }
            System.out.println("Deseja encerrar o programa? (S/N)");
            charOpcao = entrada.next();
            if(charOpcao.equalsIgnoreCase("S")){
                encerrar = true;
            }
        }
    }
}
