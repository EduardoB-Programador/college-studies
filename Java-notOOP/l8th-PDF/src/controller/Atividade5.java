package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um número de 1 a 12, e responda o mês correspondente
 * ao número, ou se o número não corresponde a nenhum dos 12 meses.
 *
 * English
 * Create a code that asks for a number from 1 to 12, and show the respective month based on
 * that number.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert a number from 1 to 12");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("The number " + num + " is not related to any month.");
        }
    }
}
