package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas, e exiba nome,
 * valor da alíquota do imposto de renda, e o salário já com o desconto realizado. Use
 * 600 = sem alíquota; 600-1499.99 = 10% de alíquota; >=1500 = 15% de alíquota.
 *
 * English
 * Create a code that asks for a name and a salary (monthly) of 10 people, then show the name,
 * the taxes related to your salary, and the salary minus the taxes of it. Use 600 = no taxes;
 * 600-1499.99 = 10%; >=1500 = 15%.
 **/

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people;
        double salary, tax;
        String name;

        System.out.println("How much people?");
        people = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= people; i++) {
            System.out.println("What is the person's name?");
            name = scanner.nextLine();

            System.out.println("What is this person's salary");
            salary = scanner.nextDouble();
            scanner.nextLine();

            if (salary >= 1500) {
                System.out.println(name + " earns " + salary + " a month and needs to pay 15% on fees" +
                        " because of that, discounting the fees from his salary, he earns in a month now " +
                        (salary - (salary * 0.15)));
            } else if ((salary > 600)) {
                System.out.println(name + " earns " + salary + " a month and needs to pay 10% on fees" +
                        " because of that, discounting the fees from his salary, he earns in a month now " +
                        (salary - (salary * 0.10)));
            } else {
                System.out.println(name + " earns " + salary + " a month and don't need to pay any fees" +
                        " so his salary is still the same.");
            }
        }
    }
}
