/*******************************************************************************
 * 60) Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através
 * de um método chamado VERIFICA_QUADRANTE, que deve receber um valor para x e um
 *	valor para y.
 Quadrantes
 *         x |
 *           |
 *     2o    |     1o
 *           |
 *y ----------------------
 *           |
 *           |
 *     3o    |     4o
 *           |
 *******************************************************************************/

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = entrada.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = entrada.nextInt();

        int quadrante = VerificaQuadrante(x, y);
        if (quadrante == 0) {
            System.out.println("O ponto está na origem.");
        } else {
            System.out.println("O ponto está no " + quadrante + "º quadrante.");
        }
    }

    public static int VerificaQuadrante(int x, int y) {
        if (x == 0 && y == 0) return 0;
        else if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else return 4; // x > 0 && y < 0
    }
}
