package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "--> AIDER LE MARS ROVER A REJOINDRE SA BASE !");

        Rover rover = new Rover(5, 5);
        EasterEgg easterEgg = new EasterEgg();
        Grid grid = new Grid(rover, easterEgg);
        GameController gameController = new GameController(rover, grid, easterEgg);

        String userInstruction = "";
        Scanner scanner = new Scanner(System.in);

        while (!gameController.isPartyWin() && !userInstruction.equalsIgnoreCase("S")) {
            System.out.println(ConsoleColors.RESET + "--> Entrez une lettre [B : bas, T : haut, R : droite, L : gauche, S : abandon] : ");
            userInstruction = scanner.nextLine();
            gameController.moveRoverOnGrid(userInstruction);

            System.out.println(ConsoleColors.RESET + "Nouvelle position du Rover : " + rover.position);

        }

        if (gameController.isPartyWin()) {
            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "--> FELICITATION, LE ROVER A REJOINT SA BASE !");
        }
    }
}