package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10.
 *
 * English
 * Create a code that asks for an integer and verify if the number is between 1 and 10.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if ((num >= 1) && (num <= 10)) {
            System.out.println("The number informed is between 1 and 10.");
        } else {
            System.out.println("The number informed is not between 1 and 10.");
        }

    }
}
