/**
 *
 */
package by.iba.gomel;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * This class is a simple realization of bank. It works according to inner schedule.
 */
public final class Bank {
    /**
     * Schedule of bank's work time.
     */
    private final Schedule workSchedule;

    /**
     * Custom constructor.
     * 
     * @param schedule
     *            - instance of input schedule.
     */
    public Bank(final Schedule schedule) {
        this.workSchedule = schedule;
    }

    /**
     * This method is for checking the rest of the time before closing.
     *
     * @param day
     *            - the given day.
     * @return the rest of the time before closing.
     */
    public LocalTime checkWorkingTimeUntilClosing(final LocalDateTime day) {
        return this.workSchedule.checkWorkingTimeUntilClosing(day);
    }
}
