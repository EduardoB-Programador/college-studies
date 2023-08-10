package controller;

/**Português
 * Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de
 * 0 até 500. Utilize um laço que varie de 2 em 2.
 *
 * English
 * Create a code that shows the sum of all even number from 0 to 500;
 **/

public class Atividade2 {
    public static void main(String[] args) {
        int i = 0, acum = 0;

        do {
            acum = acum + i;
            i+=2;
        } while (i <= 500);

        System.out.println(acum);
    }
}
