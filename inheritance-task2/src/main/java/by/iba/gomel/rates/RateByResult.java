/**
 *
 */
package by.iba.gomel.rates;

import java.util.function.IntSupplier;

/**
 * This interface is to realize calculators that deal with common results.
 */
public interface RateByResult extends IntSupplier {
    /**
     * This implementation is to set player's result.
     *
     * @param playerId
     *            - player's ID.
     * @param result
     *            - double result of running.
     */
    void setPlayerResult(int playerId, double result);
}
