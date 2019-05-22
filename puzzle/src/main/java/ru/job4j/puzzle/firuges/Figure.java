package ru.job4j.puzzle.firuges;

public interface Figure {
    default boolean movable() {
        return true;
    }

    Cell position();

    Cell[] way(Cell source, Cell dest);

    default String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );

    }

    Figure copy(Cell dest);

}
