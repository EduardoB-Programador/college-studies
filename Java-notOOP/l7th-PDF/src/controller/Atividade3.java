package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente os resultados de uma tabuada de um número qualquer
 * informado pelo usuário.
 *
 * English
 * Create a code that asks for a number then shows the multiplication table of the number given.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
    }
}
