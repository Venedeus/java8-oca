package by.iba.gomel;

/**
 * This class is a custom implementation of the interface Log.
 */
public final class WarningLog implements Log {
    /**
     * Prefix for logging message.
     */
    private static final String PREFIX = "WARNING - ";

    /**
     * Implementation of the static method for logging.
     *
     * @param level
     *            - level of logging.
     * @param message
     *            - input logging message.
     * @return output logging message.
     */
    public static String log(final String level, final String message) {
        return WarningLog.PREFIX + Log.log(level, message);
    }

    /**
     * Implementation of the default logging method.
     *
     * @param message
     *            - input logging message.
     * @return output logging message.
     */
    @Override
    public String log(final String message) {
        return Log.super.log(WarningLog.PREFIX + message);
    }
}
