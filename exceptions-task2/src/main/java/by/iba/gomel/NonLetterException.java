/**
 *
 */
package by.iba.gomel;

/**
 * This class is extension of Exception class.
 */
public final class NonLetterException extends Exception {
    /**
     * Constant: serial version.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Name of file where exception occurred.
     */
    private final String      fileName;
    /**
     * Character that led to exception.
     */
    private final char        ch;

    /**
     * Custom constructor.
     *
     * @param fileName
     *            - name of file where exception occurred.
     * @param ch
     *            - character that lead to exception.
     */
    public NonLetterException(final String fileName, final char ch) {
        super();
        this.fileName = fileName;
        this.ch = ch;
    }

    /**
     * Getter for ch.
     *
     * @return incorrect symbol.
     */
    public char getCh() {
        return this.ch;
    }

    /**
     * Getter for fileName.
     *
     * @return name of file with incorrect symbol.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * This is overriding of default method getMessage().
     *
     * @return string with exception information.
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return "NonLetterException occured in " + this.fileName + ", char = " + this.ch;
    }

    /**
     * This is overriding of default method toString().
     *
     * @return state of an instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getMessage();
    }
}
