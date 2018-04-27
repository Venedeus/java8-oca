package by.iba.gomel;

/**
 * This class provides binary calculations with integers: left shift, right shift and right unsigned
 * shift.
 */
public final class BinaryCalcs {
    /**
     * Private constructor.
     */
    private BinaryCalcs() {

    }

    /**
     * This method makes left shift with input on quantity of positions.
     *
     * @param input
     *            - input integer.
     * @param positions
     *            - quantity of positions.
     *
     * @return result of left shift.
     */
    public static int leftShift(final int input, final int positions) {
        return input << positions;
    }

    /**
     * This method makes right shift with input on quantity of positions.
     *
     * @param input
     *            - input integer.
     * @param positions
     *            - quantity of positions.
     * 
     * @return result of right shift.
     */
    public static int rightShift(final int input, final int positions) {
        return input >> positions;
    }

    /**
     * This method makes right unsigned shift with input on quantity of positions.
     *
     * @param input
     *            - input integer.
     * @param positions
     *            - quantity of positions.
     * 
     * @return result of right unsigned shift.
     */
    public static int rightUnsignedShift(final int input, final int positions) {
        return input >>> positions;
    }
}
