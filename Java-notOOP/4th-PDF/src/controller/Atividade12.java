package controller;

import java.util.Scanner;

/**português
 * Desenvolver um programa que pergunte 5 números inteiros e identifique o maior número e o menor número.
 *
 * English
 * Create a code that asks for 5 integers and identify the greater and lesser numbers.
 **/

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, n5, greater, lesser;

        System.out.println("Insert the first integer.");
        n1 = scanner.nextInt();
        scanner.nextLine();

        greater = n1;
        lesser = n1;

        System.out.println("Insert the second integer.");
        n2 = scanner.nextInt();
        scanner.nextLine();

        if (greater < n2) {
            greater = n2;
        }
        if (lesser > n2) {
            lesser = n2;
        }

        System.out.println("Insert the third integer.");
        n3 = scanner.nextInt();
        scanner.nextLine();

        if (greater < n3) {
            greater = n3;
        }
        if (lesser > n3) {
            lesser = n3;
        }

        System.out.println("Insert the fourth integer.");
        n4 = scanner.nextInt();
        scanner.nextLine();

        if (greater < n4) {
            greater = n4;
        }
        if (lesser > n4) {
            lesser = n4;
        }

        System.out.println("Insert the fifth integer.");
        n5 = scanner.nextInt();
        scanner.nextLine();

        if (greater < n5) {
            greater = n5;
        }
        if (lesser > n5) {
            lesser = n5;
        }

        System.out.println("Among the numbers " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " and " + n5 +
                " the greatest of them is " + greater + ", and the lowest of them is " + lesser + ".");
    }
}
