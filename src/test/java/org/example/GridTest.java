package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    Rover rover = new Rover(5, 5);
    EasterEgg easterEgg = new EasterEgg();
    Grid grid = new Grid(rover, easterEgg);

   /* @Disabled
    @Test
    *void should_print_rover_position_in_grid() {
        grid.printGrid();
        String result = grid[rover.positionY][rover.positionX];

        assertEquals(" [R] ", result);
    }

    @Disabled
    @Test
    void should_print_easterEgg_position_in_grid() {

        grid.printGrid();
        int randomX = (int)easterEgg.randomPositionX;
        int randomY = (int)easterEgg.randomPositionY;
        String result = grid.grid[randomY][randomX];
        assertEquals(" [0] ", result);
    }*/

}