package by.iba.gomel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * This class is an implementation of a simple chat agent, that has a name and to ask a question, or
 * reply a phrase. All phrases are gotten from the Vocabulary class. If chat agent gets a
 * Bye-Bye-phrase a field readyToTalk is to be switched into false and the chat agent cannot to
 * continue a conversation.
 */
public final class ChatAgent {
    /**
     * String constant: time format [Hours (24): minutes].
     */
    private static final String TIME_FORMAT = "HH:mm";
    /**
     * String field: name of the chat agent.
     */
    private final String        name;
    /**
     * Boolean field to show the status of chat agent.
     */
    private boolean             readyToTalk;

    /**
     * Constructor with parameters.
     *
     * @param name
     *            name of the chat agent.
     */
    public ChatAgent(final String name) {
        super();

        this.name = name;
        this.readyToTalk = true;
    }

    /**
     * This method allows to ask a random generated question from a vocabulary.
     *
     * @return the question.
     */
    public String ask() {
        return Vocabulary.generatePhrase(Generators.generateInt(Vocabulary.getQuestionsAmount()));
    }

    /**
     * Getter for name.
     *
     * @return name of the chat agent.
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method checks if the chat agent can continue the conversation.
     *
     * @return true - if the chat agent is ready to talk, false - if not.
     */
    public boolean isReadyToTalk() {
        return this.readyToTalk;
    }

    /**
     * This method replies on an input phrase. The input phrase 'Bye-Bye' switches the chat agent
     * off.
     *
     * @param inputPhrase
     *            - phrase to be replied.
     * @return answer on a phrase.
     */
    public String reply(final String inputPhrase) {
        String phrase = inputPhrase;

        switch (phrase) {
            case Vocabulary.GREETING:
                phrase = Vocabulary.GREETING;
                break;
            case Vocabulary.HOW_ARE_YOU:
                phrase = Vocabulary.FINE;
                break;
            case Vocabulary.WHATS_NAME:
                phrase = Vocabulary.NAME + this.name;
                break;
            case Vocabulary.WHATS_TIME:
                phrase = Vocabulary.TIME
                        + new SimpleDateFormat(ChatAgent.TIME_FORMAT, Locale.ENGLISH)
                                .format(new Date());
                break;
            case Vocabulary.BYE:
                phrase = Vocabulary.BYE;
                this.readyToTalk = false;
                break;
            default:
                phrase = Vocabulary.BYE;
        }

        return phrase;
    }

    /**
     * This method shows information about the chat agent.
     */
    @Override
    public String toString() {
        return "ChatAgent " + this.name + ". Ready to talk - " + this.readyToTalk;
    }

}
