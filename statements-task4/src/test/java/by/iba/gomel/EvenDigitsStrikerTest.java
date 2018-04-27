package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for EvensDigitsStriker.
 */
public class EvenDigitsStrikerTest {

    /**
     * This test for {@link by.iba.gomel.EvenDigitsStriker#strikeEvens(int)}.
     */
    @Test
    public void testStrikeEvens() {
        Assert.assertEquals("Method strikDigits", 13, EvenDigitsStriker.strikeEvens(123));
    }

    /**
     * This test for {@link by.iba.gomel.EvenDigitsStriker#strikeEvens(int)}. This test should
     * throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testStrikeEvensNoOdds() {
        EvenDigitsStriker.strikeEvens(2);
    }

}
