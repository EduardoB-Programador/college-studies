package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte 20 elementos de um vetor a e construa um vetor b de
 * mesma dimensão com os mesmos elementos de a, os quais devem estar invertidos, ou seja, o
 * primeiro elemento de a passa a ser o último elemento de b, e assim por diante. Apresentar
 * os vetores a e b.
 *
 * English
 * Create a code that asks for 20 elements (anything) in an array called "a" then create the
 * array "b" with the same length and the same elements from the array "a", but in a way that
 * the first element in "a" will be the ultimate one, the second element in "a" be the penultimate
 * in "b" and so on. Show both arrays at the end.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String a[] = new String[amount];
        String b[] = new String[amount];

        for (int i = 0; i < amount; i++) {

            System.out.println("Insert an elements(number, text, anything):");
            a[i] = scanner.nextLine();

            b[amount - (i + 1)] = a[i];

        }

        for (int i = 0; i < amount; i++) {

            if (i == 0) {
                System.out.println("The elements in arrays \"a\" and \"b\" from 1 to " + amount +
                        ", are respectively:\n");
            }

            System.out.println("a = " + a[i] + "\tb = " + b[i]);
        }
    }
}
