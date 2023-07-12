package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que pergunte dois valores reais e apresente o primeiro com acréscimo de 30% e o segundo
 * com desconto de 25%.
 *
 * English
 * Create a code that asks for 2 values then show the first plus 30%, and the second minus 25%.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double n1, n2;

        System.out.println("Insert the first value:");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the second value: ");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The first value plus 30% is " + (n1 + (n1 * 0.3)) +
                "\nThe second value minus 25% is: " + (n2 - (n2 * 0.25)));
    }
}
