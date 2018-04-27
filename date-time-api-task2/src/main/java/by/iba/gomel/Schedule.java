/**
 *
 */
package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a simple variant of common schedule. It's better to use as a part of
 * composition pattern with another class. It class needs primary initialization, where full-time,
 * special-time work days and day-offs could be set.
 */
public final class Schedule {
    /**
     * Constant: amount of minutes per hour.
     */
    private static final int         MINUTES_PER_HOUR = 60;
    /**
     * Begin of working day.
     */
    private LocalTime                beginFullTime;
    /**
     * Begin of a special working day.
     */
    private LocalTime                beginSpecialTime;
    /**
     * Full-time field.
     */
    private LocalTime                fullTime;
    /**
     * special-time field.
     */
    private LocalTime                specialTime;
    /**
     * Set of criteria for day-offs.
     */
    private final Set<DayOfWeek>     setOfDayOffs;
    /**
     * Set of criteria for special days.
     */
    private final Set<LocalDateTime> setOfSpecialDays;

    /**
     * Default constructor.
     */
    public Schedule() {
        this.fullTime = LocalTime.now();
        this.specialTime = LocalTime.now();
        this.beginFullTime = LocalTime.now();
        this.beginSpecialTime = LocalTime.now();
        this.setOfDayOffs = new HashSet<>();
        this.setOfSpecialDays = new HashSet<>();
    }

    /**
     * This method adds a new item to set of day-offs.
     *
     * @param dayOfWeek
     *            - a new item to be add.
     */
    public void addDayOffs(final DayOfWeek dayOfWeek) {
        this.setOfDayOffs.add(dayOfWeek);
    }

    /**
     * This method adds a new item to set of special-time work days.
     *
     * @param dayOfWeek
     *            - a new item to be add.
     */
    public void addSpecialDays(final LocalDate day) {
        this.setOfSpecialDays.add(LocalDateTime.of(day, this.specialTime));
    }

    /**
     * This method is for checking the rest of the time before closing.
     *
     * @param day
     *            - the given day.
     * @return the rest of the time before closing.
     */
    public LocalTime checkWorkingTimeUntilClosing(final LocalDateTime day) {
        LocalTime time = LocalTime.of(0, 0);

        if (!this.checkDayOff(day)) {
            if (this.checkSpecialDay(day)) {
                if (day.toLocalTime().isAfter(this.beginSpecialTime)
                        && day.toLocalTime().isBefore(this.specialTime)) {
                    time = this.specialTime;
                }
            } else {
                if (day.toLocalTime().isAfter(this.beginFullTime)
                        && day.toLocalTime().isBefore(this.fullTime)) {
                    time = this.fullTime;
                }
            }
        }

        if (time.getHour() != 0) {
            final int hour = (int) (day.toLocalTime().until(time, ChronoUnit.MINUTES)
                    / Schedule.MINUTES_PER_HOUR);
            final int minute = (int) (day.toLocalTime().until(time, ChronoUnit.MINUTES)
                    % Schedule.MINUTES_PER_HOUR);
            time = LocalTime.of(hour, minute);
        }

        return time;
    }

    /**
     * Setter for fullTime.
     *
     * @param fullTime
     *            - full time working day.
     * @param beginFullTime
     *            - beginning of full-time work day.
     */
    public void setFullTime(final LocalTime beginFullTime, final LocalTime fullTime) {
        this.beginFullTime = beginFullTime;
        this.fullTime = fullTime;
    }

    /**
     * Setter for specialTime.
     *
     * @param specialTime
     *            - special time working day.
     * @param beginSpecialTime
     *            - beginning of the special-time work day.
     */
    public void setSpecialTime(final LocalTime beginSpecialTime, final LocalTime specialTime) {
        this.beginSpecialTime = beginSpecialTime;
        this.specialTime = specialTime;
    }

    /**
     * This method is for checking whether the given day-time is matching with day-offs.
     *
     * @param day
     *            - given day-time to be checked.
     * @return true - if the given day-time matches with the day-off; false - if not.
     */
    private boolean checkDayOff(final LocalDateTime day) {
        boolean isDayOff = false;

        for (final DayOfWeek dayOff : this.setOfDayOffs) {
            if (day.getDayOfWeek() == dayOff) {
                isDayOff = true;
                break;
            }
        }

        return isDayOff;
    }

    /**
     * This method is for checking whether the given day-time is matching with work time.
     *
     * @param day
     *            - given day-time to be checked.
     * @return true - if the given day-time matches with the work time; false - if not.
     */
    private boolean checkSpecialDay(final LocalDateTime dayToCheck) {
        boolean isConfirm = false;

        for (final LocalDateTime day : this.setOfSpecialDays) {
            if (day.toLocalDate().equals(dayToCheck.toLocalDate())) {
                isConfirm = true;
                break;
            }
        }

        return isConfirm;
    }
}
