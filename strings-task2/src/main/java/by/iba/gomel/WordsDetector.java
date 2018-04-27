/**
 *
 */
package by.iba.gomel;

import java.util.HashSet;
import java.util.Set;

/**
 * This class realizes detector of word matches.
 */
public final class WordsDetector {
    /**
     * Constant: separator to split words.
     */
    private static final String SEPARATOR    = "\\W";
    /**
     * Constant: empty string.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Private default constructor.
     */
    private WordsDetector() {
    }

    /**
     * This method looks for matches of inputWord in inputSentence.
     *
     * @param inputSentence
     *            - input sentence to analyze words.
     * @param inputWord
     *            - input word to be analyzed.
     * @return set of words that were found in the inputWord.
     */
    public static Set<String> analyzeSentence(final String inputSentence, final String inputWord) {
        final Set<String> setOfWords = new HashSet<>();

        for (final String input : inputSentence.split(WordsDetector.SEPARATOR)) {
            if (!input.equals(WordsDetector.EMPTY_STRING) && inputWord.contains(input)) {
                setOfWords.add(input);
            }
        }

        return setOfWords;
    }
}
