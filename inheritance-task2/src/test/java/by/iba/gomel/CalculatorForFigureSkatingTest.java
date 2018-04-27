/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.calculators.CalculatorForFigureSkating;

/**
 * This class is for testing CalculatorForFigureSkating.
 */
public class CalculatorForFigureSkatingTest {
    /**
     * An instance of CalculatorForFigureSkating.
     */
    private CalculatorForFigureSkating calc;

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.CalculatorForFigureSkating#CalculatorForFigureSkating(by.iba.gomel.Score[])}.
     */
    @Test
    public void testCalculatorForFigureSkating() {
        Assert.assertNotNull("Instance creation failed.", this.calc);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.calc = new CalculatorForFigureSkating(new Participants(5).getParticipants());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.CalculatorForFigureSkating#ratePlayer(int, double[])}.
     */
    @Test
    public void testRatePlayer() {
        final int id = this.calc.getScore()[0].getPlayerId();
        this.calc.ratePlayer(id, new double[] {5.5, 5.5, 5.5, 6.0, 4.5});

        Assert.assertEquals("Method setPlayerResult() failed.", 540.0,
                this.calc.getPointsByPlayerId(id), 0.1);
    }

}
