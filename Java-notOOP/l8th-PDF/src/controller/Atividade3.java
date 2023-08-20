package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número e informe como resposta se o número informado
 * é par ou é ímpar.
 *
 * English
 * Create a code that asks for a number then show a message telling if that number is even or odd.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number");
        int num = scanner.nextInt();
        scanner.nextLine();

        String check;
        if (num % 2 == 0) {
            check = "even";
        } else {
            check = "odd";
        }

        switch (check) {
            case "even":
                System.out.println("The number " + num +" is even.");
                break;

            case "odd":
                System.out.println("The number " + num + " is odd.");
                break;
        }
    }
}
