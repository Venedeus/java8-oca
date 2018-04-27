/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing StringTreatment.
 */
public class CharsTreatmentTest {
    /**
     * Instance of class to test.
     */
    CharsTreatment testClass;

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#charAt(int)}.
     */
    @Test
    public void testCharAt() {
    }

    @Before
    @Test
    public void testInitialization() {
        this.testClass = new CharsTreatment();
        this.testClass.setSequence("Hello Java-World!!!".toCharArray());
    }

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#length()}.
     */
    @Test
    public void testLength() {
        Assert.assertEquals("Method length() failed.", 19, this.testClass.length());
    }

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#reverse()}.
     */
    @Test
    public void testReverse() {
        Assert.assertEquals("Method reverse() failed.", "!!!dlroW-avaJ olleH",
                this.testClass.reverse().toString());
    }

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#StringTreatment()}.
     */
    @Test
    public void testStringTreatment() {
        Assert.assertNotNull("Default constructor failed.", new CharsTreatment());
    }

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#StringTreatment(java.lang.String)}.
     */
    @Test
    public void testStringTreatmentString() {
        Assert.assertNotNull("Parametrized constructor failed.",
                new CharsTreatment("Test".toCharArray()));
    }

    /**
     * Test method for {@link by.iba.gomel.CharsTreatment#subSequence(int, int)}.
     */
    @Test
    public void testSubSequence() {
        Assert.assertEquals("Method subSequence() failed.", "Hello",
                this.testClass.subSequence(0, 4).toString());
    }

}
