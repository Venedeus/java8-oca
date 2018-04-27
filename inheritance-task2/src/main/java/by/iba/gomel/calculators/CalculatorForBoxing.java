/**
 *
 */
package by.iba.gomel.calculators;

import java.util.Arrays;

import by.iba.gomel.Score;
import by.iba.gomel.rates.RateByAccumulatingPoints;

/**
 * This class implements calculator for boxing.
 */
public final class CalculatorForBoxing extends AbstractRatingCalculator
        implements RateByAccumulatingPoints {
    /**
     * Custom constructor.
     *
     * @param participants
     *            - array of participants.
     */
    public CalculatorForBoxing(final Score[] participants) {
        super(participants);
    }

    /**
     * This implementation adds players points.
     *
     * @param playerId
     *            - player's ID.
     * @param points
     *            - points to be set.
     */
    @Override
    public void addPoints(final int playerId, final int points) {
        this.setPointsByPlayerId(playerId, this.getPointsByPlayerId(playerId) + points);
    }

    /**
     * This is an implementation of default method.
     *
     * @return 0
     */
    @Override
    public int getAsInt() {
        return 0;
    }

    /**
     * This method sorts the list of players by points in descending order.
     *
     * @return the list of players in descending order.
     */
    @Override
    public Score[] getScore() {
        Arrays.sort(this.getUnsortedScore());

        return this.getUnsortedScore();
    }

    /**
     * This implementation sets points of a player to 0.
     *
     * @param playerId
     *            - player's ID.
     */
    @Override
    public void knockout(final int playerId) {
        this.setPointsByPlayerId(playerId, 0);
    }
}
