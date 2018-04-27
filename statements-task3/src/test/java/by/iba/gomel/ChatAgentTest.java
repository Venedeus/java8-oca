package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for ChatAgent class.
 */
public class ChatAgentTest {
    ChatAgent agent;

    /**
     * This method for {@link by.iba.gomel.ChatAgent#ask()}
     */
    @Test
    public void testAsk() {
        Assert.assertNotNull("Method ask failed.", this.agent.ask());
    }

    /**
     * Test for switching readyToTalk off.
     */
    @Test
    public void testBye() {
        final ChatAgent bot = new ChatAgent("Bot");

        bot.reply(Vocabulary.BYE);

        Assert.assertFalse("Conversation finishing failed.", bot.isReadyToTalk());
    }

    /**
     * This method for {@link by.iba.gomel.ChatAgent#ChatAgent()}
     */
    @Test
    public void testChatAgent() {
        Assert.assertNotNull("Object creation failed.", this.agent);

    }

    /**
     * This method for {@link by.iba.gomel.ChatAgent#getName()}
     */
    @Test
    public void testGetName() {
        Assert.assertEquals("Method getName failed.", "Agent", this.agent.getName());
    }

    /**
     * Predefined conditions.
     */
    @Before
    @Test
    public void testInitialization() {
        this.agent = new ChatAgent("Agent");
    }

    /**
     * This method for {@link by.iba.gomel.ChatAgent#isReadyToTalk()}
     */
    @Test
    public void testIsReadyToTalk() {
        Assert.assertTrue("Method isReadyToTalk", this.agent.isReadyToTalk());
    }

    /**
     * This method for {@link by.iba.gomel.ChatAgent#reply()}
     */
    @Test
    public void testReply() {
        Assert.assertEquals("Method reply failed.", Vocabulary.NAME + this.agent.getName(),
                this.agent.reply(Vocabulary.WHATS_NAME));
    }

    /**
     * This method for {@link by.iba.gomel.ChatAgent#toString()}
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString failed.", "ChatAgent Agent. Ready to talk - true",
                this.agent.toString());
    }

}
