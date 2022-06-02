package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RoverTest {
    Rover rover = new Rover(5, 5);
    EasterEgg easterEgg = new EasterEgg();
    Grid grid = new Grid(rover, easterEgg);
    GameController gameController = new GameController(rover, grid, easterEgg);

    @Test
    void should_move_rover_into_right() {
        rover.moveRight();

        int result = rover.position[0];

        assertEquals(6, result);
        Assertions.assertThat(rover.position[1]).isEqualTo(5);
    }

    @Test
    void should_move_rover_into_left(){
        rover.moveLeft();

        int result = rover.position[0];

        assertEquals(4, result);
        Assertions.assertThat(rover.position[1]).isEqualTo(5);
    }

    @Test
    void should_move_rover_into_top(){
        rover.moveTop();

        int result = rover.position[1];

        assertEquals(4, result);
        Assertions.assertThat(rover.position[0]).isEqualTo(5);
    }

    @Test
    void should_move_rover_into_bottom(){
        rover.moveBottom();

        int result = rover.position[1];

        assertEquals(6, result);
        Assertions.assertThat(rover.position[0]).isEqualTo(5);
    }

    @Test
    void should_send_correct_instruction() {

        String instructions = "R";
        gameController.moveRoverOnGrid(instructions);
        assertNotEquals(5, rover.position[0]);
    }



}