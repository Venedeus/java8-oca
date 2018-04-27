package by.iba.gomel;

/**
 * This class is a variant of vocabulary with questions and answers.
 */
public final class Vocabulary {
    /**
     * String constant.
     */
    public static final String GREETING    = "Hello!";
    /**
     * String constant.
     */
    public static final String HOW_ARE_YOU = "How are you?";
    /**
     * String constant.
     */
    public static final String FINE        = "I'm fine, thanks!";
    /**
     * String constant.
     */
    public static final String WHATS_NAME  = "What is your name?";
    /**
     * String constant.
     */
    public static final String NAME        = "My name is ";
    /**
     * String constant.
     */
    public static final String WHATS_TIME  = "What's time is it?";
    /**
     * String constant.
     */
    public static final String TIME        = "It's about ";
    /**
     * String constant.
     */
    public static final String BYE         = "Glad to see you! Bye-Bye!";

    /**
     * Static string array with questions.
     */
    private static String[]    questions   = {Vocabulary.GREETING, Vocabulary.HOW_ARE_YOU,
            Vocabulary.WHATS_NAME, Vocabulary.WHATS_TIME, Vocabulary.BYE};

    /**
     * Default private constructor.
     */
    private Vocabulary() {

    }

    /**
     * This method generates a question from question-array.
     *
     * @param inputNumber
     *            - input integer to choose the question.
     * @return the question.
     */
    public static String generatePhrase(final int inputNumber) {
        int number = inputNumber;

        if ((number < 0) || (number >= Vocabulary.questions.length)) {
            number = Vocabulary.questions.length - 1;
        }

        return Vocabulary.questions[number];
    }

    public static int getQuestionsAmount() {
        return Vocabulary.questions.length;
    }
}
