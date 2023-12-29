package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que armazene nome e salário de 20 pessoas, calcule e armazene o
 * novo salário sabendo-se que houve um reajuste de 8%. Exibir uma listagem numerada com
 * nome e novo salário.
 *
 * English
 * Create a code that stores the name and the income of 20 people, but the income of all
 * employees were raised by 8%, store the new income of each person then show the person's
 * name and the new salary.
 **/

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String name[] = new String[amount];
        double income[] = new double[amount];

        for (int i = 0; i < amount; i++) {

            //Name input
            System.out.println("What is this person's name?");
            name[i] = scanner.nextLine();

            //Income input
            System.out.println("What is this person's income?");
            income[i] = scanner.nextDouble();
            scanner.nextLine();

            income[i] *= 1.08;
        }

        for (int i = 0; i < amount; i++) {
            System.out.println("\n-------------------------------\n" +
                    "Name: " + name[i] + "\nSalary: " + income[i] +
                    " US\n-------------------------------\n");
        }
    }
}
