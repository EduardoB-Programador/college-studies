package controller;

import java.util.Scanner;

/**Português
 * Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome, telefone e endereço
 * de 5 pessoas. Em seguida peça ao usuário para digitar um número de 1 a 5, e exibir como
 * resposta os dados da pessoa cadastrada no número informado.
 *
 * English
 * Create 3 arrays, called them: names, phoneNumber and address. Ask the user for a name, a phone
 * number and an address from 5 people. Then ask the user to type a number between 1 and 5, then
 * exhibit the information of the person (name, phoneNumber and address) on that position in the
 * array.
 **/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        String name[] = new String[amount];
        String phoneNumber[] = new String[amount];
        String address[] = new String[amount];
        String check;
        int numCheck;

        for (int i = 0; i < amount; i++) {

            System.out.println("What is this person's name?");
            name[i] = scanner.nextLine();

            System.out.println("What is this person's phone number?");
            phoneNumber[i] = scanner.nextLine();

            System.out.println("What is this person's address?");
            address[i] = scanner.nextLine();
        }

        while (true) {

            System.out.println("Do you want to check the people information?(YES/NO)");
            check = scanner.nextLine();

            if (check.equals("YES")) {

                System.out.println("Type a number between 1 and " + amount + ".");
                numCheck = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\n-------------------------\nName: "
                        + name[numCheck - 1] + "\nPhone Number:" + phoneNumber[numCheck - 1] +
                        "\nAddress: " + address[numCheck - 1] + "\n-------------------------\n");

            } else if (check.equals("NO")) {
                System.out.println("Program ended.");
                break;
            }

        }
    }
}
