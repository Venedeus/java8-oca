package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shows work of compound expressions.
 */
public final class ArithmeticDemo {
    /**
     * Constant: LOGGER.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ArithmeticDemo.class);
    /**
     * Constant: ONE = 1.
     */
    private static final int    ONE    = 1;
    /**
     * Constant: TWO = 2.
     */
    private static final int    TWO    = 2;
    /**
     * Constant: SEVEN = 7.
     */
    private static final int    SEVEN  = 7;
    /**
     * Constant: EIGHT = 8.
     */
    private static final int    EIGHT  = 8;

    /**
     * Private constructor.
     */
    private ArithmeticDemo() {

    }

    /**
     * Main method.
     *
     * @param args
     *            arguments of command line.
     */
    public static void main(final String[] args) {
        int result = ArithmeticDemo.ONE + ArithmeticDemo.TWO;

        ArithmeticDemo.LOGGER.info(String.format("%s", result));

        result -= ArithmeticDemo.ONE;
        ArithmeticDemo.LOGGER.info(String.format("%s", result));

        result *= ArithmeticDemo.TWO;
        ArithmeticDemo.LOGGER.info(String.format("%s", result));

        result /= ArithmeticDemo.TWO;
        ArithmeticDemo.LOGGER.info(String.format("%s", result));

        result += ArithmeticDemo.EIGHT;
        ArithmeticDemo.LOGGER.info(String.format("%s", result));

        result %= ArithmeticDemo.SEVEN;
        ArithmeticDemo.LOGGER.info(String.format("%s", result));
    }
}
