package by.iba.gomel;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestMyArrays {
    static int[] intArray = MyArrays.getIntArr();

    /**
     * Test for getCharArr() method. Fails if expected array is not equals to bufferIntArr.
     */
    @Test
    public void testGetCharArr() {
        final char[][] charArr = MyArrays.getCharArr();
        final char[][] bufferCharArr = {{'a', 'r', 'r', 'a', 'y'}, {'o', 'f'},
                {'a', 'r', 'r', 'a', 'y', 's'}, {'o', 'f'}, {'c', 'h', 'a', 'r', 's'}};

        for (int i = 0; i < charArr.length; i++) {
            Assert.assertEquals(("testGetCharArr method failed on " + i + " step."),
                    Arrays.toString(bufferCharArr[i]), Arrays.toString(charArr[i]));
        }
    }

    /**
     * Test for getCustomedCharArr() method. Fails if expected array is not equals to bufferArr.
     */
    @Test
    public void testGetCustomedCharArr() {
        final char[][] bufferArr = {{'y', 'a', 'r', 'r', 'a'}, {'f', 'o'},
                {'s', 'y', 'a', 'r', 'r', 'a'}, {'f', 'o'}, {'s', 'r', 'a', 'h', 'c'}};
        final char[][] charArr = MyArrays.getCustomedCharArr();

        for (int i = 0; i < charArr.length; i++) {
            Assert.assertEquals(("testGetCustomedCharArr method failed on " + i + " step."),
                    Arrays.toString(bufferArr[i]), Arrays.toString(charArr[i]));
        }
    }

    /**
     * Test for getCustomedIntArr() method. Fails if expected array is not equals to bufferArr.
     */
    @Test
    public void testGetCustomedIntArr() {
        final int[] bufferArr = MyArrays.getCustomedIntArr();

        for (int i = 0; i < bufferArr.length; i++) {
            Assert.assertTrue("Element #" + i + " is not integer value", (bufferArr[i] % 1) == 0);
        }
    }

    /**
     * Test for getIntArr() method. Fails if bufferIntArr array is not equals to actual.
     */
    @Test
    public void testGetIntArr() {
        final int[] bufferArr = MyArrays.getIntArr();

        for (int i = 0; i < bufferArr.length; i++) {
            Assert.assertTrue("Element #" + i + " is not integer value", (bufferArr[i] % 1) == 0);
        }
    }
}
