package controller;

import java.util.Scanner;

/**Português
 * A série de Ricci difere da série de Fibonacci porque os dois primeiros termos são fornecidos pelo
 * usuário. O restante da série é calculado da mesma forma que na série de Fibonacci. Altere o programa
 * da questão anterior, para que sejam perguntados os dois primeiros termos da série de Ricci, e
 * sejam exibidos os 15 termos subsequentes desta série.
 *
 * English
 * Create a code that shows the Ricci series and, for that, ask the user for the 2 first number.
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pre, now, after, i = 1;

        System.out.println("Insert the first number:");
        pre = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the second number:");
        now = scanner.nextInt();
        scanner.nextLine();

        System.out.println(pre);

        do {
            System.out.println(now);

            after = pre + now;
            pre = now;
            now = after;

            i++;
        } while ((i + 1) <= 15);
    }
}
