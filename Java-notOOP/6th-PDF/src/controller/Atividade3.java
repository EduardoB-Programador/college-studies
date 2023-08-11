package controller;

/**Português
 * Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
 *
 * English
 * Create a code that shows the sum of the first five integers.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        int i = 1, acum = 0;

        do {
            acum = acum + i;
            i++;
        } while (i <= 5);

        System.out.println(acum);
    }
}
