package controller;

import java.util.Scanner;

/**Português
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas
 * em dias. Obs: Considere os anos com 365 dias e os meses com 30 dias.
 *
 * English
 * Create a code that gets someones age in years, months and days and show that time span in days. Use
 * 1 year = 365 days; 1 month = 30 days
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month, year;

        System.out.println("How old are you? (only years)");
        year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You have " + year + " years old and how many months?");
        month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You have " + year + " years and " + month + " months old and how many days?");
        day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You have " + ((year * 365) + (month * 30) + day) + " days old.");
    }
}
