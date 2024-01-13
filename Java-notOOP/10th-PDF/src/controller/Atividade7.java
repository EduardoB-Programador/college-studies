package controller;

/**Português
 * Desenvolva um programa que gere e exiba a matriz abaixo:
 * 11 12 13 14
 * 15 16 17 18
 * 19 20 21 22
 *
 * English
 * Develop a code that creates the following matrix.
 * 11 12 13 14
 * 15 16 17 18
 * 19 20 21 22
 **/

public class Atividade7 {
    public static void main(String[] args) {

        int num = 11;

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++, num++) {

                if (j == 4) {
                    System.out.println(num);
                } else {
                    System.out.print(num + "\t");
                }

            }
        }

    }
}
