package by.iba.gomel;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides the realization of card deck. Card deck can be initialized with Russian set
 * (36 cards), and French set (52 cards).
 */
public final class CardDeck {
    /**
     * Instance of card deck set.
     */
    private final Set<PlayingCard> setOfCards;

    /**
     * Public constructor.
     *
     * @param set
     *            set of cards according inner enumeration.
     */
    public CardDeck(final CardDeck.Sets set) {
        this.setOfCards = new HashSet<>();

        if (set == Sets.RUSSIAN_SET) {
            this.createRussianSet();
        } else {
            this.createFrenchSet();
        }
    }

    /**
     * Getter for setOfCards.
     *
     * @return set of cards
     */
    public Set<PlayingCard> getSetOfCards() {
        return this.setOfCards;
    }

    /**
     * This method is for initialization of setOfCards with French set.
     */
    private void createFrenchSet() {
        for (final Rank rank : Rank.values()) {
            for (final Suite suite : Suite.values()) {
                this.setOfCards.add(new PlayingCard(rank, suite));
            }
        }
    }

    /**
     * This method is for initialization of setOfCards with Russian set.
     */
    private void createRussianSet() {
        for (final Rank rank : Rank.getRussianSet()) {
            for (final Suite suite : Suite.values()) {

                this.setOfCards.add(new PlayingCard(rank, suite));
            }
        }
    }

    /**
     * Inner enumeration for types of sets.
     */
    public enum Sets {
        RUSSIAN_SET, FRENCH_SET;
    }
}
