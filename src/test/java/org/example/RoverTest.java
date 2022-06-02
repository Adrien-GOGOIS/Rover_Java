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
        Assertions.assertThat(rover.position).isEqualTo(new Position(6, 5));
    }

    @Test
    void should_move_rover_into_left(){
        rover.moveLeft();
        Assertions.assertThat(rover.position).isEqualTo(new Position(4, 5));
    }

    @Test
    void should_move_rover_into_top(){
        rover.moveTop();
        Assertions.assertThat(rover.position).isEqualTo(new Position(5, 4));
    }

    @Test
    void should_move_rover_into_bottom(){
        rover.moveBottom();
        Assertions.assertThat(rover.position).isEqualTo(new Position(5, 6));
    }

    @Test
    void should_send_correct_instruction() {

        String instructions = "R";
        gameController.moveRoverOnGrid(instructions);
        assertNotEquals(rover.position, new Position(5, 5));
    }



}