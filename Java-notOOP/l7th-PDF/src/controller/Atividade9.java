package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número inteiro e exiba os números que são, ao mesmo
 * tempo, múltiplos de 3 e 5, na sequência de 1 até o número informado pelo usuário.
 *
 * English
 * Create a code that asks for an integer then show all the numbers that are, at the same time,
 * multiple of 3 and 5, from 1 to the number that was asked.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
