/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.calculators.CalculatorForRunning;

/**
 * This class is for testing CalculatorForRunning.
 */
public class CalculatorForRunningTest {
    /**
     * An instance of CalculatorForRunning.
     */
    private CalculatorForRunning calc;

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.CalculatorForRunning#CalculatorForRunning(by.iba.gomel.Score[])}.
     */
    @Test
    public void testCalculatorForRunning() {
        Assert.assertNotNull("Instance creation failed.", this.calc);
    }

    /**
     * Test method for {@link by.iba.gomel.calculators.CalculatorForRunning#getScore()}.
     */
    @Test
    public void testGetScore() {
        final Score[] score = this.calc.getScore();
        boolean rightOrder = true;

        for (int i = 0; i < (score.length - 1); i++) {
            if (score[i].getPoints() > score[i + 1].getPoints()) {
                rightOrder = false;
                break;
            }
        }

        Assert.assertTrue("Method getScore() failed.", rightOrder);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.calc = new CalculatorForRunning(new Participants(5).getParticipants());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.CalculatorForRunning#setPlayerResult(int, double)}.
     */
    @Test
    public void testSetPlayerResult() {
        final int id = this.calc.getScore()[0].getPlayerId();
        this.calc.setPlayerResult(id, 10);

        Assert.assertEquals("Method setPlayerResult() failed.", 1000,
                this.calc.getPointsByPlayerId(id));
    }

}
