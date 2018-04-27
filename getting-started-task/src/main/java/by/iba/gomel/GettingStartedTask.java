package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The GettingStartedTask class implements an application that simply prints name in console.
 */
public final class GettingStartedTask {
    /**
     * Constant NAME.
     */
    private static final String NAME   = "Yauheni Shviatsou";

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GettingStartedTask.class);

    /**
     * Default private constructor.
     */
    private GettingStartedTask() {

    }

    /**
     * Main method simply prints name in console.
     *
     * @param args
     *            input parameters.
     */
    public static void main(final String[] args) {
        // Display the string.
        GettingStartedTask.LOGGER.info(GettingStartedTask.NAME);
    }
}
