/**
 *
 */
package by.iba.gomel;

/**
 * This class provides player's result.
 */
public final class Score implements Comparable<Score> {
    /**
     * Prime value for hash code.
     */
    private static final int HASH_CODE_PRIME = 31;
    /**
     * Static field to organize ids.
     */
    private static int       id;
    /**
     * Player's points.
     */
    private int              points;
    /**
     * Player's ID.
     */
    private final int        playerId;

    /**
     * Custom constructor.
     *
     * @param points
     *            - player's result.
     */
    public Score() {
        this.points = 0;
        Score.id++;
        this.playerId = Score.id;
    }

    /**
     * Getter for ID.
     *
     * @return total amount of participants.
     */
    public static int getId() {
        return Score.id;
    }

    /**
     * This implementation compares two instances according to points.
     *
     * @param arg0
     *            - the first instance.
     * @return the difference.
     */
    @Override
    public int compareTo(final Score arg0) {
        return arg0.points - this.points;
    }

    /**
     * This method overrides default equals() method.
     *
     * @param obj
     *            - object to compare.
     * @return true - if objects are equal, false - is not.
     *
     */
    @Override
    public boolean equals(final Object obj) {
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }

        final Score other = (Score) obj;

        if ((this.playerId != other.playerId) || (this.points != other.points)) {
            return false;
        }

        return true;
    }

    /**
     * Getter for player's ID.
     *
     * @return player's ID.
     */
    public int getPlayerId() {
        return this.playerId;
    }

    /**
     * Getter for points.
     *
     * @return player's points.
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * This method overrides default hashCode method.
     *
     * @return hash code.
     */
    @Override
    public int hashCode() {
        int result = 1;
        result = (Score.HASH_CODE_PRIME * result) + this.playerId;
        result = (Score.HASH_CODE_PRIME * result) + this.points;
        return result;
    }

    /**
     * Setter for player's points.
     *
     * @param points
     *            - points to set.
     */
    public void setPoints(final int points) {
        this.points = points;
    }

    /**
     * This implementation returns the state of an instance.
     *
     * @return state of an instance.
     */
    @Override
    public String toString() {
        return "Player's ID: " + this.playerId + " - Score: " + this.points;
    }
}
