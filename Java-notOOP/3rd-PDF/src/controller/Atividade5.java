package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, utilizando a fórmula
 * v = 𝝅𝒓𝟐𝒉 . Onde v=Volume, 𝝅=𝟑.𝟏𝟒𝟏𝟓𝟗𝟐𝟔𝟓, r = raio e h = altura.
 *
 * English
 * Create a code that shows the volume of an oil can, using the following formula v = 𝝅𝒓𝟐𝒉.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h, r;

        System.out.println("Insert a value to be the height of a can: (centimeters)");
        h = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert a value to be the radius of a can: (centimeters)");
        r = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The volume of the can is " + (Math.PI * Math.pow(r,2) * h) + "cm³");
    }
}
