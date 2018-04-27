/**
 *
 */
package by.iba.gomel;

import java.security.SecureRandom;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class provides testing of class by.iba.gomel.Sorting.
 */
public class SortingTest {
    private int[] array;

    /**
     * This method generates random integers in range [0; 100).
     *
     * @return random integer.
     *
     */
    public static int generateInt() {
        final SecureRandom random = new SecureRandom();
        return random.nextInt(100);
    }

    /**
     * Test method for {@link by.iba.gomel.Sorting#sortBubbleDec(int[])}.
     */
    @Test
    public void testSortBubbleDec() {
        this.array = new int[] {2, 3, 1};

        this.array = Sorting.sortBubbleDec(this.array);

        Assert.assertArrayEquals("Method sortBubbleDec failed", this.array,
                Sorting.sortBubbleDec(this.array));
    }

    /**
     * Test method for {@link by.iba.gomel.Sorting#sortBubbleDec(int[])}.
     */
    @Test
    public void testSortBubbleDecOutLimits() {
        this.array = new int[101];

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = SortingTest.generateInt();
        }

        Assert.assertArrayEquals(
                "Error while checking length of the array in the decrement sorting.", this.array,
                Sorting.sortBubbleDec(this.array));
    }

    /**
     * Test method for {@link by.iba.gomel.Sorting#sortBubbleInc(int[])}.
     */
    @Test
    public void testSortBubbleInc() {
        this.array = new int[] {2, 3, 1};

        this.array = Sorting.sortBubbleInc(this.array);

        Assert.assertArrayEquals("Method sortBubbleInc failed", this.array,
                Sorting.sortBubbleInc(this.array));
    }

    /**
     * Test method for {@link by.iba.gomel.Sorting#sortBubbleInt(int[])}.
     */
    @Test
    public void testSortBubbleIntOutLimits() {
        this.array = new int[101];

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = SortingTest.generateInt();
        }

        Assert.assertArrayEquals(
                "Error while checking length of the array in the increment sorting.", this.array,
                Sorting.sortBubbleDec(this.array));
    }
}
