/*******************************************************************************
 * 35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma
 * mensagem: "Múltiplo de 10".
 *******************************************************************************/

import java.util.Scanner;
public class Ex35 {
    public static void main(String[] args) {
        int numero;

        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i%10==0 ) {
                System.out.println("Multiplo de 10");
            }
        }
    }
}
