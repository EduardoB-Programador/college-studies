package controller;

/**Português
 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.
 *
 * English
 * Create a code that shows the number 2 powered by every number from 0 to 10.
 **/

public class Atividade5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println((Math.pow(2,i)));
        }
    }
}
