package controller;

import java.util.Scanner;

/**Português
 *  Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para preencher este
 *  vetor. Ao final, apresente o maior e o menor valor informados, além da média dos 10
 *  números informados.
 *
 * English
 * Create an array with 10 elements of length, then ask for 10 numbers to fill the array.
 * Show at the end the biggest number and the smallest one, also do the arithmetic average
 * between all numbers.
 **/

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements for the array?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int numbers[] = new int[amount];
        int greatest = 0, smallest = 0;
        double average = 0;

        for (int i = 0; i < amount; i++) {

            //Number input
            System.out.println("Type a number:");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();

            //The variables may not end with zero
            if (i == 0) {
                smallest = numbers[i];
                greatest = numbers[i];
            }

            //Checking for greatest and smallest numbers
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            average += numbers[i];
        }

        average = average / amount;

        System.out.println("\nThe biggest number is " + greatest +
                "\nThe smallest number is " + smallest +
                "\nThe average between all numbers is " + average);
    }
}
