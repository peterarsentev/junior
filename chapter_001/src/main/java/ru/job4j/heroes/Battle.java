package ru.job4j.heroes;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Battle {
    private final Team first;
    private final Team second;

    public Battle(final Team first, final Team second) {
        this.first = first;
        this.second = second;
    }

    public void init() {
        boolean turn = true;
        do {
            Hero master = turn ? first.turn() : second.turn();
            if (master.actionToTeam()) {
                Hero comrade = turn ? first.turn() : second.turn();
                master.upgrade(comrade);
            } else {
                Hero caller = !turn ? first.turn() : second.turn();
                master.degrade(caller);
            }
            turn = !turn;
        } while (this.first.isLife() && this.second.isLife());
    }


}
