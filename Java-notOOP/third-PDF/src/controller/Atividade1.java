package controller;

import java.util.Scanner;

/**Português
 * Elaborar um programa de computador que pergunte ao usuário o valor do Raio de um círculo e calcule a área do
 * referido círculo, apresentando o resultado deste cálculo. area = 𝝅𝒓²
 *
 * English
 * Create a code that asks the user for a radius of a circle then calculate the area of that circle. Use
 * area = 𝝅𝒓²
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a value to be the radius of a circle");
        double radius = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The area of the circle is " + (Math.PI * (Math.pow(radius, 2))));
    }
}
