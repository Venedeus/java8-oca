package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

public class TestConverter {

    /**
     * Test for method primConvertToByte(byte b). Tests on out-of-range and in-range result.
     */
    @Test
    public void testPrimConvertToByte() {
        Assert.assertEquals("primConvertToByte method failed", -19,
                Converter.primConvertToByte((byte) 100));
        Assert.assertEquals("primConvertToByte method failed", 55,
                Converter.primConvertToByte((byte) 5));
    }

    /**
     * Test for method primConvertToInt(int i). Tests on out-of-range and in-range result.
     */
    @Test
    public void testPrimConvertToInt() {
        Assert.assertEquals("primConvertToInt method failed", -307921510,
                Converter.primConvertToInt(500000));
        Assert.assertEquals("primConvertToInt method failed", 100000,
                Converter.primConvertToInt(5));
    }

    /**
     * Test for method primConvertToLong(long l). Tests on out-of-range and in-range result.
     */
    @Test
    public void testPrimConvertToLong() {
        Assert.assertEquals("primConvertToLong method failed", 1000000000000000000L,
                Converter.primConvertToLong(1000000000));
        Assert.assertEquals("primConvertToLong method failed", 5000000000L,
                Converter.primConvertToLong(5));
    }
}
