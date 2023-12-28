package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor nomes. Em
 * seguida o programa deve informar que enquanto o usuário responder SIM, será pedido
 * que ele digite um nome e o programa informará se este nome existe ou não no vetor
 * nomes. Em resumo, o programa deverá fazer o seguinte:
 *
 * • Solicitar 10 nomes para preencher o vetor nomes
 * • Perguntar se o usuário quer fazer uma pesquisa de nomes no vetor nomes.
 * • Se a resposta for SIM, perguntar qual o nome.
 * • Informar se o nome existe ou não no vetor nomes.
 *
 * English
 * Create a code that asks for 10 people names then store in an array. After, the program
 * must ask for a name, to check if the name informed is inside the array, if the user
 * want to continue checking the names in the array they must type "YES" in order to that
 * to happen. Summarizing:
 *
 * • Asks for 10 names;
 * • Ask if the user want to check the name array;
 * • If the user type "YES" then ask for the name they want to check in the list;
 * • Inform the user if the name inserted is in the array.
 **/

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String names[] = new String[amount];
        String check, nameCheck;

        for (int i = 0; i < amount; i++) {

            System.out.println("What is the person's name?");
            names[i] = scanner.nextLine();

        }

        for (int i = 0; i != 1;) {

            System.out.println("Do you want to check the name list?(YES/NO)");
            check = scanner.nextLine();

            if (check.equals("YES")) {

                System.out.println("What is the name you want to check?");
                nameCheck = scanner.nextLine();

                for (int j = 0; j < amount; j++) {

                    if (nameCheck.equals(names[j])) {

                        System.out.println("\nThe name " + nameCheck + " is on the list.\n");
                        break;

                    } else if (!nameCheck.equals(names[j]) && j == amount - 1) {

                        System.out.println("\nThe name " + nameCheck + " is not on the list.\n");

                    }

                }

            } else if (check.equals("NO")) {
                System.out.println("Program ended.");
                break;
            }
        }

    }
}
