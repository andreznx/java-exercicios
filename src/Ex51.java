/*******************************************************************************
 * 51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada
 * um dos N alunos e calcular a média aritmética das notas. Contar quantos alunos
 * estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0,
 * imprimir mensagem: Não há nenhum aluno com nota acima de 5.
 *******************************************************************************/
import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade;
        double soma = 0;
        boolean acimaDeCinco = false;

        System.out.println("Digite a quantidade de alunos: ");
        quantidade = entrada.nextInt();

        String[] alunos = new String[quantidade];
        double[] nota = new double[quantidade];

        int contagem = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = entrada.next();

            System.out.println("Digite a nota do aluno: ");
            nota[i] = entrada.nextDouble();

            soma += nota[i];

            if(nota[i] > 7.0) {
                contagem++;
            }

            if (nota[i] > 5.0) {
                acimaDeCinco = true;
            }
        }

        double media = soma / quantidade;

        System.out.println("A média dos alunos é: " + media);
        System.out.println("Quantidade de alunos que tirou nota acima de 7.0 é " + contagem);

        if (!acimaDeCinco) {
            System.out.println("Não há nenhum aluno com nota acima de 5.");
        }
        entrada.close();
    }
}
