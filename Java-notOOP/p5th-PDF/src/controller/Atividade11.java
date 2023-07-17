package controller;

import java.util.Scanner;

/**Português
 * Elaborar um programa que apresente o valor de uma potência de uma base qualquer (Variável b) elevada a um
 * expoente qualquer (Variável e). Não use Math.pow
 *
 * English
 * Create a code that asks for a number (variable b) and asks for a power (variable e) to raise that number.
 * Don't use Math.pow
 **/

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b, acum, e, i = 1;

        System.out.println("Insert a number:");
        b = scanner.nextInt();
        scanner.nextLine();
        acum = b;

        System.out.println("Raise that number to the power of:");
        e = scanner.nextInt();
        scanner.nextLine();

        while (i < e) {
            acum = acum * b;
            i++;
        }

        System.out.println("The number " + b + " raised to the power of " + e + " is equal to " +
                acum);
    }
}
