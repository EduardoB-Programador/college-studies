package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente o total da soma de n números inteiros do número 1 até n,
 * onde n é um valor informado pelo usuário.
 *
 * English
 * Create a code that asks for a number "n" and shows the sum of all number from 1 to n.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int acum = 0, n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            acum = acum + i;
        }

        System.out.println(acum);
    }
}
