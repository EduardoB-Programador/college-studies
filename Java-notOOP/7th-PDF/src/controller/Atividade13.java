package controller;

import java.util.Scanner;

/**Português
 * Sabendo-se que uma Polegada equivale a 2,54 centímetros, desenvolver um programa que exiba uma
 * tabela de conversões de polegadas para centímetros, de 1 polegada até um valor inteiro de
 * polegada inserido pelo usuário.
 *
 * English
 * Knowing that an inch is equal to 2.54 centimeters, create a code that shows a conversion table from
 * inches to centimeters, ask the user for a measurement value in inches then show the conversion table
 * from 1 to the number that was asked.
 **/

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a distance in inches");
        double num = scanner.nextDouble();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + " inch is = " + (i * 2.54) + " centimeters");
        }
    }
}
