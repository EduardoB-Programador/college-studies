package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo
 * deste valor, ou seja, o número lido como sendo positivo.
 *
 * English
 * Create a code that asks for a integer, positive or negative, then show the number as positive.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number, positive or negative:");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        if (n1 < 0) {
            n1 = n1 - (2 * n1);
        }

        System.out.println("The modulus of that number is " + n1);
    }
}
