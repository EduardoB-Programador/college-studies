package controller;

import java.util.Scanner;

/**Português
 * Um distribuidor de refrigerantes vende seu produto em todas as 5 regiões do Brasil.
 * Em cada trimestre do ano ele fecha a totalização de vendas por região montando uma
 * tabela que cruza região x total de vendas no trimestre. Desenvolver um programa que
 * leia o total de vendas em cada região por trimestre, e ao final, apresente na tela
 * um relatório com informações de vendas por região em cada trimestre, além do total
 * de vendas no ano inteiro também por cada região e total geral de vendas no ano pela
 * empresa.
 *
 * English
 * A soda distributor sells his products in all 5 regions of Brazil. Each trimester
 * he creates a table comparing the sales from each region of Brazil. Knowing the
 * situation create a code that gets a value from the user corresponding to the
 * collected amount of money from each trimester. At the end, make a sells table
 * that shows the gain from each region per trimester until the end of the year and the
 * total gained from each region. Also show the total the business gained in a year.
 **/

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many regions?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many semesters?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        double gain [] [] = new double[rows][columns];
        double totalReg [] = new double[rows];
        double realTotal = 0;

        //Filling the matrix with user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.println("Insert the gain from the region " + (i+1) +
                        " in the trimester " + (j+1));
                gain [i][j] = scanner.nextDouble();
                scanner.nextLine();

                /*
                 * columns = trimester; rows = region
                 * columns = j
                 * rows = i
                 */
            }
        }

        //Array totalReg[]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                totalReg[i] += gain[i][j];

            }
        }

        //Variable realTotal
        for (int i = 0; i < rows; i++) {
            realTotal += totalReg[i];
        }

        //Output
        System.out.println("----------------------------------------------------------");

        for (int m = 0; m < 3; m++) {

            if (m == 0) {

                System.out.print("---------\t\t");

                for (int i = 0; i < rows; i++) {

                    System.out.print("Region " + (i+1) + "\t\t");

                }

            } else if (m == 1) {

                for (int i = 0; i < columns; i++) {

                    System.out.print("\nTrimester " + (i+1) + " :\t\t");

                    for (int j = 0; j < rows; j++) {

                        if (j != rows - 1) {
                            System.out.print(gain[j][i] + "\t\t");
                        } else {
                            System.out.println(gain[j][i]);
                        }

                    }
                }

            } else {

                System.out.print("\nTotal per region:\t");

                for (int i = 0; i < rows; i++) {

                    if (i != rows - 1) {
                        System.out.print(totalReg[i] + "\t\t");
                    } else {
                        System.out.println(totalReg[i] + "\t\tTotal: " + realTotal);
                    }

                }
            }
        }
        System.out.print("----------------------------------------------------------");

    }
}
