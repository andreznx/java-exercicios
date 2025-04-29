/*******************************************************************************
 * 64) Escreva um programa que deverá ter as seguintes opções:
 * 1 - Carregar Vetor
 * 2 - Listar Vetor
 * 3 - Exibir apenas os números pares do vetor
 * 4 - Exibir apenas os números ímpares do vetor
 * 5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
 * 6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
 * 7 - Sair
 * Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
 *******************************************************************************/

import java.util.Scanner;
public class Ex64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[3];
        int opcao = 0;
        boolean encerrar = true;

        while (encerrar){
            System.out.println("\nMENU:");
            System.out.println("1 - Carregar vetor");
            System.out.println("2 - Mostrar vetor");
            System.out.println("3 - Mostrar números pares");
            System.out.println("4 - Mostrar números impares");
            System.out.println("5 - Quantidade números pares");
            System.out.println("6 - Quantidade números impares");
            System.out.println("7 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    carregarVetor(vetor, entrada);
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    paresVetor(vetor);
                    break;
                case 4:
                    imparesVetor(vetor);
                    break;
                case 5:
                    quantidadePar(vetor);
                    break;
                case 6:
                    quantidadeImpares(vetor);
                    break;
                case 7:
                    encerrar = false;

                default:
                    System.out.println("Número inválido.");
            }
        }
    }

    public static void carregarVetor(int[] vetor, Scanner entrada){
        for(int i = 0; i < 3; i++){
            System.out.println("Armazene o número " + (i+1) + " :");
            vetor[i] = entrada.nextInt();
        }
    }
    public static void listarVetor(int[] vetor) {
        System.out.println("Números armazenados:");
        for (int i = 0; i < 3; i++) {
            System.out.println(vetor[i]);
        }
    }
    public static void paresVetor(int[] vetor){
        System.out.println("Números pares: ");
        boolean encontrou = false;
        for (int num : vetor) {
            if(num%2==0){
                System.out.println(num + " ");
                encontrou = true;
            }
        }
        if(!encontrou) System.out.print("Nenhum número par.");
        System.out.println();
    }

    public static void imparesVetor(int[] vetor) {
        System.out.print("Números ímpares: ");
        boolean encontrou = false;
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                encontrou = true;
            }
        }
        if (!encontrou) System.out.print("Nenhum número ímpar.");
        System.out.println();
    }

    public static void quantidadePar(int[] vetor){
        System.out.println("Quantidade de números pares armazenados: ");
        int quantidade = 0;
        for(int num : vetor) {
                if (num%2==0){
                    quantidade++;
                }
        }
        System.out.println(quantidade);
    }

    public static void quantidadeImpares(int[] vetor){
        System.out.println("Quantidade de número impares armazenados: ");
        int quantidade = 0;
        for(int num : vetor){
            if (num % 2 != 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);
    }
}
