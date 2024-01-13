package controller;

import java.util.Scanner;

/**Português
 * Faça um jogo de batalha naval para 2 jogadores. Crie uma matriz 8 x 8 do tipo String.
 * O jogador um deverá indicar 4 posições na matriz (sem deixar o jogador 2 olhar a tela
 * neste momento) onde serão posicionados um navio, um submarino, um porta-aviões e um
 * barco. As demais posições serão preenchidas apenas com água. O jogador dois então vai
 * assumir o computador e informar as coordenadas de onde vai atirar. Ele tem direito a 5
 * tiros. Ao final o jogo deverá informar as embarcações atingidas e o total de pontuação
 * obtida (Porta-Aviões vale 4 pontos, submarino vale 3 pontos, navio vale 2 pontos e
 * barco vale 1 ponto).
 *
 * English
 * Create a naval battle game to 2 players. Create a 8x8 String matrix. The player 1 must
 * choose 4 positions in the matrix (the player 2 must not see the screen at this moment)
 * where will be put a ship, a submarine, an aircraft carrier and a boat. Every other
 * position will be only water. Player 2 must now take control of the computer and inform
 * coordinates to shoot. He can shoot 5 times. At the end show the hit watercraft and the
 * total score (Aircraft carrier = 4 points, submarine = 3 points, ship = 2 points and
 * boat = 1 point).
 **/

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Matrix sizing
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nHow many columns?");
        int columns = scanner.nextInt();
        scanner.nextLine();

        //Variables to make my life easier
        int totalArea = columns * rows, watercraft = 0;

        System.out.println("\nHow many shots? (There will be " + (totalArea) + " spots)");
        int shots = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nHow many aircraft carriers? (There are " + (totalArea) + " blank spots)");
        int carriers = scanner.nextInt();
        scanner.nextLine();

        watercraft += carriers;

        System.out.println("\nHow many submarines? (There are " + (totalArea - watercraft) + " blank spots)");
        int submarines = scanner.nextInt();
        scanner.nextLine();

        watercraft += submarines;

        System.out.println("\nHow many ships? (There are " + (totalArea - watercraft) + " blank spots)");
        int ships = scanner.nextInt();
        scanner.nextLine();

        watercraft += ships;

        System.out.println("\nHow many boats? (There are " + (totalArea - watercraft) + " blank spots)");
        int boats = scanner.nextInt();
        scanner.nextLine();

        watercraft += boats;

        String place [][] = new String[rows][columns];

        int points = 0;

        //Firstly filling the matrix with "water"
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                place[i][j] = "water";

            }
        }

        //Input for carriers
        for (int i = 1; i <= carriers; i++) {

            System.out.println("Type the row that you want to put a carrier: (1 - " + rows + ")");
            int localRow = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("\nType the column that you want to put the carrier: (1 - " + columns + ")");
            int localColumn = scanner.nextInt() - 1;
            scanner.nextLine();

            place [localRow][localColumn] = "carrier";

            System.out.println("Keep in mind that if you place another watercraft in a place that " +
                    "already has one you will lost the previous watercraft.\n" +
                    (carriers - i) + " carriers remaining.\n");

        }

        //Input for submarines
        for (int i = 1; i <= submarines; i++) {

            System.out.println("Type the row that you want to put a submarine: (1 - " + rows + ")");
            int localRow = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("\nType the column that you want to put the submarine: (1 - " + columns + ")");
            int localColumn = scanner.nextInt() - 1;
            scanner.nextLine();

            place [localRow][localColumn] = "submarine";

            System.out.println("Keep in mind that if you place another watercraft in a place that " +
                    "already has one you will lost the previous watercraft.\n" +
                    (submarines - i) + " submarines remaining.\n");

        }

        //Input for ships
        for (int i = 1; i <= ships; i++) {

            System.out.println("Type the row that you want to put a ship: (1 - " + rows + ")");
            int localRow = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("\nType the column that you want to put the ship: (1 - " + columns + ")");
            int localColumn = scanner.nextInt() - 1;
            scanner.nextLine();

            place [localRow][localColumn] = "ship";

            System.out.println("Keep in mind that if you place another watercraft in a place that " +
                    "already has one you will lost the previous watercraft.\n" +
                    (ships - i) + " ships remaining.\n");

        }

        //Input for boats
        for (int i = 1; i <= boats; i++) {

            System.out.println("Type the row that you want to put a boat: (1 - " + rows + ")");
            int localRow = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("\nType the column that you want to put the boat: (1 - " + columns + ")");
            int localColumn = scanner.nextInt() - 1;
            scanner.nextLine();

            place [localRow][localColumn] = "boat";

            System.out.println("Keep in mind that if you place another watercraft in a place that " +
                    "already has one you will lost the previous watercraft.\n" +
                    (boats - i) + " boats remaining.\n");

        }

        //Destroy them all
        int watercraftDestroyed [] = new int[4];

        /*
         * watercraftDestroyed[0] = Aircraft carriers
         * watercraftDestroyed[1] = Submarines
         * watercraftDestroyed[2] = Ships
         * watercraftDestroyed[3] = Boats
         */

        for (int i = 1; i <= shots; i++) {

            System.out.println("Type a number between 1 and " + rows + ", that corresponds to the row" +
                    " of your shot:");
            int rowShot = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.println("Type a number between 1 and " + columns + ", that corresponds to the column" +
                    " of your shot:");
            int columnShot = scanner.nextInt() - 1;
            scanner.nextLine();

            if (place[rowShot][columnShot].equals("water")){
                System.out.println("You hit the water, aim better!!");
            } else {

                switch (place[rowShot][columnShot]) {
                    case "carrier":
                        watercraftDestroyed[0] += 1;
                        watercraft -= 1;
                        System.out.println("Wow! You hit an Aircraft Carrier! Nice shot! There are still more " +
                                watercraft + " watercraft to destroy!");
                        place[rowShot][columnShot] = "water";
                        points += 4;
                        break;

                    case "submarine":
                        watercraftDestroyed[1] += 1;
                        watercraft -= 1;
                        System.out.println("Wow! You hit a Submarine! Keep going! There are still more " +
                                watercraft + " watercraft to destroy!");
                        place[rowShot][columnShot] = "water";
                        points += 3;
                        break;

                    case "ship":
                        watercraftDestroyed[2] += 1;
                        watercraft -= 1;
                        System.out.println("You hit a ship! Nice aim! There are still more " +
                                watercraft + " watercraft to destroy!");
                        place[rowShot][columnShot] = "water";
                        points += 2;
                        break;

                    case "boat":
                        watercraftDestroyed[3] += 1;
                        watercraft -= 1;
                        System.out.println("Congrats! You hit a boat! There are still more " +
                                watercraft + " watercraft to destroy!");
                        place[rowShot][columnShot] = "water";
                        points += 1;
                        break;

                }
            }

            if (shots - i != 0 && watercraft != 0) {

                System.out.println("You still have " + (shots - i) + " shots, hit them!!!");

            } else if (watercraft != 0 && i == shots) {

                System.out.println("Sadly you ran out of shots and there were still " + watercraft + " more " +
                        "watercraft to destroy.\n" +
                        "You hit:\n" +
                        watercraftDestroyed[0] + " Aircraft carriers (4 points)\n" +
                        watercraftDestroyed[1] + " Submarines (3 points)\n" +
                        watercraftDestroyed[2] + " Ships (2 points)\n" +
                        watercraftDestroyed[3] + " Boats (1 point)\n\n" +
                        "You got a total of " + points + " points.\n\n");
                break;

            } else if (watercraft == 0 && i == shots) {

                System.out.println("Wow that was close! You were able to hit the last watercraft in " +
                        "your last shot!\n" +
                        "You hit:\n" +
                        watercraftDestroyed[0] + " Aircraft carriers (4 points)\n" +
                        watercraftDestroyed[1] + " Submarines (3 points)\n" +
                        watercraftDestroyed[2] + " Ships (2 points)\n" +
                        watercraftDestroyed[3] + " Boats (1 point)\n\n" +
                        "You got a total of " + points + " points.");
                break;

            } else if (watercraft == 0 && i != shots) {

                System.out.println("You certainly have great aim! You hit all the watercraft with " +
                        (shots - 1) + " spare shots!\n" +
                        "You hit:\n" +
                        watercraftDestroyed[0] + " Aircraft carriers (4 points)\n" +
                        watercraftDestroyed[1] + " Submarines (3 points)\n" +
                        watercraftDestroyed[2] + " Ships (2 points)\n" +
                        watercraftDestroyed[3] + " Boats (1 point)\n" +
                        (shots - i) + " spare shots\n\n" +
                        "You got a total of " + (points + (shots - i)) + " points.\n\n");
                break;

            }

        }

    }
}
