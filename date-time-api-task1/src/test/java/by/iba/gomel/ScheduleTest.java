/**
 *
 */
package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Schedule class.
 */
public class ScheduleTest {
    /**
     * An instance of testing class.
     */
    Schedule schedule;

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with
     * dayoff.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingDayoff() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on short time on open.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(
                        LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()),
                                LocalTime.of(18, 00)))
                        .toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with full
     * time in closed period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingFullTimeClosed() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on full time on close.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)),
                        LocalTime.of(19, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with full
     * time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingFullTimeOpened() {
        Assert.assertNotEquals("Method checkWorkingTimeUntilClosing failed on full time on open.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)),
                        LocalTime.of(9, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with
     * short time in closed period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingShortTimeClosed() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on short time on closed.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(
                        LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()),
                                LocalTime.of(18, 00)))
                        .toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with
     * short time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingShortTimeOpened() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on dayoff.", "00:00",
                this.schedule
                        .checkWorkingTimeUntilClosing(LocalDateTime
                                .of(LocalDate.now().with(DayOfWeek.SUNDAY), LocalTime.of(9, 00)))
                        .toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.schedule = new Schedule();

        this.schedule.setFullTime(LocalTime.of(18, 00));
        this.schedule.setShortTime(LocalTime.of(16, 00));
        this.schedule.addDayOffs(DayOfWeek.SATURDAY);
        this.schedule.addDayOffs(DayOfWeek.SUNDAY);
        this.schedule.addShortDays(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
    }

    /**
     * Test method for {@link by.iba.gomel.Schedule#Schedule()}.
     */
    @Test
    public void testSchedule() {
        Assert.assertNotNull("Instance creation failed.", this.schedule);
    }

}
