package controller;

/**Português
 * Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20.
 *
 * English
 * Create a code that shows all odd integers between 0 and 20.
 **/

public class Atividade8 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i % 2 != 0) {
                System.out.println("The number " + i + " is odd.");
            }
            i++;
        }
    }
}
