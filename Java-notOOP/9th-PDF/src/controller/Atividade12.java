package controller;

import java.util.Scanner;

/**Português
 * Crie dois vetores a e b com 5 elementos cada e preencha-os com números informados
 * pelo usuário. Ao final apresente os números que existem repetidos entre os 2 vetores.
 *
 * English
 * Create two arrays, those called "a" and "b" both with 5 elements of length. Ask the
 * user for numbers to fill both arrays, then show the numbers that appeared in both arrays.
 **/

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        int a[] = new int[amount];
        int b[] = new int[amount];

        for (int i = 0; i < amount; i++) {

            //Filling the array "a"
            System.out.println("Type a number fo fill the \"a\" array:");
            a[i] = scanner.nextInt();
            scanner.nextLine();

            //Filling the array "b"
            System.out.println("Type a number fo fill the \"b\" array:");
            b[i] = scanner.nextInt();
            scanner.nextLine();

        }

        System.out.println("The arrays will be checked now, if no text appear talking about a " +
                "number appearing in both arrays, then there is no number that is in\nboth array" +
                " \"a\" and array \"b\".\n");

        //Check for numbers that appear in both arrays
        for (int i = 0; i < amount; i++) {

            for (int j = 0; j < amount; j++) {

                if (a[i] == b[j]) {
                    System.out.println("The number " + a[i] + " is in both arrays.");
                    break;
                }

            }

        }
    }
}
