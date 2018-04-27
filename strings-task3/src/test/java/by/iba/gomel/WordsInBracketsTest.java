/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing WordsInBrackets class.
 */
public class WordsInBracketsTest {
    /**
     * String to be analyzed.
     */
    private String str;

    /**
     * Test method for {@link by.iba.gomel.WordsInBrackets#getInFigures()}.
     */
    @Test
    public void testAnalyzeSentenceInFigures() {
        WordsInBrackets.analyzeString(this.str);

        Assert.assertEquals("Method getListOfWordsInFigures() with figure brackets failed.",
                "analyzing; a; sentence; This; ", WordsInBrackets.getInFigures().toString());
    }

    /**
     * Test method for {@link by.iba.gomel.WordsInBrackets#getInRounds()}.
     */
    @Test
    public void testAnalyzeSentenceInRounds() {
        WordsInBrackets.analyzeString(this.str);

        Assert.assertEquals("Method getListOfWordsInFigures() with figure brackets failed.",
                "is; for; test; ", WordsInBrackets.getInRounds().toString());
    }

    /**
     * Test method for {@link by.iba.gomel.WordsInBrackets#getInRounds()}. brackets.
     */
    @Test
    public void testAnalyzeSentenceInSquares() {
        WordsInBrackets.analyzeString("[This, analyzing, and, figures] [sentence, is, for]");

        Assert.assertEquals("Method getListOfWordsInFigures() with figure brackets failed.",
                "analyzing; and; figures; This; is; for; sentence; ",
                WordsInBrackets.getInSquares().toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInits() {
        this.str = "Lets start {This (test [inner brackets] is for) analyzing [in square brackets] a sentence}";
    }
}
