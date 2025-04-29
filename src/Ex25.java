/*******************************************************************************
 * 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
 * programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * (h = altura)
 *   - Para homens: (72.7*h) - 58
 *   - Para mulheres: (62.1 *h) - 44.7
 *******************************************************************************/

import java.util.Scanner;

class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, pesoIdeal, h;
        String sexo;

        System.out.println("Digite a sua altura:");
        altura = entrada.nextDouble();

        System.out.println("Digite o seu sexo: (Masculino, Feminino)");
        sexo = entrada.next();

        if (sexo.equalsIgnoreCase("Masculino")){
            h = altura;
            pesoIdeal = (72.7*h) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
        } else if(sexo.equalsIgnoreCase( "Feminino")) {
            h = altura;
            pesoIdeal = (62.1*h) -44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
        } else {
            System.out.println("Houve um erro na escolha do sexo.");
        }
    }
}