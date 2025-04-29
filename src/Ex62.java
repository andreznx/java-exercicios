/*******************************************************************************
 * Escreva um programa que calcule e retorne o valor da hipotenusa através do
 * método HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo
 * Fórmulas: hipotenusa² = base² + altura²
 *             base x altura
 *    área = -----------------
 *                  2
 *******************************************************************************/

import java.util.Scanner;
public class Ex62 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura;

        System.out.println("Digite o valor da base: ");
        base = entrada.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextDouble();

        System.out.println("O valor da Hipotenusa é: " + hipotenusa(base, altura));
    }

    public static double hipotenusa(double Base, double Altura) {
        double hipotenusa = (Base * Base) + (Altura * Altura);
        hipotenusa = Math.sqrt(hipotenusa);
        return hipotenusa;
    }
}
