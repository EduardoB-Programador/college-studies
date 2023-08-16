package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente o valor de uma potência de uma base qualquer elevada
 * a um expoente qualquer, ou seja, de be, onde os valores de b e e são fornecidos pelo usuário,
 * sem utilizar Math.pow().
 *
 * English
 * Create a code that asks for a 2 number, the first will be the base (b) and the second will be the
 * exponent (e) then show the base powered by the exponent, don't use Math.pow.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b, e, acum = 1;

        System.out.println("Insert a base:");
        b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert a exponent:");
        e = scanner.nextInt();
        scanner.nextLine();

        if (e != 0) {
            for (int i = e ;i > 0; i--) {
                acum = acum * b;
            }
        }

        System.out.println(acum);
    }
}
