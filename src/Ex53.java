/*******************************************************************************
 * 53) Durante uma corrida de automóveis com N voltas de duração foram anotados
 * para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
 * programa para ler os tempos das N voltas, calcular e imprimir:
 * 	i. melhor tempo;
 * 	ii. a volta em que o melhor tempo ocorreu;
 * 	iii. tempo médio das N voltas;
 *******************************************************************************/

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeVoltas = 5;
        double somaVoltas = 0;
        double melhorTempo;
        int melhorVolta = 1;

        double[] tempoVolta = new double[quantidadeVoltas];

        for (int i = 0; i < quantidadeVoltas; i++) {
            System.out.println("Digite o seu tempo na volta " + (i + 1) + " :");
            tempoVolta[i] = entrada.nextDouble();
            somaVoltas += tempoVolta[i];
        }

        melhorTempo = tempoVolta[0]; // inicializa com a primeira volta

        for (int i = 1; i < quantidadeVoltas; i++) {
            if (tempoVolta[i] < melhorTempo) {
                melhorTempo = tempoVolta[i];
                melhorVolta = i + 1;
            }
        }

        double mediaVoltas = somaVoltas / quantidadeVoltas;

        System.out.println("Seu melhor tempo foi de: " + melhorTempo + " segundos.");
        System.out.println("Melhor volta: " + melhorVolta);
        System.out.println("Tempo médio: " + mediaVoltas);

        entrada.close();
    }
}

