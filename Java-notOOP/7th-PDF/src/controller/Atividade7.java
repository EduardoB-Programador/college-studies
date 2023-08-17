package controller;

/**Português
 * Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa
 * de 3 até 21.
 *
 * English
 * Create a code that shows the sum of all even numbers between 3 and 21.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        int acum = 0;

        for (int i = 4;i < 21; i++) {
            if (i % 2 == 0) {
                acum = acum + i;
            }
        }

        System.out.println(acum);
    }
}
