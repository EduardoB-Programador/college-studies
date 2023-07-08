package controller;

import java.util.Scanner;

/**Português
 * A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações sem juros. Faça um algoritmo que
 * pergunte um valor de uma compra, o número de prestações escolhidas e apresente como resultado o valor das
 * prestações
 *
 * English
 * A store is selling their products to pay in 10 portions without taxes. Create a code that asks for a value and
 * the number of portions the value is going to be paid then show the value of the portions.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the value of the product");
        double value = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the amount of portions to pay for the product");
        int portion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The value for each portion is " + (value/portion));
    }
}
