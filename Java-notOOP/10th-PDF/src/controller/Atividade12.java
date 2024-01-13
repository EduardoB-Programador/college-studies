package controller;

import java.util.Scanner;

/**Português
 * Uma escola precisa informatizar seu quadro de notas escolares. Desenvolva
 * um programa que pergunte quantos alunos a turma possui e em seguida armazene
 * cada uma das 4 notas que cada aluno da turma possui. Ao final o programa
 * deverá apresentar relatório com as notas por aluno, a média, e se o aluno
 * foi aprovado ou reprovado.
 *
 * English
 * A school needs to create a report card for all students in each class.
 * Create a code that asks how many students are in the classroom then store
 * for each student 4 scores. At the end the code must show a table that
 * contains the grades of all students, the average grade of each of them and
 * show the student situation (if the student passed or failed the school year).
 **/

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is done because I can input lower numbers in order to test the code first
        System.out.println("How many students?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        double genRepCard [] [] = new double[rows][4];
        double average [] = new double[rows];
        //It's 4 because it's related because the school year is usually divided by 4
        //So it's one score per school division

        //Grades input for each student and calculating the average of each student
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("What is the student " + (i + 1) +" grade "+
                        (j+1) +"?(0.0 - 10.0)");
                genRepCard[i][j] = scanner.nextDouble();
                scanner.nextLine();

                //i -> rows -> students
                //j -> year/4

                average[i] += genRepCard[i][j];

            }

            average[i] /= 4;

        }

        //Output
        System.out.println("-----------------------------------------------------" +
                "-----------------------------------------------------" +
                "\n----------\t1st grade\t2nd grade\t3rd grade\t4th grade\tAverage\tSituation");
        for (int i = 0; i < rows; i++) {

            System.out.print("Student " + (i + 1) + ":\t");

            for (int j = 0; j < 4; j++) {

                if (j != 3) {
                    System.out.print(genRepCard[i][j] + "\t\t\t");
                } else {
                    System.out.println(genRepCard[i][j] + "\t\t\t" + average[i] + "\t\t\t" +
                            (average[i] >= 7 ? "Succeeded" : "Failed"));
                }

            }
        }
        System.out.println("-----------------------------------------------------" +
                "-----------------------------------------------------");

    }
}
