/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Circle class.
 */
public class CircleTest {
    /**
     * An instance of Circle.
     */
    private Circle circle;

    /**
     * Test method for {@link by.iba.gomel.Circle#Circle(double)}.
     */
    @Test
    public void testCircle() {
        Assert.assertNotNull("Object's creation failed.", this.circle);
    }

    /**
     * Test method for {@link by.iba.gomel.Circle#getRhombusArea()}.
     */
    @Test
    public void testGetArea() {
        Assert.assertEquals("Method getArea() failed.", Math.PI * 10, this.circle.getArea(), 0.1);
    }

    /**
     * Test method for {@link by.iba.gomel.Circle#getAsDouble()}.
     */
    @Test
    public void testGetAsDouble() {
        Assert.assertEquals("Method getAsDouble() failed", 0, this.circle.getAsDouble(), 0.1);
    }

    /**
     * Test method for {@link by.iba.gomel.Circle#getRadius()}.
     */
    @Test
    public void testGetRadius() {
        Assert.assertEquals("Method getRadius() failed", 5, this.circle.getRadius(), 0.1);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.circle = new Circle(5);
    }
}
