package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte um valor numérico inteiro e faça a exibição desse valor caso seja
 * divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa deverá exibir a mensagem “Valor não é
 * divisível por 4 e 5”.
 *
 * English
 * Create a code that asks for a integer and tell if that number can be divided by 4 and 5, if the number
 * cannot result in a integer after dividing it the code must show "Integer cannot be divided by 4 and 5".
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number and I'll tell if that number can be divided by 4 and 5");
        int num = scanner.nextInt();
        scanner.nextLine();

        if ((num % 4 == 0) && (num % 5 == 0)) {
            System.out.println("That number can result in a integer after dividing by 4 and 5.");
        } else {
            System.out.println("Integer cannot be divided by 4 and 5");
        }
    }
}
