/**
 *
 */
package by.iba.gomel;

/**
 * This class realizes functional to find words within brackets.
 */
public final class WordsInBrackets {
    private static final char[]  ROUNDS             = {'(', ')'};
    /**
     * Constant: square brackets.
     */
    private static final char[]  SQUARES            = {'[', ']'};
    /**
     * Constant: figure brackets.
     */
    private static final char[]  FIGURES            = {'{', '}'};
    /**
     * Constant: default character.
     */
    private static final char    DEFAULT_CHAR       = ' ';
    /**
     * Constant: regex for separator between words.
     */
    private static final String  SEPARATOR          = " ";
    /**
     * Constant: regex for final deletion of punctuation.
     */
    private static final String  APPENDER_SEPARATOR = "\\W";
    /**
     * Array of words gotten while input string splitted.
     */
    private static String[]      strArray;
    /**
     * String of words in round brackets.
     */
    private static StringBuilder inRounds;
    /**
     * String of words in square brackets.
     */
    private static StringBuilder inSquares;
    /**
     * String of words in figure brackets.
     */
    private static StringBuilder inFigures;

    /**
     * Private default constructor.
     */
    private WordsInBrackets() {

    }

    /**
     * This method is for analyzing input string.
     *
     * @param str
     *            - input string.
     */
    public static void analyzeString(final String str) {
        WordsInBrackets.inRounds = new StringBuilder("");
        WordsInBrackets.inSquares = new StringBuilder("");
        WordsInBrackets.inFigures = new StringBuilder("");

        WordsInBrackets.strArray = str.split(WordsInBrackets.SEPARATOR);
        WordsInBrackets.checkWords(0, WordsInBrackets.DEFAULT_CHAR);
    }

    /**
     * This method check the array of words and send the word to the corresponding StringBuilder
     * instance.
     *
     * @param pos
     *            - current position of analyzing function.
     * @param ch
     *            - type of bracket.
     * @return new current position.
     */
    public static int checkWords(final int pos, final char ch) {
        int step = pos;

        while (step < WordsInBrackets.strArray.length) {
            boolean appended = false;
            String str = WordsInBrackets.strArray[step];
            final char firstCh = WordsInBrackets.strArray[step].charAt(0);
            final char lastCh = WordsInBrackets.strArray[step]
                    .charAt(WordsInBrackets.strArray[step].length() - 1);

            if ((firstCh == WordsInBrackets.ROUNDS[0]) || (firstCh == WordsInBrackets.SQUARES[0])
                    || (firstCh == WordsInBrackets.FIGURES[0])) {
                str = str.substring(1);

                step = WordsInBrackets.checkWords(step + 1,
                        WordsInBrackets.getClosedBracket(firstCh));

                WordsInBrackets.appender(str, firstCh);

                appended = true;
            }

            if (ch == lastCh) {
                str = str.substring(0, str.length() - 1);
                WordsInBrackets.appender(str, ch);

                break;
            }

            if (!appended) {
                WordsInBrackets.appender(str, ch);
            }

            step++;
        }

        return step;
    }

    /**
     * Getter for inFigures instance.
     *
     * @return words in figure brackets.
     */
    public static StringBuilder getInFigures() {
        return WordsInBrackets.inFigures;
    }

    /**
     * Getter for inRounds instance.
     *
     * @return words in round brackets.
     */
    public static StringBuilder getInRounds() {
        return WordsInBrackets.inRounds;
    }

    /**
     * Getter for inSquares instance.
     *
     * @return words in square brackets.
     */
    public static StringBuilder getInSquares() {
        return WordsInBrackets.inSquares;
    }

    /**
     * This method appends given word to corresponding StringBuilder instance.
     *
     * @param inputWord
     *            - word to be set.
     * @param -
     *            type of the bracket.
     */
    private static void appender(final String inputWord, final char ch) {
        final String word = inputWord.split(WordsInBrackets.APPENDER_SEPARATOR)[0] + "; ";

        if ((ch == WordsInBrackets.ROUNDS[0]) || (ch == WordsInBrackets.ROUNDS[1])) {
            WordsInBrackets.inRounds.append(word);
        }
        if ((ch == WordsInBrackets.SQUARES[0]) || (ch == WordsInBrackets.SQUARES[1])) {
            WordsInBrackets.inSquares.append(word);
        }
        if ((ch == WordsInBrackets.FIGURES[0]) || (ch == WordsInBrackets.FIGURES[1])) {
            WordsInBrackets.inFigures.append(word);
        }
    }

    /**
     * This method returns the closed bracket according to input opened bracket.
     *
     * @param openedBracket
     *            - opened bracket.
     * @return closed bracket.
     */
    private static char getClosedBracket(final char openedBracket) {
        char closedBracket = WordsInBrackets.DEFAULT_CHAR;

        if (openedBracket == WordsInBrackets.ROUNDS[0]) {
            closedBracket = WordsInBrackets.ROUNDS[1];
        }

        if (openedBracket == WordsInBrackets.SQUARES[0]) {
            closedBracket = WordsInBrackets.SQUARES[1];
        }

        if (openedBracket == WordsInBrackets.FIGURES[0]) {
            closedBracket = WordsInBrackets.FIGURES[1];
        }

        return closedBracket;
    }
}
