package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas. Pergunte ao usuário o
 * conteúdo desta matriz e ao final exiba a matriz inteira.
 *
 * English
 * Develop a code that creates a matrix with 5 rows and 3 columns. Ask the user to fill the
 * matrix with information.
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Matrix size
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        //using info to define the amount of information that needs to be given
        String info [] = new String[columns];
        String personInfo [] [] = new String[rows][columns];

        //info filling
        for (int i = 0; i < columns; i++) {

            System.out.println("Insert info that needs to be given:");
            info[i] = scanner.nextLine();

        }

        //personInfo filling
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert " + info[j] + ":");
                personInfo[i][j] = scanner.nextLine();

            }
        }

        //Output
        System.out.println("\n---------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(personInfo[i][j]);

                if (j == columns - 1) {
                    System.out.println();
                } else {
                    System.out.print("\t");
                }

            }
        }
        System.out.print("---------------------------------");

    }
}
