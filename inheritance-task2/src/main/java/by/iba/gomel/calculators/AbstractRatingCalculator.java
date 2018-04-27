/**
 *
 */
package by.iba.gomel.calculators;

import by.iba.gomel.Score;
import by.iba.gomel.rates.Disqualification;

/**
 * Abstract class for different types of calculators.
 */
public abstract class AbstractRatingCalculator implements Disqualification {
    /**
     * The list of participants.
     */
    private final Score[] scoreArray;

    /**
     * Custom constructor.
     *
     * @param players
     *            - array of participants.
     */
    public AbstractRatingCalculator(final Score[] players) {
        this.scoreArray = players.clone();
    }

    /**
     * This method is common for all realizations. It resets player's points to zero.
     *
     * @param playerId
     *            - player to be disqualified.
     */
    @Override
    public final void disqualify(final int playerId) {
        this.setPointsByPlayerId(playerId, 0);
    }

    /**
     * This method is for getting points of a player.
     *
     * @param playerId
     *            - player's ID.
     * @return points of a player.
     */
    public final int getPointsByPlayerId(final int playerId) {
        for (final Score score : this.scoreArray) {
            if (score.getPlayerId() == playerId) {
                return score.getPoints();
            }
        }

        return 0;
    }

    /**
     * This method sorts the list of players by points in descending order.
     *
     * @return the list of players in descending order.
     */
    public abstract Score[] getScore();

    /**
     * This method returns the list of players.
     *
     * @return the list of players.
     */
    public final Score[] getUnsortedScore() {
        return this.scoreArray;
    }

    /**
     * This method sets points to player.
     *
     * @param playerId
     *            - player's ID to set points.
     * @param points
     *            - points to be set.
     */
    public final void setPointsByPlayerId(final int playerId, final int points) {
        for (final Score score : this.scoreArray) {
            if (score.getPlayerId() == playerId) {
                score.setPoints(points);
            }
        }
    }
}
