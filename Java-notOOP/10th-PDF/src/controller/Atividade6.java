package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz com 3 linhas e 5 colunas. As 4
 * primeiras colunas de todas as linhas deverão ser preenchidas com números
 * informados pelo usuário. A 5ª coluna deverá receber a média dos 4 valores
 * existentes na mesma linha (das 4 primeiras colunas). Ao final exiba toda a matriz.
 *
 * English
 * Create a code that makes a matrix with 3 rows and 5 columns. The first 4 columns
 * of each row must be filled by the user. The 5th columns must do the arithmetic
 * average between all the previous numbers inserted by the user on the same row.
 * Show at the end the matrix.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        double numbers [] [] = new double[rows][columns];
        double average = 0;

        //Filling the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (j < (columns - 1)) {

                    System.out.println("Insert a number");
                    numbers [i][j] = scanner.nextDouble();
                    scanner.nextLine();
                    average += numbers [i][j];

                } else {

                    //Last step to calculate the average for row i
                    average /= (columns - 1);

                    numbers [i][j] = average;

                }
            }
            average = 0;
        }

        //Output
        System.out.println("\n---------------------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (j < columns - 1) {

                    System.out.print(numbers [i][j] + "\t\t");

                } else {

                    System.out.println(numbers [i][j]);

                }
            }
        }
        System.out.print("---------------------------------------------");

    }
}
