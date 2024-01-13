package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que carregue uma matriz 12 x 4 com os valores das
 * vendas de uma loja (perguntar estes valores ao usuário), em que cada linha
 * represente um mês do ano, e cada coluna, uma semana do mês. Calcule e exiba:
 *
 * a) Total vendido em cada mês do ano;
 * b) Total vendido no ano.
 *
 * English
 * Create a code that makes a 12x4 matrix that stores the gain from a certain
 * store (ask the gain to the user), each row represents a month in the year,
 * and each columns a week in each month. Calculate and show:
 *
 * a) Total sold in each month of the year
 * b) Total sold in the entire year
 **/

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sizing the matrix, input the rows
        System.out.println("How many months?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        double matrix [][] = new double[rows][4];
        //4 = 4 weeks in a month (approximately)

        double totalPerMonth [] = new double[rows];
        double totalYear = 0;

        //Input the gain for each month, calculate the total per month and per year
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("How much did the store sell in the month " + (i+1) + " in the week " +
                        (j+1) + " of that month?");
                matrix[i][j] = scanner.nextDouble();
                scanner.nextLine();

                totalPerMonth[i] += matrix[i][j];
                totalYear += matrix[i][j];

            }
        }

        //Output
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            System.out.println("Month " + (i+1) + ": " + totalPerMonth[i]);
        }
        System.out.println("\nTotal in the year: " + totalYear +
                "\n-----------------------------------------------------------");

    }
}
