/*******************************************************************************
 * 55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a
 * frase sem os espaços em branco.
 * Imprimir também a quantidade de espaços em branco da frase.
 *******************************************************************************/

import java.util.Scanner;

public class Ex55 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        String novaFrase = "";
        int contadorEspacos = 0;

        do {
            System.out.print("Digite sua frase (até 50 caracteres): ");
            frase = entrada.nextLine();
        } while (frase.length() > 50);

        char[] arrayChars = frase.toCharArray();

        for (int x = 0; x < arrayChars.length; x++) {
            if (arrayChars[x] != ' ') {
                novaFrase = novaFrase + arrayChars[x];
            } else {
                contadorEspacos++;
            }
        }

        System.out.println("Nova frase: " + novaFrase);
        System.out.println("Quantidade de espaços em branco: " + contadorEspacos);
    }
}
