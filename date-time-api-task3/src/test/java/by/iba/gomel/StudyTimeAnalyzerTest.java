/**
 *
 */
package by.iba.gomel;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing StudyTimeAnalyzer class.
 */
public class StudyTimeAnalyzerTest {
    /**
     * An instance of testing class.
     */
    StudyTimeAnalyzer analyzer;

    /**
     * Test method for {@link by.iba.gomel.StudyTimeAnalyzer#checkTime(java.time.LocalTime)} on
     * break time.
     */
    @Test
    public void testCheckTimeBreak() {
        Assert.assertFalse("Method checkTime() failed.",
                this.analyzer.checkTime(LocalTime.of(10, 05)));
    }

    /**
     * Test method for {@link by.iba.gomel.StudyTimeAnalyzer#checkTime(java.time.LocalTime)} on
     * lesson time.
     */
    @Test
    public void testCheckTimeLesson() {
        Assert.assertTrue("Method checkTime() failed.",
                this.analyzer.checkTime(LocalTime.of(9, 50)));
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.analyzer = new StudyTimeAnalyzer(LocalTime.of(8, 20), Duration.ofMinutes(45),
                Duration.ofMinutes(10));
    }

    /**
     * Test method for
     * {@link by.iba.gomel.StudyTimeAnalyzer#StudyTimeAnalyzer(java.time.LocalTime)}.
     */
    @Test
    public void testStudyTimeAnalyzer() {
        Assert.assertNotNull("Instance creation failed.", this.analyzer);
    }

    /**
     * Test method for {@link by.iba.gomel.StudyTimeAnalyzer#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.",
                "Studies begin at: 08:20, lesson duration: 45 min, break duration: 10 min",
                this.analyzer.toString());
    }
}
