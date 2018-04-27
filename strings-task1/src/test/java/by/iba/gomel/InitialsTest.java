/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing Initials class.
 */
public class InitialsTest {
    /**
     * Test method for {@link by.iba.gomel.Initials#computeInitials(String)}.
     */
    @Test
    public void testComputeInitials() {
        Assert.assertEquals("Method computeInitials() failed.", "E.S.",
                Initials.computeInitials("Evgeniy Shvetsov"));
    }

    /**
     * Test method for {@link by.iba.gomel.Initials#computeInitials(String)} with blank input.
     */
    @Test
    public void testComputeInitialsBlankInput() {
        Assert.assertEquals("Method computeInitials() failed.", "", Initials.computeInitials(""));
    }

    /**
     * Test method for {@link by.iba.gomel.Initials#computeInitials(String)} with letters.
     */
    @Test
    public void testComputeInitialsLetters() {
        Assert.assertEquals("Method computeInitials() failed.", "E.S.",
                Initials.computeInitials("E S"));
    }

    /**
     * Test method for {@link by.iba.gomel.Initials#computeInitials(String)} with only one name.
     */
    @Test
    public void testComputeInitialsOneName() {
        Assert.assertEquals("Method computeInitials() failed.", "",
                Initials.computeInitials("Evgeniy"));
    }
}
