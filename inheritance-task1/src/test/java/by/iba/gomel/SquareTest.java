/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Square class.
 */
public class SquareTest {
    /**
     * An instance of Square.
     */
    private Square square;

    /**
     * Test method for {@link by.iba.gomel.Square#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        Assert.assertTrue("Method equals() failed.", this.square.equals(new Square(5)));
    }

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#getRhombusArea()}.
     */
    @Test
    public void testGetArea() {
        Assert.assertEquals("Method getArea() failed.", 25, this.square.getArea(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Square#getAsDouble()}.
     */
    @Test
    public void testGetAsDouble() {
        Assert.assertEquals("Method getAsDouble() failed", 0, this.square.getAsDouble(), 0.1);
    }

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#getHeight()}.
     */
    @Test
    public void testGetHeight() {
        Assert.assertEquals("Method getHeight() failed.", 5, this.square.getHeight(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Square#getWidth()}.
     */
    @Test
    public void testGetWidth() {
        Assert.assertEquals("Method getWeight() failed.", 5, this.square.getWidth(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Square#hashCode()}.
     */
    @Test
    public void testHashCode() {
        Assert.assertEquals("Method hashCode() failed.", 66, this.square.hashCode());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.square = new Square(5);
    }

    /**
     * Test method for {@link by.iba.gomel.Square#equals(java.lang.Object)} on not equals.
     */
    @Test
    public void testNotEqualsObject() {
        Assert.assertFalse("Method equals() failed.", this.square.equals(new Square(10)));
    }

    /**
     * Test method for {@link by.iba.gomel.Square#equals(java.lang.Object)} on null.
     */
    @Test
    public void testNullEqualsObject() {
        Assert.assertFalse("Method equals() failed.", this.square.equals(null));
    }

    /**
     * Test method for {@link by.iba.gomel.Square#Square(double)}.
     */
    @Test
    public void testSquare() {
        Assert.assertNotNull("Instance creation failed.", this.square);
    }

    /**
     * Test method for {@link by.iba.gomel.Square#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.", "Square:\nside = 5.0\narea = 25.0",
                this.square.toString());
    }
}
