package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.
 *
 * English
 * Create a code that asks an integer then show the number before and the number after the number that was given.
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type any integer");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The number before that number is " + (num - 1) + ", the number that was given was " +
                num + ", and the number after that one is " + (num + 1) + ".");
    }
}
