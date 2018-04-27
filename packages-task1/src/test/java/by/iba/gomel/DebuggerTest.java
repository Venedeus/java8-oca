package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing by.iba.gomel.debug.Debugger and by.iba.gomel.debugoff.Debugger.
 */
public class DebuggerTest {
    /**
     * Instance of by.iba.gomel.debug.Debugger.
     */
    private by.iba.gomel.debug.Debugger    debugger;
    /**
     * Instance of by.iba.gomel.debugoff.Debugger.
     */
    private by.iba.gomel.debugoff.Debugger debuggeroff;

    /**
     * Test for {link@ by.iba.gomel.debug.Debugger#debug(String)}
     */
    @Test
    public void testDebugDebug() {
        Assert.assertEquals("Method debug() failed.", "INFO - Test", this.debugger.debug("Test"));
    }

    /**
     * Test for {link@ by.iba.gomel.debugoff.Debugger#debug(String)}
     */
    @Test
    public void testDebugoffDebug() {
        Assert.assertEquals("Method debug() failed.", "WARNING - Test",
                this.debuggeroff.debug("Test"));
    }

    /**
     * Initialization for instances.
     */
    @Before
    @Test
    public void testInitialization() {
        this.debugger = new by.iba.gomel.debug.Debugger();
        this.debuggeroff = new by.iba.gomel.debugoff.Debugger();
    }
}
