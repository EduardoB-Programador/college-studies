package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.
 *
 * English
 * Create a code that asks the income of a employee then show that value 15% higher.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much is your income?");
        double income = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Your new income is now " + (income * 1.15));
    }
}
