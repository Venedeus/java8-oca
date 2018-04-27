package by.iba.gomel.rates;

import java.util.function.IntSupplier;

/**
 * This interface is to realize calculators that deal with multiplication of points.
 */
public interface RateByMultiplePoints extends IntSupplier {
    /**
     * This implementation is to set player's points.
     *
     * @param playerId
     *            - player's ID.
     * @param points
     *            - double array of points.
     */
    void ratePlayer(int playerId, double[] points);
}
