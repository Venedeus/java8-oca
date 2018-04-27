package by.iba.gomel;

/**
 * This class is for calculation of input floating-point values. The result is rounded using given
 * amount of digits after floating point.
 */
public final class FPAdder {
    /**
     * Integer constant DECIMAL_BASE = 10;
     */
    private static final int DECIMAL_BASE = 10;

    /**
     * No-parameter private constructor.
     */
    private FPAdder() {
    }

    /**
     * This method is for calculation of input floating-point values. Amount of arguments is checked
     * to be more than 1.
     *
     * @param args
     *            - arguments to be calculated.
     * @param floatPrec
     *            - precision of calculation.
     * @return result of calculation.
     */
    public static double calculate(final String[] args, final int floatPrec) {
        FPAdder.checkArgs(args.length);

        double result = 0;

        for (final String arg : args) {
            result += Double.parseDouble(arg);
        }

        return FPAdder.round(result, floatPrec);
    }

    /**
     * This method checks whether amount of arguments is more than 1. IllegalArgumentException is
     * thrown if amount is less of equals to 1.
     *
     * @param length
     *            - amount of arguments.
     */
    private static void checkArgs(final int length) {
        if (length <= 1) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method is for rounding of the result according to given precision.
     *
     * @param value
     *            - value to be rounded.
     * @param floatPrec
     *            - precision of rounding.
     * @return rounded result.
     */
    private static double round(final double value, final int floatPrec) {
        return Math.round(value * Math.pow(FPAdder.DECIMAL_BASE, floatPrec))
                / Math.pow(FPAdder.DECIMAL_BASE, floatPrec);
    }
}
