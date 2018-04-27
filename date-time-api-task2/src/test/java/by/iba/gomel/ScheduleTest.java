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
 *
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
        System.out.println(this.schedule);
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on short time on open.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY)),
                        LocalTime.now())).toString());
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
                        LocalTime.of(9, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with full
     * time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingFullTimeOpened() {
        Assert.assertNotEquals("Method checkWorkingTimeUntilClosing failed on full time on close.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)),
                        LocalTime.of(11, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with
     * special time in closed period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingSpecialTimeClosed() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on full time on close.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
                        LocalTime.of(9, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Schedule#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with
     * special time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingSpecialTimeOpened() {
        Assert.assertNotEquals("Method checkWorkingTimeUntilClosing failed on full time on close.",
                "00:00",
                this.schedule.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
                        LocalTime.of(11, 00))).toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.schedule = new Schedule();

        this.schedule.setFullTime(LocalTime.of(10, 00), LocalTime.of(17, 00));
        this.schedule.setSpecialTime(LocalTime.of(10, 00), LocalTime.of(20, 30));
        this.schedule.addDayOffs(DayOfWeek.SATURDAY);
        this.schedule.addDayOffs(DayOfWeek.SUNDAY);
        this.schedule
                .addSpecialDays(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    }

    /**
     * Test method for {@link by.iba.gomel.Schedule#Schedule()}.
     */
    @Test
    public void testSchedule() {
        Assert.assertNotNull("Instance creation failed.", this.schedule);
    }
}
