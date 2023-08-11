package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente o valor de uma potência de uma base qualquer elevada a
 * um expoente qualquer, ou seja, de be. (Não utilize Math.pow();
 *
 * English
 * Create a code that asks for a base and a exponent and show the result, don't utilize Math.pow.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, expo, result, i = 1;

        System.out.println("Insert a base:");
        base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert a exponent:");
        expo = scanner.nextInt();
        scanner.nextLine();

        result = base;
        do {
            result = result * base;
            i++;
        } while ((i + 1) <= expo);

        System.out.println("The number " + base + " powered by " + expo + " is equal to " + result);
    }
}
