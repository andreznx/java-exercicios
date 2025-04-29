import java.math.BigInteger;

/*******************************************************************************
 * 43) Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
 * qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
 * pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro
 * de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e
 * os quadros subseqüentes, o dobro do quadro anterior. A rainha achou o trabalho
 * barato e pediu que o serviço fosse executado, sem se dar conta de que seria
 * impossível efetuar o pagamento. Faça um programa para calcular o número de
 * grãos que o monge esperava receber.
 *******************************************************************************/

import java.math.BigInteger;

public class Ex43 {
    public static void main(String[] args) {
        BigInteger graosNaCasa = BigInteger.ONE;
        BigInteger totalGraos = BigInteger.ONE;
        int casaTabuleiro = 64;

        for (int i = 1; i < casaTabuleiro; i++) {
            graosNaCasa = graosNaCasa.multiply(BigInteger.valueOf(2));
            totalGraos = totalGraos.add(graosNaCasa);
        }

        System.out.println("\nA quantidade total de grãos é: " + totalGraos);
    }
}
