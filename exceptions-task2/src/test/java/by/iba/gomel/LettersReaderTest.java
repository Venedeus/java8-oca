/**
 *
 */
package by.iba.gomel;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class is for testing LettersReader class.
 */
public class LettersReaderTest {
    /**
     * Rule for exceptions.
     */
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    /**
     * An instance of testing class.
     */
    LettersReader                  reader;

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.reader = new LettersReader("CorrectInput.txt");
    }

    /**
     * Test method for {@link by.iba.gomel.LettersReader#LettersReader(java.lang.String)}.
     */
    @Test
    public void testLettersReader() {
        Assert.assertNotNull("Instance creation failed.", this.reader);
    }

    /**
     * Test method for {@link by.iba.gomel.LettersReader#readFromFile()}.
     */
    @Test
    public void testReadFromFile() {
        Assert.assertEquals("Method readFromFile() failed.", "[H, e, l, l, o,  , W, o, r, l, d, !]",
                this.reader.readFromFile().toString());
    }

    /**
     * Test method for {@link by.iba.gomel.LettersReader#readFromFile()} with Cyrillic symbol.
     */
    @Test
    public void testReadFromFileCyrillic() throws NonLetterException {
        final LettersReader exReader = new LettersReader("IncorrectInput.txt");
        exReader.readFromFile().size();

    }

    /**
     * Test method for {@link by.iba.gomel.LettersReader#readFromFile()} with no input file.
     */
    @Test
    public void testReadFromFileNoFile() throws FileNotFoundException {
        final LettersReader exReader = new LettersReader("NoInput.txt");
        exReader.readFromFile().size();

    }

    /**
     * Test method for {@link by.iba.gomel.LettersReader#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.",
                "LettersReader: fileName = CorrectInput.txt", this.reader.toString());
    }
}
