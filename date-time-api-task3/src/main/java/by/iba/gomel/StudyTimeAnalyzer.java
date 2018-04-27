/**
 *
 */
package by.iba.gomel;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * This class is for analyzing whether the given time is a lesson time or a break time.
 */
public final class StudyTimeAnalyzer {
    /**
     * Study beginning time.
     */
    private final LocalTime studyBegin;
    /**
     * Lesson duration.
     */
    private final Duration  durLesson;
    /**
     * Break duration.
     */
    private final Duration  durBreak;

    /**
     * Custom constructor.
     *
     * @param studyBegin
     *            - study beginning time.
     * @param durLesson
     *            - duration of a lesson.
     * @param durBreak
     *            - duration of a break.
     */
    public StudyTimeAnalyzer(final LocalTime studyBegin, final Duration durLesson,
            final Duration durBreak) {
        this.studyBegin = studyBegin;
        this.durLesson = durLesson;
        this.durBreak = durBreak;
    }

    /**
     * This method is for checking whether the given time is a lesson or a break.
     *
     * @param timeToCheck
     *            - time to be checked.
     * @return true - if checked time is a lesson, false - if a break.
     */
    public boolean checkTime(final LocalTime timeToCheck) {
        boolean isLesson = false;

        if (((this.durLesson.plus(this.durBreak)).toMinutes() != 0)
                && (((this.studyBegin.until(timeToCheck, ChronoUnit.MINUTES)
                        % (this.durLesson.plus(this.durBreak)).toMinutes())
                        - this.durLesson.toMinutes()) <= 0)) {
            isLesson = true;
        }

        return isLesson;
    }

    /**
     * This method overrides the default toString method.
     *
     * @return the state of an instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Studies begin at: " + this.studyBegin + ", lesson duration: "
                + this.durLesson.toMinutes() + " min, break duration: " + this.durBreak.toMinutes()
                + " min";
    }
}
