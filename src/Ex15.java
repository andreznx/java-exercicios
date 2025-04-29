/*******************************************************************************
 * 15) Escreva um programa que leia quatro notas escolares de um aluno e
 * apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
 * for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
 * do recuperação, somar com o valor da média e obter a nova média. Se a nova
 * média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
 * foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
 * mensagem informando esta condição. Apresentar junto com as mensagens o valor
 * da média do aluno.
 *******************************************************************************/
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, nota4, notaRecuperacao, novaNota, totalNotas;
        double media, novaMedia;

        System.out.println("Olá, qual o seu nome?");
        nome = entrada.nextLine();

        System.out.println(nome + " insira a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Terceira nota:");
        nota3 = entrada.nextDouble();

        System.out.println("Quarta nota:");
        nota4 = entrada.nextDouble();

        totalNotas = nota1 + nota2 + nota3 + nota4;
        media = totalNotas / 4;

        if (media >= 7) {
            System.out.println("Parabéns " + nome + "! você foi aprovado.");
            System.out.println("Sua média foi de: " + media);
        } else {
            System.out.println(nome + " sua média foi de " + media + "! então você não foi aprovado, por favor insira a nota de recuperação:");
            notaRecuperacao = entrada.nextInt();

            novaMedia = (media + notaRecuperacao) / 2;

            if (novaMedia >= 7) {
                System.out.println(nome + " parabéns! sua nota de " + notaRecuperacao + " na recuperação fez com que você seja aprovado!");
            } else {
                System.out.println(nome + " mesmo com a nota de recuperação você não foi aprovado.");
                System.out.println("Sua média foi de: " + novaMedia);
            }
        }
    }
}

