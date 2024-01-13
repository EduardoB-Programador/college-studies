package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o conteúdo de duas matrizes a e b, cada uma
 * com 5 linhas e 3 colunas, construa uma matriz c de mesma dimensão, a qual é formada
 * pela soma dos elementos da matriz a com a matriz b. Apresentar ao final o conteúdo
 * das três matrizes.
 *
 * English
 * Create a code that makes 2 matrices "a" and "b" and ask the user to fill the matrix
 * with numbers, both matrices must have 5 rows and 3 columns, then create the "c" matrix
 * with the same amount of rows and columns. Each content from the matrix "c" must be the
 * sum of the contents from the respective "a" and "b" rows and columns. Show all the
 * contents from all matrices at the end.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        //The matrices
        int a [] [] = new int[rows][columns];
        int b [] [] = new int[rows][columns];
        int c [] [] = new int[rows][columns];

        //The matrices filling
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert a number for matrix \"a\":");
                a [i][j] = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Insert number for matrix \"b\":");
                b [i][j] = scanner.nextInt();
                scanner.nextLine();

                c[i][j] = a[i][j] + b[i][j];

            }
        }

        //Output
        System.out.println();
        for (int q = 0; q < 3; q++) {
            System.out.println("-----------------------------------------");

            if (q == 0) {
                System.out.println("Matrix a:");
            } else if (q == 1) {
                System.out.println("Matrix b:");
            } else if (q == 2) {
                System.out.println("Matrix c:");
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {

                    if (q == 0) {

                        if (j < columns - 1) {

                            System.out.print(a[i][j] + "\t\t");

                        } else {

                            System.out.println(a[i][j]);

                        }

                    } else if (q == 1) {

                        if (j < columns - 1) {

                            System.out.print(b[i][j] + "\t\t");

                        } else {

                            System.out.println(b[i][j]);

                        }

                    } else if (q == 2) {

                        if (j < columns - 1) {

                            System.out.print(c[i][j] + "\t\t");

                        } else {

                            System.out.println(c[i][j]);

                        }

                    }

                }
            }
        }
        System.out.print("-----------------------------------------");

    }
}
