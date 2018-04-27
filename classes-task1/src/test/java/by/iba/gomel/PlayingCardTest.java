/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class tests PlayingCard class.
 */
public class PlayingCardTest {
    /**
     * Instance of playing card.
     */
    private PlayingCard card;

    /**
     * Test method for {@link by.iba.gomel.PlayingCard#getRank()}.
     */
    @Test
    public void testGetRank() {
        Assert.assertEquals("Method getRank failed.", Rank.ACE, this.card.getRank());
    }

    /**
     * Test method for {@link by.iba.gomel.PlayingCard#getSuite()}.
     */
    @Test
    public void testGetSuite() {
        Assert.assertEquals("Method getSuite failed.", Suite.HEARTS, this.card.getSuite());
    }

    @Before
    @Test
    public void testInitialization() {
        this.card = new PlayingCard(Rank.ACE, Suite.HEARTS);
    }

    /**
     * Test method for
     * {@link by.iba.gomel.PlayingCard#PlayingCard(by.iba.gomel.Rank, by.iba.gomel.Suite)}.
     */
    @Test
    public void testPlayingCard() {
        Assert.assertNotNull("Object creation failed.", this.card);
    }

    /**
     * Test method for {@link by.iba.gomel.PlayingCard#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString failed.", "Playing card: ACE - HEARTS",
                this.card.toString());
    }
}
