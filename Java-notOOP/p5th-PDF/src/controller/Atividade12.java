package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que peça ao usuário para digitar diversos números reais, e ao final, exibir o maior e o
 * menor número que foram digitados, além da média entre TODOS os números digitados pelo usuário. A inserção
 * de números deve parar quando o usuário digitar o número -1, e este número -1 não deve ser considerado nem
 * como maior, nem como menor, e nem na contagem da média.
 *
 * English
 * Create a code that asks the user for a amount of numbers, at the end the code must show the
 * largest and smallest numbers and also the average between all of them. The number insertion must stop when
 * the user types -1, the number shall not be included in any of the previous operations.
 **/

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, large, small, i = 0;
        double average = 0;

        System.out.println("Insert a number, if you want the number insertion to stop, type -1");
        num = scanner.nextInt();

        large = num;
        small = num;

        while (num != -1) {
            if (num > large) {
                large = num;
            } else if (num < small) {
                small = num;
            }

            average = average + num;

            i++;

            System.out.println("Insert a number, if you want the number insertion to stop, type -1");
            num = scanner.nextInt();
        }

        average = (double) average / i;

        System.out.println("The largest number is: " + large +
                "\nThe smallest number is: " + small +
                "\nThe average of all numbers is: " + (double) average);

        System.out.println("Ended");
    }
}
