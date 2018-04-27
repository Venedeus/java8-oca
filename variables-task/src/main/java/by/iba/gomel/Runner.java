package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shows the work with some kinds of variables.
 */
public final class Runner {
    /**
     * Constant: a default name - NAME = "Jack".
     */
    private static final String NAME           = "Jack";
    /**
     * Constant: a default weight - DEFAULT_WEIGHT = 75
     */
    private static final int    DEFAULT_WEIGHT = 75;
    /**
     * Constant: Logger.
     */
    private static final Logger LOGGER         = LoggerFactory.getLogger(Runner.class);

    /**
     * Default constructor.
     */
    private Runner() {

    }

    /**
     * Main method.
     * 
     * @param args
     *            - parameters of command line.
     */
    public static void main(final String[] args) {
        /*
         * There is an error if defaultWeight is not initialized.
         */
        final int defaultWeight = Runner.DEFAULT_WEIGHT;
        final Human jack = new Human(Runner.NAME);
        jack.setWeight(defaultWeight);

        Runner.LOGGER.info(jack.toString());
    }
}
