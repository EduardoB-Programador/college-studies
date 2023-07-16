package controller;

/**Português
 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.
 *
 * English
 * Create a code that shows the integers squared from 15 to 200.
 **/

public class Atividade3 {
    public static void main(String[] args) {
        int i = 15;

        while (i <= 200) {
            System.out.println((Math.pow(i, 2)));
            i++;
        }
    }
}
