package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
 * deve apresentar os dados anteriormente informados.
 *
 * English
 * Create a code that asks the user their name and gender. Then the code must show the information given.
 **/
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your gender?");
        String gender = scanner.nextLine();

        System.out.println("Your name is " + name + " and your gender is " + gender + ".");
    }
}
