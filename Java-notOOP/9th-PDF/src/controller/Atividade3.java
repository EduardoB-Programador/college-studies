package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
 * apresente a soma de todos os elementos que sejam ímpares
 *
 * English
 * Create a code that asks for 5 number in a array, then at the end show the sum
 * of all odd numbers.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int acum = 0 ,nums[] = new int[amount];

        for (int i = 0; i < amount; i ++) {
            System.out.println("Type a number");
            nums[i] = scanner.nextInt();
            scanner.nextLine();

            if (nums[i] % 2 != 0) {
                acum = acum + nums[i];
            }
        }

        System.out.print("The sum of all odd numbers informed is " + acum);

    }
}
