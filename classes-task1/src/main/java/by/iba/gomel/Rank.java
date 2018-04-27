package by.iba.gomel;

import java.util.EnumSet;
import java.util.Set;

/**
 * This enumeration provides types of card's rank.
 */
public enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGTH, NINE, TEN, JACK, QUEEN, KING, ACE;

    /**
     * This method serves to create a set of Russian card's set.
     *
     * @return set of Russian ranks.
     */
    public static Set<Rank> getRussianSet() {
        final EnumSet<Rank> russianSet = EnumSet.allOf(Rank.class);

        russianSet.remove(TWO);
        russianSet.remove(THREE);
        russianSet.remove(FOUR);
        russianSet.remove(FIVE);

        return russianSet;
    }
}
