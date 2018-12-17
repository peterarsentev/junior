package ru.job4j.chess.firuges;

public class Bishop implements Figure {
    @Override
    public Cell position() {
        return null;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] {
                dest
        };
    }

    @Override
    public String icon() {
        return null;
    }

    @Override
    public Figure copy(Cell dest) {
        return null;
    }
}
