package controller;

import java.util.Scanner;

/**Português
 * Desenvolver um programa que calcule o salário líquido de um professor. Para elaborar o programa, é
 * necessário possuir alguns dados, tais como: Valor da hora aula, número de horas trabalhadas no mês e
 * percentual de desconto do INSS.
 *
 * English
 * Create a code that asks the salary of a professor. To do that you'll need: money per hour, the amount
 * of hours worked in a month, and the discount percentage from INSS (a brazilian institute).
 **/

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mph, hoursMonth, salary, percent = 0.12;

        System.out.println("How much is the money per hour?");
        mph = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How much hours did your work in that month?");
        hoursMonth = scanner.nextDouble();
        scanner.nextLine();

        salary = mph * hoursMonth;

        System.out.println("The salary of that professor is " + (salary - (salary * percent)));
    }
}
