/*
7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 		variável C é a temperatura em graus Celsius.

*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c, f;

        System.out.println("Conversão para Celsius");

        System.out.println("Informe a temperatura em Fahrenheit: ");
        f = entrada.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.println("A conversão de " + f + " Fahrenheit para Celsius é de: " + c);
    }
}

