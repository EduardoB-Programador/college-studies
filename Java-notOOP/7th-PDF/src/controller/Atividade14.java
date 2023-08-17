package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15 alunos de uma
 * turma. E exiba a listagem contendo nome, nota1, nota2, média e apresente “APROVADO” se a
 * média for maior ou igual a 5, e “REPROVADO” se a média for menor que 5. Ao final, exibir
 * também a média da turma.
 *
 * English
 * Create a code that asks the name, 1st grade and 2nd grade from 15 students, then show the
 * student's name, 1st grade, 2nd grade, the average between the 2 of them and show
 * "approved" if the student's average is greater or equal to 5, or "failed" if the student's
 *  average is lesser than 5, also show the average of all the students together.
 **/

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students, grade1, grade2;
        double average, globalAverage = 0;
        String name;

        System.out.println("How many students there is in the class?");
        students = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= students; i++) {
            System.out.println("What is the name of the student?");
            name = scanner.nextLine();

            System.out.println("What is that student's first grade?");
            grade1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is that student's second grade?");
            grade2 = scanner.nextInt();
            scanner.nextLine();

            average = (double) (grade1 + grade2)/2;
            globalAverage = globalAverage + average;

            if (average >= 5) {
                System.out.println("The student " + name + " got " + grade1 + " as the first grade, and " +
                        grade2 + " as the second. The average is " + average +
                        " and the student is approved.");
            } else {
                System.out.println("The student " + name + " got " + grade1 + " as the first grade, and " +
                        grade2 + " as the second. The average is " + average +
                        " and the student failed.");
            }
        }

        globalAverage = globalAverage/students;

        System.out.println("The average score of the class is " + globalAverage);
    }
}
