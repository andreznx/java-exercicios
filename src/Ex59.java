/*******************************************************************************
 * 59) Escreva um programa que solicite dois caracteres de A a Z ao usuário e
 * imprima o número de caracteres existente entre eles. Assuma que o usuário
 * digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir
 * mensagem de erro.
 * Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9
 *******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Ex59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] alfabeto = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        System.out.println("Digite o primeiro caractere: ");
        char caracter = entrada.nextLine().toLowerCase().charAt(0);
        int primeiroCaracter = ChecarCaracter(caracter, alfabeto);

        System.out.println("Digite o segundo caractere: ");
        char outroCaracter = entrada.nextLine().toLowerCase().charAt(0);
        int segundoCaracter = ChecarCaracter(outroCaracter, alfabeto);

        int diferenca = segundoCaracter - primeiroCaracter - 1;

        if (primeiroCaracter >= 0 && segundoCaracter >= 0 && diferenca >= 0) {
            System.out.println("O número de caracteres entre eles é: " + diferenca);
        } else {
            System.out.println("Erro! Caracteres fora de ordem ou inválidos.");
        }
    }

    public static int ChecarCaracter(char ch, char[] alfabeto) {
        int numero = -1;
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == ch) {
                numero = i;
                break;
            }
        }
        return numero;
    }
}