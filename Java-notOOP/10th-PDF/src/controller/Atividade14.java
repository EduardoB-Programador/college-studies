package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o conteúdo de uma matriz 5 x 5 inteira e,
 * em seguida, pergunte ao usuário qual a linha da matriz que ele quer que seja
 * exibida. Esta pergunta deverá se repetir até que o usuário informe um número
 * que não corresponda a uma linha da matriz.
 *
 * English
 * Create a code that asks to fill a 5x5 matrix, then ask the user what row they
 * want to check then show the entire row. The code must stop only when the number
 * typed by the user do not correspond to any row.
 **/

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Matrix sizing (better for testing)
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        String a [][] = new String[rows][columns];

        //Matrix information input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert info into the matrix:");
                a[i][j] = scanner.nextLine();

            }
        }

        //Output
        while (true) {

            int check = 0;

            System.out.println("\nWhat row do you want to check? (1 - " + rows + ")");
            check = scanner.nextInt() - 1;
            scanner.nextLine();

            if (check >= 0 && check <= rows) {

                System.out.println("----------------------------------------------");

                for (int i = 0; i < columns; i++) {
                    System.out.print("Matrix[" + (check + 1) + "][" + (i+1) + "] = " +
                            a[check][i] + "\t\t");
                }

                System.out.println("\n----------------------------------------------");

            } else {
                System.out.println("There is no row " + (check + 1) + ". Program ended.");
                break;
            }

        }

    }
}
