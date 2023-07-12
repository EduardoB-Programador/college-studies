package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: a soma dos dois
 * números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número, a
 * multiplicação entre os dois números, a divisão do primeiro pelo segundo número, e também o resto da divisão do
 * primeiro pelo segundo número.
 *
 * English
 * Create a code that asks 2 numbers and then show: one number plus the other, the first number minus the second,
 * the second minus the first, the first divided by the second and the rest of division when dividing the first by
 * the second.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.println("Type any number");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Type any number again");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) +
                "\n" + n1 + " - " + n2 + " = " + (n1 - n2) +
                "\n" + n2 + " - " + n1 + " = " + (n2 - n1) +
                "\n" + n1 + " / " + n2 + " = " + (n1 / n2) +
                "\n" + n1 + " % " + n2 + " = " + (n1 % n2));
    }
}
