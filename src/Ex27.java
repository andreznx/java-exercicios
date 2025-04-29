/*******************************************************************************
 * 28) Faça um programa que gera e escreve os números ímpares dos números lidos
 * entre 100 e 200.
 *******************************************************************************/

import java.util.Scanner;

class Ex27 {
    public static void main(String[] args) {

        for (int i = 100;i <= 200; i++){
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }
}