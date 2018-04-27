/**
 *
 */
package by.iba.gomel;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * This class is a simple realization of museum. It works according to inner schedule.
 */
public final class Museum {
    /**
     * Schedule of museum's work time.
     */
    private final Schedule workSchedule;
    /**
     * Museum's title.
     */
    private final String   title;
    /**
     * Time to get from the airport to the museum.
     */
    private final Duration timeFromAirport;

    /**
     * Custom constructor.
     *
     * @param title
     *            - museum's title.
     * @param workSchedule
     *            - schedule of museum's work time.
     * @param timeFromAirport
     *            - time interval to get from the airport to museum.
     */
    public Museum(final String title, final Schedule workSchedule, final String timeFromAirport) {
        this.title = title;
        this.workSchedule = workSchedule;
        this.timeFromAirport = Duration.parse("PT" + timeFromAirport);
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

    /**
     * Getter for timeFromAirport field.
     *
     * @return the time to get from the airport to museum.
     */
    public Duration getTimeFromAirport() {
        return this.timeFromAirport;
    }

    /**
     * This method overrides the default toString method.
     *
     * @return the state of an instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String state = "opened";

        if (this.checkWorkingTimeUntilClosing(LocalDateTime.now()).equals(LocalTime.of(0, 0))) {
            state = "closed";
        }

        return this.title + " is now " + state;
    }
}
