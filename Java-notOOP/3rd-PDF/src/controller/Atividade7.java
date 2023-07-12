package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte os valores dos catetos de um triângulo retângulo e apresente o valor da
 * hipotenusa.
 *
 * English
 * Create a code that asks for the measure of the legs from a right-angled triangle, then show the hypotenuse.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double leg1, leg2;

        System.out.println("Insert the measure of the first leg of the right angled triangle:");
        leg1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the measure of the other leg:");
        leg2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The measure of the hypotenuse is: " +
                (Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2))));
    }
}
