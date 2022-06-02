package org.example;

import java.util.Arrays;

public class GameController {

    final Grid grid;
    final EasterEgg easterEgg;
    final Rover rover;
    public GameController(Rover rover, Grid grid, EasterEgg easterEgg) {
        this.easterEgg = easterEgg;
        this.rover = rover;
        this.grid = grid;

        grid.printGrid();
    }

    public void moveRoverOnGrid(String userInstruction) {

        switch (userInstruction.toUpperCase()) {
            case "R" : rover.moveRight();
                break;
            case "L" : rover.moveLeft();
                break;
            case "T" : rover.moveTop();
                break;
            case "B" : rover.moveBottom();
        }

        grid.printGrid();
    }

    public boolean isPartyWin() {
        return rover.position.equals(easterEgg.position);
    }

}
