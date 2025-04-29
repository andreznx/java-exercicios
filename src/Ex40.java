/*******************************************************************************
 * 40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03
 * grupos de indústrias que são altamente poluentes do meio ambiente. O índice
 * de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
 * indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o
 * índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a
 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
 * notificados a paralisarem suas atividades. Faça um programa que leia o índice
 * de poluição medido e emita a notificação adequada aos diferentes grupos de
 * empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na
 * seguinte pergunta, "Deseja encerrar o programa?".
 *******************************************************************************/

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        double indice;
        boolean encerrar = false;
        String charOpcao;
        Scanner entrada = new Scanner(System.in);

        while(encerrar == false){
            System.out.println("Digite o indice da poluição:");
            indice = entrada.nextDouble();

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice de poluição aceitável.");
            } else if(indice >= 0.3 && indice < 0.4) {
                System.out.println("As empresas do 1 grupo devem suspender as atividades.");
            } else if(indice >= 0.4 && indice < 0.5) {
                System.out.println("As empresas do 1 e 2 grupo devem suspender as atividades.");
            } else if(indice >= 0.5) {
                System.out.println("As empresas do 1, 2 e 3 grupo devem suspender as atividades.");
            } else {
                System.out.println("Houve algum erro.");
            }

            System.out.println("Deseja encerrar o programa? (S/N)");
            charOpcao = entrada.next();
            if(charOpcao.equalsIgnoreCase("S")) {
                encerrar = true;
            }
        }

    }
}
