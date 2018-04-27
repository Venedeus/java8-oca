/**
 *
 */
package by.iba.gomel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Visitor class.
 */
public class VisitorTest {
    /**
     * An instance of testing class.
     */
    Visitor visitor;

    /**
     * Test method for {@link by.iba.gomel.Visitor#countArrivalTime(java.time.LocalDateTime)}.
     */
    @Test
    public void testCountArrivalTime() {
        Assert.assertEquals("Method countTimeToTrip() failed.", "09:00", this.visitor
                .countArrivalTime(LocalDateTime.of(LocalDate.of(2017, 1, 12), LocalTime.of(12, 00)))
                .toLocalTime().toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.visitor = new Visitor("Minsk", "UTC+3");
        this.visitor.setArrival("London", "UTC");
    }

    /**
     * Test method for {@link by.iba.gomel.Visitor#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.",
                "Visitor [home: Minsk/UTC+3] has a trip to: London/UTC", this.visitor.toString());
    }

    /**
     * Test method for {@link by.iba.gomel.Visitor#Visitor(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testVisitorMinsk() {
        Assert.assertNotNull("Instance creation failed.", this.visitor);
    }

}
