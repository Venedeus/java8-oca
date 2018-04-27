/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CubeTest {
    /**
     * Dimension of the cube.
     */
    int  dim;
    /**
     * Cube object.
     */
    Cube cube;

    /**
     * Test method for {@link by.iba.gomel.Cube#Cube()}.
     */
    @Test
    public void testCube() {

        Assert.assertTrue("Constructor test failed.",
                (this.cube.getCharArr().length == this.dim)
                        && (this.cube.getCharArr()[0].length == this.dim)
                        && (this.cube.getCharArr()[0][0].length == this.dim));
    }

    /**
     * Test method for {@link by.iba.gomel.Cube#getCharArr()}.
     */
    @Test
    public void testGetCharArr() {
        int count = 0;

        for (int i = 0; i < this.cube.getCharArr().length; i++) {
            for (int j = 0; j < this.cube.getCharArr()[i].length; j++) {
                for (int k = 0; k < this.cube.getCharArr()[i][j].length; k++) {
                    count++;
                }
            }
        }

        Assert.assertEquals("Method getCharArr failed.", (int) Math.pow(this.dim, this.dim), count);
    }

    @Before
    @Test
    public void testInitialization() {
        this.dim = 3;
        this.cube = new Cube(this.dim);
    }

    /**
     * Test method for {@link by.iba.gomel.Cube#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertNotNull("Method toString test failed.", this.cube.toString());
    }
}
