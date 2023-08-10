package controller;

/**Português
 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20.
 *
 * English
 * Create a code that shows all numbers that can be divided by 4 lesser than 20.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 20);
    }
}
