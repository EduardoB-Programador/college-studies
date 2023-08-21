package controller;

import java.util.Scanner;

/**Português
 * Elabore um programa que pergunte dois números e também qual operação a ser realizada com
 * estes dois números de acordo com a tabela abaixo (esta tabela deve aparecer como menu de
 * escolha para o usuário). Caso o usuário digite um código que não esteja na tabela, informar
 * que o código inserido está errado.
 *
 * a = Média aritmética entre os números digitados
 * b = Diferença do maior pelo menor
 * c = Produto entre os números digitados
 * d = Divisão do primeiro pelo segundo
 *
 * English
 * Create a code that asks for 2 numbers then ask what to do with those numbers showing the
 * table bellow. If the letter is not in the table (or it's uppercase) then advice the user to
 * select the operation correctly.
 *
 * a = The Average between those numbers
 * b = The difference between the greater and the lesser
 * c = The first times the second
 * d = The first divided by the second
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String select;
        int out = 0;
        double n1, n2, greater, lesser;

        System.out.println("Insert the first value.");
        n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the second value.");
        n2 = scanner.nextInt();
        scanner.nextLine();

        while (out == 0) {
            System.out.println("\nWhat do you want to do with those numbers?\n" +
                    "a - The average between those number\n" +
                    "b - The difference between the greater and the lesser\n" +
                    "c - The first times the second\n" +
                    "d - The first divided by the second\n" +
                    "e - Nothing\n");
            select = scanner.nextLine();

            if (n1 >= n2) {
                greater = n1;
                lesser = n2;
            } else {
                greater = n2;
                lesser = n1;
            }

            switch (select) {
                case "a":
                    System.out.println("The average between " + n1 + " and " + n2 + " is "
                            +( (n1 + n2)/2 ));
                    break;

                case "b":
                    System.out.println("The difference between the greater and the lesser is " +
                            (greater - lesser));
                    break;

                case "c":
                    System.out.println("The number " + n1 + " times the number " + n2 +
                            " is equal to " + (n1 * n2));
                    break;

                case "d":
                    System.out.println("The number " + n1 + " divided by " + n2 +
                            " is equal to " + (n1 / n2));
                    break;

                case "e":
                    System.out.println("Program ended.");
                    out++;
                    break;

                default:
                    System.out.println("You must type one of the letters in the table, and it" +
                            " must be lowercase.");
            }
        }
    }
}
