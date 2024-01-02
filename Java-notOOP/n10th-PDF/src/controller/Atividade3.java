package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte ao
 * usuário números para preencher toda a matriz, e ao final, exiba a matriz inteira
 * e a soma dos números pares contidos na matriz.
 *
 * English
 * Create a code that makes a matrix with 4 rows and 3 columns. Ask the user to
 * insert numbers to fill the matrix, and at the end show the entire matrix and
 * the sum of all even numbers.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int numbers [] [] = new int[rows][columns], sumEven = 0;

        //User input (matrix filling)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Type a number:");
                numbers [i][j] = scanner.nextInt();
                scanner.nextLine();

                //Checking if the number is even and adding to the sumEven variable
                if (numbers[i][j] % 2 == 0) {
                    sumEven+= numbers[i][j];
                }

            }
        }

        //Output
        System.out.println("\n------------------------------------------");
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
        System.out.print("\nThe sum of all even numbers is equal to " + sumEven +
                "\n------------------------------------------");
    }
}
