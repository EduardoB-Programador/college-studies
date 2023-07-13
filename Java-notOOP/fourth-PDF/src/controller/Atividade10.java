package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte dois números inteiros, e apresente como resultado se o segundo número
 * informado é ou não um divisor do primeiro número informado.
 *
 * English
 * Create a code that asks for 2 integers, then show if the second number can be divided by the first one.
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.println("insert the first integer.");
        n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the second integer.");
        n2 = scanner.nextInt();
        scanner.nextLine();

        if (n2 % n1 == 0) {
            System.out.println("The second number can be divided by the first number informed.");
        } else {
            System.out.println("The second number cannot be divided by the first one.");
        }
    }
}
