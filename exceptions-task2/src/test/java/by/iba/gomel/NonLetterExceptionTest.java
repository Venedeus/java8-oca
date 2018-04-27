/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing NonLetterException class.
 */
public class NonLetterExceptionTest {
    /**
     * An instance of testing class.
     */
    private NonLetterException ex;

    /**
     * Test method for {@link by.iba.gomel.NonLetterException#getCh()}.
     */
    @Test
    public void testGetCh() {
        Assert.assertEquals("Method getCh() failed.", 'x', this.ex.getCh());
    }

    /**
     * Test method for {@link by.iba.gomel.NonLetterException#getFileName()}.
     */
    @Test
    public void testGetFileName() {
        Assert.assertEquals("Method getFileName() failed.", "test.txt", this.ex.getFileName());
    }

    /**
     * Test method for {@link by.iba.gomel.NonLetterException#getMessage()}.
     */
    @Test
    public void testGetMessage() {
        Assert.assertEquals("Method getMessage() failed.",
                "NonLetterException occured in test.txt, char = x", this.ex.getMessage());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.ex = new NonLetterException("test.txt", 'x');
    }

    /**
     * Test method for
     * {@link by.iba.gomel.NonLetterException#NonLetterException(java.lang.String, char)}.
     */
    @Test
    public void testNonLetterException() {
        Assert.assertNotNull("Instance creation failed.", this.ex);
    }

    /**
     * Test method for {@link by.iba.gomel.NonLetterException#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.",
                "NonLetterException occured in test.txt, char = x", this.ex.toString());
    }

}
