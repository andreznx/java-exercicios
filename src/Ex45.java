/*******************************************************************************
 * 45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
 * foi realizada a leitura.
 *******************************************************************************/

import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeNumeros;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = entrada.nextInt();
        int[] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número:");
            numeros [i] = entrada.nextInt();
        }
        System.out.println("\nOrdem ao contrária dos números:");
        for (int x = quantidadeNumeros - 1; x >= 0; x--) {
            System.out.println(numeros[x]);
        }
    }
}
