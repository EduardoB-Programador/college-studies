package controller;

/**Português
 * Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500.
 * Utilize um laço que efetue a variação de 2 em 2.
 *
 * English
 * Create a code that shows at the end the sum of all even numbers between 0 and 500. Use i+=2.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        int i = 0, acum = 0;

        while (i < 500) {
            acum = acum + i;
            i+=2;
        }
        System.out.println(acum);
    }
}
