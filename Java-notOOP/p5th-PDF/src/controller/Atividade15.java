package controller;

/**Português
 * Desenvolver um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é
 * formada pela sequência 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo posterior
 * com seu anterior subsequente.
 *
 * English
 * Create a code that shows the 15th number from the Fibonacci series.
 **/

public class Atividade15 {
    public static void main(String[] args) {
        int pre = 0, now = 1, after, i = 1;

        while (i <= 15) {
            System.out.println(now);

            after = now + pre;
            pre = now;
            now = after;

            i++;
        }
    }
}
