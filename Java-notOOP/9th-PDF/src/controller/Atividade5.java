package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie um vetor b de mesma
 * dimensão contendo os valores ao quadrado correspondentes no vetor a. Ao final exibir os 2 vetores.
 *
 * English
 * Create a code that asks for 5 number in an array called "a", then create the array "b" with the
 * same size taking the numbers from "a" and raising to the power of 2. Show both arrays at the end.
 **/

public class Atividade5 {
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

            b[i] = a[i] * a[i];

            if (i == amount - 1) {
                System.out.println("The numbers you typed were raised to the power of 2.\n");
            }
        }

        for (int i = 0; i < amount; i++) {
            System.out.println(a[i] + "² = " + b[i]);
        }
    }
}
