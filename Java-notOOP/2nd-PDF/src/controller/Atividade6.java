package controller;

import java.util.Scanner;

/**Português
 * Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
 * no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, exibir ao
 * final o seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão sobre vendas) no final do mês.
 *
 * English
 * Create a code that asks a seller's name, their salary and the total of sales in a month (in money).
 * The seller earns 15% of commission for each sale. Show at the end, their name, their salary, commission, and the
 * salary + commission.
 **/

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary, sales;

        System.out.println("Insert a name:");
        String name = scanner.nextLine();

        System.out.println("Insert a salary:");
        salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insert the amount of money from sales:");
        sales = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Name: " + name +
                "\nSalary: " + salary +
                "\nComission: " + (0.15 * sales) +
                "\nTotal income: " + (salary + (0.15 * sales)));
    }
}
