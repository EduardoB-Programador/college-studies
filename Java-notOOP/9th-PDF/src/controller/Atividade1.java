package controller;

import java.util.Scanner;

/**Português
 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte ao usuário
 * o nome e a profissão de 5 pessoas e preencha estes vetores. Ao final exiba um relatório
 * apontando o nome e a profissão de cada uma das 5 pessoas cadastradas.
 *
 * English
 * Create 2 arrays one called name and the other called job, each one with 5 elements. Ask
 * the user for someone's name and job 5 times then show at the end the person's name and
 * their job.
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String name [] = new String[amount];
        String job [] = new String[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("What is the person's name?");
            name[i] = scanner.nextLine();

            System.out.println("What is that person's job?");
            job[i] = scanner.nextLine();
        }

        System.out.println("\n\nName\t\tJob");
        for (int i = 0; i < amount; i++) {
            System.out.println(name[i] + "\t\t" + job[i]);
        }
    }
}
