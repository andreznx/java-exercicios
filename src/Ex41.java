/*******************************************************************************
 * 41) Faça um programa que dada a idade de um nadador, classifique-o em uma das
 * seguintes categorias:
 * 	- Infantil A = 5 a 7 anos
 * 	- Infantil B = 8 a 11 anos
 * 	- Juvenil A = 12 a 13 anos
 * 	- Juvenil B = 14 a 17 anos
 * 	- Adultos = Maiores de 18 anos
 *******************************************************************************/

import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        int idade;
        String nome, categoria;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        nome = entrada.next();

        System.out.println(nome + " qual a sua idade?");
        idade = entrada.nextInt();

        if(idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if(idade >= 8 && idade <= 11) {
            categoria = "Infantil B";
        } else if(idade >= 12 && idade <= 13) {
            categoria = "Juvenil A";
        } else if(idade >=14 && idade < 18) {
            categoria = "Juvenil B";
        } else {
            categoria = "Adultos";
        }
        System.out.println(nome + " a sua categoria é: " + categoria);
    }
}
