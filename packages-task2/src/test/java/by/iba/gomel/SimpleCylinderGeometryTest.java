/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.math.geometry.SimpleCylinderGeometry;

/**
 * Test for SimpleCylinderGeometry class.
 */
public class SimpleCylinderGeometryTest {

    /**
     * Test method for
     * {@link by.iba.gomel.math.geometry.SimpleCylinderGeometry#calculateCylinderSquare(int)}.
     */
    @Test
    public void testCalculateCylinderSquare() {
        Assert.assertEquals("Method calculateCylinderSquare() failed.", 169.56,
                SimpleCylinderGeometry.calculateCylinderSquare(3, 6), 0.01);
    }

    /**
     * Test for getting constant PI.
     */
    @Test
    public void testCalculateCylinderSquarePI() {
        Assert.assertEquals("Getting PI failed.", 3.14, SimpleCylinderGeometry.PI, 0.01);
    }

}
