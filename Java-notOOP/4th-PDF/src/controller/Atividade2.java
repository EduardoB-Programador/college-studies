package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que permita ao aluno responder qual a capital do Brasil. O programa deverá exibir se
 * a resposta está certa ou errada.
 *
 * English
 * Create a code that let the user answer what is the capital of Brazil. The code must show if the answer is
 * correct or not.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the capital of Brazil?");
        String capital = scanner.nextLine();

        if (capital.equals("Brasília") || capital.equals("brasília") || capital.equals("Brasilia") || capital.equals("brasilia")) {
            System.out.println("Correct! The capital of Brazil is Brasília.");
        } else {
            System.out.println("Incorrect, the capital of Brazil is Brasília.");
        }
    }
}
