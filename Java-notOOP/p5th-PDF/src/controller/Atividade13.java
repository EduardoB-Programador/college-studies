package controller;

/**Português
 * Desenvolver um programa que imprima a tabuada de 3 a 6.
 *
 * English
 * Create a code that shows the multiplication table of 3, 4, 5 and 6.
 **/

public class Atividade13 {
    public static void main(String[] args) {
        int i = 3, j = 1;

        while (i <= 6) {
            while (j <= 10){
                System.out.println(i + " * " + j + " = " + (i*j));
                j++;
            }
            j = 1;
            i++;
        }
    }
}
