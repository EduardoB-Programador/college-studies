package controller;

import java.util.Scanner;

/**Português
 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por extenso dos
 * dias da semana. Em seguida pergunte ao usuário um número e apresente o dia correspondente ao
 * número no vetor, ou exiba a mensagem “Número não corresponde a um dia da semana.”
 *
 * English
 * Create a array called "week" with 7 elements containing all the week days. Ask the user
 * for a number then show the day of the week corresponding to the number, or, if the number
 * inserted don't correspond to any week day, show the message "This number do not correspond to
 * any day of the week".
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String week[] = new String[7];

        week[0] = "sunday";
        week[1] = "monday";
        week[2] = "tuesday";
        week[3] = "wednesday";
        week[4] = "Thursday";
        week[5] = "friday";
        week[6] = "saturday";

        for (int i = 0; i != 1;) {

            System.out.println("Insert a number:(if you want to stop, type -10)");
            int number = scanner.nextInt();
            scanner.nextLine();

            if ((number <= 7) && (number >= 1)) {
                System.out.println("The number " + number + " correspond to " + week[number - 1] +
                        "\n\n");
            } else if (number == -10) {
                System.out.println("Program ended.");
                i++;
            } else {
                System.out.println("This number do not correspond to any day of the week.\n\n");
            }

        }

    }
}
