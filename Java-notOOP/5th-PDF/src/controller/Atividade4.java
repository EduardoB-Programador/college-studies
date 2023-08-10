package controller;

/**Português
 * Desenvolver um programa que apresente o valor da soma dos cem primeiros números inteiros
 * (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
 *
 * English
 * Create a code that shows the sum of all numbers between 1 and 100, (1 + 2 + 3 + 4 + ... +
 * 97 + 98 + 99 + 100)
 **/

public class Atividade4 {
    public static void main(String[] args) {
        int i = 1, acum = 0;
        while (i <= 100) {
            acum = acum + i;
            i++;
        }
        System.out.println(acum);
    }
}
