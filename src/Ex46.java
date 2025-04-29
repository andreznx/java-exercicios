/*******************************************************************************
 * 46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses
 * vetores. Ou seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].
 *******************************************************************************/

import java.util.Scanner;
public class Ex46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade, resultado = 0;

        System.out.println("Digite a quantidade de números nos vetores:");
        quantidade = entrada.nextInt();

        int[] vetorX = new int[quantidade];
        int[] vetorY = new int[quantidade];

        System.out.println("Vetor X:");
        for (int i = 0; i < quantidade; i ++) {
            System.out.println("Digite o número " + (i+1) + " para o vetor X:");
            vetorX[i] = entrada.nextInt();
        }
        System.out.println("Vetor Y:");
        for(int x = 0; x < quantidade; x++) {
            System.out.println("Digite o número " + (x+1) + " para o vetor Y:");
            vetorY[x] = entrada.nextInt();
        }

        System.out.println("Multiplicação dos vetores: ");
        for (int y = 0; y < quantidade; y++) {
            resultado += vetorX[y] * vetorY[y];
            System.out.println(vetorX[y] + " * " + vetorY[y] + " = " + (vetorX[y]*vetorY[y]));

        }
        System.out.println("Soma dos vetores: " + resultado);
    }
}
