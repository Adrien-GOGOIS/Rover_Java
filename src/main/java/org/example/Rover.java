package org.example;

public class Rover {
    Position position;
    public Rover(int axeX, int axeY) {
        this.position = new Position(axeX, axeY);
    }

    public Rover(Position position) {
        this.position = position;
    }
    public void moveRight() {
        position = Position.rightOf(position);
    }

    public void moveLeft() {
        position = Position.leftOf(position);
    }

    public void moveTop() {
        position = Position.topOf(position);
    }

    public void moveBottom() {
        position = Position.bottomOf(position);
    }
}
