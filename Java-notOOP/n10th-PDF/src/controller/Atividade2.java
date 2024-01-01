package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas. Pergunte ao
 * usuário números para preencher toda a matriz, e ao final exiba a matriz inteira e
 * também a soma dos números desta matriz.
 *
 * English
 * Create a code that makes a matrix with 3 rows and 2 columns, ask the user to fill
 * this matrix with numbers. Show at end the matrix elements and also sum the numbers that
 * were inserted.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int numbers [] [] = new int[rows][columns], sum = 0;

        //Matrix filling and summing all its numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert a number:");
                numbers[i][j] = scanner.nextInt();
                scanner.nextLine();

                sum += numbers[i][j];

            }
        }

        //Output
        System.out.println("\n---------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(numbers[i][j]);

                if (j == columns - 1) {
                    System.out.println();
                } else {
                    System.out.print("\t\t");
                }

            }
        }
        System.out.print("\nThe sum of all these numbers is " + sum +
                "\n---------------------------------");

    }
}
