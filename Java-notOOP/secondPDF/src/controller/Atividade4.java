package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte ao usuário o seu peso e sua altura. Ao final o programa deverá exibir na
 * tela o valor do índice de massa corporal desta pessoa (IMC).
 *
 * English
 * Create a code that asks the user their weight and height. Then the code must show the body mass index (BMI).
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kg, m;

        System.out.println("How much do you weight? (kilograms)");
        kg = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How tall are you? (meters)");
        m = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("You body mass index is " + (kg / (Math.pow(m, 2))));
    }
}
