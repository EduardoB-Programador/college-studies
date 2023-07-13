package controller;

import java.util.Scanner;

/**português
 * Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença
 * entre o maior valor e o menor valor lido.
 *
 * English
 * Create a code that asks for 2 integers then show the difference between the greater and the lesser.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, difference;

        System.out.println("Insert the first integer.");
        n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the second integer.");
        n2 = scanner.nextInt();
        scanner.nextLine();

        if (n1 > n2) {
            difference = n1 - n2;
        } else {
            difference = n2 - n1;
        }

        System.out.println("The difference between the greater and the lesser is " + difference);
    }
}
