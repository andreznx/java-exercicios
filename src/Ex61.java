/*******************************************************************************
 * 61) Escreva um programa que calcule e retorne o salário atualizado através do
 * método REAJUSTE. O método deve receber o valor do salário e o índice de
 * reajuste.
 *******************************************************************************/

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário atual: ");
        double salarioAtual = entrada.nextDouble();

        System.out.println("Digite a porcentagem do reajuste: ");
        double reajuste = entrada.nextDouble() / 100;

        System.out.println("Seu novo salário é de: " + reajuste(salarioAtual, reajuste));
    }

    public static double reajuste(double salario, double indiceReajuste) {
        double novoSalario = salario + (salario * indiceReajuste);
        return novoSalario;
    }
}
