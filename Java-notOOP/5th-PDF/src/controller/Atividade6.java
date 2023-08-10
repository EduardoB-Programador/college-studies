package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e apresente o valor obtido da
 * multiplicação sucessiva de n por 3 enquanto o produto for menor que 250.
 *
 * English
 * Create a code that asks for a number lesser or equal to 50, then show that number times 3 and the result
 * of it times 3 and so on until that number is no longer less than 250.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number lesser or equal to 50:");
        int num = scanner.nextInt();

        if (num <= 50) {
            while (num <= 250) {
                System.out.println(num);
                num = num * 3;
            }
        } else {
            System.out.println("Try again, next time insert a number lesser or equal to 50.");
        }
    }
}
