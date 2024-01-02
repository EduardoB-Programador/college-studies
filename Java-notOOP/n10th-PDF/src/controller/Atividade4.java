package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte ao
 * usuário números para preencher toda a matriz, e ao final, exiba a matriz inteira
 * e a média dos números da matriz.
 *
 * English
 * Create a code that makes a matrix with 5 rows and 2 columns, and ask the user
 * to fill it with numbers, at the end show the entire matrix and calculate the
 * arithmetic average of all numbers inserted.
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int numbers [] [] = new int[rows][columns];
        double average = 0;

        //User input (matrix filling)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert a number:");
                numbers[i][j] = scanner.nextInt();
                scanner.nextLine();

                average += numbers[i][j];

            }
        }

        average = average/(rows * columns);

        //Output
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(numbers[i][j]);

                if (j == columns - 1) {
                    System.out.println();
                } else {
                    System.out.print("\t");
                }

            }
        }
        System.out.print("\nThe arithmetic average of all numbers that were inserted is: " +
                average + "\n---------------------------------------");

    }
}
