package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, e apresente esta
 * temperatura convertida em graus Celsius. A fórmula da conversão é c = (f – 32) x 5 : 9 , onde c  é a temperatura
 * em graus Celsius e f  em Fahrenheit.
 *
 * English
 * Create a code that asks the temperature in degrees fahrenheit, then show that temperature in degrees celsius.
 * Use c = (f - 32) * 5 / 9
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform a temperature in degrees fahrenheit");
        double temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The temperature " + temp + " in fahrenheit is equivalent to " + ((temp - 32) * 5 / 9) +
                " in celsius.");

    }
}
