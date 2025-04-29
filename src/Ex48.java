/*******************************************************************************
 * 48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
 * encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
 * uma campanha publicitária milionária de produtos de beleza. Foram inscritas
 * 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
 * foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
 * vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
 * a campanha milionária.
 *******************************************************************************/

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];

        System.out.println("Cadastro de Candidatas");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da candidata " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Digite a idade da candidata " + (i + 1) + ": ");
            idades[i] = entrada.nextInt();
        }

        System.out.println("\nCandidatas Aprovadas (idade entre 18 e 20 anos)");
        boolean encontrouAptas = false;

        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println("- " + nomes[i] + " (" + idades[i] + " anos)");
                encontrouAptas = true;
            }
        }

        if (!encontrouAptas) {
            System.out.println("Nenhuma candidata foi aprovada para a campanha.");
        }
    }
}
