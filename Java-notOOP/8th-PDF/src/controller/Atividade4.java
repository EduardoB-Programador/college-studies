package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside, e apresente
 * uma das seguintes alternativas como resposta: Carioca, Paulista, Mineiro, Outros Estados.
 *
 * English
 * Create a code that asks for an acronym of the person's state (in brazil), then show a
 * message telling
 **/

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the acronym of the state in Brazil that you live?");
        String acronym = scanner.nextLine();

        switch (acronym) {
            case "AC":
            case "ac":
                System.out.println("You are Acriano.");
                break;

            case "AL":
            case "al":
                System.out.println("You are Alagoano.");
                break;

            case "AP":
            case "ap":
                System.out.println("You are Amapaense.");
                break;

            case "AM":
            case "am":
                System.out.println("You are Amazonense.");
                break;

            case "BA":
            case "ba":
                System.out.println("You are Baiano.");
                break;

            case "CE":
            case "ce":
                System.out.println("You are Cearense.");
                break;

            case "ES":
            case "es":
                System.out.println("You are Capixaba or Espírito Santense.");
                break;

            case "GO":
            case "go":
                System.out.println("You are Goiano.");
                break;

            case "MA":
            case "ma":
                System.out.println("You are Maranhense.");
                break;

            case "MT":
            case "mt":
                System.out.println("You are Mato-Grossense.");
                break;

            case "MS":
            case "ms":
                System.out.println("You are Sul-Mato-Grossense.");
                break;

            case "MG":
            case "mg":
                System.out.println("You are Mineiro.");
                break;

            case "PA":
            case "pa":
                System.out.println("You are Paraense.");
                break;

            case "PB":
            case "pb":
                System.out.println("You are Paraibano.");
                break;

            case "PR":
            case "pr":
                System.out.println("You are Paranaense.");
                break;

            case "PE":
            case "pe":
                System.out.println("You are Pernambucano.");
                break;

            case "PI":
            case "pi":
                System.out.println("You are Piauiense.");
                break;

            case "RJ":
            case "rj":
                System.out.println("You are Carioca or Fluminense.");
                break;

            case "RN":
            case "rn":
                System.out.println("You are Portiguar or Norte-Rio-Grandense.");
                break;

            case "RS":
            case "rs":
                System.out.println("You are Gaúcho or Sul-Rio-Grandense.");
                break;

            case "RO":
            case "ro":
                System.out.println("You are Rondoniano or Rondoniense.");
                break;

            case "RR":
            case "rr":
                System.out.println("You are Roraimense.");
                break;

            case "SC":
            case "sc":
                System.out.println("You are Catarinense.");

            case "SP":
            case "sp":
                System.out.println("You are Paulista.");
                break;

            case "SE":
            case "se":
                System.out.println("You are Sergipano.");
                break;

            case "TO":
            case "to":
                System.out.println("You are Tocantinense.");
                break;

            case "DF":
            case "df":
                System.out.println("You are Brasiliense.");
                break;

            default:
                System.out.println(acronym + " is not an acronym for any state in Brazil.");
        }
    }
}
