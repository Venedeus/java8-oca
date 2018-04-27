package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shows differences between "==" and "equals()" comparison.
 */
public final class Runner {
    /**
     * Constant: LOGGER.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    /**
     * Private constructor.
     */
    private Runner() {

    }

    /**
     * Main method.
     *
     * @param args
     *            - arguments of command line.
     */
    public static void main(final String[] args) {
        final Dog spot1 = new Dog("Spot", "Ruff!");
        final Dog spot2 = new Dog("Spot", "Ruff!");
        final Dog scruffy = new Dog("Scruffy", "Wurf!");

        Runner.LOGGER.info(spot1.toString());
        Runner.LOGGER.info(scruffy.toString());

        // "=" blocks by SonarQube.

        Runner.LOGGER.info("spot1.equals(scruffy): " + spot1.equals(scruffy));
        Runner.LOGGER.info("spot1.equals(spot2): " + spot1.equals(spot2));
    }
}
