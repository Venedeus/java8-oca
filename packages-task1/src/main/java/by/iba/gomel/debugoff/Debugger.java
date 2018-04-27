package by.iba.gomel.debugoff;

/**
 * This class provides a method to change an input string adding a prefix.
 */
public final class Debugger {
    /**
     * String constant.
     */
    private static final String PREFIX = "WARNING - ";

    /**
     * This method changes an input string adding a prefix.
     *
     * @param inputString
     *            - input string to be changed.
     * @return modified string.
     */
    public String debug(final String inputString) {
        return Debugger.PREFIX + inputString;
    }
}
