package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba mensagem informando que o
 * aluno foi aprovado se a média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma
 * mensagem informando essa condição. Apresentar junto com a mensagem de aprovação ou reprovação o valor
 * da média obtida pelo aluno.
 *
 * English
 * Create a code that asks for 4 grades of a student then calculate the average of all of them, and show
 * a message telling that the student can go to the next grade if the average is equal or greater than 5.
 * If it's not equal or greater than 5, show a message telling that they cannot go to the next grade.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2 ,n3 ,n4, average;

        System.out.println("Insert the 1st grade:");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the 2nd grade:");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the 3rd grade:");
        n3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the 4th grade:");
        n4 = scanner.nextDouble();
        scanner.nextLine();

        average = (n1 + n2 + n3 + n4) / 4;

        if (average >= 5) {
            System.out.println("The average grade of that student is " + average +
                    " and they can go to the next grade.");
        } else {
            System.out.println("The average grade of that student is " + average +
                    " and they cannot go to the next grade.");
        }
    }
}
