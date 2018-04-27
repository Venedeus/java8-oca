/**
 *
 */
package by.iba.gomel;

/**
 * This class provides implementation of bubble algorithm to sort an array. There is a limit on
 * quantity of array's elements.
 */
public final class Sorting {
    /**
     * Numeric constant - the limit of array's length.
     */
    private static final int MAX_LENGTH = 100;

    /**
     * Private constructor.
     */
    private Sorting() {

    }

    /**
     * This method sorts a given array in increment.
     *
     * @param array
     *            - given array.
     * @return sorted array.
     */
    public static int[] sortBubbleDec(final int[] array) {
        final boolean isLengthFit = Sorting.isLengthMatches(array.length);

        for (int i = 0; isLengthFit && (i < (array.length - 1)); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] <= array[j + 1]) {
                    final int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }

        return array;
    }

    /**
     * This method sorts a given array in decrement.
     *
     * @param array
     *            - given array.
     * @return sorted array.
     */
    public static int[] sortBubbleInc(final int[] array) {
        final boolean isLengthFit = Sorting.isLengthMatches(array.length);

        for (int i = 0; isLengthFit && (i < (array.length - 1)); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] >= array[j + 1]) {
                    final int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }

        return array;
    }

    /**
     * This method checks if the array's length not larger then MAX_LENGTH.
     *
     * @param length
     *            - length of the array.
     * @return the result of comparison.
     */
    private static boolean isLengthMatches(final int length) {
        return length <= Sorting.MAX_LENGTH;
    }
}
