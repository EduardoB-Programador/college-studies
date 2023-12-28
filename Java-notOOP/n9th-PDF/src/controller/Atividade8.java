package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos, calcule e
 * armazene a média, armazene também a situação do aluno (AP ou RP). Exibir ao final uma
 * listagem contendo nomes, notas, médias e situação de cada aluno.
 *
 * English
 * Create a code that store the name of 15 students and their score on the 1st and 2nd exam,
 * calculate the arithmetic average of each student and show at the end a table of each
 * students grades, if the average hit over 50% they succeeded, if it did not hit 50% the
 * student failed.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many student?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String name[] = new String[amount];
        double score1[] = new double[amount];
        double score2[] = new double[amount];
        double average[] = new double[amount];

        for (int i = 0; i < amount; i++) {

            System.out.println("What is the name of the student?");
            name[i] = scanner.nextLine();

            System.out.println("What is " + name[i] + "'s score in the first exam?(0-100)");
            score1[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("What is " + name[i] + "'s score in the second exam?(0-100)");
            score2[i] = scanner.nextDouble();
            scanner.nextLine();

            average[i] = (score1[i] + score2[i])/2;
        }

        for (int i = 0; i < amount; i++) {
            System.out.println("Name\t\t1st Exam\t\t2nd Exam\t\tAverage\n" + name[i] + "\t\t" +
                    score1[i] + "\t\t\t" + score2[i] + "\t\t\t" + average[i] + "\t\t\t" +
                    (average[i] >= 50 ? "Succeeded" : "Failed") + "\n");
        }
    }
}
