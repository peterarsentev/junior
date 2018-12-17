package ru.job4j.chess.firuges;

public interface Figure {
    Cell position();

    Cell[] way(Cell source, Cell dest);

    String icon();

    Figure copy(Cell dest);

}
