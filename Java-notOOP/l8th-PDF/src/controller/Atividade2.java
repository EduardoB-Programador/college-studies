package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a seguinte orientação
 * de acordo com o sexo informado: “Banheiro masculino à direita” ou “Banheiro feminino à esquerda”.
 *
 * English
 * Create a code that asks for someone's gender then show a message informing, based on the gender
 * informed, where is the bathroom.
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your gender?");
        String gender = scanner.nextLine();

        switch (gender) {
            case "female":
            case "woman":
            case "f":

                System.out.println("The women's bathroom is at the left.");
                break;

            case "male":
            case "man":
            case "m":
                System.out.println("The men's bathroom is at the right.");
                break;

            default:
                System.out.println("I don't want to offend you, but for you to know the women's bathroom" +
                        " is at the left and the men's bathroom is at the right.");
        }
    }
}
