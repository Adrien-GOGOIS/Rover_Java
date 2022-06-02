package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
    final EasterEgg easterEgg;
    final Rover rover;

    private final List<Position> roverPath = new ArrayList<>();
    public Grid(Rover rover, EasterEgg easterEgg) {

        this.easterEgg = easterEgg;
        this.rover = rover;

    }

    public void printGrid() {

        roverPath.add(rover.position);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (rover.position.sameAs(x, y)) {
                    System.out.printf(ConsoleColors.RESET + " [R] ");
                } else if (easterEgg.position.sameAs(x, y)) {
                    System.out.printf(ConsoleColors.RESET + " [0] ");
                } else if (roverPath.contains(new Position(x, y))){
                    System.out.printf(ConsoleColors.RESET + " [.] ");
                } else {
                    System.out.printf(ConsoleColors.RESET + " [ ] ");
                }
            }
            System.out.println();
        }
    }
}
