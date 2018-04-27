package by.iba.gomel;

/**
 * This is an interface of a simple logging.
 */
public interface Log {
    /**
     * Static method for logging.
     *
     * @param level
     *            - level of logging.
     * @param message
     *            - input logging message.
     * @return output logging message.
     */
    static String log(final String level, final String message) {
        return level + " - " + message;
    }

    /**
     * Default logging method.
     *
     * @param message
     *            - input logging message.
     * @return output logging message.
     */
    default String log(final String message) {
        return message;
    }
}
