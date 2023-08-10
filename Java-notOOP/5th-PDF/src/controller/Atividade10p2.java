package controller;

/**Português
 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15. Não use Math.pow.
 *
 * English
 * Create a code that shows the number 3 raised to every power from 0 to 15. Don't use Math.pow.
 **/

public class Atividade10p2 {
    public static void main(String[] args) {
        int i = 0, acum = 1;

        while (i <= 15) {

            if (i == 0) {
                System.out.println("3 raised to the power of " + i + " is 1");
            } else {
                System.out.println("3 raised to the power of " + i + " is " + (3 * acum));
                acum = acum * 3;
            }

            i++;
        }
    }
}
