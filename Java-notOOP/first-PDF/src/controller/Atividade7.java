package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números.
 *
 * English
 * Create a code that asks 3 number then show the average of them.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Type any number");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Type any number");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Type any number");
        n3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The average of those number is " + ((n1 + n2 + n3) / 3));
    }
}
