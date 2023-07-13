package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e ao final apresente-os dispostos
 * em ordem crescente.
 *
 * English
 * Create a code that asks for 3 numbers ("a", "b" and "c") and show them in ascending order.
 **/

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b , c, aux;

        System.out.println("Insert the first number:");
        a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("insert the second number:");
        b = scanner.nextInt();
        scanner.nextLine();

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Insert the third number:");
        c = scanner.nextInt();
        scanner.nextLine();

        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("The ascending order with all those numbers: " +
                c + " " + b + " " + a + ".");
    }
}
