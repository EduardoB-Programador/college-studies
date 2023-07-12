package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. Considere U$1,00 =
 * R$5,42.
 *
 * English
 * Create a code that asks for a amount in dollars then show the equivalent in reais (Brazilian currency).
 * Use U$1.00 = R$5.42
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you have? (Dollars)");
        double money = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("You have U$" + money + ", that is equivalent to R$" + (money * 5.42) + ".");
    }
}
