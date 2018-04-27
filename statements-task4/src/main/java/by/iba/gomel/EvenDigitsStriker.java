package by.iba.gomel;

/**
 * This class provides realization of function for striking even digits in input integer number.
 */
public final class EvenDigitsStriker {
    /**
     * Numeric constant: base of numeric system.
     */
    private static final int NUMERIC_SYSTEM  = 10;
    /**
     * Numeric constant: identifier to check the even digits.
     */
    private static final int EVEN_IDENTIFIER = 2;

    /**
     * Default private constructor.
     */
    private EvenDigitsStriker() {

    }

    /**
     * This method provides even digits striking.
     *
     * @param inputNumber
     *            number to be analyzed.
     * @return result of striking.
     * @throws IllegalArgumentException
     *             if the result of striking is zero. This result causes if there is no odd digits.
     */
    public static int strikeEvens(final int inputNumber) {
        int number = inputNumber;
        int outputNumber = 0;

        while (number != 0) {
            final int digit = number % EvenDigitsStriker.NUMERIC_SYSTEM;

            number /= EvenDigitsStriker.NUMERIC_SYSTEM;

            if ((digit % EvenDigitsStriker.EVEN_IDENTIFIER) != 0) {
                outputNumber *= EvenDigitsStriker.NUMERIC_SYSTEM;
                outputNumber += digit;
            }
        }

        final String strOutputNumber = new StringBuffer(String.valueOf(outputNumber)).reverse()
                .toString();

        outputNumber = Integer.valueOf(strOutputNumber);

        if (outputNumber == 0) {
            throw new IllegalArgumentException();
        }

        return Integer.valueOf(strOutputNumber);
    }
}
