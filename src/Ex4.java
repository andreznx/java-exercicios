/* 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
        * 	valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
        * 	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
        * 	com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
        * 	devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
        * 	multiplicações.
*/
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d;
        int aMaisB, aMaisC, aMaisD, bMaisC, bMaisD, cMaisD;
        int aVezesB, aVezesC, aVezesD, bVezesC, bVezesD, cVezesD;

        System.out.println("Digite o valor A: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor B: ");
        b = entrada.nextInt();

        System.out.println("Digite o valor C: ");
        c = entrada.nextInt();

        System.out.println("Digite o valor D: ");
        d = entrada.nextInt();

        aMaisB = a + b;
        aMaisC = a + c;
        aMaisD = a + d;
        bMaisC = b + c;
        bMaisD = b + d;
        cMaisD = c + d;

        aVezesB = a * b;
        aVezesC = a * c;
        aVezesD = a * d;
        bVezesC = b * c;
        bVezesD = b * d;
        cVezesD = c * d;

        System.out.println("Valor A + B: " + aMaisB);
        System.out.println("Valor A + C: " + aMaisC);
        System.out.println("Valor A + D: " + aMaisD);
        System.out.println("Valor B + C: " + bMaisC);
        System.out.println("Valor B + D: " + bMaisD);
        System.out.println("Valor C + D: " + cMaisD);
        System.out.println("Valor A * B: " + aVezesB);
        System.out.println("Valor A * C: " + aVezesC);
        System.out.println("Valor A * D: " + aVezesD);
        System.out.println("Valor B * C: " + bVezesC);
        System.out.println("Valor B * D: " + bVezesD);
        System.out.println("Valor C * D: " + cVezesD);
    }
}