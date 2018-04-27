package by.iba.gomel;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * This class provides two arrays: 1. 3-dimension array of positive integer values. 2. array of
 * arrays of chars. Each array would be initialized by two ways - when declared and by assigning
 * values for each element.
 */
public final class MyArrays {
    /**
     * Constant: ZERO = 0;
     */
    private static final int      ZERO    = 0;
    /**
     * Constant: ONE = 1;
     */
    private static final int      ONE     = 1;
    /**
     * Constant: TEN = 10;
     */
    private static final int      TEN     = 10;
    /**
     * Array of integer values.
     */
    private static final int[]    intArr  = {1, 2, 3};
    /**
     * Array of arrays of chars.
     */
    private static final char[][] charArr = {{'a', 'r', 'r', 'a', 'y'}, {'o', 'f'},
            {'a', 'r', 'r', 'a', 'y', 's'}, {'o', 'f'}, {'c', 'h', 'a', 'r', 's'}};

    private MyArrays() {
    }

    /**
     * Getter for charArr.
     *
     * @return array of arrays of chars.
     */
    public static char[][] getCharArr() {
        return MyArrays.charArr;
    }

    /**
     * This method changes elements of charArr in custom order: it swaps the first and the last
     * elements and so on. So as a result we have reinitialized array.
     *
     * @return reinitialized charArr.
     */
    public static char[][] getCustomedCharArr() {
        for (int i = MyArrays.ZERO; i < MyArrays.charArr.length; i++) {
            final char[] bufferArr = Arrays.copyOf(MyArrays.charArr[i], MyArrays.charArr[i].length);
            for (int j = MyArrays.ZERO; j < MyArrays.charArr[i].length; j++) {
                MyArrays.charArr[i][j] = bufferArr[bufferArr.length - j - MyArrays.ONE];
            }
        }

        return MyArrays.charArr;
    }

    /**
     * This method randomizes each element of intArr. So as a result we have reinitialized array.
     *
     * @return reinitialized intArr.
     */
    public static int[] getCustomedIntArr() {
        for (int i = MyArrays.ZERO; i < MyArrays.intArr.length; i++) {
            MyArrays.intArr[i] = (i + MyArrays.ONE) * new SecureRandom().nextInt(MyArrays.TEN);
        }

        return MyArrays.intArr;
    }

    /**
     * Getter for intArr.
     *
     * @return array of integer values.
     */
    public static int[] getIntArr() {
        return MyArrays.intArr;
    }
}
