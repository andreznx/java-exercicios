/* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
        * 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
        * 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
        * 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
        * 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
        * 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
        *****************************************************************************************************************/

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double tempo, litrosUsados, distancia, velocidade;

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.println(nome + " digite o tempo gasto na sua viagem: ");
        tempo = entrada.nextDouble();

        System.out.println("Agora informe a velocidade média: ");
        velocidade = entrada.nextDouble();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println(nome + " aqui está a descrição da sua viagem: ");
        System.out.println("Velocidade: " + velocidade);
        System.out.printf("Tempo gasto: %.2f%n", tempo);
        System.out.println("Distância percorrida: " + distancia);
        System.out.printf("Quantidade de litros: %.2f%n", litrosUsados);
    }
}