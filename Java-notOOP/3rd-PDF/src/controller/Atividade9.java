package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que solicite a razão de uma pa (Progressão Aritmética) e o valor do 1º termo.
 * E apresente o 10º termo da série.
 *
 * English
 * Create a code that asks the difference between each term from a arithmetic sequence and the 1st term of it,
 * then show the 10th term.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, difference;

        System.out.println("Insert the first term of an arithmetic sequence:");
        first = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the difference between each term in the AP:");
        difference = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The 10th term of the arithmetic sequence is " + (first + difference * 9));
    }
}
