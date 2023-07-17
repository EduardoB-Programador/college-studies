package controller;

/**Português
 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
 * Desta forma, temos que 5! = 5 * 4 * 3 * 2 * 1 ou 5! = 1 * 2 * 3 * 4 * 5, equivalente a 120.
 *
 * English
 * Create a code that calculate the factorial of 5, or 5!. Your can do 5*4*3*2*1 or 1*2*3*4*5, 5! = 120.
 **/

public class Atividade14 {
    public static void main(String[] args) {
        int i = 5, acum;

        acum = 5;

        while (i >= 1) {

            if (i != 5) {
                acum = acum * i;
            }

            i--;

        }

        System.out.println(acum);
    }
}
