package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
 * apresente a soma de todos os elementos deste vetor.
 *
 * English
 * Create a code that creates an array then asks for 5 number in it. At the end
 * show the sum of all those numbers.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int acum = 0,nums [] = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Type a number");
            nums[i] = scanner.nextInt();
            scanner.nextLine();

            acum = acum + nums[i];
        }

        System.out.print("The sum of the numbers ");
        for (int i = 0; i < amount; i++) {
            if (i != amount - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i] + " is " + acum);
            }
        }
    }
}
