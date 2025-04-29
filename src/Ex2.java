/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner entradaValor = new Scanner(System.in);
        double cotacaoDolar = 6.0;
        double valor;
        double resultado;

        System.out.println("Digite o valor para fazer a conversão em dolar: ");
        valor = entradaValor.nextDouble();

        resultado = valor * cotacaoDolar;

        System.out.println("A conversão do valor R$ " + valor + " é de: R$ " + resultado);
    }
}