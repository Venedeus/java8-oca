/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Rhombus class.
 */
public class RhombusTest {
    /**
     * An instance of a rhombus.
     */
    Rhombus rhombus;

    /**
     * Test method for {@link by.iba.gomel.Rhombus#equals(java.lang.Object)} on equals.
     */
    @Test
    public void testEqualsObject() {
        Assert.assertTrue("Method equals() failed.", this.rhombus.equals(new Rhombus(5, 2)));
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#getRhombusArea()}.
     */
    @Test
    public void testGetArea() {
        Assert.assertEquals("Method getArea failed.", 10, this.rhombus.getArea(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#getAsDouble()}.
     */
    @Test
    public void testGetAsDouble() {
        Assert.assertEquals("Method getAsDouble() failed", 0, this.rhombus.getAsDouble(), 0.1);
    }

    /**
     * Test method for {@link by.iba.gomel.AbstractRectangle#getHeight()}.
     */
    @Test
    public void testGetHeight() {
        Assert.assertEquals("Method getHeight() failed.", 5, this.rhombus.getHeight(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#getRhombusHeight()}.
     */
    @Test
    public void testGetRhombusHeight() {
        Assert.assertEquals("Method getRhombusHeight() failed.", 2, this.rhombus.getRhombusHeight(),
                0);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#getWidth()}.
     */
    @Test
    public void testGetWidth() {
        Assert.assertEquals("Method getWidth() failed.", 5, this.rhombus.getWidth(), 0);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#hashCode()}.
     */
    @Test
    public void testHashCode() {
        Assert.assertEquals("Method hashCode() failed.", 43, this.rhombus.hashCode());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.rhombus = new Rhombus(5, 2);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#equals(java.lang.Object)} on not equals.
     */
    @Test
    public void testNotEqualsObject() {
        Assert.assertFalse("Method equals() failed.", this.rhombus.equals(new Rhombus(5, 3)));
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#equals(java.lang.Object)} on null.
     */
    @Test
    public void testNullEqualsObject() {
        Assert.assertFalse("Method equals() failed.", this.rhombus.equals(null));
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#Rhombus(double, double)}.
     */
    @Test
    public void testRhombus() {
        Assert.assertNotNull("Instance creation failed.", this.rhombus);
    }

    /**
     * Test method for {@link by.iba.gomel.Rhombus#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.",
                "Rhombus:\nside = 5.0\nheight = 2.0\narea = 10.0", this.rhombus.toString());
    }

}
