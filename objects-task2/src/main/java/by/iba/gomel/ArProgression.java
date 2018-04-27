package by.iba.gomel;

/**
 * This class realizes class-member of arithmetic progression. Input data are checked to match the
 * conditions of an arithmetic progression.
 */
public final class ArProgression {
    /**
     * Total amount of progression's members.
     */
    private static int totalElements;
    /**
     * The first member of the progression.
     */
    private static int firstElement;
    /**
     * The step of the progression.
     */
    private static int step;
    /**
     * The last element of the progression.
     */
    private static int lastElement;
    /**
     * Total sum of progression's members.
     */
    private static int totalSum;
    /**
     * Value of the current member.
     */
    private static int value;

    /**
     * This method counts the next step of the progression.
     *
     * @return current value.
     */
    public static int countStep() {
        if (ArProgression.hasStep()) {
            ArProgression.value += ArProgression.step;
            ArProgression.totalSum += ArProgression.value;
            ArProgression.totalElements++;
        }

        return ArProgression.value;
    }

    /**
     * Getter for the first element of the progression.
     *
     * @return the first element.
     */
    public static int getFirstElement() {
        return ArProgression.firstElement;
    }

    /**
     * Getter for the last element of the progression.
     *
     * @return the last element.
     */
    public static int getLastElement() {
        return ArProgression.lastElement;
    }

    /**
     * Getter for step of the progression.
     *
     * @return the step of the progression.
     */
    public static int getStep() {
        return ArProgression.step;
    }

    /**
     * Getter for amount of members of the progression.
     *
     * @return amount of the members.
     */
    public static int getTotalElements() {
        return ArProgression.totalElements;
    }

    /**
     * Getter for sum of members of the progression.
     *
     * @return sum of the members.
     */
    public static int getTotalSum() {
        return ArProgression.totalSum;
    }

    /**
     * Getter for value of the current member of the progression.
     *
     * @return value of the current member.
     */
    public static int getValue() {
        return ArProgression.value;
    }

    /**
     * This method check if the limit of the progression is reached.
     *
     * @return true - if there is a further step; false - if not.
     */
    public static boolean hasStep() {
        if (((ArProgression.step > 0)
                && ((ArProgression.value + ArProgression.step) <= ArProgression.lastElement))
                || ((ArProgression.step < 0) && ((ArProgression.value
                        + ArProgression.step) >= ArProgression.lastElement))) {
            return true;
        }

        return false;
    }

    /**
     * This method initializes fields with input data.
     *
     * @param inputFirstElement
     *            - the first element of the progression.
     * @param inputLastElement
     *            - the last element of the progression.
     * @param inputStep
     *            - the step of the progression.
     * @throws IllegalArguementException
     *             if input data contain error.
     */
    public static void initializeArProgression(final int inputFirstElement,
            final int inputLastElement, final int inputStep) {
        if (((inputFirstElement < inputLastElement) && (inputStep > 0))
                || ((inputFirstElement > inputLastElement) && (inputStep < 0))) {
            ArProgression.firstElement = inputFirstElement;
            ArProgression.lastElement = inputLastElement;
            ArProgression.step = inputStep;
            ArProgression.value = ArProgression.firstElement;
            ArProgression.totalSum = ArProgression.value;
            ArProgression.totalElements++;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method shows information about an object.
     *
     * @return information about an object.
     */
    @Override
    public String toString() {
        return "Arithmetic progression [" + ArProgression.firstElement + " - "
                + ArProgression.lastElement + "], step = " + ArProgression.step;
    }
}
