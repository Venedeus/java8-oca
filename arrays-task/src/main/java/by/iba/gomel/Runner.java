package by.iba.gomel;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shows different types of arrays initialization.
 */
public final class Runner {
    /**
     * Constant text for logger.
     */
    private static final String FIRST_INITIALIZATION_HEADER  = "Arrays after first initialization:";
    /**
     * Constant text for logger.
     */
    private static final String SECOND_INITIALIZATION_HEADER = "Arrays after second initialization:";
    /**
     * Constant: Logger.
     */
    private static final Logger LOGGER                       = LoggerFactory
            .getLogger(Runner.class);

    /**
     * Private constructor.
     */
    private Runner() {

    }

    /**
     * Main method.
     *
     * @param args
     *            - parameters of the command line.
     */
    public static void main(final String[] args) {
        Runner.LOGGER.info(Runner.FIRST_INITIALIZATION_HEADER);
        Runner.LOGGER.info(Arrays.toString(MyArrays.getIntArr()));

        for (final char[] charArr : MyArrays.getCharArr()) {
            Runner.LOGGER.info(Arrays.toString(charArr));
        }

        Runner.LOGGER.info(Runner.SECOND_INITIALIZATION_HEADER);
        Runner.LOGGER.info(Arrays.toString(MyArrays.getCustomedIntArr()));

        for (final char[] charArr : MyArrays.getCustomedCharArr()) {
            Runner.LOGGER.info(Arrays.toString(charArr));
        }
    }
}
