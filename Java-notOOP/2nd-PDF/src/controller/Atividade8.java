package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que receba o preço de custo de um produto e mostre como resposta o valor de venda. Sabe-
 * se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
 *
 * English
 * Create a code that receives a product buying price and show it's selling price, based in a user percentage
 * insert
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a buying price of a product:");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the percentage to sell the product:");
        int percent = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The selling price of the product is " + (price + (price * percent/100)));
    }
}
