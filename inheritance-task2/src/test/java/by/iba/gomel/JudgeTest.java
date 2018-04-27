/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.calculators.CalculatorForBoxing;
import by.iba.gomel.calculators.CalculatorForFigureSkating;
import by.iba.gomel.calculators.CalculatorForRunning;

/**
 * This class is for testing Judge class.
 */
public class JudgeTest {
    /**
     * An instance of Judge.
     */
    private Judge judge;

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.judge = new Judge();
    }

    /**
     * Test method for {@link by.iba.gomel.Judge#rate(by.iba.gomel.calculators.RatingCalculator)}.
     */
    @Test
    public void testRateInBoxing() {
        final Participants parts = new Participants(10);
        final CalculatorForBoxing calc = new CalculatorForBoxing(parts.getParticipants());
        this.judge.rate(calc);

        final Score[] score = calc.getScore();
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
     * Test method for {@link by.iba.gomel.Judge#rate(by.iba.gomel.calculators.RatingCalculator)}.
     */
    @Test
    public void testRateInFigureSkating() {
        final CalculatorForFigureSkating calc = new CalculatorForFigureSkating(
                new Participants(10).getParticipants());
        this.judge.rate(calc);

        final Score[] score = calc.getScore();
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
     * Test method for {@link by.iba.gomel.Judge#rate(by.iba.gomel.calculators.RatingCalculator)}.
     */
    @Test
    public void testRateInRunning() {
        final CalculatorForRunning calc = new CalculatorForRunning(
                new Participants(10).getParticipants());

        this.judge.rate(calc);

        final Score[] score = calc.getScore();
        boolean rightOrder = true;

        for (int i = 0; i < (score.length - 1); i++) {
            if (score[i].getPoints() > score[i + 1].getPoints()) {
                rightOrder = false;
                break;
            }
        }

        Assert.assertTrue("Method getScore() failed.", rightOrder);
    }
}
