/*******************************************************************************
 * 14) Escreva um programa que leia dois números e apresente a diferença do
 * maior para o menor.
 *******************************************************************************/
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, diferenca;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 >= num2) {
            diferenca = num1 - num2;
            System.out.println("A diferença de " + num1 + " para " + num2 + " é de: " + diferenca);
        } else {
            diferenca = num2 - num1;
            System.out.println("A diferença de " + num2 + " para " + num1 + " é de: " + diferenca);
        }
    }
}

