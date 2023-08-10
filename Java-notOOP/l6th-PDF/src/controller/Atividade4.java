package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente os resultados de uma tabuada de um número n qualquer a ser
 * perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x 9, n x 10).
 *
 * English
 * Create a code that asks the user for a number and create a multiplication table od that number.
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int i = 1, num = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
