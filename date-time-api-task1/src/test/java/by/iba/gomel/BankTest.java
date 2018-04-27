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
 * This class is for testing Bank class.
 */
public class BankTest {
    /**
     * An instance of a testing class.
     */
    Bank bank;

    /**
     * Test method for {@link by.iba.gomel.Bank#Bank(by.iba.gomel.Schedule)}.
     */
    @Test
    public void testBank() {
        Assert.assertNotNull("Instance creation failed.", this.bank);
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Bank#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with dayoff.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingDayoff() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on short time on open.",
                "00:00",
                this.bank.checkWorkingTimeUntilClosing(
                        LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()),
                                LocalTime.of(18, 00)))
                        .toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Bank#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with full
     * time in closed period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingFullTimeClosed() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on full time on close.",
                "00:00",
                this.bank.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)),
                        LocalTime.of(19, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Bank#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with full
     * time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingFullTimeOpened() {
        Assert.assertNotEquals("Method checkWorkingTimeUntilClosing failed on full time on open.",
                "00:00",
                this.bank.checkWorkingTimeUntilClosing(LocalDateTime.of(
                        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)),
                        LocalTime.of(9, 00))).toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Bank#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with short
     * time in closed period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingShortTimeClosed() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on short time on closed.",
                "00:00",
                this.bank.checkWorkingTimeUntilClosing(
                        LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()),
                                LocalTime.of(18, 00)))
                        .toString());
    }

    /**
     * Test method for
     * {@link by.iba.gomel.Bank#checkWorkingTimeUntilClosing(java.time.LocalDateTime)} with short
     * time in opened period.
     */
    @Test
    public void testCheckWorkingTimeUntilClosingShortTimeOpened() {
        Assert.assertEquals("Method checkWorkingTimeUntilClosing failed on dayoff.", "00:00",
                this.bank
                        .checkWorkingTimeUntilClosing(LocalDateTime
                                .of(LocalDate.now().with(DayOfWeek.SUNDAY), LocalTime.of(9, 00)))
                        .toString());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        final Schedule workSchedule = new Schedule();

        workSchedule.setFullTime(LocalTime.of(19, 00));
        workSchedule.setShortTime(LocalTime.of(15, 00));
        workSchedule.addDayOffs(DayOfWeek.SUNDAY);
        workSchedule.addShortDays(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
        workSchedule.addShortDays(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));

        this.bank = new Bank(workSchedule);
    }

}
