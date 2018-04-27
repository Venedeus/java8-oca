/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for Generators class.
 */
public class GeneratorsTest {

    /**
     * Test method for {@link by.iba.gomel.Generators#generateInt()}.
     */
    @Test
    public void testGenerateInt() {
        final int number = Generators.generateInt();

        Assert.assertTrue("Method generateInt failed.",
                (number >= Integer.MIN_VALUE) && (number <= Integer.MAX_VALUE));
    }

    /**
     * Test method for {@link by.iba.gomel.Generators#generateInt(int)}.
     */
    @Test
    public void testGenerateIntInt() {
        final int number = Generators.generateInt(5);

        Assert.assertTrue("Method generateInt failed.", (number >= 0) && (number < 5));
    }

    /**
     * Test method for {@link by.iba.gomel.Generators#generateLatinChar()}.
     */
    @Test
    public void testGenerateLatinChar() {
        final char ch = Generators.generateLatinChar();

        Assert.assertTrue("Method generateLatinChar failed.", (ch >= 'a') && (ch <= 'z'));
    }

}
