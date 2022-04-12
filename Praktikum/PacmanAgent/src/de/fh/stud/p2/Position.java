package de.fh.stud.p2;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position add(Position pos) {
        return new Position(this.x + pos.x, this.y + pos.y);
    }
}
