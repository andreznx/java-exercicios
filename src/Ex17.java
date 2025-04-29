/*******************************************************************************
 * 16) Escreva um programa que leia dois números e exiba mensagem informando o
 * valor do maior número e o valor do menor número. Se os dois números forem
 * iguais, o programa deve exibir mensagem informando este fato.
 *******************************************************************************/

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, maior, menor;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            maior = num1;
            menor = num2;

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else if (num2 > num1){
            maior = num2;
            menor = num1;

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else if(num1 == num2) {
            System.out.println("O número 1: " + num1 + " e o número 2: " + num2 + " são iguais");
        } else {
            System.out.println("Aconteceu algum erro.");
        }
    }
}

