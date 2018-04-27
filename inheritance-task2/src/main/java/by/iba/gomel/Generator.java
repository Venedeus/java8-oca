package by.iba.gomel;

import java.security.SecureRandom;

/**
 * This class serves to presents different types of generators.
 */
public final class Generator {
    /**
     * Integer constant: the length of the Latin alphabet.
     */
    private static final int          LATIN_ALPHABET = 26;
    /**
     * Char constant: the first symbol of the Latin alphabet.
     */
    private static final char         START_CHAR     = 'a';
    /**
     * Instance of randomizer.
     */
    private static final SecureRandom random;

    /**
     * Static initialization.
     */
    static {
        random = new SecureRandom();
    }

    /**
     * Default private constructor.
     */
    private Generator() {
    }

    /**
     * Generator for random doubles in range [0; limit).
     *
     * @param limit
     *            - upper limit of generator.
     * @return random double.
     */
    public static double generateDouble(final int limit) {
        return Generator.random.nextDouble() * limit;
    }

    /**
     * Generator for random double array in range [0; limit).
     *
     * @param limit
     *            - upper limit of generator.
     * @param length
     *            - length of an array to be created.
     * @return random double array.
     */
    public static double[] generateDoubleArray(final int limit, final int length) {
        final double[] array = new double[length];

        for (int i = 0; i < length; i++) {
            array[i] = Generator.random.nextDouble() * limit;
        }

        return array;
    }

    /**
     * Generator of random integers.
     *
     * @return generated integer.
     */
    public static int generateInt() {
        return Generator.random.nextInt();
    }

    /**
     * Generator of random integers in range [0; limit).
     *
     * @param limit
     *            - upper limit of generator.
     * @return generated integer.
     */
    public static int generateInt(final int limit) {
        return Generator.random.nextInt(limit);
    }

    /**
     * Generator of random integers in range [1; limit).
     *
     * @param limit
     *            - upper limit of generator.
     * @return generated integer.
     */
    public static int generateIntFromOne(final int limit) {
        int number = Generator.random.nextInt(limit);

        if (number == 0) {
            number++;
        }

        return number;
    }

    /**
     * Generator of chars in range of the Latin alphabet.
     *
     * @return generated char.
     */
    public static char generateLatinChar() {
        return (char) (Generator.random.nextInt(Generator.LATIN_ALPHABET) + Generator.START_CHAR);
    }
}
