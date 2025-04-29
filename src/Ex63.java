/*******************************************************************************
 * 63) Escreva um programa que verifique se um número é par ou ímpar através de
 * um método chamado VERIFICA. O método deverá receber um número inteiro (n) e
 * deverá retornar a mensagem “PAR” ou “ÍMPAR”.
 *******************************************************************************/

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Insira um número: ");
        numero = entrada.nextInt();

        System.out.println("Resultado: " + verifica(numero));
    }

    public static String verifica(int Numero) {

        String resultado;
        if (Numero%2==0){
            resultado = "Par";
        } else {
            resultado = "Impar";
        }
        return resultado;
    }
}
