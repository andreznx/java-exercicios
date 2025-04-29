/*******************************************************************************
 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
 * com 365 dias e mês com 30 dias.
 *******************************************************************************/

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, meses, dias, anoEmDias, mesEmDias, totalIdade;
        int ano = 365;
        int mes = 30;

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite quantos meses: ");
        meses = entrada.nextInt();

        System.out.println("Digite a quantidade em dias: ");
        dias = entrada.nextInt();

        anoEmDias = idade * ano;
        mesEmDias = meses * mes;
        totalIdade = anoEmDias + mesEmDias + dias;

        System.out.println("A sua idade em dias é de: " + totalIdade + " dias");
    }
}

