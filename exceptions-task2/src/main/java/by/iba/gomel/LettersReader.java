/**
 *
 */
package by.iba.gomel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is for reading a file by symbols. Letter symbols are checked to be Latin.
 */
public final class LettersReader {
    /**
     * Constant: Logger to log exceptions.
     */
    private static final Logger   LOGGER      = LoggerFactory.getLogger(LettersReader.class);
    /**
     * Constant: the first letter of Latin alphabet.
     */
    private static final char     LATIN_FIRST = 'A';
    /**
     * Constant: the last letter of Latin alphabet.
     */
    private static final char     LATIN_LAST  = 'z';

    /**
     * Name of the file to be read.
     */
    private final String          fileName;
    /**
     * List of chars in file.
     */
    private final List<Character> listOfChars;

    /**
     * Custom constructor.
     *
     * @param fileName
     *            - name of file to be read.
     */
    public LettersReader(final String fileName) {
        this.fileName = fileName;
        this.listOfChars = new ArrayList<>();
    }

    /**
     * This method is for logging exceptions.
     *
     * @param e
     *            - input exception.
     */
    private static void logException(final Exception e) {
        LettersReader.LOGGER.error(e.toString());
    }

    /**
     * This method is to read chars from a file. There could be catched NonLetterException if a char
     * is not a part of Latin alphabet, and IOException if a kind of input-output exceptions are
     * occurred.
     *
     * @return list of chars.
     */
    public List<Character> readFromFile() {
        int ch;

        try (FileInputStream stream = new FileInputStream(this.fileName);
                final BufferedReader reader = new BufferedReader(
                        new InputStreamReader(stream, StandardCharsets.US_ASCII))) {
            while ((ch = reader.read()) != -1) {
                this.listOfChars.add((char) ch);
            }

            this.analyzeChars(this.listOfChars.toArray(new Character[] {}));
        } catch (final NonLetterException | IOException e) {
            LettersReader.logException(e);
        }

        return this.listOfChars;
    }

    /**
     * This method overrides the default toString() method.
     *
     * @return a state of an instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LettersReader: fileName = " + this.fileName;
    }

    /**
     * This method is to analyze given array of chars to be a part of Latin alphabet.
     *
     * @param chars
     *            - an array of chars.
     * @throws NonLetterException
     *             in case if a char is not a part of Latin alphabet.
     */
    private void analyzeChars(final Character[] chars) throws NonLetterException {
        for (final char ch : chars) {
            if ((Character.isLetter(ch) && (ch < LettersReader.LATIN_FIRST))
                    || (ch > LettersReader.LATIN_LAST)) {
                throw new NonLetterException(this.fileName, ch);
            }
        }
    }
}
