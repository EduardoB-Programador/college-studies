package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que apresente os resultados de uma tabuada de um número qualquer informado pelo
 * usuário.
 *
 * English
 * Create a code that asks for a number and then create a simple table multiplying that number with every
 * number from 1 to 10.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int i = 1, num = scanner.nextInt();
        scanner.nextLine();

        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
