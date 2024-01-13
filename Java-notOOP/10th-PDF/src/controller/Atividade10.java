package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz a com 3 linhas e 5 colunas e um vetor b
 * com 5 itens. Perguntes ao usuário os números para preencher a matriz. O programa
 * deverá somar todos os itens de uma mesma coluna da matriz e guardar o resultado na
 * posição correspondente a esta coluna no vetor. Ao final o programa deverá exibir a
 * matriz e o vetor.
 *
 * English
 * Create a code that makes a matrix with 3 rows and 5 columns and an array with the
 * length of 5. Ask the user for numbers to fill the matrix. The code must sum each
 * column from the matrix and the result must be inserted inside the array
 * corresponding to the number of the column. Show the matrix and the array at the end.
 **/

public class Atividade10 {
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
        int b [] = new int[columns];

        //Filling the matrix and summing the columns and adding to the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert a number:");
                a [i][j] = scanner.nextInt();
                scanner.nextLine();

                b [j] += a[i][j];

            }
        }

        //Output
        for (int m = 0; m < 2; m++) {

            if (m == 0) {

                System.out.println("-----------------------------------------------\nMatrix:");

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

                System.out.println("\nArray:");

                for (int i = 0; i < columns; i++) {

                    if (i != columns - 1) {
                        System.out.print(b[i] + "\t\t");
                    } else {
                        System.out.println(b[i]);
                    }

                }
            }
        }
        System.out.print("-----------------------------------------------");

    }
}
