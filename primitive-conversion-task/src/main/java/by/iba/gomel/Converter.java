package by.iba.gomel;

/**
 * This class provides some methods to perform primitive conversion.
 */
public final class Converter {
    /**
     * Constant: FIVE = 5.
     */
    private static final int FIVE       = 5;
    /**
     * Constant: TEN = 10;
     */
    private static final int TEN        = 10;
    /**
     * Constant: INT_VALUE = 100000;
     */
    private static final int INT_VALUE  = 100_000;
    /**
     * Constant: LONG_VALUE = 10;
     */
    private static final int LONG_VALUE = 1_000_000_000;

    /**
     * Private constructor.
     */
    private Converter() {

    }

    /**
     * Converter to byte.
     *
     * @param b
     *            - input value.
     * @return result value after conversion.
     */
    public static byte primConvertToByte(final byte b) {
        return (byte) ((b * Converter.TEN) + Converter.FIVE);
    }

    /**
     * Converter to int.
     *
     * @param i
     *            - input value.
     * @return result value after conversion.
     */
    public static int primConvertToInt(final int i) {
        return (i * Converter.INT_VALUE) / Converter.FIVE;
    }

    /**
     * Converter to long.
     *
     * @param l
     *            - input value.
     * @return result value after conversion.
     */
    public static long primConvertToLong(final long l) {
        return l * Converter.LONG_VALUE;
    }
}
