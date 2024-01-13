package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o conteúdo de uma matriz a com 3 linhas
 * e 4 colunas. Em seguida preencha a matriz b de mesma dimensão com os valores
 * da matriz a elevados ao quadrado. Ao final exiba o conteúdo das duas matrizes.
 *
 * English
 * Create a code that makes a matrix called "a" with 3 rows and 4 columns and ask
 * the user to fill the matrix with numbers. Then create a matrix called "b" with
 * the same amount of rows and columns as "a" and insert the contents from the
 * matrix "a" to the matrix "b" but squared.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int a [] [] = new int[rows][columns];
        int b [] [] = new int[rows][columns];

        //Filling the "a" array and inserting the squared input into the "b" array
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert a number:");
                a[i][j] = scanner.nextInt();
                scanner.nextLine();

                b[i][j] = a[i][j] * a[i][j];

            }
        }

        //Output
        for (int m = 0; m < 2; m++) {

            if (m == 0) {

                System.out.println("\n----------------------------------------------------\nMatrix \"a\":");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {

                        if (j != columns - 1) {
                            System.out.print(a[i][j] + "\t\t");
                        } else {
                            System.out.println(a[i][j]);
                        }

                    }
                }

            } else {

                System.out.println("----------------------------------------------------\nMatrix \"b\":");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {

                        if (j != columns - 1) {
                            System.out.print(b[i][j] + "\t\t");
                        } else {
                            System.out.println(b[i][j]);
                        }

                    }
                }
            }
        }
        System.out.print("----------------------------------------------------");

    }
}
