package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte 4 números e apresente a média aritmética ponderada, com pesos respectivos
 * de 1, 2, 3 e 4.
 *
 * English
 * Create a code that asks for 4 numbers then show the weighted average, the weights will be respectively 1,
 * 2, 3 and 4.
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, n4;

        System.out.println("Insert a number:");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert a number:");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert a number:");
        n3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert a number:");
        n4 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The weighted average between those number with the respective weights " +
                "1, 2, 3 and 4 is " +
                ((n1 + n2 * 2 + n3 * 3 + n4 * 4) / 10));
    }
}
