/*******************************************************************************
 * 42) Faça um programa que determine o maior e o menor entre N números lidos.
 * A condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar
 * executando até que a entrada seja igual a 0 (ZERO).
 *******************************************************************************/
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        boolean encerrar = false;

        while(encerrar == false) {
            System.out.println("Digite um número");
            numeros = entrada.nextInt();

            if (numeros < 0) {
                break;
            } if (numeros > maior) {
                maior = numeros;
            } if (numeros < menor) {
                menor = numeros;
            }

            if(numeros == 0) {
                encerrar = true;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
