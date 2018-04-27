/**
 *
 */
package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Museum class.
 */
public class MuseumTest {
    /**
     * An instance of testing class.
     */
    Museum museum;

    /**
     * Test method for
     * {@link by.iba.gomel.Museum#checkWorkingTimeUntilClosing(java.time.LocalDateTime)}.
     */
    @Test
    public void testCheckWorkingTimeUntilClosing() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing() failed.", "00:00",
                this.museum
                        .checkWorkingTimeUntilClosing(
                                LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 00)))
                        .toString());
    }

    /**
     * Test method for {@link by.iba.gomel.Museum#getTimeFromAirport()}.
     */
    @Test
    public void testGetTimeFromAirport() {
        Assert.assertEquals("Method getTimeFromAirport() failed.", "PT1H30M",
                this.museum.getTimeFromAirport().toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        final Schedule schedule = new Schedule();
        schedule.setFullTime(LocalTime.of(10, 00), LocalTime.of(17, 00));
        schedule.setSpecialTime(LocalTime.of(10, 00), LocalTime.of(20, 30));
        schedule.addDayOffs(DayOfWeek.SATURDAY);
        schedule.addDayOffs(DayOfWeek.SUNDAY);
        schedule.addSpecialDays(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

        this.museum = new Museum("British Museum", schedule, "90M");
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Museum#Museum(java.lang.String, by.iba.gomel.Schedule, java.lang.String)}.
     */
    @Test
    public void testMuseum() {
        Assert.assertNotNull("Instance creation failed.", this.museum);
    }

    /**
     * This method is for testing Minsk-scenario.
     */
    @Test
    public void testMuseumOpenedForVisitorsMinsk() {
        final Visitor visitor = new Visitor("Minsk", "UTC+3");
        visitor.setArrival("London", "UTC");
        visitor.countTimeToTrip(
                new Duration[] {Duration.parse("PT3H30M"), this.museum.getTimeFromAirport()});

        final LocalDateTime arrivalDate = visitor
                .countArrivalTime(LocalDateTime.of(LocalDate.of(2017, 1, 12), LocalTime.of(12, 00)))
                .toLocalDateTime();

        Assert.assertNotEquals("TimeZone using failed.", "00:00",
                this.museum.checkWorkingTimeUntilClosing(arrivalDate).toString());
    }

    /**
     * This method is for testing Moscow-scenario.
     */
    @Test
    public void testMuseumOpenedForVisitorsMoscow() {
        final Visitor visitor = new Visitor("Moscow", "UTC+3");
        visitor.setArrival("London", "UTC");
        visitor.countTimeToTrip(
                new Duration[] {Duration.parse("PT4H5M"), this.museum.getTimeFromAirport()});

        final LocalDateTime arrivalDate = visitor
                .countArrivalTime(LocalDateTime.of(LocalDate.of(2017, 1, 12), LocalTime.of(16, 00)))
                .toLocalDateTime();

        Assert.assertEquals("TimeZone using failed.", "00:00",
                this.museum.checkWorkingTimeUntilClosing(arrivalDate).toString());
    }

    /**
     * This method is for testing New-York-scenario.
     */
    @Test
    public void testMuseumOpenedForVisitorsNewYork() {
        final Visitor visitor = new Visitor("New-York", "UTC-5");
        visitor.setArrival("London", "UTC");
        visitor.countTimeToTrip(
                new Duration[] {Duration.parse("PT7H35M"), this.museum.getTimeFromAirport()});

        final LocalDateTime arrivalDate = visitor
                .countArrivalTime(LocalDateTime.of(LocalDate.of(2017, 1, 12), LocalTime.of(1, 00)))
                .toLocalDateTime();

        Assert.assertNotEquals("TimeZone using failed.", "00:00",
                this.museum.checkWorkingTimeUntilClosing(arrivalDate).toString());
    }

    /**
     * Test method for {@link by.iba.gomel.Museum#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertTrue("Method toString() failed.",
                this.museum.toString().contains("British Museum is now "));
    }

}
