package by.iba.gomel;

import java.util.Formatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class shows binary calculations.
 */
public final class Runner {
    /**
     * Constant: LOGGER.
     */
    private static final Logger LOGGER           = LoggerFactory.getLogger(Runner.class);
    /**
     * Constant: POSITIVE_INTEGER = 0b0111 (7).
     */
    private static final int    POSITIVE_INTEGER = 0b0111;
    /**
     * Constant: NEGATIVE_INTEGER = 0b1111_1111_1111_1111_1111_1111_1111_1001 (-7).
     */
    private static final int    NEGATIVE_INTEGER = 0b1111_1111_1111_1111_1111_1111_1111_1001;
    /**
     * Constants: POSITIONS = 1.
     */
    private static final int    POSITIONS        = 1;

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
        Runner.LOGGER.info(Runner.calculateBinary(Runner.POSITIVE_INTEGER, Runner.POSITIONS));
        Runner.LOGGER.info(Runner.calculateBinary(Runner.NEGATIVE_INTEGER, Runner.POSITIONS));
    }

    /**
     * Private method for calculations and string formatting.
     *
     * @param input
     *            - input integer value.
     * @param positions
     *            - positions to shift.
     * @return formatted string with results.
     */
    private static String calculateBinary(final int input, final int positions) {
        int result = BinaryCalcs.leftShift(input, positions);

        final Formatter format = new Formatter();

        format.format("%n%s (%d) << %d: %s (%d)%n", Integer.toBinaryString(input), input, positions,
                Integer.toBinaryString(result), result);

        result = BinaryCalcs.rightShift(input, positions);

        format.format("%s (%d) >> %d: %s (%d)%n", Integer.toBinaryString(input), input, positions,
                Integer.toBinaryString(result), result);

        result = BinaryCalcs.rightUnsignedShift(input, positions);

        format.format("%s (%d) >>> %d: %s (%d)%n", Integer.toBinaryString(input), input, positions,
                Integer.toBinaryString(result), result);

        final String output = format.toString();
        format.close();

        return output;
    }
}
