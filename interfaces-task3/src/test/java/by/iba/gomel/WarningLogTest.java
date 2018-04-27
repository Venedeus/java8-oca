/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing WarningLog class.
 */
public class WarningLogTest {
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
        this.logger = new WarningLog();
    }

    /**
     * Test method for {@link by.iba.gomel.WarningLog#log(java.lang.String)}.
     */
    @Test
    public void testLogString() {
        Assert.assertEquals("Method log() failed.", "WARNING - Logging in process.",
                this.logger.log("Logging in process."));
    }

    /**
     * Test method for {@link by.iba.gomel.WarningLog#log(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testLogStringString() {
        Assert.assertEquals("Method log(String, String) failed.",
                "WARNING - Log#1 - Logging in process.",
                WarningLog.log("Log#1", "Logging in process."));
    }
}
