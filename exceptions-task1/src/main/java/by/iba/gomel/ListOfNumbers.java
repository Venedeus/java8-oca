/**
 *
 */
package by.iba.gomel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides functions to read integers from file and to write integers to file.
 */
public final class ListOfNumbers {
    /**
     * Constant: logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ListOfNumbers.class);
    /**
     * Constant: default list's size.
     */
    private static final int    SIZE   = 10;
    /**
     * List for integers.
     */
    private final List<Integer> listNum;

    /**
     * Default constructor.
     */
    public ListOfNumbers() {
        this.listNum = new ArrayList<>();

        for (int i = 0; i < ListOfNumbers.SIZE; i++) {
            this.listNum.add(i);
        }
    }

    /**
     * This method is for logging exceptions.
     *
     * @param e
     *            - input exception.
     */
    private static void logException(final Exception e) {
        ListOfNumbers.LOGGER.error(e.toString());
    }

    /**
     * Getter for listNum.
     *
     * @return list of integers.
     */
    public List<Integer> getListNum() {
        return this.listNum;
    }

    /**
     * This method reads integers from file.
     *
     * @param filePath
     *            - path to the file to be read.
     * @return list of integers.
     */
    public List<Integer> readList(final String filePath) {
        String line;

        try (FileInputStream stream = new FileInputStream(filePath);
                final BufferedReader reader = new BufferedReader(
                        new InputStreamReader(stream, StandardCharsets.US_ASCII))) {
            while ((line = reader.readLine()) != null) {
                ListOfNumbers.LOGGER.info(line);
                this.listNum.add(Integer.valueOf(line));
            }
        } catch (NumberFormatException | IOException e) {
            ListOfNumbers.logException(e);
        }

        return this.listNum;
    }

    /**
     * This is an implementation of default toString() method.
     *
     * @return instance's state.
     */
    @Override
    public String toString() {
        return "ListOfNumbers contains " + this.listNum.size() + " elements.";
    }

    /**
     * This method writes list of integers to file.
     *
     * @param filePath
     *            - file for integers to be wrote into.
     * @return true - is writing is successfully finished, false - if exception happened.
     */
    public boolean writeList(final String filePath) {
        try (FileOutputStream stream = new FileOutputStream(filePath);
                final PrintWriter out = new PrintWriter(
                        new OutputStreamWriter(stream, StandardCharsets.US_ASCII))) {
            for (int i = 0; i < this.listNum.size(); i++) {
                this.printIntToFile(out, i);
            }
        } catch (final IndexOutOfBoundsException | IOException e) {
            ListOfNumbers.logException(e);
            return false;
        }

        return true;
    }

    /**
     * This method is for printing integers into given stream.
     *
     * @param out
     *            - output stream.
     * @param i
     *            - integer to be printed.
     */
    private void printIntToFile(final PrintWriter out, final int i) {
        out.println("Value at: " + i + " = " + this.listNum.get(i));
    }
}
