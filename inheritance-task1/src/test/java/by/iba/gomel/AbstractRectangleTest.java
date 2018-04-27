/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing AbstractRectangle.
 */
public class AbstractRectangleTest {
    /**
     * Reference of testing class.
     */
    AbstractRectangle absRect;

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#AbstractRectangle(double)}.
     */
    @Test
    public void testAbstractRectangle() {
        Assert.assertNotNull("Instance creation failed.", this.absRect);
    }

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#getHeight()}.
     */
    @Test
    public void testGetHeight() {
        Assert.assertEquals("Method getHeight() failed.", 1, this.absRect.getHeight(), 0.1);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.absRect = new Square(1);
    }

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#setHeight()}.
     */
    @Test
    public void testSetHeight() {
        this.absRect.setHeight(10);
        Assert.assertEquals("Method getHeight() failed.", 10, this.absRect.getHeight(), 0.1);
    }

}
