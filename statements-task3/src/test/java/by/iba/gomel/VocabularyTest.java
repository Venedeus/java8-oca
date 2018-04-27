package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for Vocabulary class.
 */
public class VocabularyTest {
    /**
     * This method for {@link by.iba.gomel.Vocabulary#generatePhase()}
     */
    @Test
    public void testGeneratePhrase() {
        Assert.assertEquals("Method generatePhrase failed.", "Hello!",
                Vocabulary.generatePhrase(0));
    }

    /**
     * This method for {@link by.iba.gomel.Vocabulary#getQuestionsAmount()}
     */
    @Test
    public void testGetQuestionsAmount() {
        Assert.assertEquals("Method getQuestionsAmount failed", 5, Vocabulary.getQuestionsAmount());
    }

}
