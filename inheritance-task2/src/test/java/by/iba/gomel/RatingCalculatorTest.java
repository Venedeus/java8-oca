/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.calculators.CalculatorForBoxing;
import by.iba.gomel.calculators.AbstractRatingCalculator;

/**
 * This class is for testing RatingCalculator class. The instance would be initialized by
 * realization of this class, i.e. CalculatorForBoxing.
 */
public class RatingCalculatorTest {
    /**
     * An instance of RatingCalculator.
     */
    private AbstractRatingCalculator rc;

    /**
     * Test method for {@link by.iba.gomel.calculators.AbstractRatingCalculator#disqualify(int)}.
     */
    @Test
    public void testDisqualify() {
        final int id = this.rc.getScore()[0].getPlayerId();
        this.rc.setPointsByPlayerId(id, 10);
        this.rc.disqualify(id);

        Assert.assertEquals("Method getPointsByPlayerId() failed.", 0,
                this.rc.getPointsByPlayerId(id));
    }

    /**
     * Test method for {@link by.iba.gomel.calculators.AbstractRatingCalculator#getPointsByPlayerId(int)}.
     */
    @Test
    public void testGetPointsByPlayerId() {
        final int id = this.rc.getScore()[0].getPlayerId();
        this.rc.setPointsByPlayerId(id, 10);

        Assert.assertEquals("Method getPointsByPlayerId() failed.", 10,
                this.rc.getPointsByPlayerId(id));
    }

    /**
     * Test method for {@link by.iba.gomel.calculators.AbstractRatingCalculator#getScore()}.
     */
    @Test
    public void testGetScore() {
        final Score[] score = this.rc.getScore();
        boolean rightOrder = true;

        for (int i = 0; i < (score.length - 1); i++) {
            if (score[i].getPoints() < score[i + 1].getPoints()) {
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
        this.rc = new CalculatorForBoxing(new Participants(5).getParticipants());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.AbstractRatingCalculator#RatingCalculator(by.iba.gomel.Score[])}.
     */
    @Test
    public void testRatingCalculator() {
        Assert.assertNotNull("Instance creation failed.", this.rc);
    }

    /**
     * Test method for
     * {@link by.iba.gomel.calculators.AbstractRatingCalculator#setPointsByPlayerId(int, int)}.
     */
    @Test
    public void testSetPointsByPlayerId() {
        final int id = this.rc.getScore()[0].getPlayerId();
        this.rc.setPointsByPlayerId(id, 100);

        Assert.assertEquals("Method getPointsByPlayerId() failed.", 100,
                this.rc.getPointsByPlayerId(id));
    }
}
