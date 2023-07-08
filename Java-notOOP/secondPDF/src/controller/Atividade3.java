package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros). Ao final o
 * programa deverá exibir na tela para o usuário o valor do peso informado em gramas e a altura em centímetros.
 *
 * English
 * Create a code that asks the user their weight (kilograms) and their height (meters). Then the code must show the
 * weight in grams and the height in centimeters.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kg, m;

        System.out.println("How much do you weight? (Kilograms)");
        kg = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is your height? (meters)");
        m = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Your weight in grams is " + (kg * 1000) + "\nAnd your height in centimeters is " +
                (m * 100));
    }
}
