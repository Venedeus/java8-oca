package by.iba.gomel;

/**
 * This class provides the realization of a playing card.
 */
public final class PlayingCard {
    /**
     * Rank of the card.
     */
    private final Rank  rank;
    /**
     * Suite of the card.
     */
    private final Suite suite;

    /**
     * Public constructor.
     * 
     * @param rank
     *            - rank of the card.
     * @param suite
     *            - suite of the card.
     */
    public PlayingCard(final Rank rank, final Suite suite) {
        super();
        this.rank = rank;
        this.suite = suite;
    }

    /**
     * Getter for rank.
     * 
     * @return rank of the card.
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Getter for suite.
     * 
     * @return suite of the card.
     */
    public Suite getSuite() {
        return this.suite;
    }

    /**
     * Method to show object's state.
     */
    @Override
    public String toString() {
        return "Playing card: " + this.rank + " - " + this.suite;
    }
}
