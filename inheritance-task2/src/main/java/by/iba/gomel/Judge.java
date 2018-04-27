package by.iba.gomel;

import by.iba.gomel.calculators.AbstractRatingCalculator;
import by.iba.gomel.calculators.CalculatorForBoxing;
import by.iba.gomel.calculators.CalculatorForFigureSkating;
import by.iba.gomel.calculators.CalculatorForRunning;

/**
 * This is a demo-class to show simple functional of calculators.
 */
public final class Judge {
    /*
     * These constants are absolutely random and serve only for demonstration.
     */
    /**
     * This is a limit of boxing points.
     */
    private static final int BOXING_LIMITS  = 20;
    /**
     * This is a limit of running result.
     */
    private static final int RUNNING_LIMITS = 15;
    /**
     * This is a limit of figure skating points and judges.
     */
    private static final int SKATING_LIMITS = 6;

    /**
     * This method realizes a scenario of a box-game.
     *
     * @param rc
     *            - type of rating calculator - CalculatorForBoxing.
     */
    private static void playBoxingScenario(final CalculatorForBoxing rc) {
        for (int i = 0; i < Judge.BOXING_LIMITS; i++) {
            rc.addPoints(Generator.generateIntFromOne(Score.getId() + 1),
                    Generator.generateIntFromOne(Judge.BOXING_LIMITS));
        }
    }

    /**
     * This method realizes a scenario of a figure skating.
     *
     * @param rc
     *            - type of rating calculator - CalculatorForFigureSkating.
     */
    private static void playFigureSkatingScenario(final CalculatorForFigureSkating rc) {
        for (int i = 0; i <= Score.getId(); i++) {
            rc.ratePlayer(i,
                    Generator.generateDoubleArray(Judge.SKATING_LIMITS, Judge.SKATING_LIMITS));
        }
    }

    /**
     * This method realizes a scenario of a running.
     *
     * @param rc
     *            - type of rating calculator - CalculatorForRunning.
     */
    private static void playRunningScenario(final CalculatorForRunning rc) {
        for (int i = 0; i <= Score.getId(); i++) {
            rc.setPlayerResult(i, Generator.generateDouble(Judge.RUNNING_LIMITS));
        }

        rc.disqualify(1);
    }

    /**
     * This method is for rating the different types of games.
     *
     * @param rc
     *            - type of rating calculator.
     */
    public void rate(final AbstractRatingCalculator rc) {
        if (rc instanceof CalculatorForBoxing) {
            Judge.playBoxingScenario((CalculatorForBoxing) rc);
        }

        if (rc instanceof CalculatorForRunning) {
            Judge.playRunningScenario((CalculatorForRunning) rc);
        }

        if (rc instanceof CalculatorForFigureSkating) {
            Judge.playFigureSkatingScenario((CalculatorForFigureSkating) rc);
        }

        rc.getScore();
    }
}
