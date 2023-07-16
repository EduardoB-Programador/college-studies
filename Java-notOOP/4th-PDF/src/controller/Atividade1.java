package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número. Se este número for maior que 20, então ele deverá exibir a
 * metade deste número, senão, ele deverá exibir o número sem alterações.
 *
 * English
 * Create a code that asks for a number. If that number is greater than 20, show the half of that number, if
 * not, then show the number informed without modifying it.
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        double num = scanner.nextDouble();
        scanner.nextLine();

        if (num > 20) {
            num = num / 2;
            System.out.println("Your number is greater than 20, and the half of it is " + num);
        } else {
            System.out.println("Your number is " + num);
        }
    }
}
