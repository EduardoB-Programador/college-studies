package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou nulo.
 *
 * English
 * Create a code that asks for a number and tell if that number is positive, negative or zero.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num < 0) {
            System.out.println("The number is negative.");
        } else if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
