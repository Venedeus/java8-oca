/**
 *
 */
package by.iba.gomel;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing CommonClass class.
 */
public class CommonClassTest {
    /**
     * Instance of testing class.
     */
    private CommonClass testClass;

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.testClass = new CommonClass();
    }

    /**
     * Test method for {@link by.iba.gomel.CommonClass#test()}.
     */
    @Test
    public void testTest() throws NumberFormatException {
        Integer.valueOf(this.testClass.test());
    }

    /**
     * Test method for {@link by.iba.gomel.CommonClass#testDefault()}.
     */
    @Test
    public void testTestDefault() throws NumberFormatException {
        Integer.valueOf(this.testClass.testDefault());
    }
}
