/**
 *
 */
package by.iba.gomel;

/**
 * This class provides a method that checks an int sequence whether it is a arithmetic progression.
 */
public final class ArProgressionChecker {
    /**
     * Private constructor.
     */
    private ArProgressionChecker() {

    }

    /**
     * This method checks whether the input int sequence is a arithmetic progression.
     *
     * @param intSequence
     *            input int sequence.
     * @return true - if the sequence is a arithmetic progression, false - not.
     */
    public static boolean checkIntSequence(final int[] intSequence) {
        boolean isProgression = false;

        if (intSequence.length > 1) {
            final int delta = intSequence[1] - intSequence[0];
            isProgression = true;

            for (int i = 1; i < (intSequence.length - 1); i++) {
                if ((intSequence[i + 1] - intSequence[i]) != delta) {
                    isProgression = false;

                    break;
                }
                isProgression = true;
            }
        }

        return isProgression;
    }
}
