package by.iba.gomel;

/**
 * This class realizes an array of participants.
 */
public final class Participants {
    /**
     * An array of participants.
     */
    private final Score[] partsArray;

    /**
     * Custom constructor.
     *
     * @param amount
     *            - amount of participants.
     */
    public Participants(final int amount) {
        this.partsArray = new Score[amount];

        for (int i = 0; i < this.partsArray.length; i++) {
            this.partsArray[i] = new Score();
        }
    }

    /**
     * Getter for partsArray.
     *
     * @return array of participants.
     */
    public Score[] getParticipants() {
        return this.partsArray;
    }
}
