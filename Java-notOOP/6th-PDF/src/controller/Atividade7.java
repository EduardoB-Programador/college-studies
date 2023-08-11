package controller;

/**Português
 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.
 *
 * English
 * Create a code that shows the number 2 powered from 0 to 10.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(Math.pow(2,i));
            i++;
        } while (i <= 10);
    }
}
