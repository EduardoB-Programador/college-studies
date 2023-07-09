package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos valores, de forma que a variável
 * a passe a possuir o valor da variável b, e que a variável b passe a possuir o valor da variável a, e
 * apresente os valores trocados.
 *
 * English
 * Create a code that asks for 2 values, those being "a" and "b", then chance one value with the other in a way
 * that the value of "a" will be "b" and the the value of "b" will be "a".
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, aux;

        System.out.println("Insert the value for a:");
        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the value for b:");
        b = scanner.nextDouble();
        scanner.nextLine();

        aux = a;
        a = b;
        b = aux;

        System.out.println("The value of a: " + a +
                "\nThe value of b:" + b);
    }
}
