package controller;

/**Português
 * Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares situados na faixa
 * de 1000 a 1500.
 *
 * English
 * Create a code that shows all odd numbers between 1000 and 1500.
 **/

public class Atividade1 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 1500; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
