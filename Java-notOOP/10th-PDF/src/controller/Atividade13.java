package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que possa armazenar as alturas de dez atletas de
 * cinco delegações que participarão dos jogos de verão. Ao final, o programa
 * deverá exibir a maior altura de cada uma das delegações.
 *
 * English
 * Create a code that stores the height of 10 athletes from 5 different
 * delegations, they will take part in the summer games. Show at the end the
 * highest person from each delegation.
 **/

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many athletes per delegation?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many delegations?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        double athletes [] [] = new double[rows][columns];
        double highest [] = new double[columns];

        //Input and verifying the highest
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {

                System.out.println("What is the height of the athlete " + (j+1) +
                        " from the delegation " + (i+1) + "?(height in meters)");
                athletes[j][i] = scanner.nextDouble();
                scanner.nextLine();

                //i -> column -> delegation
                //j -> row - > athlete

                if (athletes[j][i] > highest[i]) {
                    highest[i] = athletes[j][i];
                }

            }
        }

        //Output
        System.out.print("-------------------------------------------------------\n" +
                "--------\t");
        for (int i = 0; i < columns; i++) {

            if (i != columns - 1) {
                System.out.print("Delegation " + (i+1) + "\t");
            } else {
                System.out.println("Delegation " + (i+1));
            }

        }
        System.out.print("Highest:\t");
        for (int i = 0; i < columns; i++) {

            if (i != columns - 1) {
                System.out.print(highest[i] + "\t\t");
            } else {
                System.out.println(highest[i]);
            }

        }
        System.out.println("-------------------------------------------------------");
    }
}
