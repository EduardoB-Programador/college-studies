package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente o fatorial de um número informado pelo usuário.
 *
 * English
 * Create a code that asks for a number then show the factorial of that number.
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int acum = 1,num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            acum = acum * i;
        }

        System.out.println(acum);
    }
}
