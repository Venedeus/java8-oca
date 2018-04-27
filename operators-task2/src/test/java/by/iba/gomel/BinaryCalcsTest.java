package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

public class BinaryCalcsTest {
    /**
     * This test for method leftShift(int input, int positions). Tests positive and negative values.
     */
    @Test
    public void testLeftShift() {
        Assert.assertEquals("leftShift test failed on positive integer.", 2,
                BinaryCalcs.leftShift(1, 1));
        Assert.assertEquals("leftShift test failed on negative integer.", -2,
                BinaryCalcs.leftShift(-1, 1));
    }

    /**
     * This test for method rightShift(int input, int positions). Tests positive and negative
     * values.
     */
    @Test
    public void testRightShift() {
        Assert.assertEquals("rightShift test failed on positive integer.", 4,
                BinaryCalcs.rightShift(8, 1));
        Assert.assertEquals("rightShift test failed on negative integer.", -4,
                BinaryCalcs.rightShift(-8, 1));
    }

    /**
     * This test for method rightUnsignedShift(int input, int positions). Tests positive and
     * negative values.
     */
    @Test
    public void testRightUnsignedShift() {
        Assert.assertEquals("rightUnsignedShift test failed on positive integer.", 5,
                BinaryCalcs.rightUnsignedShift(10, 1));
        Assert.assertEquals("rightUnsignedShift test failed on negative integer.", 2147483643,
                BinaryCalcs.rightUnsignedShift(-10, 1));
    }
}
