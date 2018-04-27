/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.calculators.CalculatorForBoxing;

/**
 * This class is for testing CalculatorForBoxing class.
 */
public class CalculatorForBoxingTest {
    /**
     * An instance of CalculatorForBoxing.
     */
    CalculatorForBoxing calc;

    /**
     * Test method for {@link by.iba.gomel.calculators.CalculatorForBoxing#addPoints(int, int)}.
     */
    @Test
    public void testAddPoints() {
        final int id = this.calc.getScore()[0].getPlayerId();
        this.calc.addPoints(id, 1);

        Assert.assertEquals("Method addPoints() failed.", 1, this.calc.getPointsByPlayerId(id));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.CalculatorForBoxing#CalculatorForBoxing(by.iba.gomel.Score[])}.
     */
    @Test
    public void testCalculatorForBoxing() {
        Assert.assertNotNull("Instance creation failed.", this.calc);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.calc = new CalculatorForBoxing(new Participants(1).getParticipants());
    }

    /**
     * Test method for {@link by.iba.gomel.calculators.CalculatorForBoxing#knockout(int)}.
     */
    @Test
    public void testKnockout() {
        this.calc.knockout(1);
        Assert.assertEquals("Method knockout() failed.", 0, this.calc.getPointsByPlayerId(1));
    }
}
