/*******************************************************************************
 * 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
 * turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
 * são: número de matrícula e a sua nota na prova em questão.
 *******************************************************************************/

package Ex33;

import Ex33.Alunos;
import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        int numAlunos;
        double somaNotas = 0;
        double media;
        Alunos aluno = new Alunos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de alunos: ");
        numAlunos = entrada.nextInt();

        Alunos[] alunos = new Alunos[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            alunos[i] = new Alunos();

            System.out.println("Digite o nome do aluno: ");
            alunos[i].nome = entrada.next();

            System.out.println("Digite a matricula do aluno: ");
            alunos[i].matricula = entrada.nextInt();

            System.out.println("Digite a nota do aluno: ");
            alunos[i].nota = entrada.nextDouble();

            somaNotas += alunos[i].nota;
        }
        media = somaNotas / numAlunos;
        System.out.println("A média do total de alunos (" + numAlunos + ") foi de: " + media);
    }
}
