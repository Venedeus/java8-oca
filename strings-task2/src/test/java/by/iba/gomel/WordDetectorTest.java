/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing WordDetector class.
 */
public class WordDetectorTest {
    /**
     * Input sentence.
     */
    String sentence;
    /**
     * Input word.
     */
    String word;

    /**
     * Test method for
     * {@link by.iba.gomel.WordsDetector#analyzeSentence(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testAnalyzeSentence() {
        Assert.assertEquals("Method analyzeSentence failed.", 2,
                WordsDetector.analyzeSentence(this.sentence, this.word).size());
    }

    @Before
    @Test
    public void testInits() {
        this.sentence = "Wealth is not his that has it, but his who enjoys it.";
        this.word = "history";
    }
}
