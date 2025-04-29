/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

 *************************************************************************/

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idVendedor, codPeca, qtdVendida;
        double preco, valorTotal;
        double comissao = 0.05;
        double valorComissao, pagarComissao;

        System.out.println("Digite o codigo de identificação do vendedor: ");
        idVendedor = entrada.nextInt();

        System.out.println("Digite o codigo da peça: ");
        codPeca = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça: ");
        preco = entrada.nextDouble();

        System.out.println("Insira a quantidade de peças vendidas: ");
        qtdVendida = entrada.nextInt();

        valorTotal = preco * qtdVendida;

        valorComissao = valorTotal * comissao;

        pagarComissao = valorTotal + valorComissao;

        System.out.println("O valor total do item " + codPeca + " é de: R$" + valorTotal + "\n");
        System.out.println("O valor de comissão para o vendedor do id " + idVendedor + " é de:  R$ " + valorComissao + "\n");
        System.out.println("O total a ser pago é de: R$ " + pagarComissao);


    }
}