package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte ao
 * usuário nomes de pessoas para preencher toda a matriz. Em seguida o programa
 * perguntará ao usuário as coordenadas (linha e coluna) que deseja visualizar o
 * conteúdo correspondente na matriz. Enquanto o usuário informar coordenadas válidas,
 * o programa exibirá o conteúdo correspondente. No momento em que forem inseridas
 * coordenadas não válidas o programa será encerrado com a mensagem na tela
 * “Coordenadas inválidas”.
 *
 * English
 * Create a code that makes a matrix with 4 rows and 4 columns and ask the user for
 * people names to fill the matrix created. Then ask the user for coordinates (row and
 * column) to see the corresponding name in the matrix. While the user continues to insert
 * valid coordinates you must keep showing names. But if the user inserts an invalid
 * coordinate the code must end and the message "invalid coordinates" must be shown.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //This is done because I can input lower numbers in order to test the code first

        int rowAndCol [] = new int[2];

        System.out.println("How many rows?");
        rowAndCol [0] = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How many columns?");
        rowAndCol [1] = scanner.nextInt();
        scanner.nextLine();

        String names [] [] = new String [rowAndCol[0]] [rowAndCol[1]];
        int coordinates [] = new int[2];

        //Filling the matrix with names
        for (int i = 0; i < rowAndCol[0]; i++) {
            for (int j = 0; j < rowAndCol [1]; j++) {

                System.out.println("Insert a name:");
                names [i][j] = scanner.nextLine();

            }
        }

        //Checking the matrix content
        while (true) {

            System.out.println("Insert a coordinate in the X axis in a range from 1 to " +
                    rowAndCol[0]);
            coordinates [0] = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("Now, insert a coordinate in the Y axis in a range from 1 to " +
                    rowAndCol[1]);
            coordinates [1] = scanner.nextInt() - 1;
            scanner.nextLine();

            /*
             * rowAndCol [0] = rows, rowAndCol [1] = columns
             * coordinates [0] = rows, coordinates [1] = columns
             */

            //IDK if there's a better method to do this
            if (
                    coordinates [0] >= 0 &&
                    coordinates [0] <= rowAndCol[0] &&
                    coordinates [1] >= 0 &&
                    coordinates [1] <= rowAndCol[1]
            ) {
                //Output
                System.out.println("\n------------------------------------------\n" +
                        "The coordinates {" + (coordinates[0] + 1) + ", " + (coordinates[1] + 1) + "}" +
                        " correspond to the name: " + names [coordinates[0]] [coordinates[1]] +
                        "\n------------------------------------------\n");

            } else {
                //End
                System.out.println("Invalid coordinates, program ended.");
                break;

            }

        }


    }
}
