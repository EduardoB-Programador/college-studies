package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte oito elementos em um vetor a, construa um vetor b de mesma
 * dimensão com os elementos do vetor a multiplicados por 3. Apresente ao final o vetor b.
 * Na exibição, o elemento b[1] deve ser implicado pelo elemento a[1] * 3, o elemento b[2] implicado
 * pelo a[2] * 3, e assim por diante, até 8.
 *
 * English
 * Create a code that asks for 8 numbers in an array called "a", then create an array called "b"
 * with the same size of "a" and multiply its elements by 3 and put in the "b" array. Show at the
 * end the array "b".
 *
 * You must display like this:
 * b[0] = a[0] * 3
 * b[1] = a[1] * 3 (and so on until 8)
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int a[] = new int[amount], b[] = new int[amount];


        for (int i = 0; i < amount; i++) {
            System.out.println("Insert a number");
            a[i] = scanner.nextInt();
            scanner.nextLine();

            b[i] = a[i] * 3;

            if (i == amount - 1) {
                System.out.println("The numbers you typed were multiplied by 3, and here they are now.\n");
            }
        }

        for (int i = 0; i < amount; i++) {
            System.out.println("a[" + i + "] * 3 = " + b[i]);
        }

    }
}
