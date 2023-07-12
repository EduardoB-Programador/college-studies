package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que faça duas perguntas: o valor referente às horas atuais e o valor referente aos
 * minutos atuais. Em seguida o programa deverá apresentar como resposta quantos minutos já se passaram desde
 * às 00:00h deste dia.
 *
 * English
 * Create a code that asks the time, at first it will ask specifically the hours and after the minutes. Then
 * the code must show how many minutes has passed since midnight.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours, minutes;

        System.out.println("Can you tell the time? (Only hours)");
        hours = scanner.nextInt();
        scanner.nextLine();

        System.out.println(hours + " hours and how many minutes?");
        minutes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("It has passed " + (hours * 60 + minutes) + " minutes since midnight.");
    }
}
