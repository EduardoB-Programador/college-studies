package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o peso de uma pessoa e também pergunte o código
 * do planeta no qual ela gostaria de obter como resposta o valor do seu peso neste referido
 * planeta. As informações da tabela abaixo (somente as colunas Código e Planeta) devem
 * aparecer como menu de escolha ao usuário:
 *
 *          planeta     gravidade relativa
 *      1 - Mercúrio -      0.37
 *      2 - Vênus    -      0.88
 *      3 - Marte    -      0.38
 *      4 - Júpiter  -      2.64
 *      5 - Saturno  -      1.15
 *      6 - Urano    -      1.17
 *
 * English
 * Create a code that asks for someone's weight then show the table bellow and ask if the
 * person would like to know how much they would weight in each planet, show only the number
 * that relate to each planet and the planet, do not show the relative gravity.
 *
 *          planet     relative gravity
 *      1 - Mercury  -      0.37
 *      2 - Venus    -      0.88
 *      3 - Mars     -      0.38
 *      4 - Jupiter  -      2.64
 *      5 - Saturn   -      1.15
 *      6 - Uranus   -      1.17
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yesOrNo;
        int select ,out = 0;

        System.out.println("How much do you weight?(in Kilograms)");
        double weight = scanner.nextDouble();
        scanner.nextLine();



        while (out == 0) {

            System.out.println("\nWould you like to see your weight in what planet?\n" +
                    "1 - Mercury\n2 - Venus\n3 - Mars\n4 - Jupiter\n5 - Saturn\n6 - Uranus\n7 - Leave\n");
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {

                case 1:
                    System.out.println("Your weight in Mercury is " + (weight * 0.37) + " kilograms.");
                    break;

                case 2:
                    System.out.println("Your weight in Venus is " + (weight * 0.88) + " kilograms.");
                    break;

                case 3:
                    System.out.println("Your weight in Mars is " + (weight * 0.38) + " kilograms.");
                    break;

                case 4:
                    System.out.println("Your weight in Jupiter is " + (weight *  2.64) + " kilograms.");
                    break;

                case 5:
                    System.out.println("Your weight in Saturn is " + (weight * 1.15) + " kilograms.");
                    break;

                case 6:
                    System.out.println("Your weight in Uranus is " + (weight * 1.17) + " kilograms.");
                    break;

                case 7:
                    System.out.println("Program ended. You left.");
                    out++;

                default:
                    System.out.println("The number " + select + " is not related to any planet.");
            }

        }
    }
}
