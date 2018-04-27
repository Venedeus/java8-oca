/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class tests CardDeck class.
 */
public class CardDeckTest {
    /**
     * Instance of card deck.
     */
    private CardDeck deck;

    /**
     * Test method for {@link by.iba.gomel.CardDeck#CardDeck(by.iba.gomel.CardDeck.Sets)}.
     */
    @Test
    public void testCardDeck() {
        Assert.assertNotNull("Object creation failed.", this.deck);
    }

    /**
     * Test method for {@link by.iba.gomel.CardDeck#getSetOfCards()} with Russian Set.
     */
    @Test
    public void testGetSetOfCards() {
        Assert.assertEquals("Method getSetOfCards failed.", 36, this.deck.getSetOfCards().size());
    }

    /**
     * Test method for {@link by.iba.gomel.CardDeck#getSetOfCards()} with French Set.
     */
    @Test
    public void testGetSetOfCardsFrenchSet() {
        this.deck = new CardDeck(CardDeck.Sets.FRENCH_SET);
        Assert.assertEquals("Method getSetOfCards failed.", 52, this.deck.getSetOfCards().size());
    }

    /**
     * Card deck initialization with Russian Set.
     */
    @Before
    @Test
    public void testInitialization() {
        this.deck = new CardDeck(CardDeck.Sets.RUSSIAN_SET);
    }
}
