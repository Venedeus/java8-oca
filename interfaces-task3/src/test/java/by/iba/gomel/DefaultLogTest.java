/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing DefaultLog class.
 */
public class DefaultLogTest {
    /**
     * Instance of Log interface.
     */
    private Log logger;

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.logger = new DefaultLog();
    }

    /**
     * Test method {@link by.iba.gomel.WarningLog#log(java.lang.String)}.
     */
    @Test
    public void testLog() {
        Assert.assertEquals("Method log() failed.", "Logger info.",
                this.logger.log("Logger info."));
    }
}
