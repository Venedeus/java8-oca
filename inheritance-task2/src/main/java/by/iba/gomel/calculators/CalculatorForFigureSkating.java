/**
 *
 */
package by.iba.gomel.calculators;

import java.util.Arrays;

import by.iba.gomel.Score;
import by.iba.gomel.rates.RateByMultiplePoints;

/**
 * This class implements calculator for figure skating. Player's points are counted as a sum of all
 * points divided on the amount of judges and multiplied on SKATING_MULTIPLICATOR for further
 * casting to integer value.
 */
public final class CalculatorForFigureSkating extends AbstractRatingCalculator
        implements RateByMultiplePoints {
    /**
     * Multiplicator for more integer precision.
     */
    private static final int SCATING_MULTIPLICATOR = 100;

    /**
     * Custom constructor.
     *
     * @param players
     *            - array of participants.
     */
    public CalculatorForFigureSkating(final Score[] players) {
        super(players);
    }

    /**
     * This private method counts average score according to given points.
     *
     * @param points
     *            - given points.
     * @return integer result.
     */
    private static int countAverageScore(final double[] points) {
        if (points.length == 0) {
            throw new ArithmeticException();
        }

        double totalScore = 0;

        for (final double point : points) {
            totalScore += point;
        }

        return (int) Math.round(
                (totalScore * CalculatorForFigureSkating.SCATING_MULTIPLICATOR) / points.length);
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
     * This implementation is to set player's points.
     *
     * @param playerId
     *            - player's ID.
     * @param points
     *            - double array of points.
     */
    @Override
    public void ratePlayer(final int playerId, final double[] points) {
        this.setPointsByPlayerId(playerId, CalculatorForFigureSkating.countAverageScore(points));
    }
}
