package ru.job4j.chess.firuges;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PawnBlack implements Figure {
    private final Cell position;

    public PawnBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (source.y == dest.y + 1 && source.x == dest.x) {
            steps = new Cell[] {
                    dest
            };
        }
        return steps;
    }

    @Override
    public String icon() {
        return "PawnBlack.png";
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
