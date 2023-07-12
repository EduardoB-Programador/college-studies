package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que solicite a razão de uma pg (Progressão Geométrica) e o valor do 1º termo.
 * E apresente o 5º termo da série.
 *
 * English
 * Create a code that asks for a common ration a geometric progression and the 1st term, then show the
 * 5th term
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, common;

        System.out.println("Insert the first term of a geometric progression:");
        first = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the common ratio of that geometric progression:");
        common = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The 5th term of that geometric progression is " + (first * Math.pow(common, 4)));
    }
}
