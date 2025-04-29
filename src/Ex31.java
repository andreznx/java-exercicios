/*******************************************************************************
 * 31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número
 * lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos
 * números ímpares lidos. Suporemos que o número de elementos deste conjunto não é
 * conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.
 *******************************************************************************/

import java.util.Scanner;

class Ex31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0, par, quantPar=0, quantImpar=0;



        while(numero >= 0) {
            System.out.println("Digite um número: (Números negativos finalizam))");
            numero = entrada.nextInt();
            if (numero >=0){
                if(numero % 2 == 0) {
                    quantPar += numero;
                } else {
                    quantImpar += numero;
                }
            }
        }
        System.out.println("\nQuantidade de números pares: " + quantPar + " \nQuantidade de números impares: " + quantImpar);
    }
}