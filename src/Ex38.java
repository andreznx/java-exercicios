/*******************************************************************************
 * 38) Faça um programa que leia as variáveis C e N, respectivamente código e
 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
 * ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o
 * excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
 * variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
 * imprimir o salário total e o salário excedente. O programa só deve parar de
 * rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
 * programa?".
 *******************************************************************************/

import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, n, excedente;
        double horaTrabalhada = 10.00;
        double salario, e, novoSalario;
        String charOpcao;
        boolean encerrar = false;

        while(encerrar == false){
            System.out.println("Digite o seu identificador: ");
            c = entrada.nextInt();

            System.out.println("Digite as horas trabalhadas: ");
            n = entrada.nextInt();

            if(n <= 50) {
                salario = n * horaTrabalhada;
                System.out.println("Identificador " + c + " seu sálario foi de: " + salario);
            } else {
                salario = n * horaTrabalhada;
                excedente = n - 50;
                e =  excedente * 20.00;
                novoSalario =  salario + e;

                System.out.println("\nIdentificador " + c + " segue as informações:");
                System.out.println("Horas trabalhadas: " + n);
                System.out.println("Salário até 50 horas trabalhadas: " + salario);
                System.out.println("Excedentes: " + excedente);
                System.out.println("Valor do excedente: " + e);
                System.out.println("Seu salário: " + novoSalario);
            }
            System.out.println("Deseja encerrar? (s/n)");
            charOpcao = entrada.next();
            if(charOpcao.equalsIgnoreCase("s")) {
                encerrar = true;
            }
        }
    }
}
