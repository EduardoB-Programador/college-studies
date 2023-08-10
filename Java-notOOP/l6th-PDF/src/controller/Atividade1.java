package controller;

/**Português
 * Desenvolver um programa que apresente todos os valores numéricos inteiros pares situados na faixa de
 * 100 a 200.
 *
 * English
 * Create a code that show all even numbers from 100 to 200.
 **/

public class Atividade1 {
    public static void main(String[] args) {
        int i = 100;

        do {
            System.out.println(i);
            i+=2;
        } while (i <= 200);
    }
}
