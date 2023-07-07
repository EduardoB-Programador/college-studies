package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, utilizando a fórmula prestação =
 * valor + (valor x (taxa : 100) x tempo em dias).
 *
 * English
 * Create a code that calculate the value of a overdue debt, use debt = value + (value * (taxes / 100) * days).
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value, taxes;

        System.out.println("How much is the debt?");
        value = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How much is the value of the taxes? (%)");
        taxes = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How much time passed");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The original value that you needed to pay was " + value + " but since " + days +
                " passed, and some taxes were added to the original value, you will need to pay " +
                (value + (value * (taxes/100) * days)));
    }
}
