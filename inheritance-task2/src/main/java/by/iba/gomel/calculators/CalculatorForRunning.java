/**
 *
 */
package by.iba.gomel.calculators;

import java.util.Arrays;
import java.util.Collections;

import by.iba.gomel.Score;
import by.iba.gomel.rates.RateByResult;

/**
 * This class implements calculator for running. Player's result is counted as result time
 * multiplied on RUNNING_MULTIPLICATOR and that casted to integer value.
 */
public final class CalculatorForRunning extends AbstractRatingCalculator implements RateByResult {
    /**
     * Multiplicator for more precision.
     */
    public static final int RUNNING_MULTIPLICATOR = 100;

    /**
     * Custom constructor.
     *
     * @param players
     *            - array of participants.
     */
    public CalculatorForRunning(final Score[] players) {
        super(players);
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
     * This method is an implementation to store participants in increasing order with zeroes in the
     * end of the list.
     *
     * @return the list of players in increasing order.
     */
    @Override
    public Score[] getScore() {
        final Score[] scoreArray = super.getUnsortedScore();
        Arrays.sort(scoreArray, Collections.reverseOrder());

        final Score[] bufferScore = new Score[scoreArray.length];
        int counter = 0;
        int indexForZero = scoreArray.length - 1;

        for (final Score score : scoreArray) {
            if (score.getPoints() != 0) {
                bufferScore[counter] = score;
                counter++;
            }

            if (score.getPoints() == 0) {
                bufferScore[indexForZero] = score;
                indexForZero--;
            }
        }

        System.arraycopy(bufferScore, 0, scoreArray, 0, bufferScore.length);

        return scoreArray;
    }

    /**
     * This implementation is to set player's result.
     *
     * @param playerId
     *            - player's ID.
     * @param result
     *            - double result of running.
     */
    @Override
    public void setPlayerResult(final int playerId, final double result) {
        this.setPointsByPlayerId(playerId,
                (int) Math.round(result * CalculatorForRunning.RUNNING_MULTIPLICATOR));
    }
}
