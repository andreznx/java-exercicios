/*******************************************************************************
 * 57) Fazer um programa que leia uma frase e imprima somente as vogais.
 *******************************************************************************/

import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();

        System.out.print("Vogais na frase: ");
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            // Verifica se a letra é uma vogal
            if (letra == 'A' || letra == 'a' ||
                    letra == 'E' || letra == 'e' ||
                    letra == 'I' || letra == 'i' ||
                    letra == 'O' || letra == 'o' ||
                    letra == 'U' || letra == 'u') {

                System.out.print(letra + " ");
            }
        }

        entrada.close(); // Boa prática: fechar o Scanner
    }
}
