/*
6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
* 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
* 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, f;

        System.out.println("Conversão para Fahrenheit");

        System.out.println("Informe a temperatura em graus Celsius: ");
        c = entrada.nextInt();

        f = (9 * c + 160) / 5;

        System.out.println("A conversão de " + c + " Celsius para Fahrenheit é de: " + f);
    }
}

