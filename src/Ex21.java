/*******************************************************************************
 * 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
 * indicando se este número é positivo ou negativo. Pare a execução do programa
 * quando o usuário requisitar.
 *******************************************************************************/
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros;
        String continuar = "S";
        String parar = "N";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Digite um número:");
            numeros = entrada.nextInt();

            if (numeros >= 0) {
                System.out.println("O número " + numeros + " digitado é positivo.");
            } else {
                System.out.println("O número " + numeros + " digitado é negativo.");
            }

            System.out.println("Deseja continuar? ('S', 'N')");
            continuar = entrada.next();

        }
        entrada.close();
    }
}