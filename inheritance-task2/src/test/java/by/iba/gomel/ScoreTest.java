/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Score class.
 */
public class ScoreTest {
    /**
     * An instance of Score.
     */
    private final Score score = new Score();

    /**
     * Test method for {@link by.iba.gomel.Score#compareTo(by.iba.gomel.Score)}.
     */
    @Test
    public void testCompareTo() {
        final Score scoreTest = new Score();
        scoreTest.setPoints(1);

        Assert.assertTrue("Method compareTo() failed.", this.score.compareTo(scoreTest) == 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Score#equals(by.iba.gomel.Score)}.
     */
    @Test
    public void testEquals() {
        Assert.assertFalse("Method compareTo() failed.", this.score.equals(new Score()));
    }

    /**
     * Test method for {@link by.iba.gomel.Score#getPlayerId()}.
     */
    @Test
    public void testGetPlayerId() {
        Assert.assertTrue("Method getPlayerId() failed.", this.score.getPlayerId() > 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Score#getPoints()}.
     */
    @Test
    public void testGetPoints() {
        Assert.assertEquals("Method getPoints() failed.", 1, this.score.getPoints());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.score.setPoints(1);
    }

    /**
     * Test method for {@link by.iba.gomel.Score#Score()}.
     */
    @Test
    public void testScore() {
        Assert.assertNotNull("Instance creation failed.", this.score);
    }

    /**
     * Test method for {@link by.iba.gomel.Score#setPoints(int)}.
     */
    @Test
    public void testSetPoints() {
        Assert.assertEquals("Method setPoints() failed.", 1, this.score.getPoints());
    }

    /**
     * Test method for {@link by.iba.gomel.Score#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertTrue("Method toString() failed.", this.score.toString() instanceof String);
    }
}
