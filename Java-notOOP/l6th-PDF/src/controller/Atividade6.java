package controller;

/**Português
 * Desenvolver um programa que apresente os quadrados dos números inteiros de 2 a 50.
 *
 * English
 * Create a code that shows the numbers from 2 to 50 squared.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.println(i + "² = " + (Math.pow(i,2)));
            i++;
        } while (i <= 50);
    }
}
