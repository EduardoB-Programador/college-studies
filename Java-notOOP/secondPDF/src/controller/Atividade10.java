package controller;

import java.util.Scanner;

/**Português
 * Escreva um algoritmo pergunte o número total de eleitores de um município, o número de votos brancos, nulos e
 * válidos e apresente como resposta o percentual que cada um representa em relação ao total de eleitores.
 *
 * English
 * Create a code that asks a total of voters of a city, the total of blank votes, total of nulls and valid votes.
 * Then show the percentage of each.
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double voters, blanks, nulls, valid;

        System.out.println("Insert the total of voters:");
        voters = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the total of blank votes:");
        blanks = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the total of null votes:");
        nulls = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the total of valid votes:");
        valid = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The amount of voters is " +  (int) voters +
                "\nThe amount of blank votes is " + (blanks * 100 / voters) +
                "%\nThe amount of null votes is " + (nulls * 100 / voters) +
                "%\nThe amount of valid votes is " + (valid * 100 / voters) + "%");
    }
}
