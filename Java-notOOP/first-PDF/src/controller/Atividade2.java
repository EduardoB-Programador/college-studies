package controller;

import java.util.Scanner;

/**Português
 * Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
 * a) Resultado de suas adições
 * b) Resultado de suas multiplicações
 *
 * English
 * Do a Code that asks 4 integers and show 2 results
 * a) The result from adding all those numbers
 * b) The result from multiplying all those numbers
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, multi, add;

        System.out.println("Type the first integer");
        n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type the second integer");
        n2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type the third integer");
        n3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Type the fourth integer");
        n4 = scanner.nextInt();
        scanner.nextLine();

        add = n1 + n2 + n3 + n4;
        multi = n1 * n2 * n3 * n4;

        System.out.println("The addition of those number is " + add + ".\nAnd the multiplication of those numbers is " + multi + ".");
    }
}
