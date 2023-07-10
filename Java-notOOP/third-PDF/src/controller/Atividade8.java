package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte a base e a altura de um retângulo, e apresente:
 * a) O perímetro deste retângulo
 * b) A área deste retângulo
 * c) A diagonal deste retângulo
 *
 * English
 * Create a code that asks for the base and height of a rectangle, then show:
 * a) The perimeter of that rectangle
 * b) The area of that rectangle
 * c) And the diagonal of it
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, height;

        System.out.println("Insert the measure of the base of a rectangle:");
        base = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the measure of the height of that rectangle:");
        height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The perimeter of that rectangle is: " + (2 * base + 2 * height) +
                "\nThe area of that rectangle is: " + (base * height) +
                "\nThe diagonal of that rectangle is: " + (Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2))));
    }
}
