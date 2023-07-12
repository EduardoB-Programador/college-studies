package controller;

import java.util.Scanner;

/**Português
 * Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O
 * programa deve coletar as seguintes informações: Distância a percorrer na viagem, em quilômetros; qual é o valor
 * do consumo médio do automóvel, em quilômetros por litro.
 *
 * English
 * Create a code that calculate and show the amount of liters an vehicle will need to make a trip. The code must get
 * from the user the distance in kilometers (Km) and the average consumption in kilometers per liter;
 **/

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km, consumption;

        System.out.println("What is the distance? (km)");
        km = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is the consumption? (km/L)");
        consumption = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The amount of liters needed to make the trip is " + (km/consumption));
    }
}
