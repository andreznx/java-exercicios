/*******************************************************************************
 * 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
 * valores de modo que a variável A passe a possuir o valor da variável B, e a
 * variável B passe a possuir o valor da variável A. Apresentar os valores
 * trocados.
 *******************************************************************************/

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, valorTemporario;

        System.out.println("Digite o valor A: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor B: ");
        b = entrada.nextInt();

        valorTemporario = a;
        a = b;
        b = valorTemporario;
        System.out.print("Esse é o valor A: " + a + "\n");
        System.out.print("Esse é o valor B: " + b);
    }
}
