/*******************************************************************************
 * 39) Faça um programa que leia um número inteiro e mostre uma mensagem
 * indicando se este número é par ou ímpar, e se é positivo ou negativo. O
 * programa só deve parar de rodar quando o usuário responder "S" na seguinte
 * pergunta, "Deseja encerrar o programa?" .
 *******************************************************************************/

import java.util.Scanner;
public class Ex39 {
    public static void main(String[] args) {
        int numero;
        boolean encerrar = false;
        String charOpcao;
        Scanner entrada = new Scanner(System.in);

        while(encerrar == false) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if(numero%2==0) {
                System.out.println("Esse número é par.");
            } else {
                System.out.println("Esse número é impar.");
            }

            if (numero >= 0) {
                System.out.println("Esse número é positivo.");
            } else {
                System.out.println("Esse número é negativo.");
            }
            System.out.println("Desseja encerrar o programa? (S/N)");
            charOpcao = entrada.next();
            if(charOpcao.equalsIgnoreCase("S")) {
                encerrar = true;
            }
        }
    }
}
