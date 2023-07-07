package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte 1 número e apresente:
 * a) O próprio número
 * b) O quadrado deste número
 * c) A raiz quadrada deste número
 *
 * English
 * Create a code that asks for 1 number then show:
 * a) The number informed;
 * b) The number squared;
 * c) The square root of that number;
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type any number");
        double num = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The number is " + num +
                "\nThat number squared is " + Math.pow(num,2) +
                "\nThe square root of that number is " + Math.sqrt(num));;
    }
}
