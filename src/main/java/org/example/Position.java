package org.example;

import java.util.Objects;

public class Position {

    final int x;
    final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Position randomPosition() {
        return new Position((int)Math.floor(Math.random()*(9 + 1)), (int)Math.floor(Math.random()*(9 + 1)));
    }

    public static Position rightOf(Position position) {
        return new Position(position.x + 1, position.y);
    }

    public static Position leftOf(Position position) {
        return new Position(position.x - 1, position.y);
    }

    public static Position topOf(Position position) {
        return new Position(position.x, position.y - 1);
    }

    public static Position bottomOf(Position position) {
        return new Position(position.x, position.y + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean sameAs(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
