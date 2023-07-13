package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número de 3 casas e apresente como resultado somente o algarismo
 * das centenas.
 *
 * English
 * Create a code that asks for a 3 digit number and show the hundreds number.
 **/

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a 3 digit number:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num / 100 != 0) {
            System.out.println("The hundreds digit is " + (num / 100));
        } else {
            System.out.println("The number doesn't have 3 digits");
        }
    }
}
