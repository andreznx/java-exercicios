/*******************************************************************************
 * 37) Faça um programa de conversão de base numérica. O programa deverá
 * apresentar uma tela de entrada com as seguintes opções:
 *		1 – Adição
 *		2 – Subtração
 *		3 – Multiplicação
 *		4 – Divisão
 * Informe a opção:
 * A partir da opção escolhida, o programa deverá solicitar para que o usuário
 * digite dois números. Em seguida, o programa deve exibir o resultado da opção
 * indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao menu
 * principal. Caso a resposta seja  ́S ́ ou  ́s ́, deverá voltar ao menu, caso
 * contrário deverá encerrar o programa.
 *******************************************************************************/

import java.util.Scanner;

public class Ex37 {
    private static double num1, num2;
    public static void main(String[] args) {
        int opcao = 0;
        double resultado;
        boolean encerrar = false;
        String charOpcao;
        Scanner entrada = new Scanner(System.in);

        while(encerrar == false) {

            System.out.println("Menu de opções");
            System.out.println("\n1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("\nDigite a opção que deseja: ");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    receber_numero();
                    System.out.println("O resultado " + num1 + "+" + num2 + " = " + (num1 + num2));
                    break;

                case 2:
                    receber_numero();
                    System.out.println("O resultado " + num1 + "-" + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    receber_numero();
                    System.out.println("O resultado " + num1 + "*" + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    receber_numero();
                    System.out.println("O resultado " + num1 + "/" + num2 + " = " + (num1 / num2));
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Deseja continuar?(s/n)");
            charOpcao = entrada.next();
            if(charOpcao.equalsIgnoreCase("n")) {
                encerrar = true;
            }
        }
    }

    public static void receber_numero() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();
    }
}
