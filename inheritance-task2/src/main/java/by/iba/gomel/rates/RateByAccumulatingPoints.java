package by.iba.gomel.rates;

import java.util.function.IntSupplier;

/**
 * This interface is to realize calculators that deal with accumulation of points.
 */
public interface RateByAccumulatingPoints extends IntSupplier {
    /**
     * This implementation adds players points.
     *
     * @param playerId
     *            - player's ID.
     * @param points
     *            - points to be set.
     */
    void addPoints(int playerId, int points);

    /**
     * This implementation sets points of a player to 0.
     *
     * @param playerId
     *            - player's ID.
     */
    void knockout(int playerId);
}
