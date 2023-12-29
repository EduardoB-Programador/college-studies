package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte os valores de um vetor a com 15 elementos, construa
 * um vetor b de mesmo tipo, sendo que cada elemento do vetor b deve ser o fatorial do elemento
 * correspondente no vetor a. Apresentar como resposta todo o conteúdo do vetor b.
 *
 * English
 * Create a code that asks for numbers in a 15 element array (call it "a"), then create the
 * array "b" with the same size. The numbers in the array "b" must be equal to the factorial of
 * each number in the array "a". At the end show every number in the array "b".
 **/

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int a[] = new int[amount];
        int b[] = new int[amount];

        for (int i = 0; i < amount; i++) {

            //Number input
            System.out.println("Type a number:");
            a[i] = scanner.nextInt();
            scanner.nextLine();

            b[i] = a[i];

            //Factorial process for array "b"
            for (int j = b[i] - 1; j >= 1; j--) {

                b[i] *= j;
            }

        }

        //output
        System.out.println("\n-------------------------------");
        for (int i = 0; i < amount; i++) {

            System.out.println(a[i] + " --> b[" + i + "] = " + b[i]);

        }
        System.out.println("-------------------------------");
    }
}