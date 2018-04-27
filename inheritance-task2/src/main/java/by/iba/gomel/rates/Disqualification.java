package by.iba.gomel.rates;

import java.util.function.IntSupplier;

/**
 * This interface is to realize disqualification.
 */
public interface Disqualification extends IntSupplier {
    /**
     * This method is common for all realizations. It resets player's points to zero.
     *
     * @param playerId
     *            - player to be disqualified.
     */
    void disqualify(final int playerId);
}
