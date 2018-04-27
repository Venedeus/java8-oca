/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing of ArProgression class.
 */
public class ArProgressionTest {
    private ArProgression ar1;
    private ArProgression ar2;

    /**
     * Test method for {@link by.iba.gomel.ArProgression#countStep()}.
     */
    @Test
    public void testCountStep() {
        Assert.assertEquals("Method countStep failed.", 9, ArProgression.getValue());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getFirstElement()}.
     */
    @Test
    public void testGetFirstElement() {
        Assert.assertEquals("Method firstElement failed", 1, ArProgression.getFirstElement());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getLastElement()}.
     */
    @Test
    public void testGetLastElement() {
        Assert.assertEquals("Method lastElement failed.", 10, ArProgression.getLastElement());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getStep()}.
     */
    @Test
    public void testGetStep() {
        Assert.assertEquals("Method getStep failed.", 2, ArProgression.getStep());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getTotalElements()}.
     */
    @Test
    public void testGetTotalElements() {
        Assert.assertEquals("Method getTotalElements failed.", 5, ArProgression.getTotalElements());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getTotalSum()}.
     */
    @Test
    public void testGetTotalSum() {
        Assert.assertEquals("Method getTotalSum failed.", 25, ArProgression.getTotalSum());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#getValue()}.
     */
    @Test
    public void testGetValue() {
        Assert.assertEquals("Method getValue failed.", 9, ArProgression.getValue());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#hasStep()}.
     */
    @Test
    public void testHasStep() {
        Assert.assertFalse("Method hasStep failed.", ArProgression.hasStep());
    }

    /**
     * PreTest initialization.
     */
    @Before
    @Test
    public void testInitialize() {
        ArProgression.initializeArProgression(1, 10, 2);
        this.ar1 = new ArProgression();
        this.ar2 = new ArProgression();

        while (ArProgression.hasStep()) {
            ArProgression.countStep();
        }
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#initializeArProgression(int, int, int)}.
     */
    @Test
    public void testInitializeArProgression() {
        Assert.assertEquals("Method initializeArProgression failed.", this.ar1.toString(),
                this.ar2.toString());
    }

    /**
     * Test method for {@link by.iba.gomel.ArProgression#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString failed.", "Arithmetic progression [1 - 10], step = 2",
                this.ar1.toString());
    }
}
