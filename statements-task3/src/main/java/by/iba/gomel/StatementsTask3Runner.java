package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The runner class with public static void main(String[] args). Shows the conversation of two chat
 * agents.
 */
public final class StatementsTask3Runner {
    /**
     * Logger constant to display the conversation.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(StatementsTask3Runner.class);

    /**
     * Default private constructor.
     */
    private StatementsTask3Runner() {

    }

    /**
     * Main method.
     *
     * @param args
     *            - command line arguments.
     */
    public static void main(final String[] args) {
        final ChatAgent jack = new ChatAgent("Jack");
        final ChatAgent mike = new ChatAgent("Mike");

        while (jack.isReadyToTalk() && mike.isReadyToTalk()) {
            final String phrase = mike.ask();

            StatementsTask3Runner.LOGGER.info(mike.getName() + ": " + phrase);
            StatementsTask3Runner.LOGGER.info(jack.getName() + ": " + jack.reply(phrase));
        }
    }
}
