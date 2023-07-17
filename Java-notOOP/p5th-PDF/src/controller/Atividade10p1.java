package controller;

/**Português
 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15. Use Math.pow.
 *
 * English
 * Create a code that shows the number 3 raised to every power from 0 to 15. Use Math.pow.
 **/

public class Atividade10p1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 15) {
            System.out.println("3 raised to the power of " + i + " is " + Math.pow(3,i));
            i++;
        }
    }
}
