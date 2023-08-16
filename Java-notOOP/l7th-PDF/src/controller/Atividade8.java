package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa, sexo e idade, e
 * exiba o nome inteiro das pessoas que são do sexo masculino e possuem 21 anos ou mais.
 *
 * English
 * Create a code that asks for a person's name, the person's gender and age, then show the name of
 * the people that are male and have 21 years old or be older than 21 years.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, gender;
        int age;

        for (int i = 1; i <= 20; i++) {
            System.out.println("What is the person's name?");
            name = scanner.nextLine();

            System.out.println("What is the person's gender?");
            gender = scanner.nextLine();

            System.out.println("What is the person's age?");
            age = scanner.nextInt();
            scanner.nextLine();

            if ((age >= 21) && (gender.equals("male"))) {
                System.out.println("\n" + name + "\n");
            }

            if (i != 20){
                System.out.println("Starting again");
            }
        }

    }
}
