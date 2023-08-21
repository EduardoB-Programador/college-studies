package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o código desejado.
 * Mostre como resposta uma mensagem confirmando a escolha do usuário, ou que o número digitado não
 * existe no menu de opções.
 *
 * 1 - Incluir
 * 2 - Alterar
 * 3 - Excluir
 * 4 - Pesquisar
 * 5 - Sair
 *
 * English
 *
 * Create a code that shows the table bellow and asks for a number to execute the options from the
 * table. Show a message confirming the selected option, if the number written is not in the menu
 * show a message telling that "the number x is not an option".
 *
 * 1 - Include
 * 2 - Change
 * 3 - Delete
 * 4 - Search
 * 5 - Leave
 **/

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option,i = 0;
        String yesOrNo = "n";

        while (i == 0) {
            System.out.println("Type a number to execute one of the bellow\n1 - Include\n2 - Change\n3 - Delete\n" +
                    "4 - Search\n5 - Leave");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    while (!yesOrNo.equals("y")) {
                        System.out.println("You selected include. Do you want to get back to the" +
                                " original menu?(y/n)");
                        yesOrNo = scanner.nextLine();
                    }
                    yesOrNo = "n";
                    break;

                case 2:
                    while (!yesOrNo.equals("y")) {
                        System.out.println("You selected change. Do you want to get back to the" +
                                " original menu?(y/n)");
                        yesOrNo = scanner.nextLine();
                    }
                    yesOrNo = "n";
                    break;

                case 3:
                    while (!yesOrNo.equals("y")) {
                        System.out.println("You selected delete. Do you want to get back to the" +
                                " original menu?(y/n)");
                        yesOrNo = scanner.nextLine();
                    }
                    yesOrNo = "n";
                    break;

                case 4:
                    while (!yesOrNo.equals("y")) {
                        System.out.println("You selected search. Do you want to get back to the" +
                                " original menu?(y/n)");
                        yesOrNo = scanner.nextLine();
                    }
                    yesOrNo = "n";
                    break;

                case 5:
                    System.out.println("Program ended. You left.");
                    i++;
                    break;

                default:
                    System.out.println("The number " + option + " is not an option, try again.");
            }
        }
    }
}
