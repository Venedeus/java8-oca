/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Participants class.
 */
public class ParticipantsTest {
    /**
     * An instance of Participants.
     */
    private Participants parts;

    /**
     * Test method for {@link by.iba.gomel.Participants#getParticipants()}.
     */
    @Test
    public void testGetParticipants() {
        Assert.assertEquals("Method getParticipants() failed.", 5,
                this.parts.getParticipants().length);
    }

    @Before
    @Test
    public void testInitialization() {
        this.parts = new Participants(5);
    }

    /**
     * Test method for {@link by.iba.gomel.Participants#Participants(int)}.
     */
    @Test
    public void testParticipants() {
        Assert.assertNotNull("Instance creation failed.", this.parts);
    }

}
