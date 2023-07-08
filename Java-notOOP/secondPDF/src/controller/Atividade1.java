package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o valor
 * com o acréscimo dos 10% da gorjeta do garçom.
 *
 * English
 * Create a code that asks the amount of the bill of a restaurant and show the value with the waiter's tip (10%)
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much is the bill?");
        double value = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The price of the bill was " + value + ", but with the waiter's tip it is now " + (value * 1.10));
    }
}