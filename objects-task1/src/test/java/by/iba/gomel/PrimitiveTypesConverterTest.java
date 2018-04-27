package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class provides tests for PrimitiveTypesConverter class.
 */
public class PrimitiveTypesConverterTest {
    PrimitiveTypesConverter converter;

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(boolean)}.
     */
    @Test
    public void testConvertToStringBoolean() {
        Assert.assertEquals("Method convertToString(boolean) failed", "true - boolean",
                this.converter.convertToString(true));
    }

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(char)}.
     */
    @Test
    public void testConvertToStringChar() {
        Assert.assertEquals("Method convertToString(char) failed", "a - char",
                this.converter.convertToString('a'));
    }

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(double)}.
     */
    @Test
    public void testConvertToStringDouble() {
        Assert.assertEquals("Method convertToString(double) failed", "1.0 - double",
                this.converter.convertToString(1.0d));
    }

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(float)}.
     */
    @Test
    public void testConvertToStringFloat() {
        Assert.assertEquals("Method convertToString(float) failed", "1.0 - float",
                this.converter.convertToString(1.0f));
    }

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(int)}.
     */
    @Test
    public void testConvertToStringInt() {
        Assert.assertEquals("Method convertToString(int) failed", "1 - int",
                this.converter.convertToString(1));
    }

    /**
     * Test method for {@link by.iba.gomel.PrimitiveTypesConverter#convertToString(long)}.
     */
    @Test
    public void testConvertToStringLong() {
        Assert.assertEquals("Method convertToString(long) failed", "1 - long",
                this.converter.convertToString(1L));
    }

    /**
     * This method serves to initialize converter before tests.
     */
    @Before
    @Test
    public void testInitialization() {
        this.converter = new PrimitiveTypesConverter();
    }

}
