/*******************************************************************************
 * 30) Faça um programa para imprimir uma tabuada.
 *******************************************************************************/

import java.util.Scanner;

class Ex30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        System.out.println("\nTabuada do: " + numero);
        for (int i = 0;i <= 10; i++){
            System.out.println(i * numero);
        }
    }
}