/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing ArProgressionChecker class.
 */
public class ArProgressionCheckerTest {
    /**
     * Test method for {@link by.iba.gomel.ArProgressionChecker#checkIntSequence(int[])}.
     */
    @Test
    public void testCheckIntSequenceFakeProgression() {
        Assert.assertFalse("Method checkArProgression failed on non-progressive sequence. ",
                ArProgressionChecker.checkIntSequence(new int[] {1, 2, 3, 4, 7, 6, 7}));
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgressionChecker#checkIntSequence(int[])}.
     */
    @Test
    public void testCheckIntSequenceOneIntInput() {
        Assert.assertFalse("Method checkArProgression failed on one int input.",
                ArProgressionChecker.checkIntSequence(new int[] {1}));
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgressionChecker#checkIntSequence(int[])}.
     */
    @Test
    public void testCheckIntSequenceRealProgressionDec() {
        Assert.assertTrue("Method checkArProgression failed on real decremental progression.",
                ArProgressionChecker.checkIntSequence(new int[] {1, 2, 3, 4, 5, 6, 7}));
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgressionChecker#checkIntSequence(int[])}.
     */
    @Test
    public void testCheckIntSequenceRealProgressionInc() {
        Assert.assertTrue(
                "Method checkArProgression failed on real incremental arithmetic progression.",
                ArProgressionChecker.checkIntSequence(new int[] {3, 2, 1}));
    }

}
