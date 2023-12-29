package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que leia um vetor a com 15 elementos inteiros. Construir um vetor
 * b de mesmo tipo, sendo cada um dos elementos do vetor b ordenados de forma decrescente.
 *
 * English
 * Create a code that reads a 15 element array ("a") filled with integers. Then create an
 * array called "b" with the same type and length, but its elements must be sorted in
 * descending order.
 **/

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int a[] = new int[amount];
        int b[] = new int[amount];
        int aux;

        for (int i = 0; i < amount; i++) {

            //Number input
            System.out.println("Type a number to be sorted in the array b:");
            a[i] = scanner.nextInt();
            scanner.nextLine();

            b[i] = a[i];

        }

        //Sort for b
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount - 1; j++) {

                if (b[j] < b[j+1]) {

                    aux = b[j];
                    b[j] = b[j+1];
                    b[j+1] = aux;

                }

            }
        }


        //output
        System.out.println("\n-------------------------------");
        for (int i = 0; i < amount; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\n-------------------------------");

    }
}
