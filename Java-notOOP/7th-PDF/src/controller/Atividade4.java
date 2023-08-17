package controller;

/**Português
 * Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50.
 *
 * English
 * Create a code that shows all number that can be divided by 5 resulting in 0 lesser than 50.
 **/

public class Atividade4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
