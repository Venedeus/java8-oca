/**
 *
 */
package by.iba.gomel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing class FPAdder.
 */
public class FPAdderTest {

    /**
     * Test method for {@link by.iba.gomel.FPAdder#calculate(java.lang.String[], int)}.
     */
    @Test
    public void testCalculate()
            throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        final String[] args = {"1", "1.23", "3.475"};
        Assert.assertEquals("Method calculate() failed.", 5.71, FPAdder.calculate(args, 2), 0.01);
    }

    /**
     * Test method for {@link by.iba.gomel.FPAdder#calculate(java.lang.String[], int)} with one
     * argument to invoke IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateException() {
        final String[] args = {"1"};
        Assert.assertEquals("Method calculate() failed while exception is called.", 5.71,
                FPAdder.calculate(args, 2), 0.01);
    }

    /**
     * Test private constructor.
     *
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    @Test
    public void testPrivateConstructor()
            throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final Constructor<FPAdder> constructor = FPAdder.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
        constructor.setAccessible(false);
    }
}
