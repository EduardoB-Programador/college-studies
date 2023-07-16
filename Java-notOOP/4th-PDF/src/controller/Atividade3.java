package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número, e apresente como resposta se o referido número é par ou é
 * ímpar.
 *
 * English
 * Create a code that asks for a number, then show if that number is odd or even.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number and I'll tell if that number is odd or even.");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        } else {
            System.out.println("The number " + num + " is odd.");
        }
    }
}
